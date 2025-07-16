            package org.example.models;

            public class DeluxeBurger extends Hamburger{
                private String cips;
                private String drink;

                public DeluxeBurger() {
                    super("Deluxe", "Sausage & Bacon", 19.10, "White");
                    this.cips = "CURVY";
                    this.drink = "COKE";
                }

                public String getCips() {
                    return cips;
                }

                public String getDrink() {
                    return drink;
                }

                public DeluxeBurger(String name, String meat, double price, String breadRollType) {
                    super(name, meat, price, breadRollType);
                }

                @Override
                public double getPrice() {
                    return super.getPrice();
                }

                @Override
                public void addHamburgerAddition1(String addition1Name, double addition1Price) {
                    super.addHamburgerAddition1(addition1Name, addition1Price);
                }

                @Override
                public void addHamburgerAddition2(String addition2Name, double addition2Price) {
                    super.addHamburgerAddition2(addition2Name, addition2Price);
                }

                @Override
                public void addHamburgerAddition3(String addition3Name, double addition3Price) {
                    super.addHamburgerAddition3(addition3Name, addition3Price);
                }

                @Override
                public void addHamburgerAddition4(String addition4Name, double addition4Price) {
                    super.addHamburgerAddition4(addition4Name, addition4Price);
                }

                @Override
                public double itemizeHamburger() {
                    return super.itemizeHamburger();
                }
                }

