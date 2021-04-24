package pl.projekt.service;

import org.springframework.stereotype.Service;
import pl.projekt.customers.Customer;
import pl.projekt.dto.CustomerDto;
import pl.projekt.redDto.CustomerReadDto;
import pl.projekt.repository.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void add(CustomerDto customerDto){
        Customer newCustomer = new Customer();
        newCustomer.setFirstName(customerDto.getFirstName());
        newCustomer.setLastName(customerDto.getLastName());
        newCustomer.setCity(customerDto.getCity());
        newCustomer.setVoivodeship(customerDto.getVoivodeship());
        newCustomer.setEmail(customerDto.getEmail());
        newCustomer.setNumber(customerDto.getNumber());
        newCustomer.setStreet(customerDto.getStreet());

        customerRepository.save(newCustomer);
    }

    public List<CustomerReadDto> findAll(){
      return   customerRepository.findAll().stream()
                .map(entity->new CustomerReadDto(entity.getFirstName(),entity.getLastName()) )
                .collect(Collectors.toList());
    }


}
