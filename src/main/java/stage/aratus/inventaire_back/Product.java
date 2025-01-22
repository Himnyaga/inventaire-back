package stage.aratus.inventaire_back;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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

public Product(Long id, String name, String description, Double price, int quantity){
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
}
// Getters et Setters
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

public String getDesc() {
    return description;
}

public void setDesc(String description) {
    this.description = description;
}

public Double getPrice() {
    return price;
}

public void setPrice(Double price) {
    this.price = price;
}
public int getQuantity() {
    return quantity;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}
}