package pl.projekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.projekt.customers.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    //
}
