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
public class PackagekindDao extends org.jooq.impl.DAOImpl<jooq.generated.tables.records.PackagekindRecord, jooq.generated.tables.pojos.Packagekind, java.lang.Integer> {

    /**
     * Create a new PackagekindDao without any configuration
     */
    public PackagekindDao() {
        super(jooq.generated.tables.Packagekind.PACKAGEKIND, jooq.generated.tables.pojos.Packagekind.class);
    }

    /**
     * Create a new PackagekindDao with an attached configuration
     */
    public PackagekindDao(org.jooq.Configuration configuration) {
        super(jooq.generated.tables.Packagekind.PACKAGEKIND, jooq.generated.tables.pojos.Packagekind.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected java.lang.Integer getId(jooq.generated.tables.pojos.Packagekind object) {
        return object.getKindid();
    }

    /**
     * Fetch records that have <code>kindID IN (values)</code>
     */
    public java.util.List<jooq.generated.tables.pojos.Packagekind> fetchByKindid(java.lang.Integer... values) {
        return fetch(jooq.generated.tables.Packagekind.PACKAGEKIND.KINDID, values);
    }

    /**
     * Fetch a unique record that has <code>kindID = value</code>
     */
    public jooq.generated.tables.pojos.Packagekind fetchOneByKindid(java.lang.Integer value) {
        return fetchOne(jooq.generated.tables.Packagekind.PACKAGEKIND.KINDID, value);
    }

    /**
     * Fetch records that have <code>kindName IN (values)</code>
     */
    public java.util.List<jooq.generated.tables.pojos.Packagekind> fetchByKindname(java.lang.String... values) {
        return fetch(jooq.generated.tables.Packagekind.PACKAGEKIND.KINDNAME, values);
    }
}
