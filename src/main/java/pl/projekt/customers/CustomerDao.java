package pl.projekt.customers;

import org.springframework.stereotype.Repository;
import pl.projekt.author.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Optional;

@Repository// to samo co component tylko to jest dla baz danych a tamto dla zaiern
@Transactional //kazda metoda publiczna bedzie transakcja
public class CustomerDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    public Customer update(Customer customer) {
        return entityManager.merge(customer);

    }

    public Optional<Customer> findById(long id) {
        return Optional.ofNullable(
                entityManager.find(Customer.class, id)
        );
    }

    public void delete(Customer customer) {
        Customer customerToDelete = entityManager.contains(customer) ?
                customer : update(customer);
        entityManager.remove(customerToDelete);
    }

    public void deleteByID(long id) {
        findById(id).ifPresent(this::delete);
    }
}
