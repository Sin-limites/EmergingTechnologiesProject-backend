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
public class HandlingRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.generated.tables.records.HandlingRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

    private static final long serialVersionUID = -131253965;

    /**
     * Create a detached HandlingRecord
     */
    public HandlingRecord() {
        super(jooq.generated.tables.Handling.HANDLING);
    }

    /**
     * Create a detached, initialised HandlingRecord
     */
    public HandlingRecord(java.lang.Integer handlingid, java.lang.String handlingname) {
        super(jooq.generated.tables.Handling.HANDLING);

        setValue(0, handlingid);
        setValue(1, handlingname);
    }

    /**
     * Getter for <code>emerging.handling.handlingID</code>.
     */
    public java.lang.Integer getHandlingid() {
        return (java.lang.Integer) getValue(0);
    }

    /**
     * Setter for <code>emerging.handling.handlingID</code>.
     */
    public void setHandlingid(java.lang.Integer value) {
        setValue(0, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>emerging.handling.handlingName</code>.
     */
    public java.lang.String getHandlingname() {
        return (java.lang.String) getValue(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>emerging.handling.handlingName</code>.
     */
    public void setHandlingname(java.lang.String value) {
        setValue(1, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
        return (org.jooq.Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return jooq.generated.tables.Handling.HANDLING.HANDLINGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field2() {
        return jooq.generated.tables.Handling.HANDLING.HANDLINGNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value1() {
        return getHandlingid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value2() {
        return getHandlingname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HandlingRecord value1(java.lang.Integer value) {
        setHandlingid(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public HandlingRecord value2(java.lang.String value) {
        setHandlingname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HandlingRecord values(java.lang.Integer value1, java.lang.String value2) {
        return this;
    }
}
