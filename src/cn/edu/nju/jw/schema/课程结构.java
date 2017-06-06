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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>课程结构 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="课程结构">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="课程编号" type="{http://jw.nju.edu.cn/schema}课程编号类型"/>
 *         &lt;element name="课程名称" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="学分数">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="课时安排" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="教师列表" type="{http://jw.nju.edu.cn/schema}教师列表结构"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u8bfe\u7a0b\u7ed3\u6784", propOrder = {
    "\u8bfe\u7a0b\u7f16\u53f7",
    "\u8bfe\u7a0b\u540d\u79f0",
    "\u5b66\u5206\u6570",
    "\u8bfe\u65f6\u5b89\u6392",
    "\u6559\u5e08\u5217\u8868"
})
public class 课程结构 {

    @XmlElement(required = true)
    protected String 课程编号;
    @XmlElement(required = true)
    protected String 课程名称;
    protected int 学分数;
    @XmlElement(required = true)
    protected String 课时安排;
    @XmlElement(required = true)
    protected 教师列表结构 教师列表;

    /**
     * 获取课程编号属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课程编号() {
        return 课程编号;
    }

    /**
     * 设置课程编号属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课程编号(String value) {
        this.课程编号 = value;
    }

    /**
     * 获取课程名称属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课程名称() {
        return 课程名称;
    }

    /**
     * 设置课程名称属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课程名称(String value) {
        this.课程名称 = value;
    }

    /**
     * 获取学分数属性的值。
     * 
     */
    public int get学分数() {
        return 学分数;
    }

    /**
     * 设置学分数属性的值。
     * 
     */
    public void set学分数(int value) {
        this.学分数 = value;
    }

    /**
     * 获取课时安排属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get课时安排() {
        return 课时安排;
    }

    /**
     * 设置课时安排属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set课时安排(String value) {
        this.课时安排 = value;
    }

    /**
     * 获取教师列表属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 教师列表结构 }
     *     
     */
    public 教师列表结构 get教师列表() {
        return 教师列表;
    }

    /**
     * 设置教师列表属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 教师列表结构 }
     *     
     */
    public void set教师列表(教师列表结构 value) {
        this.教师列表 = value;
    }

}
