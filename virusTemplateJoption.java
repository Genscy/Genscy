package joption;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Joption {

    public static void main(String[] args) {
       JOptionPane input = new JOptionPane("Blank"); 
       Random raa = new Random();
       JOptionPane.showMessageDialog(null, "Blank ");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
     int shown = 100;
     while (true){
     JDialog dialoghatdog = input.createDialog(null, "Virus!");
     dialoghatdog.setLocation(raa.nextInt((int) screenSize.getWidth() - 50), raa.nextInt((int)screenSize.getHeight()) - 50);
     dialoghatdog.setVisible(true);
     
     for(int i=0; i<=shown; i++){
        JDialog a = input.createDialog(null, " Alert! Fix it immediately!");
        a.setLocation(raa.nextInt((int) screenSize.getWidth() - 100), raa.nextInt((int) screenSize.getHeight()) - 100);
        a.setModal(false);
        a.setVisible(true);
     }
    shown++;
     }
    }
}

