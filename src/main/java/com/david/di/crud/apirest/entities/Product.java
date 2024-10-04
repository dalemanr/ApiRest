package com.david.di.crud.apirest.entities;

import com.david.di.crud.apirest.validations.IsExistDb;
import com.david.di.crud.apirest.validations.IsRequired;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //@NotEmpty(message = "{NotEmpty.product.name}")//este campo se debe omitir ya que NotBlank valida tambien que no sea nulo
    @NotBlank
    @Size(min=3,max=45)
    @IsExistDb
    private String name;

    @Min(50)
    @NotNull
    private Integer price;

    @IsRequired
    private String description;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
