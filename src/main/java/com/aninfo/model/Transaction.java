package com.aninfo.model;

import javax.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long cbu;

    private Double value;

    public Transaction(){
    }

    public Transaction(Long cbu, Double value) {
        this.cbu = cbu;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public Long getCbu() {
        return cbu;
    }

    public Double getValue() {
        return value;
    }

}
