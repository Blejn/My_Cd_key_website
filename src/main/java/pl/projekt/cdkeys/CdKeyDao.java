package pl.projekt.cdkeys;

import org.springframework.stereotype.Repository;
import pl.projekt.customers.CdKey;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository// to samo co component tylko to jest dla baz danych a tamto dla zaiern
@Transactional
public class CdKeyDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveCdKey(CdKey cdKey) {
        entityManager.persist(cdKey);
    }

    public CdKey update(CdKey cdKey) {
        return entityManager.merge(cdKey);

    }

    public Optional<CdKey> findById(long id) {
        return Optional.ofNullable(
                entityManager.find(CdKey.class, id)
        );
    }

    public void delete(CdKey cdKey) {
        CdKey cdKeyToDelete = entityManager.contains(cdKey) ?
                cdKey : update(cdKey);
        entityManager.remove(cdKeyToDelete);
    }

    //Wyswietlanie wszystkich plyt:
    public List<CdKey> findAll() {
        //SELECT* FROM cdkeys
        Query allCdKeysQuery = entityManager.createQuery("SELECT c FROM CdKey c ");
        return allCdKeysQuery.getResultList();
    }

    public List<String> findAllTitles() {
        Query allTitlesQuery = entityManager.createQuery("SELECT c.title FROM CdKey c");

        return allTitlesQuery.getResultList();
    }

    public List<CdKey> findAllTyped() {
        TypedQuery<CdKey> typedQuery = entityManager.createQuery("SELECT c FROM CdKey c", CdKey.class);
        return typedQuery.getResultList();

    }

    public List<CdKey> findAllNative() {
        Query nativeQuery = entityManager.createNativeQuery("SELECT * FROM cdstore.cdkeys", CdKey.class);
        return nativeQuery.getResultList();
    }
}
