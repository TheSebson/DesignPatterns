package FactoryOverBuilder.AbstractFactory.Products;

import FactoryOverBuilder.AbstractFactory.ComponentsFactory.Components.Fabric.Fabric;
import FactoryOverBuilder.AbstractFactory.ComponentsFactory.Components.Laces.Tie;
import FactoryOverBuilder.AbstractFactory.ComponentsFactory.Components.Sole.Sole;

public abstract class Shoes {

    protected String brand;
    protected String name;
    protected int size;
    protected float price;
    protected String color;
    protected int weight;

    protected Fabric fabric;
    protected Tie tie;
    protected Sole sole;



    public String description() {
        return "----------------- Opis produktu -----------------" +
                "\n| " + brand + " : " + name +
                "\n| Rozmiar: " + size +
                "\n| Cena: " + price + " zł" +
                "\n| Kolor: " + color +
                "\n| Waga: " + weight + "g" +
                "\n--------------------- Cechy ---------------------" +
                "\nMateriał : " + fabric +
                "\nWiązanie : " + tie +
                "\nPodeszwa : " + sole +
                "\n-------------------------------------------------\n";
    }
}
