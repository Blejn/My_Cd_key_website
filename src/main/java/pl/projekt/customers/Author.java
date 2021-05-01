package pl.projekt.customers;

import javax.persistence.*;

@Entity
@Table(name="cdauthor")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name_artist",nullable = false,length = 100)
    private String name_artist;

    public Author(String name_artist) {
        this.name_artist = name_artist;
    }

    public Author() {

    }

    public String getName_artist() {
        return name_artist;
    }

    public void setName_artist(String name_artist) {
        this.name_artist = name_artist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
