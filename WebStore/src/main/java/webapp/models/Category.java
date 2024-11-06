package webapp.models;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity(name = "Category")
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "CategoryId")
private short id;
@Column(name = "CategoryName")
private String name;
public Category(){
}
public Category(short id, String name){
this.id = id;
this.name = name;
}
public short getId() {
return id;
}
public String getName() {
return name;
}
public void setId(short id) {
this.id = id;
}
public void setName(String name) {
this.name = name;
}
}
