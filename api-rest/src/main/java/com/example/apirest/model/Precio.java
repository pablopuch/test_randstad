package com.example.apirest.model;

import jakarta.persistence.*;

import java.util.Date;

 @Entity
 @Table(name = "precios")
public class Precio {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private Date start_date;
     private Date end_date;
     private int price_list;
     private int product_id;
     private boolean priority;
     private double price;
     private String curr;


     public Long getId() {
         return id;
     }

     public void setId(Long id) {
         this.id = id;
     }

     public Date getStart_date() {
         return start_date;
     }

     public void setStart_date(Date start_date) {
         this.start_date = start_date;
     }

     public Date getEnd_date() {
         return end_date;
     }

     public void setEnd_date(Date end_date) {
         this.end_date = end_date;
     }

     public int getPrice_list() {
         return price_list;
     }

     public void setPrice_list(int price_list) {
         this.price_list = price_list;
     }

     public int getProduct_id() {
         return product_id;
     }

     public void setProduct_id(int product_id) {
         this.product_id = product_id;
     }

     public boolean isPriority() {
         return priority;
     }

     public void setPriority(boolean priority) {
         this.priority = priority;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public String getCurr() {
         return curr;
     }

     public void setCurr(String curr) {
         this.curr = curr;
     }

 }
