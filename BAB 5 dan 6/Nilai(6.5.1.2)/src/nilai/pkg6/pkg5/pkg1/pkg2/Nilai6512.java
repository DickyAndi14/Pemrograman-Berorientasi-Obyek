/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilai.pkg6.pkg5.pkg1.pkg2;

/**
 *
 * @author dicky
 */
import javax.swing.JOptionPane;

public class Nilai6512 {
  public static void main(String[] args) {
    String inputUjian1 = JOptionPane.showInputDialog("Masukkan nilai ujian ke-1:");
    double ujian1 = Double.parseDouble(inputUjian1);

    String inputUjian2 = JOptionPane.showInputDialog("Masukkan nilai ujian ke-2:");
    double ujian2 = Double.parseDouble(inputUjian2);

    String inputUjian3 = JOptionPane.showInputDialog("Masukkan nilai ujian ke-3:");
    double ujian3 = Double.parseDouble(inputUjian3);

    double rataRata = (ujian1 + ujian2 + ujian3) / 3;

    String output = "Rata-rata nilai ujian: " + rataRata;
    if (rataRata >= 60) {
      output += "  :)";
    } else {
      output += "  :(";
    }

    JOptionPane.showMessageDialog(null, output);
  }
}
