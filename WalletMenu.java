import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class WalletMenu implements ActionListener{
    //Stock stocks = new Stock();

    public void wallet(){

        double balance = 0;

        JFrame f=new JFrame("StockSim");   

        JButton add=new JButton("ADD $500");  
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent add) { 
    
            double balance = balance + 500;
            }}); 
        
        add.setBounds(135,100,120,30);  
        f.add(add);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  

        JButton Balance=new JButton("Balance: $" + balance);
        Balance.setBounds(135,150,120,30);   
        f.add(Balance);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 


        JButton StockValue=new JButton("Stock Value = $38,291");  
        StockValue.setBounds(135,200,120,30);  
        f.add(StockValue);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  


        JButton back=new JButton("BACK");  
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent back) { 
    
                HomeMenu homeObject = new HomeMenu();
                homeObject.home(); 
            }}); 
    
        back.setBounds(135,250,120,30);  
        f.add(back);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 


}}