/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.awt.*;

/**
 *
 * @author Ana
 */
public class Calculadora {
    private Frame f;
    private Panel p,p2;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,bb;
    private TextField t;
    public Calculadora(){
        p=new Panel();
        p2=new Panel();
        f=new Frame("Calculadora");
        b1=new Button("-");
        b2=new Button("*");
        b3=new Button("%");
        b4=new Button("+");
        b5=new Button("/");
        b6=new Button("D");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b10=new Button("4");
        b11=new Button("5");
        b12=new Button("6");
        b13=new Button("1");
        b14=new Button("2");
        b15=new Button("3");
        b16=new Button(".");
        b17=new Button("0");
        b18=new Button("=");
        bb=new Button("Escribir");
        t=new TextField("0");
    }
    public void launchFrame(){
        f.setSize(700, 1000);
        
        p.setSize(700, 700);
        t.
        GridLayout r=new GridLayout(6,3);
        p.setLayout(r);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        p.add(b17);
        p.add(b18);
        f.add(t,BorderLayout.NORTH);
        f.add(p,BorderLayout.CENTER);
        f.setVisible(true);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora e=new Calculadora();
        e.launchFrame();
    }
    
}
