package pl.projekt.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CustomerDto {
    @NotNull
    @Size(min=2,max = 50,message = "niepoprawne imię")
    private String firstName;
    @NotNull
    @Size(min=2,max = 50,message = "Niepoprawne nazwisko")
    private String lastName;
    @NotNull(message ="Wartość jest pusta" )
    @Size(min=2,max = 50,message = "Prosze wpisac email")
    @Email(message = "Brak znaku @ do prawidłowego wpisania emailu")
    private String email;
    @Size(min=2,max = 50,message = "Wybierz województwo")
    @NotNull(message ="Wartość jest pusta" )
    private  String voivodeship;
    @NotNull(message ="Wartość jest pusta" )
    @Size(min=2,max = 50,message = "Prosze wpisac miasto")
    private String city;
    @Size(min=2,max = 50,message = "Prosze wpisac ulice")
    @NotNull(message ="Wartość jest pusta" )
    private String street;

    @NotNull(message ="Wartość jest pusta" )
    private int number;
    @Size(min=2,max = 50,message = "Prosze wpisac kod pocztowy")
    @NotNull(message ="Wartość jest pusta" )
    private String postal_code;

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

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }
}
