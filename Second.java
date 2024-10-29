/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tic.tac.toe.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class Second implements ActionListener
{
    JFrame jf;
    JButton[] jb;
    static int count=0;
    String str;
    String ti_str="X";
    
    Color color1;
    
    String player1, player2;
    String person,person1;
    int no_series;
    int no=1;
    int player1_win=0;
    int player2_win=0;
    
    Second(String player1,String player2,int no_series)
    {
        this.player1=player1;
        this.player2=player2;
        this.no_series=no_series;
    }
    void openGamePanal()
    {
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        jf=new JFrame();
        
        
        jf.setTitle(player1+"("+ti_str+")"+"turn");
        jf.setSize(400, 400);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(3);
        
        jf.setLayout(new GridLayout(3,3));
        jb=new JButton[10];
        for(int i=0;i<9;i++)
        {
            jb[i+1]=new JButton();
            jb[i+1].addActionListener(this);
            jf.add(jb[i+1]);
        }
        jf.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
         
            count=count+1;
            if(count%2==0)
            {
                str="0";
                ti_str="X";
            
                jf.setTitle(player1+"("+ti_str+")"+"turn");
            
                color1=Color.yellow;
            
            }
            else
            {
                str="X";
                ti_str="0";
                jf.setTitle(player2+"("+ti_str+")"+"turn");
            
                color1=Color.red;
           
            }
            for(int i=0;i<9;i++)
            {
                if(e.getSource()==jb[i+1])
                {
                    jb[i+1].setBackground(color1);
                    jb[i+1].setFont(new Font("Arial", 1, 50));
                    jb[i+1].setText(str);
                    jb[i+1].setEnabled(false);
            
                }
            }
            
            
     
       
        winning();
        
    }
    void winning()
    {
        
        if(str.equals("0"))
        {
            person=player2;
            
            
        }
        else
        {
            person=player1;
        }
        for(int i=0;i<9;i++)
        {
            if(jb[1].getText()==jb[2].getText()&&jb[2].getText()==jb[3].getText()&&jb[1].getText()!="")
            {
                JOptionPane.showMessageDialog(jf,person+" "+"Wins");

                count=count+1;

                noOfSeries();
            }
            else if(jb[4].getText()==jb[5].getText()&&jb[5].getText()==jb[6].getText()&&jb[4].getText()!="")
            {
                JOptionPane.showMessageDialog(jf,person+" "+"Wins");
                count=count+1;
                noOfSeries();
            }
            else if(jb[7].getText()==jb[8].getText()&&jb[8].getText()==jb[9].getText()&&jb[7].getText()!="")
            {
                JOptionPane.showMessageDialog(jf,person+" "+"Wins");
                count=count+1;
                noOfSeries();
            }
            else if(jb[1].getText()==jb[4].getText()&&jb[4].getText()==jb[7].getText()&&jb[1].getText()!="")
            {
                JOptionPane.showMessageDialog(jf,person+" "+"Wins");
                 count=count+1;
                noOfSeries();
            }
            else if(jb[2].getText()==jb[5].getText()&&jb[5].getText()==jb[8].getText()&&jb[2].getText()!="")
            {
                JOptionPane.showMessageDialog(jf,person+" "+"Wins");
                count=count+1;
                noOfSeries();
            }
            else if(jb[3].getText()==jb[6].getText()&&jb[6].getText()==jb[9].getText()&&jb[3].getText()!="")
            {
                JOptionPane.showMessageDialog(jf,person+" "+"Wins");
                count=count+1;
                noOfSeries();
            }
            else if(jb[1].getText()==jb[5].getText()&&jb[5].getText()==jb[9].getText()&&jb[1].getText()!="")
            {
                JOptionPane.showMessageDialog(jf,person+" "+"Wins");
                 count=count+1;
                noOfSeries();
            }
            else if(jb[3].getText()==jb[5].getText()&&jb[5].getText()==jb[7].getText()&&jb[3].getText()!="")
            {
               JOptionPane.showMessageDialog(jf,person+" "+"Wins");
               count=count+1;
               noOfSeries();
            }
            else if (jb[1].getText()!=""&&jb[2].getText()!=""&&jb[3].getText()!=""&&jb[4].getText()!=""&&jb[5].getText()!=""&&jb[6].getText()!=""&&jb[7].getText()!=""&&jb[8].getText()!=""&&jb[9].getText()!="")
            {
               JOptionPane.showMessageDialog(jf,"Game Draw"); 
               count=count+1;
               noOfSeries();
            }
            
        }
         
                 
    }
    void noOfSeries()
    {
        
        
        if(no_series>no)
        {
            restart();
            no++;
        }
        else
        {
//            System.out.println("hi");
            if(player1_win<player2_win)
            {
              JOptionPane.showMessageDialog(jf,player2+" "+"Wins");
            }
            else if(player1_win>player2_win)
            {
                JOptionPane.showMessageDialog(jf, player1+" "+"Wins");
            }
            else{
                JOptionPane.showMessageDialog(jf,"game Draw");
            }
            
        }
    }
    void restart()
    {
        
       
            int i=JOptionPane.showConfirmDialog(jf, "Do you want restart");
        
       
            if (i==0)
            {
            
                for(int j=0;j<9;j++)
                {
                   jb[j+1].setText(""); 
                }
                
                for(int j=0;j<9;j++)
                {
                   jb[j+1].setBackground(null);
                }
                setEnabling(true);

                String s=person;
                if(s.equals(player1)){
                    jf.setTitle(person+"("+str+")"+"turn");
                    player1_win++;
               
               
                }
                else if(s.equals(player2)){
                    jf.setTitle(person+"("+str+")"+"turn");
                    player2_win++;
                }
                str="";

            }
            else if(i==1)
            {
                System.exit(0);
            }
            else 
            {
                setEnabling(false);
            }

    }
    void setEnabling(boolean b)
    {
        for(int i=0;i<9;i++)
        {
           jb[i+1].setEnabled(b); 
        }
        
        
    }
}
