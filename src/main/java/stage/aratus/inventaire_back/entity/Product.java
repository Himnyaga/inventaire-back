package stage.aratus.inventaire_back.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column
private String name;

@Column
private String description;

@Column
private Double price;

@Column
private Integer quantity;

@OneToMany(mappedBy = "product")
private Set<Location> locations;

@ManyToMany
private Set<Inventory> inventory;


public Product() {
}


public Product(Long id, String name, String description, Double price, Integer quantity, Set<Location> locations,
        Set<Inventory> inventory) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.locations = locations;
    this.inventory = inventory;
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


public String getDescription() {
    return description;
}


public void setDescription(String description) {
    this.description = description;
}


public Double getPrice() {
    return price;
}


public void setPrice(Double price) {
    this.price = price;
}


public Integer getQuantity() {
    return quantity;
}


public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}


public Set<Location> getLocations() {
    return locations;
}


public void setLocations(Set<Location> locations) {
    this.locations = locations;
}


public Set<Inventory> getInventory() {
    return inventory;
}


public void setInventory(Set<Inventory> inventory) {
    this.inventory = inventory;
}



}