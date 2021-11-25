package pluralsight.VariablesDataTypesOperador;

public class Datos {

    public static void main(String[] args) {
        // write your code here

        String stringVal = "Hola papasito ";
        char charVal = 'a';
        int intVal = 1;
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short resutl1 = (short) longVal;
        short result2 = (short) (byteVal -longVal);
        float result3 = longVal - floatVal;

        System.out.println("Compilado: "+byteVal);
    }

}
