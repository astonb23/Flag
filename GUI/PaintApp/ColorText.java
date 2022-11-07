public class ColorText {
    private ColorButton button1, button2, button3, button4;

    private JLabel label1, lable2, label3, label4;

    //constructor
  public ColorText(){    
   JFrame frame = new JFrame("Coloring App");
   frame.setSize(500, 500);
   frame.setLayout(new GridLayout(2,1));
    //create panel for labels   and set Layout
   JPanel labelPanel = new JPanel();
   labelPanel.setLayout(new GridLayout(4,1));
   //create each label with given prompts
   label1 = new JLabel("The is going to  "); 
   //add each label to panel for labels
   labelPanel.add(label1);
    //create panel for buttons and set Layout
   JPanel buttonPanel = new JPanel();

   //create each button
   button1= new ColorButton();
   //add each button to panel for buttons
    buttonPanel.add(button1);
    //create actionListener for each button  and call changeText(ColorButton b)
    button1.addActionListener(e->changeText(button1) );
   //add  panel for label to current window
   frame.add(labelPanel);
   //add panel for button to current window
   //show the window
   frame.setVisible(true);
 }

    
}