package pluralsight.Working_With_Strings;

import sun.font.TrueTypeFont;

import javax.swing.*;

public class String_class {

    public static void main(String[] args){

        String name = "Jim";
        String greeting = "Hello " + name;
        System.out.println(greeting); //Hello Jim
        greeting += " good to see you!";
        System.out.println(greeting); //Hello Jim good to see you


        //String Equeality

        String s1 = "I love";
        s1 += " Java";

        String s2 = "I love";
        s2 += " Java";

        //Equals es diferrentes que el operador == este operador solo compara la cantidad de espacios
        // Mientras que el methodo Equals compara las 2 cadenas y su contenido uno por uno.

        if(s1 == s2) ; //false
        // do something

        String s3 = s1.intern();
        String s4 = s2.intern();

        if(s3 == s4); //True
            // do something

    }
}
