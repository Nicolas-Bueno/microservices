package br.com.book_service.model;

import java.util.Date;

public class Book {

    private Long id;
    private String author;
    private Date lauchDate;
    private Double price;
    private String title;
    private String currency;
    private String environment;


    public Book() {
    }


    public Book(Long id, String author, Date lauchDate, Double price, String title, String currency, String environment) {
        this.id = id;
        this.author = author;
        this.lauchDate = lauchDate;
        this.price = price;
        this.title = title;
        this.currency = currency;
        this.environment = environment;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getLauchDate() {
        return this.lauchDate;
    }

    public void setLauchDate(Date lauchDate) {
        this.lauchDate = lauchDate;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

}
