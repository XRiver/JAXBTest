//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.06 时间 02:23:42 PM CST 
//


package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>部门类型的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="部门类型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="院系"/>
 *     &lt;enumeration value="行政部门"/>
 *     &lt;enumeration value="直属部门"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u90e8\u95e8\u7c7b\u578b")
@XmlEnum
public enum 部门类型 {

    院系,
    行政部门,
    直属部门;

    public String value() {
        return name();
    }

    public static 部门类型 fromValue(String v) {
        return valueOf(v);
    }

}
