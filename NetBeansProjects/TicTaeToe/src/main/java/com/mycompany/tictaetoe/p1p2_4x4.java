/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictaetoe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author USER
 */
public class p1p2_4x4 extends javax.swing.JFrame 
{
    private Timer timer;
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    int tilesTaken = 1;
    
    public p1p2_4x4() 
    {
        initComponents();
        timer = new Timer(1000, new ActionListener() //1000=1sec
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //throw new UnsupportedOperationException("Not supported yet");
                counTimer();
            }
        }); 
        timer.start();
    }

    private void gameScore()
    {
        p1ScoreLbl.setText(String.valueOf(xCount));
        p2ScoreLbl.setText(String.valueOf(oCount));
    }
    
    private void chooseAPlayer()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
            statusLbl.setText("Your Friend Turn!");
        }
        
        else
        {
            startGame = "X";
            statusLbl.setText("Your Turn");
        }
    }
    
    //timer
    int j = 0;
    public void counTimer()
    {
        j++;
        timerLbl.setText(String.valueOf(j));
    }
    
    private void winningGame()
    {
        String b1 = tilesBtn1.getText();
        String b2 = tilesBtn2.getText();
        String b3 = tilesBtn3.getText();
        String b4 = tilesBtn4.getText();
        String b5 = tilesBtn5.getText();
        String b6 = tilesBtn6.getText();
        String b7 = tilesBtn7.getText();
        String b8 = tilesBtn8.getText();
        String b9 = tilesBtn9.getText();
        String b10 = tilesBtn10.getText();
        String b11 = tilesBtn11.getText();
        String b12 = tilesBtn12.getText();
        String b13 = tilesBtn13.getText();
        String b14 = tilesBtn14.getText();
        String b15 = tilesBtn15.getText();
        String b16 = tilesBtn16.getText();
        
        //start if X win
        if(b1 == ("X") && b2 == ("X") && b3 == ("X") && b4 == ("X"))
        {
            statusLbl.setText("Player X Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn2.setBackground(new Color (211, 224, 234));
            tilesBtn3.setBackground(new Color (211, 224, 234));
            tilesBtn4.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b5 == ("X") && b6 == ("X") && b7 == ("X") && b8 == ("X"))
        {
            statusLbl.setText("Player X Win!");
            tilesBtn5.setBackground(new Color (211, 224, 234));
            tilesBtn6.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn8.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b9 == ("X") && b10 == ("X") && b11 == ("X") && b12 == ("X"))
        {
            statusLbl.setText("Player X Win!");
            tilesBtn9.setBackground(new Color (211, 224, 234));
            tilesBtn10.setBackground(new Color (211, 224, 234));
            tilesBtn11.setBackground(new Color (211, 224, 234));
            tilesBtn12.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b13 == ("X") && b14 == ("X") && b15 == ("X") && b16 == ("X"))
        {
            statusLbl.setText("Player X Win!");
            tilesBtn13.setBackground(new Color (211, 224, 234));
            tilesBtn14.setBackground(new Color (211, 224, 234));
            tilesBtn15.setBackground(new Color (211, 224, 234));
            tilesBtn16.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b1 == ("X") && b5 == ("X") && b9 == ("X") && b13 == ("X"))
        {
            statusLbl.setText("Player X Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn5.setBackground(new Color (211, 224, 234));
            tilesBtn9.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b2 == ("X") && b6 == ("X") && b10 == ("X") && b14 == ("X"))
        {
            statusLbl.setText("Player X Win!");
            tilesBtn2.setBackground(new Color (211, 224, 234));
            tilesBtn6.setBackground(new Color (211, 224, 234));
            tilesBtn10.setBackground(new Color (211, 224, 234));
            tilesBtn14.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b3 == ("X") && b7 == ("X") && b11 == ("X") && b15 == ("X"))
        {
            statusLbl.setText("Player X Win!");
            tilesBtn3.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn11.setBackground(new Color (211, 224, 234));
            tilesBtn15.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b4 == ("X") && b8 == ("X") && b12 == ("X") && b16 == ("X"))
        {
            statusLbl.setText("Player X Win!");
            tilesBtn4.setBackground(new Color (211, 224, 234));
            tilesBtn8.setBackground(new Color (211, 224, 234));
            tilesBtn12.setBackground(new Color (211, 224, 234));
            tilesBtn16.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b1 == ("X") && b6 == ("X") && b11 == ("X") && b16 == ("X"))
        {
            statusLbl.setText("Player X Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn6.setBackground(new Color (211, 224, 234));
            tilesBtn11.setBackground(new Color (211, 224, 234));
            tilesBtn16.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b4 == ("X") && b7 == ("X") && b10 == ("X") && b13 == ("X"))
        {
            statusLbl.setText("Player X Win!");
            tilesBtn4.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn10.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        //end if X win
        
        //start if O win
        if(b1 == ("O") && b2 == ("O") && b3 == ("O") && b4 == ("O"))
        {
            statusLbl.setText("Player O Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn2.setBackground(new Color (211, 224, 234));
            tilesBtn3.setBackground(new Color (211, 224, 234));
            tilesBtn4.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b5 == ("O") && b6 == ("O") && b7 == ("O") && b8 == ("O"))
        {
            statusLbl.setText("Player O Win!");
            tilesBtn5.setBackground(new Color (211, 224, 234));
            tilesBtn6.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn8.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b9 == ("O") && b10 == ("O") && b11 == ("O") && b12 == ("O"))
        {
            statusLbl.setText("Player O Win!");
            tilesBtn9.setBackground(new Color (211, 224, 234));
            tilesBtn10.setBackground(new Color (211, 224, 234));
            tilesBtn11.setBackground(new Color (211, 224, 234));
            tilesBtn12.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b13 == ("O") && b14 == ("O") && b15 == ("O") && b16 == ("O"))
        {
            statusLbl.setText("Player O Win!");
            tilesBtn13.setBackground(new Color (211, 224, 234));
            tilesBtn14.setBackground(new Color (211, 224, 234));
            tilesBtn15.setBackground(new Color (211, 224, 234));
            tilesBtn16.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b1 == ("O") && b5 == ("O") && b9 == ("O") && b13 == ("O"))
        {
            statusLbl.setText("Player O Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn5.setBackground(new Color (211, 224, 234));
            tilesBtn9.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b2 == ("O") && b6 == ("O") && b10 == ("O") && b14 == ("O"))
        {
            statusLbl.setText("Player O Win!");
            tilesBtn2.setBackground(new Color (211, 224, 234));
            tilesBtn6.setBackground(new Color (211, 224, 234));
            tilesBtn10.setBackground(new Color (211, 224, 234));
            tilesBtn14.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b3 == ("O") && b7 == ("O") && b11 == ("O") && b15 == ("O"))
        {
            statusLbl.setText("Player O Win!");
            tilesBtn3.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn11.setBackground(new Color (211, 224, 234));
            tilesBtn15.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b4 == ("O") && b8 == ("O") && b12 == ("O") && b16 == ("O"))
        {
            statusLbl.setText("Player O Win!");
            tilesBtn4.setBackground(new Color (211, 224, 234));
            tilesBtn8.setBackground(new Color (211, 224, 234));
            tilesBtn12.setBackground(new Color (211, 224, 234));
            tilesBtn16.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b1 == ("O") && b6 == ("O") && b11 == ("O") && b16 == ("O"))
        {
            statusLbl.setText("Player O Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn6.setBackground(new Color (211, 224, 234));
            tilesBtn11.setBackground(new Color (211, 224, 234));
            tilesBtn16.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b4 == ("O") && b7 == ("O") && b10 == ("O") && b13 == ("O"))
        {
            statusLbl.setText("Player O Win!");
            tilesBtn4.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn10.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        //end if O win
        
        else if((b1== ("X")||b1==("O")) && (b2 == ("X") || b2==("O")) && (b3==("X")||b3==("O")) && (b4== ("X")||b4==("O")) && 
                (b5== ("X")||b5==("O")) && (b6== ("X")||b6==("O")) && (b7== ("X")||b7==("O")) && (b8== ("X")||b8==("O")) && 
                (b9== ("X")||b9==("O")) && (b10== ("X")||b10==("O")) && (b11== ("X")||b11==("O")) && (b12== ("X")||b12==("O")) && 
                (b13==("X")||b13==("O")) && (b14==("X")||b14==("O")) && (b15== ("X")||b15==("O")) && (b16== ("X")||b16==("O")))
        {
            statusLbl.setText("Game Draw!");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        newGameBtn = new javax.swing.JButton();
        playAgainBtn = new javax.swing.JButton();
        timerLbl = new javax.swing.JLabel();
        tilesLbl = new javax.swing.JLabel();
        p2ScoreLbl = new javax.swing.JLabel();
        p1ScoreLbl = new javax.swing.JLabel();
        tilesBtn1 = new javax.swing.JButton();
        tilesBtn2 = new javax.swing.JButton();
        tilesBtn3 = new javax.swing.JButton();
        tilesBtn4 = new javax.swing.JButton();
        tilesBtn5 = new javax.swing.JButton();
        tilesBtn6 = new javax.swing.JButton();
        tilesBtn7 = new javax.swing.JButton();
        tilesBtn8 = new javax.swing.JButton();
        tilesBtn9 = new javax.swing.JButton();
        tilesBtn10 = new javax.swing.JButton();
        tilesBtn11 = new javax.swing.JButton();
        tilesBtn12 = new javax.swing.JButton();
        tilesBtn13 = new javax.swing.JButton();
        tilesBtn14 = new javax.swing.JButton();
        tilesBtn15 = new javax.swing.JButton();
        tilesBtn16 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statusLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        statusLbl.setForeground(new java.awt.Color(39, 102, 120));
        statusLbl.setText("Your Turn!");
        getContentPane().add(statusLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        exitBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(39, 102, 120));
        exitBtn.setText("X");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        newGameBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        newGameBtn.setForeground(new java.awt.Color(39, 102, 120));
        newGameBtn.setText("New Game");
        newGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newGameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        playAgainBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        playAgainBtn.setForeground(new java.awt.Color(39, 102, 120));
        playAgainBtn.setText("Play Again");
        playAgainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainBtnActionPerformed(evt);
            }
        });
        getContentPane().add(playAgainBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        timerLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        timerLbl.setForeground(new java.awt.Color(39, 102, 120));
        timerLbl.setText("0");
        getContentPane().add(timerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 20, -1));

        tilesLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        tilesLbl.setForeground(new java.awt.Color(39, 102, 120));
        tilesLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boardicon.png"))); // NOI18N
        tilesLbl.setText("Tiles Taken: 0");
        getContentPane().add(tilesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        p2ScoreLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        p2ScoreLbl.setForeground(new java.awt.Color(39, 102, 120));
        p2ScoreLbl.setText("0");
        getContentPane().add(p2ScoreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 20, -1));

        p1ScoreLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        p1ScoreLbl.setForeground(new java.awt.Color(39, 102, 120));
        p1ScoreLbl.setText("0");
        getContentPane().add(p1ScoreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 20, -1));

        tilesBtn1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn1.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn1.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn1.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn1.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 63));

        tilesBtn2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn2.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn2.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn2.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn2.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, 63));

        tilesBtn3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn3.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn3.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn3.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn3.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, 63));

        tilesBtn4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn4.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn4.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn4.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn4.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 63));

        tilesBtn5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn5.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn5.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn5.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn5.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, 63));

        tilesBtn6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn6.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn6.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn6.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn6.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, 63));

        tilesBtn7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn7.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn7.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn7.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn7.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, 63));

        tilesBtn8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn8.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn8.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn8.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn8.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, 63));

        tilesBtn9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn9.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn9.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn9.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn9.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 63));

        tilesBtn10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn10.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn10.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn10.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn10.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn10ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, 63));

        tilesBtn11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn11.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn11.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn11.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn11.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn11ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, 63));

        tilesBtn12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn12.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn12.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn12.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn12.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn12ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, 63));

        tilesBtn13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn13.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn13.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn13.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn13.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn13ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 63));

        tilesBtn14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn14.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn14.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn14.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn14.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn14ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, 63));

        tilesBtn15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn15.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn15.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn15.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn15.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn15ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, 63));

        tilesBtn16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn16.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn16.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn16.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn16.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn16ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, 63));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 102, 120));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/human.png"))); // NOI18N
        jLabel3.setText("Player 1:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(39, 102, 120));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/timericon.png"))); // NOI18N
        jLabel2.setText("Timer:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(39, 102, 120));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/human.png"))); // NOI18N
        jLabel1.setText("Player 2:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameBtnActionPerformed
        tilesBtn1.setEnabled(true);
        tilesBtn2.setEnabled(true);
        tilesBtn3.setEnabled(true);
        tilesBtn4.setEnabled(true);
        tilesBtn5.setEnabled(true);
        tilesBtn6.setEnabled(true);
        tilesBtn7.setEnabled(true);
        tilesBtn8.setEnabled(true);
        tilesBtn9.setEnabled(true);
        tilesBtn10.setEnabled(true);
        tilesBtn11.setEnabled(true);
        tilesBtn12.setEnabled(true);
        tilesBtn13.setEnabled(true);
        tilesBtn14.setEnabled(true);
        tilesBtn15.setEnabled(true);
        tilesBtn16.setEnabled(true);

        xCount = 0;
        oCount = 0;
        p1ScoreLbl.setText("0");
        p2ScoreLbl.setText("0");
        
        tilesTaken = 0;
        tilesLbl.setText("Tiles Taken: "+tilesTaken++);
        j=0;
        
        tilesBtn1.setText("");
        tilesBtn2.setText("");
        tilesBtn3.setText("");
        tilesBtn4.setText("");
        tilesBtn5.setText("");
        tilesBtn6.setText("");
        tilesBtn7.setText("");
        tilesBtn8.setText("");
        tilesBtn9.setText("");
        tilesBtn10.setText("");
        tilesBtn11.setText("");
        tilesBtn12.setText("");
        tilesBtn13.setText("");
        tilesBtn14.setText("");
        tilesBtn15.setText("");
        tilesBtn16.setText("");
                
        tilesBtn1.setBackground(new Color (255,255,255));
        tilesBtn2.setBackground(new Color (255,255,255));
        tilesBtn3.setBackground(new Color (255,255,255));
        tilesBtn4.setBackground(new Color (255,255,255));
        tilesBtn5.setBackground(new Color (255,255,255));
        tilesBtn6.setBackground(new Color (255,255,255));
        tilesBtn7.setBackground(new Color (255,255,255));
        tilesBtn8.setBackground(new Color (255,255,255));
        tilesBtn9.setBackground(new Color (255,255,255));
        tilesBtn10.setBackground(new Color (255,255,255));
        tilesBtn11.setBackground(new Color (255,255,255));
        tilesBtn12.setBackground(new Color (255,255,255));
        tilesBtn13.setBackground(new Color (255,255,255));
        tilesBtn14.setBackground(new Color (255,255,255));
        tilesBtn15.setBackground(new Color (255,255,255));
        tilesBtn16.setBackground(new Color (255,255,255));
    }//GEN-LAST:event_newGameBtnActionPerformed

    private void playAgainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAgainBtnActionPerformed
        tilesBtn1.setEnabled(true);
        tilesBtn2.setEnabled(true);
        tilesBtn3.setEnabled(true);
        tilesBtn4.setEnabled(true);
        tilesBtn5.setEnabled(true);
        tilesBtn6.setEnabled(true);
        tilesBtn7.setEnabled(true);
        tilesBtn8.setEnabled(true);
        tilesBtn9.setEnabled(true);
        tilesBtn10.setEnabled(true);
        tilesBtn11.setEnabled(true);
        tilesBtn12.setEnabled(true);
        tilesBtn13.setEnabled(true);
        tilesBtn14.setEnabled(true);
        tilesBtn15.setEnabled(true);
        tilesBtn16.setEnabled(true);
        
        tilesBtn1.setText("");
        tilesBtn2.setText("");
        tilesBtn3.setText("");
        tilesBtn4.setText("");
        tilesBtn5.setText("");
        tilesBtn6.setText("");
        tilesBtn7.setText("");
        tilesBtn8.setText("");
        tilesBtn9.setText("");
        tilesBtn10.setText("");
        tilesBtn11.setText("");
        tilesBtn12.setText("");
        tilesBtn13.setText("");
        tilesBtn14.setText("");
        tilesBtn15.setText("");
        tilesBtn16.setText("");
                
        tilesBtn1.setBackground(new Color (255,255,255));
        tilesBtn2.setBackground(new Color (255,255,255));
        tilesBtn3.setBackground(new Color (255,255,255));
        tilesBtn4.setBackground(new Color (255,255,255));
        tilesBtn5.setBackground(new Color (255,255,255));
        tilesBtn6.setBackground(new Color (255,255,255));
        tilesBtn7.setBackground(new Color (255,255,255));
        tilesBtn8.setBackground(new Color (255,255,255));
        tilesBtn9.setBackground(new Color (255,255,255));
        tilesBtn10.setBackground(new Color (255,255,255));
        tilesBtn11.setBackground(new Color (255,255,255));
        tilesBtn12.setBackground(new Color (255,255,255));
        tilesBtn13.setBackground(new Color (255,255,255));
        tilesBtn14.setBackground(new Color (255,255,255));
        tilesBtn15.setBackground(new Color (255,255,255));
        tilesBtn16.setBackground(new Color (255,255,255));
    }//GEN-LAST:event_playAgainBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        LoginPage lp = new LoginPage();
        lp.show();
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void tilesBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn6ActionPerformed
        tilesBtn6.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }

        chooseAPlayer();

        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn6ActionPerformed

    private void tilesBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn5ActionPerformed
        tilesBtn5.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }

        chooseAPlayer();

        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn5ActionPerformed

    private void tilesBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn4ActionPerformed
        tilesBtn4.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }

        chooseAPlayer();

        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn4ActionPerformed

    private void tilesBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn3ActionPerformed
        tilesBtn3.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }

        chooseAPlayer();

        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn3ActionPerformed

    private void tilesBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn2ActionPerformed
        tilesBtn2.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }

        chooseAPlayer();

        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn2ActionPerformed

    private void tilesBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn1ActionPerformed
        tilesBtn1.setText(startGame);

        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }

        chooseAPlayer();

        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn1ActionPerformed

    private void tilesBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn7ActionPerformed
        tilesBtn7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        
        chooseAPlayer();
        
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn7ActionPerformed

    private void tilesBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn8ActionPerformed
        tilesBtn8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        
        chooseAPlayer();
        
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn8ActionPerformed

    private void tilesBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn9ActionPerformed
        tilesBtn9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        
        chooseAPlayer();
        
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn9ActionPerformed

    private void tilesBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn10ActionPerformed
        tilesBtn10.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        
        chooseAPlayer();
        
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn10ActionPerformed

    private void tilesBtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn11ActionPerformed
        tilesBtn11.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        
        chooseAPlayer();
        
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn11ActionPerformed

    private void tilesBtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn12ActionPerformed
        tilesBtn12.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        
        chooseAPlayer();
        
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn12ActionPerformed

    private void tilesBtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn13ActionPerformed
        tilesBtn13.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        
        chooseAPlayer();
        
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn13ActionPerformed

    private void tilesBtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn14ActionPerformed
        tilesBtn14.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        
        chooseAPlayer();
        
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn14ActionPerformed

    private void tilesBtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn15ActionPerformed
        tilesBtn15.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        
        chooseAPlayer();
        
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn15ActionPerformed

    private void tilesBtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn16ActionPerformed
        tilesBtn16.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        
        chooseAPlayer();
        
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);

        winningGame();
    }//GEN-LAST:event_tilesBtn16ActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new p1p2_4x4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton newGameBtn;
    private javax.swing.JLabel p1ScoreLbl;
    private javax.swing.JLabel p2ScoreLbl;
    private javax.swing.JButton playAgainBtn;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JButton tilesBtn1;
    private javax.swing.JButton tilesBtn10;
    private javax.swing.JButton tilesBtn11;
    private javax.swing.JButton tilesBtn12;
    private javax.swing.JButton tilesBtn13;
    private javax.swing.JButton tilesBtn14;
    private javax.swing.JButton tilesBtn15;
    private javax.swing.JButton tilesBtn16;
    private javax.swing.JButton tilesBtn2;
    private javax.swing.JButton tilesBtn3;
    private javax.swing.JButton tilesBtn4;
    private javax.swing.JButton tilesBtn5;
    private javax.swing.JButton tilesBtn6;
    private javax.swing.JButton tilesBtn7;
    private javax.swing.JButton tilesBtn8;
    private javax.swing.JButton tilesBtn9;
    private javax.swing.JLabel tilesLbl;
    private javax.swing.JLabel timerLbl;
    // End of variables declaration//GEN-END:variables
}
