package example;

import cn.edu.nju.jw.schema.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.*;

/**
 * Created by 徐江河 on 2017/6/7.
 */
public class JAXBTrans2to3 {

    private static cn.edu.nju.jw.schema.ObjectFactory jwFactory = new cn.edu.nju.jw.schema.ObjectFactory();

    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance("cn.edu.nju.jw.schema:cn.edu.nju.schema");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object unmarshaled = unmarshaller.unmarshal(new File("XML2.xml"));
        学生列表结构 source = (学生列表结构) unmarshaled;

        // 找出所有的课程
        Map<String,课程结构> courses = new HashMap<>();
        for (学生结构 student:source.get学生()) {
            for (单科成绩结构 courseScore : student.get成绩列表().get单科成绩()) {
                String name = courseScore.get课程().get课程名称().trim();
                if (!courses.containsKey(name)) {
                    courses.put(name,courseScore.get课程());
                }
            }
        }

        课程成绩列表类型 scoreList = jwFactory.create课程成绩列表类型();
        List<课程成绩类型> scoreAppend = scoreList.get课程成绩();

        成绩性质类型[] availableTypes = {成绩性质类型.平时成绩,成绩性质类型.总评成绩,成绩性质类型.期末成绩};
        for (String courseName : courses.keySet()) {
            String courseNum = courses.get(courseName).get课程编号().trim();

            for (成绩性质类型 availableType : availableTypes) {
                课程成绩类型 courseScore = jwFactory.create课程成绩类型();
                courseScore.set成绩性质(availableType);
                courseScore.set课程编号(courseNum);

                for (学生结构 student:source.get学生()) {
                    for (单科成绩结构 singleCourseScore : student.get成绩列表().get单科成绩()) {
                        if (singleCourseScore.get课程().get课程名称().trim().equals(courseName)) {
                            成绩类型 scoreInfo = jwFactory.create成绩类型();
                            scoreInfo.set学号(student.get学号().trim());
                            switch (availableType) {
                                case 平时成绩:
                                    scoreInfo.set得分(singleCourseScore.get平时成绩());
                                    break;
                                case 期末成绩:
                                    scoreInfo.set得分(singleCourseScore.get期末成绩());
                                    break;
                                case 总评成绩:
                                    scoreInfo.set得分(singleCourseScore.get总评成绩());
                                    break;
                                case 期中成绩:
                                case 作业成绩:
                                default:
                                    break;
                            }
                            courseScore.get成绩().add(scoreInfo);
                        }
                    }
                }
                scoreAppend.add(courseScore);
            }
        }

        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(scoreList,new File("XML3.xml"));

    }
}
