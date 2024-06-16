import java.awt.event.*;
import javax.swing.*;

public class WalletMenu extends WindowAdapter{
    //Stock stocks = new Stock();


    public void wallet(){

        
        JFrame f=new JFrame("StockSim");   
        f.addWindowListener(this);
        JButton add=new JButton("ADD $500");  
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent add) { 
    
            AppData.balance =  AppData.balance + 500.00;

            WalletMenu walletObject = new WalletMenu();
            walletObject.wallet();
        

            f.dispose();
            }}); 
        
        add.setBounds(105,100,180,30);  
        f.add(add);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  

        JButton Balance=new JButton("Balance: $" + AppData.balance);
        Balance.setBounds(105,150,180,30);   
        f.add(Balance);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 


        JButton StockValue=new JButton("Stock Value: $" + (AppData.stockPrice1*AppData.stockShares1 + AppData.stockPrice2*AppData.stockShares2 + AppData.stockPrice3*AppData.stockShares3 + AppData.stockPrice4*AppData.stockShares4));  
        StockValue.setBounds(105,200,180,30);  
        f.add(StockValue);  
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