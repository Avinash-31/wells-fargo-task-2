package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security{

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String quantity;

    protected Security(){

    }

    public Security(Portfolio portfolio, String name, String category, String purchasePrice, String purchaseDate, String quantity){
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId(){
        return securityId;
    }

    public Portfolio getPortfolio(){
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio){
        this.portfolio = portfolio;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getPurchasePrice(){
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate(){
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public String getQuantity(){
        return quantity;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }
}