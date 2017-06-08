package scripts;

import cn.edu.nju.jw.schema.*;
import cn.edu.nju.schema.个人信息结构;
import cn.edu.nju.schema.性别类型;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import javax.xml.bind.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.util.Random;

/**
 * Created by 徐江河 on 2017/6/7.
 */
public class JAXBTrans1to2 {

    private static String[] students = {
            "汤大业 男 321322199611232478 1996-11-23 141250124",
            "徐江河 男 436782199610102345 1996-10-10 141250161",
            "刘璇琳 女 876413199612200456 1996-12-20 141250020",
            "朱俊文 女 908564199606015631 1996-06-01 141250182",
            "张仁知 男 321322199602191533 1996-02-19 141250180",
            "江宇杰 男 410000199509131432 1995-09-13 141250067 此人成绩包含不及格的",
            "许玥琪 女 410000199610131432 1996-10-13 141250165",
            "刘卉 女 890076199612131432 1996-12-13 141250025",
            "林庆 男 76508199602131432 1996-02-13 141250030",
            "生宸 男 89650199601131432 1996-01-13 141250175",
            "黄璜 男 034900199604201432 1996-04-20 141250070"
    };

    private static cn.edu.nju.jw.schema.ObjectFactory jwFactory = new cn.edu.nju.jw.schema.ObjectFactory();
    private static cn.edu.nju.schema.ObjectFactory njuFactory = new cn.edu.nju.schema.ObjectFactory();

    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("cn.edu.nju.jw.schema:cn.edu.nju.schema");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object unmarshaled = unmarshaller.unmarshal(new File("StudentXML1.xml"));
        JAXBElement struc = (JAXBElement) unmarshaled;
        学生结构 example = (学生结构) struc.getValue();

        学生列表结构 studentList = jwFactory.create学生列表结构();
        for (String stuData:students) {
            // 最后会添加进列表的学生结构
            学生结构 createdStudent = jwFactory.create学生结构();

            // 生成个人信息结构
            String[] data = stuData.split(" ");
            个人信息结构 studentInfo = njuFactory.create个人信息结构();

            studentInfo.set姓名(data[0]);
            studentInfo.set性别(data[1].equals("男")? 性别类型.男:性别类型.女);
            studentInfo.set身份证号(data[2]);
            XMLGregorianCalendar birthday = new XMLGregorianCalendarImpl();
            String[] birthdayData = data[3].split("-");
            birthday.setYear(Integer.parseInt(birthdayData[0]));
            birthday.setMonth(Integer.parseInt(birthdayData[1]));
            birthday.setDay(Integer.parseInt(birthdayData[2]));
            studentInfo.set生日(birthday);
            studentInfo.set部门(example.get个人信息().get部门());

            // 设置个人信息结构
            createdStudent.set个人信息(studentInfo);

            // 入学时间大家都相同
            createdStudent.set入学时间(example.get入学时间());
            // 设置学号
            createdStudent.set学号(data[4]);

            //随机生成成绩列表
            成绩列表结构 scoreList = makeClone(example.get成绩列表());
            Random rand = new Random();
            if (data.length == 5) {
                // 生成及格的成绩
                for (单科成绩结构 score: scoreList.get单科成绩()) {
                    score.set期末成绩(60+rand.nextInt(41));
                    score.set总评成绩(60+rand.nextInt(41));
                    score.set平时成绩(60+rand.nextInt(41));
                }
            } else {
                // 生成不及格的成绩
                for (单科成绩结构 score: scoreList.get单科成绩()) {
                    score.set平时成绩(rand.nextInt(60));
                    score.set总评成绩(rand.nextInt(60));
                    score.set期末成绩(rand.nextInt(60));
                }
            }
            createdStudent.set成绩列表(scoreList);

            // 设置绩点
            createdStudent.set绩点(4.2);

            studentList.get学生().add(createdStudent);
        }

        JAXBContext context2 = JAXBContext.newInstance("cn.edu.nju.jw.schema");
        Marshaller marshaller = context2.createMarshaller();
        marshaller.marshal(studentList,new File("XML2.xml"));
    }

    private static 成绩列表结构 makeClone(成绩列表结构 cloned) {
        成绩列表结构 result = jwFactory.create成绩列表结构();
        for (单科成绩结构 score: cloned.get单科成绩()) {
            result.get单科成绩().add(makeClone(score));
        }
        return result;
    }
    private static 单科成绩结构 makeClone(单科成绩结构 cloned) {
        单科成绩结构 result = jwFactory.create单科成绩结构();

        result.set平时成绩(cloned.get平时成绩());
        result.set总评成绩(cloned.get总评成绩());
        result.set期末成绩(cloned.get期末成绩());
        result.set课程(cloned.get课程());

        return result;
    }
}
