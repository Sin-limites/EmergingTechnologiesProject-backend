/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ContainershippingnamesRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.generated.tables.records.ContainershippingnamesRecord> implements org.jooq.Record2<java.lang.String, java.lang.Integer> {

    private static final long serialVersionUID = -1538045096;

    /**
     * Create a detached ContainershippingnamesRecord
     */
    public ContainershippingnamesRecord() {
        super(jooq.generated.tables.Containershippingnames.CONTAINERSHIPPINGNAMES);
    }

    /**
     * Create a detached, initialised ContainershippingnamesRecord
     */
    public ContainershippingnamesRecord(java.lang.String equipmentnumber, java.lang.Integer shippingid) {
        super(jooq.generated.tables.Containershippingnames.CONTAINERSHIPPINGNAMES);

        setValue(0, equipmentnumber);
        setValue(1, shippingid);
    }

    /**
     * Getter for <code>sinlimites.containershippingnames.equipmentNumber</code>.
     */
    public java.lang.String getEquipmentnumber() {
        return (java.lang.String) getValue(0);
    }

    /**
     * Setter for <code>sinlimites.containershippingnames.equipmentNumber</code>.
     */
    public void setEquipmentnumber(java.lang.String value) {
        setValue(0, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>sinlimites.containershippingnames.shippingID</code>.
     */
    public java.lang.Integer getShippingid() {
        return (java.lang.Integer) getValue(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>sinlimites.containershippingnames.shippingID</code>.
     */
    public void setShippingid(java.lang.Integer value) {
        setValue(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record2<java.lang.String, java.lang.Integer> key() {
        return (org.jooq.Record2) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<java.lang.String, java.lang.Integer> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<java.lang.String, java.lang.Integer> valuesRow() {
        return (org.jooq.Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field1() {
        return jooq.generated.tables.Containershippingnames.CONTAINERSHIPPINGNAMES.EQUIPMENTNUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field2() {
        return jooq.generated.tables.Containershippingnames.CONTAINERSHIPPINGNAMES.SHIPPINGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value1() {
        return getEquipmentnumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value2() {
        return getShippingid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContainershippingnamesRecord value1(java.lang.String value) {
        setEquipmentnumber(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public ContainershippingnamesRecord value2(java.lang.Integer value) {
        setShippingid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContainershippingnamesRecord values(java.lang.String value1, java.lang.Integer value2) {
        return this;
    }
}
