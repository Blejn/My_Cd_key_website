package pl.projekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.projekt.customers.CdKey;
import pl.projekt.customers.Customer;

public interface CdKeyRepository  extends JpaRepository<CdKey,Long> {
}
