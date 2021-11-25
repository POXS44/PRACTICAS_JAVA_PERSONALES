package com.poxs44.Bienvenida;


//Clase persona

import java.util.ArrayList;
import java.util.List;

class Persona {
   private String nombre ;
   private Integer edad ;

   public Persona( String nombre , Integer edad )
   {
       this.nombre = nombre;
       this.edad = edad;
   }
   public String getNombre ()
   {
       return this.nombre;
   }
}

public class Bienvenida {


    public static void main(String[] args) {
        // write your code here
        List<Persona> personas = new ArrayList<Persona>();
        Persona persona1 = new Persona("Victor",21);
        Persona persona2 = new Persona("Bujilla",69);
        //Agregando un elemento a la lista
        personas.add(persona1);
        personas.add(persona2);

        for (Persona p: personas) {

            System.out.println("Persona :"+p.getNombre());
        }

    }

}
