import java.lang.Character;

public class Nomor2{
    public static void main (String [] args){
        int digit = 15;
        int radix = 16;
        char hex = Character.forDigit(digit, radix);
        System.out.println(hex);
    }
}