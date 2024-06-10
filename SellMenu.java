import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class SellMenu implements ActionListener{

    public void sell(){

//List each stock owned and have button to increase the quanity sold of each

    JFrame f=new JFrame("StockSim");  
    JButton stockowned1=new JButton("Stock Owned 1");  
    stockowned1.setBounds(135,100,120,30);  
    f.add(stockowned1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    JButton stockowned2=new JButton("Stock Owned 2");  
    stockowned2.setBounds(135,150,120,30);  
    f.add(stockowned2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    JButton sellall=new JButton("SELL ALL");  
    sellall.setBounds(135,200,120,30);  
    f.add(sellall);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    JButton back=new JButton("BACK");  
    back.addActionListener(this);
    back.setBounds(135,250,120,30);  
    f.add(back);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
    }
public void actionPerformed(ActionEvent back){  
    HomeMenu homeObject = new HomeMenu();
    homeObject.home(); 

}
}