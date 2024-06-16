import java.awt.event.*;
import javax.swing.*;

public class SellMenu extends WindowAdapter{

    public void sell(){


    JFrame f=new JFrame("StockSim");  
    f.addWindowListener(this);
    JButton stockowned1=new JButton(AppData.stockShares1 +" | "+AppData.stockName1 + " |$" +AppData.stockPrice1);  

    stockowned1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stockowned1) { 

        AppData.balance = AppData.balance + AppData.stockPrice1;
        AppData.stockShares1 = AppData.stockShares1 - 1;

        SellMenu sellObject = new SellMenu();
        sellObject.sell(); 

        f.dispose();
        }});
    stockowned1.setBounds(105,60,180,30);  
    f.add(stockowned1);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    JButton stockowned2=new JButton(AppData.stockShares2 +" | "+AppData.stockName2 + " |$" +AppData.stockPrice2);  

    stockowned2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stockowned2) { 

        AppData.balance = AppData.balance + AppData.stockPrice2;
        AppData.stockShares2 = AppData.stockShares2 - 1;

        SellMenu sellObject = new SellMenu();
        sellObject.sell(); 

        f.dispose();
        }});
    stockowned2.setBounds(105,95,180,30);  
    f.add(stockowned2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    JButton stockowned3=new JButton(AppData.stockShares3 +" | "+AppData.stockName3 + " |$" +AppData.stockPrice3);  

    stockowned3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stockowned3) { 

        AppData.balance = AppData.balance + AppData.stockPrice3;
        AppData.stockShares3 = AppData.stockShares3 - 1;

        SellMenu sellObject = new SellMenu();
        sellObject.sell(); 

        f.dispose();
        }});
    stockowned3.setBounds(105,130,180,30);  
    f.add(stockowned3);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    JButton stockowned4=new JButton(AppData.stockShares4 +" | "+AppData.stockName4 + " |$" +AppData.stockPrice4);  

    stockowned4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent stockowned4) { 

        AppData.balance = AppData.balance + AppData.stockPrice4;
        AppData.stockShares4 = AppData.stockShares4 - 1;

        SellMenu sellObject = new SellMenu();
        sellObject.sell(); 

        f.dispose();
        }});
    stockowned4.setBounds(105,165,180,30);  
    f.add(stockowned4);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

    JButton sellall=new JButton("SELL ALL");  

    sellall.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent sellall) { 

        AppData.balance = AppData.balance + AppData.stockPrice1 * AppData.stockShares1 + AppData.stockPrice2 * AppData.stockShares2 + AppData.stockPrice3 * AppData.stockShares3 + AppData.stockPrice4 * AppData.stockShares4 ;
        AppData.stockShares1 = 0;
        AppData.stockShares2 = 0;
        AppData.stockShares3 = 0;
        AppData.stockShares4 = 0;

        SellMenu sellObject = new SellMenu();
        sellObject.sell(); 

        f.dispose();
        }});
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