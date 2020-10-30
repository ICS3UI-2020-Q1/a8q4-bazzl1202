import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables 
  JPanel mainPanel;

  JLabel nLabel;
  JLabel factorialLabel;

  JTextField nInput;
  JTextField factoricalAnswer;

  JButton calcButton;
 
  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main panel with a box layout
    mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(BoxLayout.LINE_AXIS));

    // initilaize the labels
    nLabel = new JLabel("n");
    factorialLabel = new JLabel("factorial(n)");
    // initialize the text areas
    nInput = new JTextField();
    factoricalAnswer = new JTextField();
    // initialize the button
    calcButton = new JButton("CALC");

    // assemble the panel
    mainPanel.add(nLabel, nInput, factorialLabel, factorialAnswer, calcButton);
  

    // add the mainPanel to the frame
    frame.add(mainPanel);

    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
