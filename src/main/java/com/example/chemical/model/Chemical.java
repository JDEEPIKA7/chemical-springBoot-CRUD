package com.example.chemical.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Chemical {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int position;
    private String name;
    private float weight;
    private String symbol;
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public String toString() {
        return "Chemical [position=" + position + ", name=" + name + ", weight=" + weight + ", symbol=" + symbol + "]";
    }

    
    
    
}
