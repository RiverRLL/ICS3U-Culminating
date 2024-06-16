//Import Libraries
import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;
//Define class
public class BuyMenu extends WindowAdapter { 
    public void buy(){
    //Open a new frame
    JFrame f=new JFrame("StockSim");  
    f.addWindowListener(this);
    //Change frame colour
    f.getContentPane().setBackground(Color.black);

    //Add button to buy stock1
    JButton stock1=new JButton(AppData.stockName1 + " |$" +AppData.stockPrice1);  
    stock1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stock1) { 
        //Update balance and shares owned after purchase 
        AppData.balance = AppData.balance - AppData.stockPrice1;
        AppData.stockShares1 = AppData.stockShares1 + 1;
        }});
    //Set button size and position
    stock1.setBounds(105,80,180,30);  
    f.add(stock1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
        
    //Add button to buy stock2
    JButton stock2=new JButton(AppData.stockName2 + " |$" +AppData.stockPrice2);  
    stock2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stock2) { 
        //Update balance and shares owned after purchase
        AppData.balance = AppData.balance - AppData.stockPrice2;
        AppData.stockShares2 = AppData.stockShares2 + 1;
        }});
    //Set button size and position
    stock2.setBounds(105,120,180,30);  
    f.add(stock2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    //Add button to buy stock3
    JButton stock3=new JButton(AppData.stockName3 + " |$" +AppData.stockPrice3);  
    stock3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stock3) { 
        //Update balance and shares owned after purchase
        AppData.balance = AppData.balance - AppData.stockPrice3;
        AppData.stockShares3 = AppData.stockShares3 + 1;
        }});
    //Set button size and position
    stock3.setBounds(105,160,180,30);  
    f.add(stock3);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    //Add button to buy stock4
    JButton stock4=new JButton(AppData.stockName4 + " |$" +AppData.stockPrice4);  
    stock4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stock4) { 
        //Update balance and shares owned after purchase
        AppData.balance = AppData.balance - AppData.stockPrice4;
        AppData.stockShares4 = AppData.stockShares4 + 1;
        }});
    //Set button size and position
    stock4.setBounds(105,200,180,30);  
    f.add(stock4);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);
    //Add a back button
    JButton back=new JButton("BACK");  
    back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent back) { 

            //Open home menu
            HomeMenu homeObject = new HomeMenu();
            homeObject.home(); 
            //Close buy menu
            f.dispose();
        }}); 
    //Set button size and position
    back.setBounds(135,250,120,30);  
    f.add(back);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
}}