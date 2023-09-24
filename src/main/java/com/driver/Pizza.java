package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int base =0;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.bill = "";
        if(this.isVeg) {
            this.price += 300;
            this.base += 300; ;
        }
        else{
            this.price += 400;
            this.base += 400; ;
        }

    }

    public int getPrice(){
        return this.price;
    }
    private int cheese =0;
    public void addExtraCheese(){
        if(this.cheese != 0) return;
        // your code goes here
        this.price += 80;
        this.cheese += 80;
    }
    private int topping =0;
    public void addExtraToppings(){
        if(this.topping !=0 ) return;
        if(this.isVeg == true) {
            this.price+=70;
            this.topping += 70;
        }
        else{
            this.price+=120;
            this.topping += 120 ;
        }
    }
    private int paper = 0;
    public void addTakeaway(){
        if(paper != 0) return;
        // your code goes here
        this.price += 20;
        this.paper += 20; ;
    }
    private boolean flag = false;
    public String getBill(){
        // your code goes here
        if(flag) return "";
        this.bill += "Base Price Of The Pizza: " + this.base + "\n";
        if(this.cheese != 0) {
            this.bill += "Extra Cheese Added: " + this.cheese + "\n";
        }
        if(this.topping !=0) {
            this.bill += "Extra Toppings Added: " + this.topping + "\n" ;
        }
        if(this.paper != 0) {
            this.bill += "Paperbag Added: " + this.paper + "\n";
        }
        this.bill += "Total Price: " + this.price + "\n ";
        return this.bill;
    }
}
