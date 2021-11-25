package pluralsight.method;

public class methodosencillo {

    static void swap (int i , int j){
        int k = i;
        i = j;
        j = k;
    }

    public static void main (String [] args){

        int a=10 , b = 20;

        swap(a,b);
        System.out.println(a);
    }
}
