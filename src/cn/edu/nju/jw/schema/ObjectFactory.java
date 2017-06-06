//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.06 时间 02:23:42 PM CST 
//


package cn.edu.nju.jw.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.edu.nju.jw.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _课程_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b");
    private final static QName _学生列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f\u5217\u8868");
    private final static QName _学生_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u5b66\u751f");
    private final static QName _教师_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u6559\u5e08");
    private final static QName _课程成绩列表_QNAME = new QName("http://jw.nju.edu.cn/schema", "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.edu.nju.jw.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link 课程成绩列表类型 }
     * 
     */
    public 课程成绩列表类型 create课程成绩列表类型() {
        return new 课程成绩列表类型();
    }

    /**
     * Create an instance of {@link 学生结构 }
     * 
     */
    public 学生结构 create学生结构() {
        return new 学生结构();
    }

    /**
     * Create an instance of {@link 教师结构 }
     * 
     */
    public 教师结构 create教师结构() {
        return new 教师结构();
    }

    /**
     * Create an instance of {@link 学生列表结构 }
     * 
     */
    public 学生列表结构 create学生列表结构() {
        return new 学生列表结构();
    }

    /**
     * Create an instance of {@link 课程结构 }
     * 
     */
    public 课程结构 create课程结构() {
        return new 课程结构();
    }

    /**
     * Create an instance of {@link 单科成绩结构 }
     * 
     */
    public 单科成绩结构 create单科成绩结构() {
        return new 单科成绩结构();
    }

    /**
     * Create an instance of {@link 成绩列表结构 }
     * 
     */
    public 成绩列表结构 create成绩列表结构() {
        return new 成绩列表结构();
    }

    /**
     * Create an instance of {@link 课程成绩类型 }
     * 
     */
    public 课程成绩类型 create课程成绩类型() {
        return new 课程成绩类型();
    }

    /**
     * Create an instance of {@link 成绩类型 }
     * 
     */
    public 成绩类型 create成绩类型() {
        return new 成绩类型();
    }

    /**
     * Create an instance of {@link 教师列表结构 }
     * 
     */
    public 教师列表结构 create教师列表结构() {
        return new 教师列表结构();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程结构 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b")
    public JAXBElement<课程结构> create课程(课程结构 value) {
        return new JAXBElement<课程结构>(_课程_QNAME, 课程结构.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生列表结构 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f\u5217\u8868")
    public JAXBElement<学生列表结构> create学生列表(学生列表结构 value) {
        return new JAXBElement<学生列表结构>(_学生列表_QNAME, 学生列表结构.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 学生结构 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u5b66\u751f")
    public JAXBElement<学生结构> create学生(学生结构 value) {
        return new JAXBElement<学生结构>(_学生_QNAME, 学生结构.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 教师结构 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u6559\u5e08")
    public JAXBElement<教师结构> create教师(教师结构 value) {
        return new JAXBElement<教师结构>(_教师_QNAME, 教师结构.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link 课程成绩列表类型 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jw.nju.edu.cn/schema", name = "\u8bfe\u7a0b\u6210\u7ee9\u5217\u8868")
    public JAXBElement<课程成绩列表类型> create课程成绩列表(课程成绩列表类型 value) {
        return new JAXBElement<课程成绩列表类型>(_课程成绩列表_QNAME, 课程成绩列表类型.class, null, value);
    }

}
