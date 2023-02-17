package Hangman;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class HiddenWord extends JFrame {
    String[] WordOptions = new String[] {"caleidoscopio", "arroz" , "chocolate" , "avestruz" , "cacahaute" , "nopal" , "pollo" , "programar" , "guayaba"};
    static Component frame;
    static String HiddenWord = new String();
    public static HiddenWord TRACKING;
    
    
    
    public void hiddenWordSelection(){
        Random random = new Random();
        int randomNumber = random.nextInt(9);
        HiddenWord = WordOptions[randomNumber];
        GridBagLayoutDemo.CheckWordLength();
    }

    public void CheckLetter(String input) {
        System.out.println(input);
        if (HiddenWord.contains(input)) {
            JOptionPane.showMessageDialog(frame, "The letter '" + input + "' is contained in the word.");
            char in = input.charAt(0);
            for(int i=0; i<HiddenWord.length(); i++ ){
                if(HiddenWord.charAt(i)==in){
                    System.out.println(i);
                    System.out.println("escondida " + HiddenWord);
                    int index = i;
                    char[] myNameChars = GridBagLayoutDemo.UnderScoreWord.toCharArray();
                    myNameChars[index] = in;
                    GridBagLayoutDemo.UnderScoreWord = String.valueOf(myNameChars);
                    GridBagLayoutDemo.Hidden.setText(GridBagLayoutDemo.UnderScoreWord);
                }
            }
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

            