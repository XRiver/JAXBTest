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
 * <p>单科成绩结构 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="单科成绩结构">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="课程" type="{http://jw.nju.edu.cn/schema}课程结构"/>
 *         &lt;element name="平时成绩" type="{http://jw.nju.edu.cn/schema}得分类型"/>
 *         &lt;element name="期末成绩" type="{http://jw.nju.edu.cn/schema}得分类型"/>
 *         &lt;element name="总评成绩" type="{http://jw.nju.edu.cn/schema}得分类型"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u5355\u79d1\u6210\u7ee9\u7ed3\u6784", propOrder = {
    "\u8bfe\u7a0b",
    "\u5e73\u65f6\u6210\u7ee9",
    "\u671f\u672b\u6210\u7ee9",
    "\u603b\u8bc4\u6210\u7ee9"
})
public class 单科成绩结构 {

    @XmlElement(required = true)
    protected 课程结构 课程;
    protected int 平时成绩;
    protected int 期末成绩;
    protected int 总评成绩;

    /**
     * 获取课程属性的值。
     * 
     * @return
     *     possible object is
     *     {@link 课程结构 }
     *     
     */
    public 课程结构 get课程() {
        return 课程;
    }

    /**
     * 设置课程属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link 课程结构 }
     *     
     */
    public void set课程(课程结构 value) {
        this.课程 = value;
    }

    /**
     * 获取平时成绩属性的值。
     * 
     */
    public int get平时成绩() {
        return 平时成绩;
    }

    /**
     * 设置平时成绩属性的值。
     * 
     */
    public void set平时成绩(int value) {
        this.平时成绩 = value;
    }

    /**
     * 获取期末成绩属性的值。
     * 
     */
    public int get期末成绩() {
        return 期末成绩;
    }

    /**
     * 设置期末成绩属性的值。
     * 
     */
    public void set期末成绩(int value) {
        this.期末成绩 = value;
    }

    /**
     * 获取总评成绩属性的值。
     * 
     */
    public int get总评成绩() {
        return 总评成绩;
    }

    /**
     * 设置总评成绩属性的值。
     * 
     */
    public void set总评成绩(int value) {
        this.总评成绩 = value;
    }

}
