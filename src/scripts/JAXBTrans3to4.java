package example;

import cn.edu.nju.jw.schema.学生列表结构;
import cn.edu.nju.jw.schema.成绩类型;
import cn.edu.nju.jw.schema.课程成绩列表类型;
import cn.edu.nju.jw.schema.课程成绩类型;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 徐江河 on 2017/6/7.
 */
public class JAXBTrans3to4 {
    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance("cn.edu.nju.jw.schema:cn.edu.nju.schema");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object unmarshaled = unmarshaller.unmarshal(new File("XML3.xml"));
        课程成绩列表类型 source = (课程成绩列表类型) unmarshaled;

        for (课程成绩类型 courseScores : source.get课程成绩()) {
            List<成绩类型> removed = new ArrayList<>();
            for (成绩类型 score : courseScores.get成绩()) {
                if (score.get得分()>=60) {
                    removed.add(score);
                }
            }
            courseScores.get成绩().removeAll(removed);
        }

        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(source,new File("XML4.xml"));
    }
}
