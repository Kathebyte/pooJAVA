package Tarea3;

public class Electrodomestico {

    Integer precioBase;
    String color;
    String consumoEnergetico;
    Integer peso;


    // Constructor
    Electrodomestico ( Integer nuevoPrecioBase, String nuevoColor, String nuevoConsumoEnergetico,Integer nuevoPeso) {
        this.precioBase = nuevoPrecioBase;
        this.color= nuevoColor;
        this.consumoEnergetico = nuevoConsumoEnergetico;
        this.peso=nuevoPeso;

    }
}