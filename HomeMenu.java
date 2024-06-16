import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;


public class HomeMenu extends WindowAdapter {
    final TextField tf=new TextField(); 
public void home(){

    JFrame f=new JFrame("StockSim");   
        f.addWindowListener(this);
    JButton buy=new JButton("BUY");
    buy.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent buy){  
        buy.getActionCommand();

        double max1 = 2;
        double max2 = 5;
        double max3 = 7;
        double max4 = 45;
        double min1 = -1.25;
        double min2 = -5;
        double min3 = -6; 
        double min4 = -52;

        AppData.stockPrice1 = AppData.stockPrice1 + Math.floor(Math.random() *(max1 - min1 + 1) + min1);
        AppData.stockPrice2 = AppData.stockPrice2 + Math.floor(Math.random() *(max2 - min2 + 1) + min2);
        AppData.stockPrice3 = AppData.stockPrice3 + Math.floor(Math.random() *(max3 - min3 + 1) + min3);
        AppData.stockPrice4 = AppData.stockPrice4 + Math.floor(Math.random() *(max4 - min4 + 1) + min4);


        BuyMenu buyObject = new BuyMenu();
        buyObject.buy(); 

        f.dispose();
    }
    }
    );
    
    buy.setBounds(105,100,180,30);   
    f.add(buy);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
    
    JButton sell=new JButton("SELL");  
    sell.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent sell){
        sell.getActionCommand();

        double max1 = 2;
        double max2 = 5;
        double max3 = 7;
        double max4 = 25;
        double min1 = -1.25;
        double min2 = -4;
        double min3 = -5; 
        double min4 = -22;

        AppData.stockPrice1 = AppData.stockPrice1 + Math.floor(Math.random() *(max1 - min1 + 1) + min1);
        AppData.stockPrice2 = AppData.stockPrice2 + Math.floor(Math.random() *(max2 - min2 + 1) + min2);
        AppData.stockPrice3 = AppData.stockPrice3 + Math.floor(Math.random() *(max3 - min3 + 1) + min3);
        AppData.stockPrice4 = AppData.stockPrice4 + Math.floor(Math.random() *(max4 - min4 + 1) + min4);
        SellMenu sellObject = new SellMenu();
        sellObject.sell();

        f.dispose();
    }
    }
    );
    sell.setBounds(105,150,180,30); 
    f.add(sell);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    JButton wallet=new JButton("WALLET");  
    wallet.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent buy) { 


            WalletMenu walletObject = new WalletMenu();
            walletObject.wallet(); 

            f.dispose();
        }}); 

    wallet.setBounds(105,200,180,30);  
    f.add(wallet);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    
}

}