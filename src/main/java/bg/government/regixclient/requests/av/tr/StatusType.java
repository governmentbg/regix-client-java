//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.03 at 11:48:44 PM EEST 
//


package bg.government.regixclient.requests.av.tr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="\u041d\u043e\u0432\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430"/>
 *     &lt;enumeration value="\u041f\u0440\u0435\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u0430\u043d\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430"/>
 *     &lt;enumeration value="\u041d\u043e\u0432\u0430 \u0437\u0430\u043a\u0440\u0438\u0442\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430"/>
 *     &lt;enumeration value="\u041f\u0440\u0435\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u0430\u043d\u0430 \u0437\u0430\u043a\u0440\u0438\u0442\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusType")
@XmlEnum
public enum StatusType {

    @XmlEnumValue("\u041d\u043e\u0432\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430")
    \u041d\u041e\u0412\u0410_\u041f\u0410\u0420\u0422\u0418\u0414\u0410("\u041d\u043e\u0432\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430"),
    @XmlEnumValue("\u041f\u0440\u0435\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u0430\u043d\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430")
    \u041f\u0420\u0415\u0420\u0415\u0413\u0418\u0421\u0422\u0420\u0418\u0420\u0410\u041d\u0410_\u041f\u0410\u0420\u0422\u0418\u0414\u0410("\u041f\u0440\u0435\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u0430\u043d\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430"),
    @XmlEnumValue("\u041d\u043e\u0432\u0430 \u0437\u0430\u043a\u0440\u0438\u0442\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430")
    \u041d\u041e\u0412\u0410_\u0417\u0410\u041a\u0420\u0418\u0422\u0410_\u041f\u0410\u0420\u0422\u0418\u0414\u0410("\u041d\u043e\u0432\u0430 \u0437\u0430\u043a\u0440\u0438\u0442\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430"),
    @XmlEnumValue("\u041f\u0440\u0435\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u0430\u043d\u0430 \u0437\u0430\u043a\u0440\u0438\u0442\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430")
    \u041f\u0420\u0415\u0420\u0415\u0413\u0418\u0421\u0422\u0420\u0418\u0420\u0410\u041d\u0410_\u0417\u0410\u041a\u0420\u0418\u0422\u0410_\u041f\u0410\u0420\u0422\u0418\u0414\u0410("\u041f\u0440\u0435\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u0430\u043d\u0430 \u0437\u0430\u043a\u0440\u0438\u0442\u0430 \u043f\u0430\u0440\u0442\u0438\u0434\u0430");
    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
