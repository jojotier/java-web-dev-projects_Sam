package org.launchcode;

public class Main {


    public static void main(String[] args) {
	MenuItem chocolateCake = new MenuItem("Chocolate Cake", 10.95,"A decadent richly layered torte with vanilla buttercream.", "Dessert", true);
   MenuItem cherryIceCream = new MenuItem("Cherry Ice Cream", 5.25, "Freshly picked cherries churned in a custard base with rich cream and chocolate.", "Dessert", false);
    Menu dessertMenu = new Menu();
dessertMenu.addItem(chocolateCake);
dessertMenu.addItem(cherryIceCream);

System.out.println(chocolateCake);

    }

}
