package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private String cheeseAdded = null;
    private String toppingsAdded = null;
    private String takeawayAdded = null;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseAdded == null) {
            this.price += 80;
            cheeseAdded = "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsAdded == null) {
            if (isVeg) {
                this.price += 70;
                toppingsAdded = "Extra Toppings Added: 70\n";
            } else {
                this.price += 120;
                toppingsAdded = "Extra Toppings Added: 120\n";
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeawayAdded == null) {
            this.price += 20;
            takeawayAdded = "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        // your code goes here
        if(cheeseAdded != null)
            bill += cheeseAdded;
        if(toppingsAdded != null)
            bill += toppingsAdded;
        if(takeawayAdded != null)
            bill += takeawayAdded;

        bill += "Total Price: "+this.price;
        return this.bill;
    }
}
