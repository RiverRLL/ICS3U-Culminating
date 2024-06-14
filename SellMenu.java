import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class SellMenu implements ActionListener{

    public void sell(){

//Each click sells 1 of the selected stock
//List quanity owned + stockname + price: Example |6| SS Bank |$122.64|

    JFrame f=new JFrame("StockSim");  
    JButton stockowned1=new JButton("|qty| Stock1 |price|");  
    stockowned1.setBounds(135,60,120,30);  
    f.add(stockowned1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    JButton stockowned2=new JButton("|qty| Stock2 |price|");  
    stockowned2.setBounds(135,95,120,30);  
    f.add(stockowned2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    JButton stockowned3=new JButton("|qty| Stock3 |price|");  
    stockowned3.setBounds(135,130,120,30);  
    f.add(stockowned3);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    JButton stockowned4=new JButton("|qty| Stock4 |price|");  
    stockowned4.setBounds(135,165,120,30);  
    f.add(stockowned4);  
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