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
public class Containerlocation implements java.io.Serializable {

    private static final long serialVersionUID = 595494747;

    private java.lang.Integer locationid;
    private java.lang.String equipmentnumber;
    private java.lang.Long longtitude;
    private java.lang.Long latitude;
    private java.sql.Timestamp date;

    public Containerlocation() {
    }

    public Containerlocation(
            java.lang.Integer locationid,
            java.lang.String equipmentnumber,
            java.lang.Long longtitude,
            java.lang.Long latitude,
            java.sql.Timestamp date
    ) {
        this.locationid = locationid;
        this.equipmentnumber = equipmentnumber;
        this.longtitude = longtitude;
        this.latitude = latitude;
        this.date = date;
    }

    public java.lang.Integer getLocationid() {
        return this.locationid;
    }

    public void setLocationid(java.lang.Integer locationid) {
        this.locationid = locationid;
    }

    public java.lang.String getEquipmentnumber() {
        return this.equipmentnumber;
    }

    public void setEquipmentnumber(java.lang.String equipmentnumber) {
        this.equipmentnumber = equipmentnumber;
    }

    public java.lang.Long getLongtitude() {
        return this.longtitude;
    }

    public void setLongtitude(java.lang.Long longtitude) {
        this.longtitude = longtitude;
    }

    public java.lang.Long getLatitude() {
        return this.latitude;
    }

    public void setLatitude(java.lang.Long latitude) {
        this.latitude = latitude;
    }

    public java.sql.Timestamp getDate() {
        return this.date;
    }

    public void setDate(java.sql.Timestamp date) {
        this.date = date;
    }
}