package com.example.deklaration.model;

import jakarta.persistence.*;

@Entity
public class Declaration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int inkomst;
    private int avdrag;
    private int skatt;

    // getters och setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public int getInkomst() { return inkomst; }
    public void setInkomst(int inkomst) { this.inkomst = inkomst; }
    public int getAvdrag() { return avdrag; }
    public void setAvdrag(int avdrag) { this.avdrag = avdrag; }
    public int getSkatt() { return skatt; }
    public void setSkatt(int skatt) { this.skatt = skatt; }
}
