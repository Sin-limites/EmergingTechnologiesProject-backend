/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Containerkinds implements java.io.Serializable {

    private static final long serialVersionUID = 2021264897;

    private java.lang.String equipmentnumber;
    private java.lang.Integer kindid;

    public Containerkinds() {
    }

    public Containerkinds(
            java.lang.String equipmentnumber,
            java.lang.Integer kindid
    ) {
        this.equipmentnumber = equipmentnumber;
        this.kindid = kindid;
    }

    public java.lang.String getEquipmentnumber() {
        return this.equipmentnumber;
    }

    public void setEquipmentnumber(java.lang.String equipmentnumber) {
        this.equipmentnumber = equipmentnumber;
    }

    public java.lang.Integer getKindid() {
        return this.kindid;
    }

    public void setKindid(java.lang.Integer kindid) {
        this.kindid = kindid;
    }
}