import java.lang.Runtime;

public class Nomor3{
    public static void main (String [] args){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Before Exit");
        runtime.exit(0);
        System.out.println("After Exit");
    }
}