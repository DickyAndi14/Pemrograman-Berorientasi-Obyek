/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpangkatan.pkg6.pkg5.pkg4.pkgfor.loop;

/**
 *
 * @author dicky
 */
import java.util.Scanner;

public class Perpangkatan654ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        System.out.print("Masukkan pangkat: ");
        int pangkat = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= pangkat; i++) {
            hasil *= bilangan;
        }

        System.out.println(bilangan + " pangkat " + pangkat + " = " + hasil);
    }
}
