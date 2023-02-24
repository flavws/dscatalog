package com.devsuperior.dscatalog.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

//serializable -> padrão da linguagem java para que o objeto seja convertido em sequência de bites
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Category (){

    }

    public Category (Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    //métodos de comparação

    //equals -> operação mais assertiva porém mais lenta
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(getId(), category.getId());
    }

    //hashcode -> operação de comparação mais rápida porém menos eficiente
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
