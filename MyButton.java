package Hangman;

import javax.swing.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;


public class MyButton extends JFrame implements ActionListener, KeyListener {
    
    //attributes
    JButton button;
    JTextField text;
    String input;
    Component frame;
    
    //MyButton class, adds button to GUI
    public MyButton(JTextField input){
        button = new JButton();
        button.setPreferredSize(new Dimension(50,20));
        button.addActionListener(this);
        this.add(button);
        this.text = input;
        text.addKeyListener(this);
    }

    
    //KeyListener to detect when the enter key is pressed
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            this.input = text.getText();
            HiddenWord hw = new HiddenWord();
            hw.CheckLetter(input);
        }
    }
    
    //Method that calls the HiddenWord class
    public void actionPerformed(ActionEvent e){
        this.input = text.getText();
        HiddenWord hw = new HiddenWord();
        hw.CheckLetter(input);
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
}
