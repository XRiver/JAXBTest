package scripts;

import cn.edu.nju.jw.schema.ObjectFactory;
import cn.edu.nju.jw.schema.学生结构;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by 徐江河 on 2017/6/6.
 */
public class TestUnmarshaller {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance("cn.edu.nju.jw.schema");
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Object unmarshaled = unmarshaller.unmarshal(new File("StudentXML1.xml"));
        ObjectFactory factory = new ObjectFactory();
        JAXBElement struc = (JAXBElement) unmarshaled;
        System.out.println(struc.getDeclaredType());
        学生结构 casted = (学生结构) struc.getValue();
        System.out.println(casted.get学号());
    }
}
