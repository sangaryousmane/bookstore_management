package com.example.bookstoremanagementsystem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@NoArgsConstructor
public class Roles extends AbstractEntitySuper{

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    public Roles(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Roles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
