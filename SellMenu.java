//Import libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Define class
public class SellMenu extends WindowAdapter{
    public void sell(){

    //Open new frame
    JFrame f=new JFrame("StockSim");  
    f.addWindowListener(this);
    //Change frame colour
    f.getContentPane().setBackground(Color.black);

    //Add button to sell stock1
    JButton stockowned1=new JButton(AppData.stockShares1 +" | "+AppData.stockName1 + " |$" +AppData.stockPrice1);  
    stockowned1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stockowned1) { 
        //Update balance and shares owned after sale
        AppData.balance = AppData.balance + AppData.stockPrice1;
        AppData.stockShares1 = AppData.stockShares1 - 1;
        //Update frame to display new data (shares owned)
        SellMenu sellObject = new SellMenu();
        sellObject.sell(); 
        //Close outdated frame
        f.dispose();
        }});
    //Set button size and position
    stockowned1.setBounds(105,60,180,30);  
    f.add(stockowned1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    //Add button to sell stock2
    JButton stockowned2=new JButton(AppData.stockShares2 +" | "+AppData.stockName2 + " |$" +AppData.stockPrice2);  
    stockowned2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stockowned2) { 
        //Update balance and shares owned after sale
        AppData.balance = AppData.balance + AppData.stockPrice2;
        AppData.stockShares2 = AppData.stockShares2 - 1;
        //Update frame to display new data (shares owned)
        SellMenu sellObject = new SellMenu();
        sellObject.sell(); 
        //Close outdated frame 
        f.dispose();
        }});
    //Set button size and position
    stockowned2.setBounds(105,95,180,30);  
    f.add(stockowned2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    //Add button to sell stock3
    JButton stockowned3=new JButton(AppData.stockShares3 +" | "+AppData.stockName3 + " |$" +AppData.stockPrice3);  
    stockowned3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stockowned3) { 
        //Update balance and shares owned after sale
        AppData.balance = AppData.balance + AppData.stockPrice3;
        AppData.stockShares3 = AppData.stockShares3 - 1;
        //Update frame to display new data (shares owned)
        SellMenu sellObject = new SellMenu();
        sellObject.sell(); 
        //Close outdated frame
        f.dispose();
        }});
    //Set button size and position
    stockowned3.setBounds(105,130,180,30);  
    f.add(stockowned3);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    //Add button to sell stock4
    JButton stockowned4=new JButton(AppData.stockShares4 +" | "+AppData.stockName4 + " |$" +AppData.stockPrice4);  
    stockowned4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stockowned4) { 
        //Update balance and shares owned after sale
        AppData.balance = AppData.balance + AppData.stockPrice4;
        AppData.stockShares4 = AppData.stockShares4 - 1;
        //Update frame to display new data (shares owned)
        SellMenu sellObject = new SellMenu();
        sellObject.sell(); 
        //Close outdated frame
        f.dispose();
        }});
    //Set button size and position
    stockowned4.setBounds(105,165,180,30);  
    f.add(stockowned4);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    //Add sell all button
    JButton sellall=new JButton("SELL ALL");  
    sellall.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent sellall) { 
        //Update balance and shares owned after sale
        AppData.balance = AppData.balance + AppData.stockPrice1 * AppData.stockShares1 + AppData.stockPrice2 * AppData.stockShares2 + AppData.stockPrice3 * AppData.stockShares3 + AppData.stockPrice4 * AppData.stockShares4 ;
        AppData.stockShares1 = 0;
        AppData.stockShares2 = 0;
        AppData.stockShares3 = 0;
        AppData.stockShares4 = 0;
        //Update frame to display new data (shares owned)
        SellMenu sellObject = new SellMenu();
        sellObject.sell(); 
        //Close outdated frame
        f.dispose();
        }});
    //Set button size and position
    sellall.setBounds(135,200,120,30);  
    f.add(sellall);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
    //Add back button
    JButton back=new JButton("BACK");  
    back.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent back) { 
            //Open home menu
            HomeMenu homeObject = new HomeMenu();
            homeObject.home(); 
            //Close sell menu
            f.dispose();
        }}); 
    //Set button size and position
    back.setBounds(135,250,120,30);  
    f.add(back);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
}
}