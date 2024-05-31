import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;

public class BuyMenu implements ActionListener{
    final TextField tf=new TextField(); 
    public void buy(){

    JFrame f=new JFrame("StockSim");  
    JButton search=new JButton("SEARCH");  
    search.addActionListener(this);
    search.setBounds(135,100,120,30);  
    f.add(search);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    JButton explore=new JButton("EXPLORE");  
    explore.setBounds(135,150,120,30);  
    f.add(explore);  
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
public void actionPerformed(ActionEvent buy){  
    tf.setText("Welcome to Javatpoint.");  

}}