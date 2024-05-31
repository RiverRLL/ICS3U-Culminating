import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class HomeMenu implements ActionListener{
    final TextField tf=new TextField(); 
public void home(){

    JFrame f=new JFrame("StockSim");   
    JButton buy=new JButton("BUY");
    buy.addActionListener(this);
    buy.setBounds(135,100,120,30);   
    f.add(buy);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
    
    JButton sell=new JButton("SELL");  
    sell.addActionListener(this);
    sell.setBounds(135,150,120,30); 
    f.add(sell);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    JButton portfolio=new JButton("PORTFOLIO");  
    portfolio.addActionListener(this);
    portfolio.setBounds(135,200,120,30);  
    f.add(portfolio);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 


    
}
public void actionPerformed(ActionEvent buy){  
    BuyMenu buyObject = new BuyMenu();
    buyObject.buy(); 

// public void actionPerformed(ActionEvent sell){  
//     SellMenu sellObject = new SellMenu();
//     sellObject.sell(); 

// public void actionPerformed(ActionEvent Portfolio){  
//     PortfolioMenu portfolioObject = new PortfolioMenu();
//     PortfolioObject.portfolio(); 



}
}