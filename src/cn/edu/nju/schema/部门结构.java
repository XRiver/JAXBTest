//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.06 时间 02:23:42 PM CST 
//


package cn.edu.nju.schema;

import javax.xml.bind.annotation.*;


/**
 * <p>部门结构 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="部门结构">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="部门编号" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="部门名称" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="部门类型" type="{http://www.nju.edu.cn/schema}部门类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u90e8\u95e8\u7ed3\u6784", propOrder = {
    "\u90e8\u95e8\u7f16\u53f7",
    "\u90e8\u95e8\u540d\u79f0",
    "\u90e8\u95e8\u7c7b\u578b"
})
public class 部门结构 {

    @XmlElement(required = true)
    protected String 部门编号;
    @XmlElement(required = true)
    protected String 部门名称;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected cn.edu.nju.schema.部门类型 部门类型;

    /**
     * 获取部门编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门编号() {
        return 部门编号;
    }

    /**
     * 设置部门编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门编号(String value) {
        this.部门编号 = value;
    }

    /**
     * 获取部门名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get部门名称() {
        return 部门名称;
    }

    /**
     * 设置部门名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set部门名称(String value) {
        this.部门名称 = value;
    }

    /**
     * 获取部门类型属性的值。
     * 
     * @return
     *     possible object is
     *     {@link cn.edu.nju.schema.部门类型 }
     *     
     */
    public cn.edu.nju.schema.部门类型 get部门类型() {
        return 部门类型;
    }

    /**
     * 设置部门类型属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link cn.edu.nju.schema.部门类型 }
     *     
     */
    public void set部门类型(cn.edu.nju.schema.部门类型 value) {
        this.部门类型 = value;
    }

}
