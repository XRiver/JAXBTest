//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.06 时间 02:23:42 PM CST 
//


package cn.edu.nju.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>个人信息结构 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="个人信息结构">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="姓名" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="性别" type="{http://www.nju.edu.cn/schema}性别类型"/>
 *         &lt;element name="部门" type="{http://www.nju.edu.cn/schema}部门结构"/>
 *         &lt;element name="生日" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="身份证号">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="18"/>
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
@XmlType(name = "\u4e2a\u4eba\u4fe1\u606f\u7ed3\u6784", propOrder = {
    "\u59d3\u540d",
    "\u6027\u522b",
    "\u90e8\u95e8",
    "\u751f\u65e5",
    "\u8eab\u4efd\u8bc1\u53f7"
})
public class 个人信息结构 {

    @XmlElement(required = true)
    protected String 姓名;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected 性别类型 性别;
    @XmlElement(required = true)
    protected 部门结构 部门;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar 生日;
    @XmlElement(required = true)
    protected String 身份证号;

    /**
     * 获取姓名属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get姓名() {
        return 姓名;
    }

    /**
     * 设置姓名属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set姓名(String value) {
        this.姓名 = value;
    }

    /**
     * 获取性别属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 性别类型 }
     *     
     */
    public 性别类型 get性别() {
        return 性别;
    }

    /**
     * 设置性别属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 性别类型 }
     *     
     */
    public void set性别(性别类型 value) {
        this.性别 = value;
    }

    /**
     * 获取部门属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 部门结构 }
     *     
     */
    public 部门结构 get部门() {
        return 部门;
    }

    /**
     * 设置部门属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 部门结构 }
     *     
     */
    public void set部门(部门结构 value) {
        this.部门 = value;
    }

    /**
     * 获取生日属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar get生日() {
        return 生日;
    }

    /**
     * 设置生日属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void set生日(XMLGregorianCalendar value) {
        this.生日 = value;
    }

    /**
     * 获取身份证号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get身份证号() {
        return 身份证号;
    }

    /**
     * 设置身份证号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set身份证号(String value) {
        this.身份证号 = value;
    }

}
