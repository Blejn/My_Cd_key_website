package pl.projekt.redDto;

public class CustomerReadDto {
    private final String first_name;
    private final String lastName;

    public CustomerReadDto(String first_name, String listName) {
        this.first_name = first_name;
        this.lastName = listName;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getListName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "CustomerReadDto{" +
                "first_name='" + first_name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
