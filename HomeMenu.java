import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class HomeMenu implements ActionListener{
    final TextField tf=new TextField(); 
public void home(){

    JFrame f=new JFrame("StockSim");   
    JButton buy=new JButton("BUY");
    buy.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent buy){  
        buy.getActionCommand();
        BuyMenu buyObject = new BuyMenu();
        buyObject.buy(); 
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

            //HomeMenu.dispatchEvent(new WindowEvent(HomeMenu, WindowEvent.WINDOW_CLOSING));
            WalletMenu walletObject = new WalletMenu();
            walletObject.wallet(); 
        }}); 

    wallet.setBounds(135,200,120,30);  
    f.add(wallet);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    
}

}

