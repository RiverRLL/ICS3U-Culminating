import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class BuyMenu implements ActionListener{
    final TextField tf=new TextField(); 
    public void buy(){

    JFrame f=new JFrame("StockSim");  
    JButton stock1=new JButton("Stock 1 + Price");  
    //stock1.addActionListener(this);
    stock1.setBounds(135,80,120,30);  
    f.add(stock1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    JButton stock2=new JButton("Stock 2 + Price");  
    //stock2.addActionListener(this);
    stock2.setBounds(135,120,120,30);  
    f.add(stock2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    JButton stock3=new JButton("Stock 3 + Price");  
    //stock3.addActionListener(this);
    stock3.setBounds(135,160,120,30);  
    f.add(stock3);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    JButton stock4=new JButton("Stock 4 + Price");  
    //stock3.addActionListener(this);
    stock4.setBounds(135,200,120,30);  
    f.add(stock4);  
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

}}