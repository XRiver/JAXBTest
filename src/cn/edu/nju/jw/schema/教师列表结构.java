//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.06.06 时间 02:23:42 PM CST 
//


package cn.edu.nju.jw.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>教师列表结构 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="教师列表结构">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="教师" type="{http://jw.nju.edu.cn/schema}教师结构" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u6559\u5e08\u5217\u8868\u7ed3\u6784", propOrder = {
    "\u6559\u5e08"
})
public class 教师列表结构 {

    @XmlElement(required = true)
    protected List<教师结构> 教师;

    /**
     * Gets the value of the 教师 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 教师 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get教师().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link 教师结构 }
     * 
     * 
     */
    public List<教师结构> get教师() {
        if (教师 == null) {
            教师 = new ArrayList<教师结构>();
        }
        return this.教师;
    }

}
