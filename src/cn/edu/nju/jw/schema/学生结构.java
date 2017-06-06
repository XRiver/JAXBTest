//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.06 时间 02:23:42 PM CST 
//


package cn.edu.nju.jw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import cn.edu.nju.schema.个人信息结构;


/**
 * <p>学生结构 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="学生结构">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="个人信息" type="{http://www.nju.edu.cn/schema}个人信息结构"/>
 *         &lt;element name="入学时间" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="学号" type="{http://jw.nju.edu.cn/schema}学号类型"/>
 *         &lt;element name="成绩列表" type="{http://jw.nju.edu.cn/schema}成绩列表结构"/>
 *         &lt;element name="绩点">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minExclusive value="0"/>
 *               &lt;maxExclusive value="5.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5b66\u751f\u7ed3\u6784", propOrder = {
    "\u4e2a\u4eba\u4fe1\u606f",
    "\u5165\u5b66\u65f6\u95f4",
    "\u5b66\u53f7",
    "\u6210\u7ee9\u5217\u8868",
    "\u7ee9\u70b9"
})
public class 学生结构 {

    @XmlElement(required = true)
    protected 个人信息结构 个人信息;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 入学时间;
    @XmlElement(required = true)
    protected String 学号;
    @XmlElement(required = true)
    protected 成绩列表结构 成绩列表;
    protected double 绩点;

    /**
     * 获取个人信息属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 个人信息结构 }
     *     
     */
    public 个人信息结构 get个人信息() {
        return 个人信息;
    }

    /**
     * 设置个人信息属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 个人信息结构 }
     *     
     */
    public void set个人信息(个人信息结构 value) {
        this.个人信息 = value;
    }

    /**
     * 获取入学时间属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get入学时间() {
        return 入学时间;
    }

    /**
     * 设置入学时间属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set入学时间(XMLGregorianCalendar value) {
        this.入学时间 = value;
    }

    /**
     * 获取学号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get学号() {
        return 学号;
    }

    /**
     * 设置学号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set学号(String value) {
        this.学号 = value;
    }

    /**
     * 获取成绩列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 成绩列表结构 }
     *     
     */
    public 成绩列表结构 get成绩列表() {
        return 成绩列表;
    }

    /**
     * 设置成绩列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 成绩列表结构 }
     *     
     */
    public void set成绩列表(成绩列表结构 value) {
        this.成绩列表 = value;
    }

    /**
     * 获取绩点属性的值。
     * 
     */
    public double get绩点() {
        return 绩点;
    }

    /**
     * 设置绩点属性的值。
     * 
     */
    public void set绩点(double value) {
        this.绩点 = value;
    }

}
