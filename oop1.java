package Laboop1;

import javax.swing.JOptionPane;
public class oop1 {

    public static void main(String[] args) {
      int option = JOptionPane.showConfirmDialog(null, "Do you want to change to there first class ticket");

      JOptionPane.showMessageDialog(null, "You have chosen: " + (option==JOptionPane.YES_OPTION?"YES":"NO"));

      System.exit(0);
    }
}