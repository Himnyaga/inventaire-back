package stage.aratus.inventaire_back.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Proprietary {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column
private String name;

@Column
private String contactInfo;

@Column
private String hashedPassword;

@OneToMany(mappedBy = "owner")
private Set<Inventory> inventories;

public Proprietary() {
}

public Proprietary(Long id, String name, String contacInfo, String hashedPassword) {
    this.id = id;
    this.name = name;
    this.contactInfo = contacInfo;
    this.hashedPassword = hashedPassword;
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

public String getContactInfo() {
    return contactInfo;
}

public void setContactInfo(String contacInfo) {
    this.contactInfo = contacInfo;
}

public String getHashedPassword() {
    return hashedPassword;
}

public void setHashedPassword(String hashedPassword) {
    this.hashedPassword = hashedPassword;
}

public Set<Inventory> getInventories() {
    return inventories;
}

public void setInventories(Set<Inventory> inventories) {
    this.inventories = inventories;
}

}