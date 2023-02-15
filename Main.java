// package Hangman;

// import javax.swing.*;
// import java.awt.*;

// public class Main {
//     static JLabel label = new JLabel();
//     static int lifes = 8;

//     public static void main(String[] args) {
        
//         HiddenWord selection = new HiddenWord();
//         selection.hiddenWordSelection();
        
//         //Creation of GUI
//         JFrame frame = new JFrame("HANGMAN");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         JPanel GUI = new JPanel();
//         GUI.setBackground(Color.white);
//         GUI.setPreferredSize(new  Dimension(550,575));
        
//         JLabel label1 = new JLabel ("Inserta tu letra");
//         GUI.add(label1);

//         InputField texto1 = new InputField();
//         GUI.add(texto1.field);

//         MyButton boton = new MyButton(texto1.field);
//         GUI.add(boton.button);
        
//         label.setVerticalAlignment(JLabel.CENTER);
//         JLabel label3 = new JLabel("Left");
//         GUI.add(label3);
        
//         label.setIcon(new ImageIcon("C:/Users/andee/OneDrive/Documentos/Nueva carpeta/Hangman/images/javier.png"));
//         Dimension size = label.getPreferredSize();
//         label.setBounds(145, 100, 350,375);
//         frame.getContentPane().add(label);
        
//         frame.getContentPane().add(GUI);
//         frame.pack();
//         frame.setVisible(true);        
//     }
// }