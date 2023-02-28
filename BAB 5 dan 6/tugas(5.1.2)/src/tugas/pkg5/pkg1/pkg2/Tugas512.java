/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg5.pkg1.pkg2;

/**
 *
 * @author dicky
 */
import javax.swing.JOptionPane;

public class Tugas512 {
    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Enter word1:");
        String word2 = JOptionPane.showInputDialog("Enter word2:");
        String word3 = JOptionPane.showInputDialog("Enter word3:");

        String output = word1 + " " + word2 + " " + word3;
        JOptionPane.showMessageDialog(null, output);
    }
}
