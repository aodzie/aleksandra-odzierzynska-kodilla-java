package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public final class Product {
    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Product() {
    }
    public Product(String name) {
        this.name = name;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    public List<Item> getItems() {
        return items;
    }

    private void setId(int id) {
        this.id = id;
    }
    private void setName(String name) {
        this.name = name;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
}