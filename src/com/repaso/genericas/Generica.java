package com.repaso.genericas;

import java.io.Serializable;

public class Generica<T> implements Serializable {
    public Generica() {
    }

    /**
     * Estamos instanciando en cada uno de los condicionales un tipo de dato.
     * @param t
     */
    /*
    void prueba(T t){
        if(t instanceof String){
            System.out.println("String");
        }else if (t instanceof Integer){
            System.out.println("Integer");
        }else if (t instanceof Double){
            System.out.println("Double");
        }
    }
    */

    /**
     * Utilizamos el valor generico para instanciar cualquier tipo de objeto.
     * @param t
     */
    void prueba(T t){
        if(t instanceof String){
           ((String) t).charAt(0);
           ((String) t).indexOf(0);
        }else if (t instanceof Integer){
                ((Integer) t).getInteger("1");
        }else if (t instanceof Double){
            ((Double) t).max(5,6);

    }
    }
}