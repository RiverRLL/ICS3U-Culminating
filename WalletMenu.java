//Import libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Define Class
public class WalletMenu extends WindowAdapter{
    public void wallet(){
        //Open new frame
        JFrame f=new JFrame("StockSim");   
        f.addWindowListener(this);
        //Change frame colour
        f.getContentPane().setBackground(Color.black);
        //Add button to add $500 to balance
        JButton add=new JButton("ADD $500");  
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent add) { 
            //Update balance after adding $500
            AppData.balance =  AppData.balance + 500.00;
            //Update frame to display new data (balance)
            WalletMenu walletObject = new WalletMenu();
            walletObject.wallet();
            //Close outdate frame
            f.dispose();
            }}); 
        //Set button size and position
        add.setBounds(105,100,180,30);  
        f.add(add);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  

        //Add button to display balance
        JButton Balance=new JButton("Balance: $" + AppData.balance);
        //Set button size and position
        Balance.setBounds(105,150,180,30);   
        f.add(Balance);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 

        //Add button to display total stock value
        JButton StockValue=new JButton("Stock Value: $" + (AppData.stockPrice1*AppData.stockShares1 + AppData.stockPrice2*AppData.stockShares2 + AppData.stockPrice3*AppData.stockShares3 + AppData.stockPrice4*AppData.stockShares4));  
        //Set button size and position
        StockValue.setBounds(105,200,180,30);  
        f.add(StockValue);  
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
            //Close wallet menu
            f.dispose();
        }}); 
    //Set button size and position
    back.setBounds(135,250,120,30);  
    f.add(back);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

}}