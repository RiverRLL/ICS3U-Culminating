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
        BuyMenu buyObject = new BuyMenu();
        buyObject.buy(); 

        f.dispose();
    }
    }
    );
    
    buy.setBounds(135,100,120,30);   
    f.add(buy);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
    
    JButton sell=new JButton("SELL");  
    sell.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent sell){
        sell.getActionCommand();
        SellMenu sellObject = new SellMenu();
        sellObject.sell();

        f.dispose();
    }
    }
    );
    sell.setBounds(135,150,120,30); 
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

    wallet.setBounds(135,200,120,30);  
    f.add(wallet);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    
}

}