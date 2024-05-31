// import java.awt.*;
// import java.awt.event.*;  
import javax.swing.*;

public class SellMenu {

    public void sell(){

//List each stock owned and have button to increase the quanity sold of each



    JFrame f=new JFrame("StockSim");  
    JButton buy=new JButton("SELL");  
    buy.setBounds(135,150,120,30);  
    f.add(buy);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 

    JButton back=new JButton("BACK");  
    back.setBounds(135,200,120,30);  
    f.add(back);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 


}
}