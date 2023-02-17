package Hangman;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class GridBagLayoutDemo {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
    static int lifes = 8;
    static JLabel label = new JLabel();
	static JLabel label2 = new JLabel();
    public static ImageIcon card; 
    static JLabel Hidden = new JLabel();
    static String UnderScoreWord = new String();

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
        HiddenWord selection = new HiddenWord();
        selection.hiddenWordSelection();
        System.out.println(HiddenWord.HiddenWord);
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        label2 = new JLabel("By: Andre Francois y Javier Muñoz");
		label2.setIcon(new ImageIcon("Hangman/images/logo.png"));
        label2.setHorizontalAlignment(JLabel.CENTER);
              //make this component tall
        c.weightx = 0;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label2, c);
        
        JLabel title = new JLabel("HANGMAN GAME");
        c.fill = GridBagConstraints.HORIZONTAL;
        title.setHorizontalAlignment(JLabel.CENTER);
        c.weightx = 1;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(title, c);
        
        JLabel text = new JLabel("Inserta una letra");
        c.fill = GridBagConstraints.HORIZONTAL;
        text.setHorizontalAlignment(JLabel.CENTER);
        c.weightx = 0.10;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(text, c);

        
        Hidden = new JLabel(UnderScoreWord);
        c.fill = GridBagConstraints.HORIZONTAL;
        Hidden.setHorizontalAlignment(JLabel.CENTER);
        Font font = new Font("Consolas", Font.PLAIN, 50);
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.TRACKING, 0.4);
        font = font.deriveFont(attributes);
        Hidden.setFont(font);
        c.weightx = 20;
        c.gridx = 1;
        c.gridy = 4;
        c.insets = new Insets(30, 0, 0, 0); // Add some top padding
        pane.add(Hidden, c);
        
        InputField input = new InputField();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.2;
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(10,10,0,10);  //top padding
        pane.add(input.field, c);

        MyButton button = new MyButton(input.field);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.2;
        c.gridx = 2;
        c.gridy = 2;
        pane.add(button.button, c);

        label.setIcon(new ImageIcon("Hangman/images/2.png"));
        label.setHorizontalAlignment(JLabel.CENTER);
        c.ipady = 40;      //make this component tall
        c.weightx = 0.5;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 3;
        pane.add(label, c);
    }

    public static void CheckWordLength() {
        for(int i = 0; i < HiddenWord.HiddenWord.length(); i++) {
            UnderScoreWord += "_";
        }
        System.out.println(UnderScoreWord);
    }
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window

        frame.pack();
        frame.setVisible(true);
		frame.setSize(750, 600);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        createAndShowGUI();

        };
    }