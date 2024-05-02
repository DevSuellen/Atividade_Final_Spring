package com.atividadefinal.spring.api.models;

import jakarta.persistence.*;

@Entity
public class PizzaPedida_has_Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPizzaPedida;

    @Column
    private int idIngrediente;

    public PizzaPedida_has_Ingrediente() {

    }

    public int getIdPizzaPedida() {
        return idPizzaPedida;
    }

    public void setIdPizzaPedida(int idPizzaPedida) {
        this.idPizzaPedida = idPizzaPedida;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }
}
