package GUI.PaintApp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class ColorButton{
    //instance variables
    private String name;
    private  Color color;
    public static Random rand = new Random();
    //constructor
    public ColorButton(){
    this.name = "try me";
    this.color = new
    Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
    }

}