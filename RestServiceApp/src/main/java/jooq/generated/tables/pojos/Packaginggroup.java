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
public class Packaginggroup implements java.io.Serializable {

    private static final long serialVersionUID = -252331581;

    private java.lang.Integer packagingid;
    private java.lang.String packagingname;

    public Packaginggroup() {
    }

    public Packaginggroup(
            java.lang.Integer packagingid,
            java.lang.String packagingname
    ) {
        this.packagingid = packagingid;
        this.packagingname = packagingname;
    }

    public java.lang.Integer getPackagingid() {
        return this.packagingid;
    }

    public void setPackagingid(java.lang.Integer packagingid) {
        this.packagingid = packagingid;
    }

    public java.lang.String getPackagingname() {
        return this.packagingname;
    }

    public void setPackagingname(java.lang.String packagingname) {
        this.packagingname = packagingname;
    }
}
