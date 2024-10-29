/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tic.tac.toe.game;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class First implements ActionListener
{
    JFrame jf1;
    JLabel jl1,jl2;
    JTextField jt1,jt2;
    JButton jb1;
    First()
    {
        jf1=new JFrame("TicTac");
        
        jf1.setSize(400, 400);
        jf1.setLocationRelativeTo(null);
        jf1.setDefaultCloseOperation(3);
        jf1.setLayout(null);
        jl1=new JLabel("Enter Player one (X)");
        jl1.setBounds(20, 50, 150, 30);
        jf1.add(jl1);
        
        
        jt1=new JTextField();
        jt1.setBounds(170, 50, 200, 30);
        jf1.add(jt1);
        
        
        jl2=new JLabel("Enter Player two (0)");
        jl2.setBounds(20, 100, 150, 30);
        jf1.add(jl2);
        
        
        jt2=new JTextField();
        jt2.setBounds(170, 100, 200, 30);
        jf1.add(jt2);
        
        jb1=new JButton("Start");
        jb1.setBounds(90, 170, 100, 30);
        jb1.addActionListener(this);
        jf1.add(jb1);
        jf1.setVisible(true);
    
   }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==jb1){
             String player1=jt1.getText();
             String player2=jt2.getText();
            Second ob =new Second(player1,player2,5);
            ob.openGamePanal();
            jf1.setVisible(false);
         }
    }
  
     
    
}
