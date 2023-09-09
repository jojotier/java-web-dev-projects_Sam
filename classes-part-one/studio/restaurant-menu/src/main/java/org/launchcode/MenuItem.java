package org.launchcode;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
       this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  this.name + " " + this.isNew + "   " + this.price + "\n" + this.category + "\n" + this.description   ;
    }
    public boolean isNew() {
        return isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }
}
