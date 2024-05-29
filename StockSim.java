import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;
public class StockSim implements ActionListener {  
    final TextField tf=new TextField(); 
public static void main (String[] args) {  
    JFrame f=new JFrame("StockSim");   
    JButton buy=new JButton("BUY");
    buy.addActionListener(this);
    buy.setBounds(135,100,120,30);   
    f.add(buy);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   



    JButton sell=new JButton("SELL");  
    sell.setBounds(135,150,120,30); 
    f.add(sell);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    JButton portfolio=new JButton("PORTFOLIO");  
    portfolio.setBounds(135,200,120,30);  
    f.add(portfolio);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 


    
}
public void actionPerformed(ActionEvent e){  
    tf.setText("Welcome to Javatpoint.");  



}
}