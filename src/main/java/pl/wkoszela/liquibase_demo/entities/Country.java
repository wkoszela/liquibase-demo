package pl.wkoszela.liquibase_demo.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @Column(name = "code", length = 100)
    private String code;

    @Column(name = "name", length = 100)
    private String name;

    @OneToOne
    private City capital;

    public Country() {
    }

    public Country(String code, String name, City capital) {
        this.code = code;
        this.name = name;
        this.capital = capital;
    }

    public String toString() {
        return String.format("{%s, %s, %s}", code, name, capital);
    }
}
