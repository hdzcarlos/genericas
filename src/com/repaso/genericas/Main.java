package com.repaso.genericas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Generica<String> generica = new Generica<>();
	generica.prueba("hola");

        List<String> lista = new ArrayList<>();
        if(lista instanceof List){
            System.out.println("Es un list");
        }else if (lista instanceof ArrayList){
            System.out.println("Es un arraylist");
        }
        /**
         * Al igual que  sucede con List y ArrayList por el principio de polimorfismo
         * Instanceof nos dice si generica es compatible con Serializable
         * Si es compatible se cumple la condición if.
         */
        if (generica instanceof Serializable){
            System.out.println("Es serializable");
        }else{
            System.out.println("no es serializable");
        }
    }
}
