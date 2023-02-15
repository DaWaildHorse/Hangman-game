package Hangman;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class HiddenWord extends JFrame {
    String[] WordOptions = new String[] {"Caleidoscopio", "Arroz" , "Chocolate" , "Avestruz" , "Cacahaute" , "Nopal" , "Pollo" , "Programar"};
    static Component frame;
    static String HiddenWord = new String();
    
    
    
    public void hiddenWordSelection(){
        Random random = new Random();
        int randomNumber = random.nextInt(7);
        HiddenWord = WordOptions[randomNumber];
    }

    public void CheckLetter(String input) {
        System.out.println(input);
        if (HiddenWord.contains(input)) {
            JOptionPane.showMessageDialog(frame, "The letter '" + input + "' is contained in the word.");
        } else {  
            JOptionPane.showMessageDialog(frame, "The letter '" + input + "' is not contained in the word."); 
            GridBagLayoutDemo.lifes--;
            switch(GridBagLayoutDemo.lifes) {
                case 7:
                    
                    GridBagLayoutDemo.label.setIcon(new ImageIcon("Hangman/images/2.png"));
                    break;
                case 6:
                    GridBagLayoutDemo.label.setIcon(new ImageIcon("Hangman/images/3.png"));
                    break;
                case 5:
                    GridBagLayoutDemo.label.setIcon(new ImageIcon("Hangman/images/4.png"));
                    break;
                case 4:
                    GridBagLayoutDemo.label.setIcon(new ImageIcon("Hangman/images/5.png"));
                    break;
                case 3:
                    GridBagLayoutDemo.label.setIcon(new ImageIcon("Hangman/images/6.png"));
                    break;
                case 2:
                    GridBagLayoutDemo.label.setIcon(new ImageIcon("Hangman/images/7.png"));
                    break;
                case 1:
                    GridBagLayoutDemo.label.setIcon(new ImageIcon("Hangman/images/8.png"));
                    break;
            };
            System.out.println(GridBagLayoutDemo.lifes);
            
        }
    }
    
}

            