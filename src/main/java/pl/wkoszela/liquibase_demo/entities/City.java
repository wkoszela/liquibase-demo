package pl.wkoszela.liquibase_demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 100)
    private int id;

    @Column(name = "name", length = 100)
    private String name;

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("{%s, %s}", id, name);
    }
}
