package stage.aratus.inventaire_back.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;
import java.util.Set;
@Entity
public class Inventory{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column
private String name;

@Column
private LocalDateTime createdAt;

@Column
private LocalDateTime updatedAt;

@ManyToOne
private  Proprietary owner;

@ManyToMany(mappedBy = "inventory")
private Set<Product> products;


public Inventory() {
}


public Inventory(Long id, String name, LocalDateTime createdAt, LocalDateTime updatedAt, Proprietary owner,
        Set<Product> products) {
    this.id = id;
    this.name = name;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.owner = owner;
    this.products = products;
}


public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public LocalDateTime getCreatedAt() {
    return createdAt;
}


public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
}


public LocalDateTime getUpdatedAt() {
    return updatedAt;
}


public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
}


public Proprietary getOwner() {
    return owner;
}


public void setOwner(Proprietary owner) {
    this.owner = owner;
}


public Set<Product> getProducts() {
    return products;
}


public void setProducts(Set<Product> products) {
    this.products = products;
}


}