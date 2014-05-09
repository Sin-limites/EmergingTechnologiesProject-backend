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
public class PackagekindRecord extends org.jooq.impl.UpdatableRecordImpl<jooq.generated.tables.records.PackagekindRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

    private static final long serialVersionUID = -484037170;

    /**
     * Create a detached PackagekindRecord
     */
    public PackagekindRecord() {
        super(jooq.generated.tables.Packagekind.PACKAGEKIND);
    }

    /**
     * Create a detached, initialised PackagekindRecord
     */
    public PackagekindRecord(java.lang.Integer kindid, java.lang.String kindname) {
        super(jooq.generated.tables.Packagekind.PACKAGEKIND);

        setValue(0, kindid);
        setValue(1, kindname);
    }

    /**
     * Getter for <code>emerging.packagekind.kindID</code>.
     */
    public java.lang.Integer getKindid() {
        return (java.lang.Integer) getValue(0);
    }

    /**
     * Setter for <code>emerging.packagekind.kindID</code>.
     */
    public void setKindid(java.lang.Integer value) {
        setValue(0, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>emerging.packagekind.kindName</code>.
     */
    public java.lang.String getKindname() {
        return (java.lang.String) getValue(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>emerging.packagekind.kindName</code>.
     */
    public void setKindname(java.lang.String value) {
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
        return jooq.generated.tables.Packagekind.PACKAGEKIND.KINDID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field2() {
        return jooq.generated.tables.Packagekind.PACKAGEKIND.KINDNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value1() {
        return getKindid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value2() {
        return getKindname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackagekindRecord value1(java.lang.Integer value) {
        setKindid(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public PackagekindRecord value2(java.lang.String value) {
        setKindname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PackagekindRecord values(java.lang.Integer value1, java.lang.String value2) {
        return this;
    }
}