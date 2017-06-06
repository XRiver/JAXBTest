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
 * <p>教师结构 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="教师结构">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="个人信息" type="{http://www.nju.edu.cn/schema}个人信息结构"/>
 *         &lt;element name="入职时间" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="工号" type="{http://jw.nju.edu.cn/schema}工号类型"/>
 *         &lt;element name="手机" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="邮箱" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6559\u5e08\u7ed3\u6784", propOrder = {
    "\u4e2a\u4eba\u4fe1\u606f",
    "\u5165\u804c\u65f6\u95f4",
    "\u5de5\u53f7",
    "\u624b\u673a",
    "\u90ae\u7bb1"
})
public class 教师结构 {

    @XmlElement(required = true)
    protected 个人信息结构 个人信息;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 入职时间;
    @XmlElement(required = true)
    protected String 工号;
    @XmlElement(required = true)
    protected String 手机;
    @XmlElement(required = true)
    protected String 邮箱;

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
     * 获取入职时间属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get入职时间() {
        return 入职时间;
    }

    /**
     * 设置入职时间属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set入职时间(XMLGregorianCalendar value) {
        this.入职时间 = value;
    }

    /**
     * 获取工号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get工号() {
        return 工号;
    }

    /**
     * 设置工号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set工号(String value) {
        this.工号 = value;
    }

    /**
     * 获取手机属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get手机() {
        return 手机;
    }

    /**
     * 设置手机属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set手机(String value) {
        this.手机 = value;
    }

    /**
     * 获取邮箱属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get邮箱() {
        return 邮箱;
    }

    /**
     * 设置邮箱属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set邮箱(String value) {
        this.邮箱 = value;
    }

}
