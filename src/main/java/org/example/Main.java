package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServicioPeluqueria servicioPeluqueria = ServicioPeluqueria.Tinte;
        ServicioPeluqueria servicioPeluqueria1 = ServicioPeluqueria.Corte;
        ServicioPeluqueria servicioPeluqueria2 = ServicioPeluqueria.Uñas;
        System.out.println(servicioPeluqueria.getNombre() + " " + servicioPeluqueria.getDescripcion() +" " + servicioPeluqueria.getPrecio());
        System.out.println(servicioPeluqueria1.getNombre() +" " + servicioPeluqueria1.getDescripcion() +" " + servicioPeluqueria1.getPrecio());
        System.out.println(servicioPeluqueria2.getNombre() +" " + servicioPeluqueria2.getDescripcion() +" " + servicioPeluqueria2.getPrecio());
    }
}