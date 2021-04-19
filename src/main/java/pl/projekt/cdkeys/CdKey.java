package pl.projekt.cdkeys;

import javax.persistence.*;

@Entity
@Table(name = "cdkeys")
public class CdKey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
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
}
