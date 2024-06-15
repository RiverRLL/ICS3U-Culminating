import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class BuyMenu extends WindowAdapter {
    final TextField tf=new TextField(); 
    public void buy(){

    JFrame f=new JFrame("StockSim");  
    f.addWindowListener(this);
    JButton stock1=new JButton(AppData.stockName1 + " | " +AppData.stockPrice1);  
    //stock1.addActionListener(this);
    stock1.setBounds(135,80,120,30);  
    f.add(stock1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    JButton stock2=new JButton(AppData.stockName2 + " | " +AppData.stockPrice2);  
    //stock2.addActionListener(this);
    stock2.setBounds(135,120,120,30);  
    f.add(stock2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    JButton stock3=new JButton(AppData.stockName3 + " | " +AppData.stockPrice3);  
    //stock3.addActionListener(this);
    stock3.setBounds(135,160,120,30);  
    f.add(stock3);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    JButton stock4=new JButton(AppData.stockName4 + " | " +AppData.stockPrice4);  
    //stock3.addActionListener(this);
    stock4.setBounds(135,200,120,30);  
    f.add(stock4);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    JButton back=new JButton("BACK");  
    back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent back) { 


            HomeMenu homeObject = new HomeMenu();
            homeObject.home(); 

            f.dispose();
        }}); 

    back.setBounds(135,250,120,30);  
    f.add(back);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
}}