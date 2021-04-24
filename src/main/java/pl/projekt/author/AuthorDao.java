package pl.projekt.author;

import org.springframework.stereotype.Repository;
import pl.projekt.customers.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Optional;

@Repository// to samo co component tylko to jest dla baz danych a tamto dla zaiern
@Transactional
public class AuthorDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveAuthor(Author author) {
        entityManager.persist(author);
    }

    public Author update(Author author) {
       return   entityManager.merge(author);

    }

    public Optional<Author> findById(long id) {
        return Optional.ofNullable(
                entityManager.find(Author.class, id)
        );
    }

    public void delete(Author author) {
        Author authorToDelete = entityManager.contains(author) ?
                author : update(author);
        entityManager.remove(authorToDelete);
    }
}
