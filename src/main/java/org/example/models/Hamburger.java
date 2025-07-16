package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        System.out.println(addition1Name + " eklendi.");
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        System.out.println(addition2Name + " eklendi.");
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        System.out.println(addition3Name + " eklendi.");
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        System.out.println(addition4Name + " eklendi.");
    }
    public double getPrice() {
        return itemizeHamburger();
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;

        if (addition1Name != null) {
            totalPrice += addition1Price;
            System.out.println("Addition1: " + addition1Name);
        }
        if (addition2Name != null) {
            totalPrice += addition2Price;
            System.out.println("Addition2: " + addition2Name);
        }
        if (addition3Name != null) {
            totalPrice += addition3Price;
            System.out.println("Addition3: " + addition3Name);
        }
        if (addition4Name != null) {
            totalPrice += addition4Price;
            System.out.println("Addition4: " + addition4Name);
        }

        System.out.println(totalPrice);
        return totalPrice;
    }
}

