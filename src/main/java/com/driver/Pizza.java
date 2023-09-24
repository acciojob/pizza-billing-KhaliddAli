package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    //variables to sete prices
    private int base;
    private int cheese;
    private int topping;
    private int paper;
//  flags
    private boolean ischeese;
    private boolean istopping;
    private boolean ispaper;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.base = 300;
            this.topping = 70;
        }
        else{
            this.base = 400;
            this.topping = 120;
            
        }

        this.bill = "Base Price Of The Pizza: " + this.base + "\n";
        this.price = this.base;
        this.cheese = 80;
        this.paper = 20;
    }

    public int getPrice(){
        return this.price;
    }
    
    public void addExtraCheese(){
        if(this.ischeese == false){
            this.price += this.cheese;
            this.ischeese = true;
        }
       
    }
    
    public void addExtraToppings(){
        if(this.istopping == false){
            this.price += this.topping;
            this.istopping = true;
        }
        
    }
    
    public void addTakeaway(){
        if(this.ispaper == false){
            this.price += this.paper;
            this.ispaper = true;
        }
        
    }
    private boolean flag = false;
    public String getBill(){
        // your code goes here
        if(flag){
            return this.bill;
        }
        this.flag = true;
        if(this.ischeese){
            this.bill += "Extra Cheese Added: " + this.cheese + "\n";
        }
        if(this.istopping){
            this.bill += "Extra Toppings Added: " + this.topping + "\n";
        }
        if(this.ispaper) {
            this.bill += "Paperbag Added: " + this.paper + "\n";
        }

        return this.bill + "Total Price: " + this.price;
        
    }
}
