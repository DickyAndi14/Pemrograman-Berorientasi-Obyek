/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai.pkg6.pkg5.pkg1.pkg1;

/**
 *
 * @author dicky
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nilai6511 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.print("Masukkan nilai ujian ke-1: ");
      double ujian1 = Double.parseDouble(reader.readLine());
      System.out.print("Masukkan nilai ujian ke-2: ");
      double ujian2 = Double.parseDouble(reader.readLine());
      System.out.print("Masukkan nilai ujian ke-3: ");
      double ujian3 = Double.parseDouble(reader.readLine());

      double rataRata = (ujian1 + ujian2 + ujian3) / 3;
      System.out.print("Rata-rata nilai ujian: " + rataRata);

      if (rataRata >= 60) {
        System.out.print("  :)\n");
      } else {
        System.out.print("  :(\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}