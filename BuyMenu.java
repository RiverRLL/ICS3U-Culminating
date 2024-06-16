import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class BuyMenu extends WindowAdapter {
    final TextField tf=new TextField(); 
    public void buy(){

    JFrame f=new JFrame("StockSim");  
    f.addWindowListener(this);

    JButton stock1=new JButton(AppData.stockName1 + " |$" +AppData.stockPrice1);  

    stock1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stock1) { 

        AppData.balance = AppData.balance - AppData.stockPrice1;
        AppData.stockShares1 = AppData.stockShares1 + 1;
        }});
    stock1.setBounds(105,80,180,30);  
    f.add(stock1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
        

    JButton stock2=new JButton(AppData.stockName2 + " |$" +AppData.stockPrice2);  

    stock2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stock2) { 

        AppData.balance = AppData.balance - AppData.stockPrice2;
        AppData.stockShares2 = AppData.stockShares2 + 1;
        }});

    stock2.setBounds(105,120,180,30);  
    f.add(stock2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    JButton stock3=new JButton(AppData.stockName3 + " |$" +AppData.stockPrice3);  

    stock3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stock3) { 

        AppData.balance = AppData.balance - AppData.stockPrice3;
        AppData.stockShares3 = AppData.stockShares3 + 1;
        }});

    stock3.setBounds(105,160,180,30);  
    f.add(stock3);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    JButton stock4=new JButton(AppData.stockName4 + " |$" +AppData.stockPrice4);  

    stock4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stock4) { 

        AppData.balance = AppData.balance - AppData.stockPrice4;
        AppData.stockShares4 = AppData.stockShares4 + 1;
        }});
    stock4.setBounds(105,200,180,30);  
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