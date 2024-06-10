import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class WalletMenu implements ActionListener{
    //Stock stocks = new Stock();

    public void wallet(){

        JFrame f=new JFrame("StockSim");   

        JButton balance=new JButton("BALANCE: $46,383");
        balance.setBounds(135,100,120,30);   
        f.add(balance);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 


        JButton StockValue=new JButton("Stock Value = $38,291");  
        StockValue.setBounds(135,150,120,30);  
        f.add(StockValue);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  


        JButton back=new JButton("BACK");  
        back.addActionListener(this);
        back.setBounds(135,200,120,30);  
        f.add(back);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }
public void actionPerformed(ActionEvent back){  
    HomeMenu homeObject = new HomeMenu();
    homeObject.home(); 
    }


}