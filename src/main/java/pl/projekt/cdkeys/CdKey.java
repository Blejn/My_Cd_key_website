package pl.projekt.cdkeys;

import pl.projekt.author.Author;
import pl.projekt.customers.Customer;

import javax.persistence.*;

@Entity
@Table(name = "cdkeys")
public class CdKey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @ManyToOne
    private Customer customer;


    @ManyToOne
    private Author author;
//------------------------------------------ do CUSTOMERA I AUTHORA GET I SET
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
//----------------------------------------------------------------------------
    private String title;

    public CdKey() {

    }

    public CdKey(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "CdKey{" +
                " id= " + id +
                ",  customer= " + customer +
                ",  author= " + author +
                ",  title=' " + title + '\'' +
                '}';
    }
}
