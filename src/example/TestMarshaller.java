package example;

import cn.edu.nju.schema.ObjectFactory;
import cn.edu.nju.schema.部门类型;
import cn.edu.nju.schema.部门结构;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

/**
 * Created by 徐江河 on 2017/6/6.
 */
public class TestMarshaller {
    public static void main(String[] args) throws Exception {
        JAXBContext context = JAXBContext.newInstance("cn.edu.nju.schema");
        Marshaller marshaller = context.createMarshaller();
        ObjectFactory factory = new ObjectFactory();
        部门结构 struc = factory.create部门结构();
        struc.set部门名称("体育部");
        struc.set部门编号("132456");
        struc.set部门类型(部门类型.行政部门);
        marshaller.marshal(struc,new File("XML2.xml"));
        /*
        想要把某种类型直接作为XML的root element，需要手动在结构的类定义之前加上@XmlRootElement
         */
    }
}
