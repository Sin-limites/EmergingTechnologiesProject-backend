/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ContainerlocationDao extends org.jooq.impl.DAOImpl<jooq.generated.tables.records.ContainerlocationRecord, jooq.generated.tables.pojos.Containerlocation, java.lang.Integer> {

    /**
     * Create a new ContainerlocationDao without any configuration
     */
    public ContainerlocationDao() {
        super(jooq.generated.tables.Containerlocation.CONTAINERLOCATION, jooq.generated.tables.pojos.Containerlocation.class);
    }

    /**
     * Create a new ContainerlocationDao with an attached configuration
     */
    public ContainerlocationDao(org.jooq.Configuration configuration) {
        super(jooq.generated.tables.Containerlocation.CONTAINERLOCATION, jooq.generated.tables.pojos.Containerlocation.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected java.lang.Integer getId(jooq.generated.tables.pojos.Containerlocation object) {
        return object.getLocationid();
    }

    /**
     * Fetch records that have <code>locationID IN (values)</code>
     */
    public java.util.List<jooq.generated.tables.pojos.Containerlocation> fetchByLocationid(java.lang.Integer... values) {
        return fetch(jooq.generated.tables.Containerlocation.CONTAINERLOCATION.LOCATIONID, values);
    }

    /**
     * Fetch a unique record that has <code>locationID = value</code>
     */
    public jooq.generated.tables.pojos.Containerlocation fetchOneByLocationid(java.lang.Integer value) {
        return fetchOne(jooq.generated.tables.Containerlocation.CONTAINERLOCATION.LOCATIONID, value);
    }

    /**
     * Fetch records that have <code>equipmentNumber IN (values)</code>
     */
    public java.util.List<jooq.generated.tables.pojos.Containerlocation> fetchByEquipmentnumber(java.lang.String... values) {
        return fetch(jooq.generated.tables.Containerlocation.CONTAINERLOCATION.EQUIPMENTNUMBER, values);
    }

    /**
     * Fetch records that have <code>longitude IN (values)</code>
     */
    public java.util.List<jooq.generated.tables.pojos.Containerlocation> fetchByLongitude(java.math.BigDecimal... values) {
        return fetch(jooq.generated.tables.Containerlocation.CONTAINERLOCATION.LONGITUDE, values);
    }

    /**
     * Fetch records that have <code>latitude IN (values)</code>
     */
    public java.util.List<jooq.generated.tables.pojos.Containerlocation> fetchByLatitude(java.math.BigDecimal... values) {
        return fetch(jooq.generated.tables.Containerlocation.CONTAINERLOCATION.LATITUDE, values);
    }

    /**
     * Fetch records that have <code>date IN (values)</code>
     */
    public java.util.List<jooq.generated.tables.pojos.Containerlocation> fetchByDate(java.sql.Timestamp... values) {
        return fetch(jooq.generated.tables.Containerlocation.CONTAINERLOCATION.DATE, values);
    }
}
