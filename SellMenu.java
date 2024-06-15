import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class SellMenu extends WindowAdapter{

    public void sell(){

//Each click sells 1 of the selected stock
//List quanity owned + stockname + price: Example |6| SS Bank |$122.64|

    JFrame f=new JFrame("StockSim");  
    f.addWindowListener(this);
    JButton stockowned1=new JButton(AppData.stockShares1 +" | "+AppData.stockName1 + " | " +AppData.stockPrice1);  
    stockowned1.setBounds(135,60,120,30);  
    f.add(stockowned1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    JButton stockowned2=new JButton(AppData.stockShares2 +" | "+AppData.stockName2 + " | " +AppData.stockPrice2);  
    stockowned2.setBounds(135,95,120,30);  
    f.add(stockowned2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    JButton stockowned3=new JButton(AppData.stockShares3 +" | "+AppData.stockName3 + " | " +AppData.stockPrice3);  
    stockowned3.setBounds(135,130,120,30);  
    f.add(stockowned3);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    JButton stockowned4=new JButton(AppData.stockShares4 +" | "+AppData.stockName4 + " | " +AppData.stockPrice4);  
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
}
}