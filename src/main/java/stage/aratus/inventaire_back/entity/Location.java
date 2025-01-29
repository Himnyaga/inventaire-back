package stage.aratus.inventaire_back.entity;


import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Location{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column
private String name;

@Column
private String adress;

@OneToMany(mappedBy = "location")
private Set<Product> product;

public Location() {
}

public Location(Long id, String name, String adress, Set<Product> product) {
    this.id = id;
    this.name = name;
    this.adress = adress;
    this.product = product;
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

public String getAdress() {
    return adress;
}

public void setAdress(String adress) {
    this.adress = adress;
}

public Set<Product> getProduct() {
    return product;
}

public void setProduct(Set<Product> product) {
    this.product = product;
}


}