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
public class Packagekind implements java.io.Serializable {

    private static final long serialVersionUID = -1193832297;

    private java.lang.Integer kindid;
    private java.lang.String kindname;

    public Packagekind() {
    }

    public Packagekind(
            java.lang.Integer kindid,
            java.lang.String kindname
    ) {
        this.kindid = kindid;
        this.kindname = kindname;
    }

    public java.lang.Integer getKindid() {
        return this.kindid;
    }

    public void setKindid(java.lang.Integer kindid) {
        this.kindid = kindid;
    }

    public java.lang.String getKindname() {
        return this.kindname;
    }

    public void setKindname(java.lang.String kindname) {
        this.kindname = kindname;
    }
}
