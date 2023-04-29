package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja<String> cajaCarton = new Caja<>(new String[15]);

        cajaCarton.add(0, "Hola");
        cajaCarton.add(1, "Adios");
        cajaCarton.add(2, "Hi");
        System.out.println(cajaCarton);
        String temp = cajaCarton.get(0);

        System.out.println("----");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0,"Hola");
        cajaSin.add(1,"Adios");
        cajaSin.add(2,"Hi");
        System.out.println(cajaSin);

        String temp2 = (String) cajaSin.get(0);

        System.out.println("---comida---");
        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Manazana", false));
        cajaComida.add(1, new Comida("Maruchan", true));
        cajaComida.add(2, new Comida("Platano", false));
        cajaComida.add(3, new Comida("Hamburguesa", true));
        cajaComida.add(4, new Comida("Sandia", false));
        cajaComida.add(5, new Comida("Pringles", true));
        System.out.println(cajaComida.get(0));

        System.out.println("-----");

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Sandia", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(8));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Sandia", false));
        comidas2.add(new Comida("Danone", true));
        comidas2.add(new Comida("Salchicha", true));
        comidas2.add(new Comida("Pera", false));
        comidas2.add(new Comida("Fresa", false));

        System.out.println(comidas2.get(2));
        comidas2.set(2, new Comida("Pringles", true));
        comidas2.add(5, new Comida("Manzana", false));
        System.out.println("---------");
        for (Comida comida : comidas2 ) {
            System.out.println(comida);

        }
    }
}