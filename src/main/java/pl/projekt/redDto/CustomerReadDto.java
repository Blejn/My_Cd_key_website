package pl.projekt.redDto;

import javax.validation.constraints.NotNull;

public class CustomerReadDto {
    private final String first_name;

    private final String lastName;

    private final String email;

    private final String voivodeship;

    private final String city;

    private  final String street;

    private final int number;

    private final String postal_code;

    public CustomerReadDto(String first_name, String lastName,String email,String voivodeship,String city,String street, int number, String postal_code) {
        this.first_name = first_name;
        this.lastName = lastName;
        this.email = email;
        this.voivodeship = voivodeship;
        this.city = city;
        this.street = street;
        this.number = number;
        this.postal_code = postal_code;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getVoivodeship() {
        return voivodeship;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getPostal_code() {
        return postal_code;
    }

    @Override
    public String toString() {
        return "CustomerReadDto{" +
                "first_name='" + first_name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", voivodeship='" + voivodeship + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", postal_code='" + postal_code + '\'' +
                '}';
    }
}
