package pl.projekt.customers;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



    @OneToMany(mappedBy ="customer")
    private List<CdKey> cdKeys= new ArrayList<>();

@NotNull
@Column(name = "firstName",length = 100,nullable = false)
@Size(min=2,max = 50,message = "niepoprawne imię")
   private String firstName;
    @Column(name = "lastName",length = 100,nullable = false)
    @Size(min=2,max = 50)
   private String lastName;
    @NotNull
@Column(name = "email",length = 255,nullable = false)
    @NotNull
   private String email;
@Column(name = "voivodeship",length = 100,nullable = false)
@NotNull
   private  String voivodeship;
@Column(name = "city",length = 100,nullable = false)
@NotNull
   private String city;
@Column(name = "street",length = 100,nullable = false)
@NotNull
   private String street;

     @NotNull
    @Column(name = "numberphone",length = 50,nullable = false)
    @NotNull
    private int number;
    @Column(name = "postalCode",length = 100,nullable = false)
    @NotNull
   private int postal_code;

   public Customer(){

   }

    public Customer(String firstName) {
        this.firstName = firstName;
    }

    public Customer(String firstName, String lastName, String email, String voivodeship, String city, String street, int number, int postal_code) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.voivodeship = voivodeship;
        this.city = city;
        this.street = street;
        this.number = number;
        this.postal_code = postal_code;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVoivodeship() {
        return voivodeship;
    }

    public void setVoivodeship(String voivodeship) {
        this.voivodeship = voivodeship;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }
}
