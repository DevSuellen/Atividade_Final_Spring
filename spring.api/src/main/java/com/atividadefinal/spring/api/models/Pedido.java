package com.atividadefinal.spring.api.models;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    @Column
    private int idCliente;
    @Column
    private int idFornada;
    @Column
    private Timestamp dataHora;

    public Pedido() {

    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFornada() {
        return idFornada;
    }

    public void setIdFornada(int idFornada) {
        this.idFornada = idFornada;
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }
}
