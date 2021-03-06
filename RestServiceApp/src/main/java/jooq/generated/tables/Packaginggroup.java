/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Packaginggroup extends org.jooq.impl.TableImpl<jooq.generated.tables.records.PackaginggroupRecord> {

    /**
     * The singleton instance of <code>sinlimites.packaginggroup</code>
     */
    public static final jooq.generated.tables.Packaginggroup PACKAGINGGROUP = new jooq.generated.tables.Packaginggroup();
    private static final long serialVersionUID = -1908740966;
    /**
     * The column <code>sinlimites.packaginggroup.packagingID</code>.
     */
    public final org.jooq.TableField<jooq.generated.tables.records.PackaginggroupRecord, java.lang.Integer> PACKAGINGID = createField("packagingID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");
    /**
     * The column <code>sinlimites.packaginggroup.packagingName</code>.
     */
    public final org.jooq.TableField<jooq.generated.tables.records.PackaginggroupRecord, java.lang.String> PACKAGINGNAME = createField("packagingName", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

    /**
     * Create a <code>sinlimites.packaginggroup</code> table reference
     */
    public Packaginggroup() {
        this("packaginggroup", null);
    }

    /**
     * Create an aliased <code>sinlimites.packaginggroup</code> table reference
     */
    public Packaginggroup(java.lang.String alias) {
        this(alias, jooq.generated.tables.Packaginggroup.PACKAGINGGROUP);
    }

    private Packaginggroup(java.lang.String alias, org.jooq.Table<jooq.generated.tables.records.PackaginggroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private Packaginggroup(java.lang.String alias, org.jooq.Table<jooq.generated.tables.records.PackaginggroupRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, jooq.generated.Sinlimites.SINLIMITES, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<jooq.generated.tables.records.PackaginggroupRecord> getRecordType() {
        return jooq.generated.tables.records.PackaginggroupRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Identity<jooq.generated.tables.records.PackaginggroupRecord, java.lang.Integer> getIdentity() {
        return jooq.generated.Keys.IDENTITY_PACKAGINGGROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.UniqueKey<jooq.generated.tables.records.PackaginggroupRecord> getPrimaryKey() {
        return jooq.generated.Keys.KEY_PACKAGINGGROUP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.UniqueKey<jooq.generated.tables.records.PackaginggroupRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<jooq.generated.tables.records.PackaginggroupRecord>>asList(jooq.generated.Keys.KEY_PACKAGINGGROUP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public jooq.generated.tables.Packaginggroup as(java.lang.String alias) {
        return new jooq.generated.tables.Packaginggroup(alias, this);
    }

    /**
     * Rename this table
     */
    public jooq.generated.tables.Packaginggroup rename(java.lang.String name) {
        return new jooq.generated.tables.Packaginggroup(name, null);
    }
}
