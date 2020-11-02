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

  Font biggerText;
 
  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("AWT Factorial");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main panel with a box layout
    mainPanel = new JPanel();
    mainPanel.setLayout(new FlowLayout());

    // initilaize the labels
    nLabel = new JLabel("n");
    factorialLabel = new JLabel("factorial(n)");

    // initialize the text areas
    nInput = new JTextField();
    factoricalAnswer = new JTextField();

    // initialize the button and set ActionListenerActionListener
    calcButton = new JButton("CALC");
    calcButton.addActionListener(this);
    calcButton.setActionCommand("CALC");

    // set a preferred size so box layout knows it should be smaller
    nInput.setPreferredSize(new Dimension(200, 20));
    factoricalAnswer.setPreferredSize(new Dimension(200, 20));

    // create a bigger font to use
    biggerText = new Font("arial",Font.PLAIN, 20);

    // set the font on the area I want to use it
    nLabel.setFont(biggerText);
    nInput.setFont(biggerText);
    factorialLabel.setFont(biggerText);
    factoricalAnswer.setFont(biggerText);
    
    // assemble the panel
    mainPanel.add(nLabel);
    mainPanel.add(nInput);
    mainPanel.add(factorialLabel);
    mainPanel.add(factoricalAnswer);
    mainPanel.add(calcButton);
  

    // add the mainPanel to the frame
    frame.add(mainPanel);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if(command.equals("CALC")){
      // create accumulator variable
      int sum = 1;
      // get text from the input box
      String nText = nInput.getText();
      // change the string into an integer
      int nInteger = Integer.parseInt(nText);
      for(int i = nInteger; i >= 1; i--){
        sum = sum*i;
      }
      factoricalAnswer.setText(sum + "");
    }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
