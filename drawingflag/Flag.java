import javax.swing.*;    // For JFrame and JPanel
import java.awt.*;       // For Color, Container, and GridLayout
public class Flag{
   public static void main(String[] args){
      JFrame theGUI = new JFrame();
      theGUI.setTitle("Polad Flag");
      theGUI.setSize(300, 200);
      theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel panel1 = new JPanel(); 
      panel1.setBackground(Color.white);
      JPanel panel2 = new JPanel(); 
      panel2.setBackground(Color.white);
      JPanel panel3 = new JPanel(); 
      panel3.setBackground(Color.red);
      JPanel panel4 = new JPanel(); 
      panel4.setBackground(Color.red);
      Container pane = theGUI.getContentPane();
      pane.setLayout(new GridLayout(2, 2));
      pane.add(panel1);
      pane.add(panel2);
      pane.add(panel3);
      pane.add(panel4);
      theGUI.setVisible(true);
   }
}