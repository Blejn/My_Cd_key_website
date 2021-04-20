package pl.projekt.cdkeys;

import org.springframework.stereotype.Repository;
import pl.projekt.author.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
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
        return   entityManager.merge(cdKey);

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
}
