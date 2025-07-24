/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictaetoe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;

/**
 *
 * @author USER
 */
public class hb_5x5 extends javax.swing.JFrame 
{
    private Timer timer;
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    private boolean isHumanTurn = true; // Flag to indicate if it's the human player's turn
    int tilesTaken = 1;
    
    public hb_5x5() 
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
        humanScoreLbl.setText(String.valueOf(xCount));
        robotScoreLbl.setText(String.valueOf(oCount));
    }
    
    private void chooseAPlayer()
    {
        if(isHumanTurn)
        {
            startGame = "X";
            statusLbl.setText("Robot Turn!");
        }
        else
        {
            startGame = "O";
            statusLbl.setText("Your Turn!");
            makeComputerMove();
        }
    }
    
    private void makeComputerMove() 
    {
        // Find an available empty tile to make a move
        for (int i = 1; i <= 25; i++) 
        {
            JButton button = getButtonByIndex(i);
            if (button.getText().isEmpty()) 
            {
                button.setText("O");
                button.setEnabled(true);
                tilesTaken++;
                winningGame();
                chooseAPlayer();
                break;
            }
        }
    }

    private JButton getButtonByIndex(int index) 
    {
        switch (index) 
        {
            case 1:
                return tilesBtn1;
            case 2:
                return tilesBtn2;
            case 3:
                return tilesBtn3;
            case 4:
                return tilesBtn4;
            case 5:
                return tilesBtn5;
            case 6:
                return tilesBtn6;
            case 7:
                return tilesBtn7;
            case 8:
                return tilesBtn8;
            case 9:
                return tilesBtn9;
            case 10:
                return tilesBtn10;
            case 11:
                return tilesBtn11;
            case 12:
                return tilesBtn12;
            case 13:
                return tilesBtn13;
            case 14:
                return tilesBtn14;
            case 15:
                return tilesBtn15;
            case 16:
                return tilesBtn16;
            case 17:
                return tilesBtn17;
            case 18:
                return tilesBtn18;
            case 19:
                return tilesBtn19;
            case 20:
                return tilesBtn20;
            case 21:
                return tilesBtn21;
            case 22:
                return tilesBtn22;
            case 23:
                return tilesBtn23;
            case 24:
                return tilesBtn24;
            case 25:
                return tilesBtn25;
            default:
                throw new IllegalArgumentException("Invalid button index: " + index);
        }
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
        String b17 = tilesBtn17.getText();
        String b18 = tilesBtn18.getText();
        String b19 = tilesBtn19.getText();
        String b20 = tilesBtn20.getText();
        String b21 = tilesBtn21.getText();
        String b22 = tilesBtn22.getText();
        String b23 = tilesBtn23.getText();
        String b24 = tilesBtn24.getText();
        String b25 = tilesBtn25.getText();
        
        //start if X win
        if(b1 == ("X") && b2 == ("X") && b3 == ("X") && b4 == ("X") && b5 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn2.setBackground(new Color (211, 224, 234));
            tilesBtn3.setBackground(new Color (211, 224, 234));
            tilesBtn4.setBackground(new Color (211, 224, 234));
            tilesBtn5.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b6 == ("X") && b7 == ("X") && b8 == ("X") && b9 == ("X") && b10 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn6.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn8.setBackground(new Color (211, 224, 234));
            tilesBtn9.setBackground(new Color (211, 224, 234));
            tilesBtn10.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b11 == ("X") && b12 == ("X") && b13 == ("X") && b14 == ("X") && b15 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn11.setBackground(new Color (211, 224, 234));
            tilesBtn12.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            tilesBtn14.setBackground(new Color (211, 224, 234));
            tilesBtn15.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b16 == ("X") && b17 == ("X") && b18 == ("X") && b19 == ("X") && b20 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn16.setBackground(new Color (211, 224, 234));
            tilesBtn17.setBackground(new Color (211, 224, 234));
            tilesBtn18.setBackground(new Color (211, 224, 234));
            tilesBtn19.setBackground(new Color (211, 224, 234));
            tilesBtn20.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b21 == ("X") && b22 == ("X") && b23 == ("X") && b24 == ("X") && b25 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn21.setBackground(new Color (211, 224, 234));
            tilesBtn22.setBackground(new Color (211, 224, 234));
            tilesBtn23.setBackground(new Color (211, 224, 234));
            tilesBtn24.setBackground(new Color (211, 224, 234));
            tilesBtn25.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b1 == ("X") && b6 == ("X") && b11 == ("X") && b16 == ("X") && b21 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn6.setBackground(new Color (211, 224, 234));
            tilesBtn11.setBackground(new Color (211, 224, 234));
            tilesBtn16.setBackground(new Color (211, 224, 234));
            tilesBtn21.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b2 == ("X") && b7 == ("X") && b12 == ("X") && b17 == ("X") && b22 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn2.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn12.setBackground(new Color (211, 224, 234));
            tilesBtn17.setBackground(new Color (211, 224, 234));
            tilesBtn22.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b3 == ("X") && b8 == ("X") && b13 == ("X") && b18 == ("X") && b23 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn3.setBackground(new Color (211, 224, 234));
            tilesBtn8.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            tilesBtn18.setBackground(new Color (211, 224, 234));
            tilesBtn23.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b4 == ("X") && b9 == ("X") && b14 == ("X") && b19 == ("X") && b24 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn4.setBackground(new Color (211, 224, 234));
            tilesBtn9.setBackground(new Color (211, 224, 234));
            tilesBtn14.setBackground(new Color (211, 224, 234));
            tilesBtn19.setBackground(new Color (211, 224, 234));
            tilesBtn24.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b5 == ("X") && b10 == ("X") && b15 == ("X") && b20 == ("X") && b25 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn5.setBackground(new Color (211, 224, 234));
            tilesBtn10.setBackground(new Color (211, 224, 234));
            tilesBtn15.setBackground(new Color (211, 224, 234));
            tilesBtn20.setBackground(new Color (211, 224, 234));
            tilesBtn25.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b1 == ("X") && b7 == ("X") && b13 == ("X") && b19 == ("X") && b25 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            tilesBtn19.setBackground(new Color (211, 224, 234));
            tilesBtn25.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        
        else if(b5 == ("X") && b9 == ("X") && b13 == ("X") && b17 == ("X") && b21 == ("X"))
        {
            statusLbl.setText("You Win!");
            tilesBtn5.setBackground(new Color (211, 224, 234));
            tilesBtn9.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            tilesBtn17.setBackground(new Color (211, 224, 234));
            tilesBtn21.setBackground(new Color (211, 224, 234));
            xCount++;
            gameScore();
        }
        //end if X win
        
        //start if O win
        if(b1 == ("O") && b2 == ("O") && b3 == ("O") && b4 == ("O") && b5 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn2.setBackground(new Color (211, 224, 234));
            tilesBtn3.setBackground(new Color (211, 224, 234));
            tilesBtn4.setBackground(new Color (211, 224, 234));
            tilesBtn5.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b6 == ("O") && b7 == ("O") && b8 == ("O") && b9 == ("O") && b10 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn6.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn8.setBackground(new Color (211, 224, 234));
            tilesBtn9.setBackground(new Color (211, 224, 234));
            tilesBtn10.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b11 == ("O") && b12 == ("O") && b13 == ("O") && b14 == ("O") && b15 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn11.setBackground(new Color (211, 224, 234));
            tilesBtn12.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            tilesBtn14.setBackground(new Color (211, 224, 234));
            tilesBtn15.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b16 == ("O") && b17 == ("O") && b18 == ("O") && b19 == ("O") && b20 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn16.setBackground(new Color (211, 224, 234));
            tilesBtn17.setBackground(new Color (211, 224, 234));
            tilesBtn18.setBackground(new Color (211, 224, 234));
            tilesBtn19.setBackground(new Color (211, 224, 234));
            tilesBtn20.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b21 == ("O") && b22 == ("O") && b23 == ("O") && b24 == ("O") && b25 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn21.setBackground(new Color (211, 224, 234));
            tilesBtn22.setBackground(new Color (211, 224, 234));
            tilesBtn23.setBackground(new Color (211, 224, 234));
            tilesBtn24.setBackground(new Color (211, 224, 234));
            tilesBtn25.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b1 == ("O") && b6 == ("O") && b11 == ("O") && b16 == ("O") && b21 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn6.setBackground(new Color (211, 224, 234));
            tilesBtn11.setBackground(new Color (211, 224, 234));
            tilesBtn16.setBackground(new Color (211, 224, 234));
            tilesBtn21.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b2 == ("O") && b7 == ("O") && b12 == ("O") && b17 == ("O") && b22 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn2.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn12.setBackground(new Color (211, 224, 234));
            tilesBtn17.setBackground(new Color (211, 224, 234));
            tilesBtn22.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b3 == ("O") && b8 == ("O") && b13 == ("O") && b18 == ("O") && b23 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn3.setBackground(new Color (211, 224, 234));
            tilesBtn8.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            tilesBtn18.setBackground(new Color (211, 224, 234));
            tilesBtn23.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b4 == ("O") && b9 == ("O") && b14 == ("O") && b19 == ("O") && b24 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn4.setBackground(new Color (211, 224, 234));
            tilesBtn9.setBackground(new Color (211, 224, 234));
            tilesBtn14.setBackground(new Color (211, 224, 234));
            tilesBtn19.setBackground(new Color (211, 224, 234));
            tilesBtn24.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b5 == ("O") && b10 == ("O") && b15 == ("O") && b20 == ("O") && b25 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn5.setBackground(new Color (211, 224, 234));
            tilesBtn10.setBackground(new Color (211, 224, 234));
            tilesBtn15.setBackground(new Color (211, 224, 234));
            tilesBtn20.setBackground(new Color (211, 224, 234));
            tilesBtn25.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b1 == ("O") && b7 == ("O") && b13 == ("O") && b19 == ("O") && b25 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn1.setBackground(new Color (211, 224, 234));
            tilesBtn7.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            tilesBtn19.setBackground(new Color (211, 224, 234));
            tilesBtn25.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        
        else if(b5 == ("O") && b9 == ("O") && b13 == ("O") && b17 == ("O") && b21 == ("O"))
        {
            statusLbl.setText("Robot Win!");
            tilesBtn5.setBackground(new Color (211, 224, 234));
            tilesBtn9.setBackground(new Color (211, 224, 234));
            tilesBtn13.setBackground(new Color (211, 224, 234));
            tilesBtn17.setBackground(new Color (211, 224, 234));
            tilesBtn21.setBackground(new Color (211, 224, 234));
            oCount++;
            gameScore();
        }
        //end if O win
        
        else if((b1== ("X")||b1==("O")) && (b2 == ("X") || b2==("O")) && (b3==("X")||b3==("O")) && (b4== ("X")||b4==("O")) && (b5== ("X")||b5==("O")) && 
                (b6== ("X")||b6==("O")) && (b7== ("X")||b7==("O")) && (b8== ("X")||b8==("O")) && (b9== ("X")||b9==("O")) && (b10== ("X")||b10==("O")) && 
                (b11== ("X")||b11==("O")) && (b12== ("X")||b12==("O")) && (b13==("X")||b13==("O")) && (b14==("X")||b14==("O")) && (b15== ("X")||b15==("O")) && 
                (b16== ("X")||b16==("O")) && (b17== ("X")||b17==("O")) && (b18== ("X")||b18==("O")) && (b19== ("X")||b19==("O")) && (b20== ("X")||b20==("O")) && 
                (b21== ("X")||b21==("O")) && (b22== ("X")||b22==("O")) && (b23== ("X")||b23==("O")) && (b24== ("X")||b24==("O")) && (b25== ("X")||b25==("O")))
        {
            statusLbl.setText("Game Draw!");
        }
    }
    
    //timer
    int j = 0;
    public void counTimer()
    {
        j++;
        timerLbl.setText(String.valueOf(j));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statusLbl = new javax.swing.JLabel();
        timerLbl = new javax.swing.JLabel();
        tilesLbl = new javax.swing.JLabel();
        humanScoreLbl = new javax.swing.JLabel();
        robotScoreLbl = new javax.swing.JLabel();
        newGameBtn = new javax.swing.JButton();
        playAgainBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
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
        tilesBtn17 = new javax.swing.JButton();
        tilesBtn18 = new javax.swing.JButton();
        tilesBtn19 = new javax.swing.JButton();
        tilesBtn20 = new javax.swing.JButton();
        tilesBtn21 = new javax.swing.JButton();
        tilesBtn22 = new javax.swing.JButton();
        tilesBtn23 = new javax.swing.JButton();
        tilesBtn24 = new javax.swing.JButton();
        tilesBtn25 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statusLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        statusLbl.setForeground(new java.awt.Color(39, 102, 120));
        statusLbl.setText("Your Turn!");
        getContentPane().add(statusLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        timerLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        timerLbl.setForeground(new java.awt.Color(39, 102, 120));
        timerLbl.setText("0");
        getContentPane().add(timerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 20, -1));

        tilesLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        tilesLbl.setForeground(new java.awt.Color(39, 102, 120));
        tilesLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boardicon.png"))); // NOI18N
        tilesLbl.setText("Tiles Taken: 0");
        getContentPane().add(tilesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        humanScoreLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        humanScoreLbl.setForeground(new java.awt.Color(39, 102, 120));
        humanScoreLbl.setText("0");
        getContentPane().add(humanScoreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 20, -1));

        robotScoreLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        robotScoreLbl.setForeground(new java.awt.Color(39, 102, 120));
        robotScoreLbl.setText("0");
        getContentPane().add(robotScoreLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 20, -1));

        newGameBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        newGameBtn.setForeground(new java.awt.Color(39, 102, 120));
        newGameBtn.setText("New Game");
        newGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameBtnActionPerformed(evt);
            }
        });
        getContentPane().add(newGameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        playAgainBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        playAgainBtn.setForeground(new java.awt.Color(39, 102, 120));
        playAgainBtn.setText("Play Again");
        playAgainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAgainBtnActionPerformed(evt);
            }
        });
        getContentPane().add(playAgainBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        exitBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(39, 102, 120));
        exitBtn.setText("X");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

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
        getContentPane().add(tilesBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 60));

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
        getContentPane().add(tilesBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 60));

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
        getContentPane().add(tilesBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 60));

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
        getContentPane().add(tilesBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, 60));

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
        getContentPane().add(tilesBtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, 60));

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
        getContentPane().add(tilesBtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 60));

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
        getContentPane().add(tilesBtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 60));

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
        getContentPane().add(tilesBtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, 60));

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
        getContentPane().add(tilesBtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 60));

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
        getContentPane().add(tilesBtn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, 60));

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
        getContentPane().add(tilesBtn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 60));

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
        getContentPane().add(tilesBtn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, 60));

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
        getContentPane().add(tilesBtn13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, 60));

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
        getContentPane().add(tilesBtn14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, 60));

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
        getContentPane().add(tilesBtn15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, 60));

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
        getContentPane().add(tilesBtn16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 60));

        tilesBtn17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn17.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn17.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn17.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn17.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn17ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 60));

        tilesBtn18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn18.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn18.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn18.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn18.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn18ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, 60));

        tilesBtn19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn19.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn19.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn19.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn19.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn19ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, 60));

        tilesBtn20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn20.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn20.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn20.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn20.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn20ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, 60));

        tilesBtn21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn21.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn21.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn21.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn21.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn21ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 60));

        tilesBtn22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn22.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn22.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn22.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn22.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn22ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, 60));

        tilesBtn23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn23.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn23.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn23.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn23.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn23ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, 60));

        tilesBtn24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn24.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn24.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn24.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn24.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn24ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, 60));

        tilesBtn25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        tilesBtn25.setForeground(new java.awt.Color(39, 102, 120));
        tilesBtn25.setMaximumSize(new java.awt.Dimension(80, 80));
        tilesBtn25.setMinimumSize(new java.awt.Dimension(80, 80));
        tilesBtn25.setPreferredSize(new java.awt.Dimension(80, 80));
        tilesBtn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tilesBtn25ActionPerformed(evt);
            }
        });
        getContentPane().add(tilesBtn25, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, 60));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(39, 102, 120));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/timericon.png"))); // NOI18N
        jLabel2.setText("Timer:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 102, 120));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/human.png"))); // NOI18N
        jLabel3.setText("Human:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(39, 102, 120));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/robot.png"))); // NOI18N
        jLabel1.setText("Robot:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

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
        tilesBtn17.setEnabled(true);
        tilesBtn18.setEnabled(true);
        tilesBtn19.setEnabled(true);
        tilesBtn20.setEnabled(true);
        tilesBtn21.setEnabled(true);
        tilesBtn22.setEnabled(true);
        tilesBtn23.setEnabled(true);
        tilesBtn24.setEnabled(true);
        tilesBtn25.setEnabled(true);
        
        xCount = 0;
        oCount = 0;
        humanScoreLbl.setText("0");
        robotScoreLbl.setText("0");
        
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
        tilesBtn17.setText("");
        tilesBtn18.setText("");
        tilesBtn19.setText("");
        tilesBtn20.setText("");
        tilesBtn21.setText("");
        tilesBtn22.setText("");
        tilesBtn23.setText("");
        tilesBtn24.setText("");
        tilesBtn25.setText("");
                
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
        tilesBtn17.setBackground(new Color (255,255,255));
        tilesBtn18.setBackground(new Color (255,255,255));
        tilesBtn19.setBackground(new Color (255,255,255));
        tilesBtn20.setBackground(new Color (255,255,255));
        tilesBtn21.setBackground(new Color (255,255,255));
        tilesBtn22.setBackground(new Color (255,255,255));
        tilesBtn23.setBackground(new Color (255,255,255));
        tilesBtn24.setBackground(new Color (255,255,255));
        tilesBtn25.setBackground(new Color (255,255,255));
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
        tilesBtn17.setEnabled(true);
        tilesBtn18.setEnabled(true);
        tilesBtn19.setEnabled(true);
        tilesBtn20.setEnabled(true);
        tilesBtn21.setEnabled(true);
        tilesBtn22.setEnabled(true);
        tilesBtn23.setEnabled(true);
        tilesBtn24.setEnabled(true);
        tilesBtn25.setEnabled(true);
                
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
        tilesBtn17.setText("");
        tilesBtn18.setText("");
        tilesBtn19.setText("");
        tilesBtn20.setText("");
        tilesBtn21.setText("");
        tilesBtn22.setText("");
        tilesBtn23.setText("");
        tilesBtn24.setText("");
        tilesBtn25.setText("");
                
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
        tilesBtn17.setBackground(new Color (255,255,255));
        tilesBtn18.setBackground(new Color (255,255,255));
        tilesBtn19.setBackground(new Color (255,255,255));
        tilesBtn20.setBackground(new Color (255,255,255));
        tilesBtn21.setBackground(new Color (255,255,255));
        tilesBtn22.setBackground(new Color (255,255,255));
        tilesBtn23.setBackground(new Color (255,255,255));
        tilesBtn24.setBackground(new Color (255,255,255));
        tilesBtn25.setBackground(new Color (255,255,255));
    }//GEN-LAST:event_playAgainBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        LoginPage lp = new LoginPage();
        lp.show();
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

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
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn1ActionPerformed

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
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn2ActionPerformed

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
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn3ActionPerformed

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
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn4ActionPerformed

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
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn5ActionPerformed

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
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn6ActionPerformed

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
        makeComputerMove();
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
        makeComputerMove();
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
        makeComputerMove();
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
        makeComputerMove();
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
        makeComputerMove();
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
        makeComputerMove();
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
        makeComputerMove();
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
        makeComputerMove();
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
        makeComputerMove();
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
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn16ActionPerformed

    private void tilesBtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn17ActionPerformed
        tilesBtn17.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn17ActionPerformed

    private void tilesBtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn18ActionPerformed
        tilesBtn18.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn18ActionPerformed

    private void tilesBtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn19ActionPerformed
        tilesBtn19.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn19ActionPerformed

    private void tilesBtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn20ActionPerformed
        tilesBtn20.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn20ActionPerformed

    private void tilesBtn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn21ActionPerformed
        tilesBtn21.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn21ActionPerformed

    private void tilesBtn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn22ActionPerformed
        tilesBtn22.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn22ActionPerformed

    private void tilesBtn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn23ActionPerformed
        tilesBtn23.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn23ActionPerformed

    private void tilesBtn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn24ActionPerformed
        tilesBtn24.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn24ActionPerformed

    private void tilesBtn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tilesBtn25ActionPerformed
        tilesBtn25.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            checker = false;
        }
        else
        {
            checker = true;
        }
        makeComputerMove();
        chooseAPlayer();
        tilesLbl.setText("Tiles Taken: " + tilesTaken++);
        winningGame();
    }//GEN-LAST:event_tilesBtn25ActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new hb_5x5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel humanScoreLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton newGameBtn;
    private javax.swing.JButton playAgainBtn;
    private javax.swing.JLabel robotScoreLbl;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JButton tilesBtn1;
    private javax.swing.JButton tilesBtn10;
    private javax.swing.JButton tilesBtn11;
    private javax.swing.JButton tilesBtn12;
    private javax.swing.JButton tilesBtn13;
    private javax.swing.JButton tilesBtn14;
    private javax.swing.JButton tilesBtn15;
    private javax.swing.JButton tilesBtn16;
    private javax.swing.JButton tilesBtn17;
    private javax.swing.JButton tilesBtn18;
    private javax.swing.JButton tilesBtn19;
    private javax.swing.JButton tilesBtn2;
    private javax.swing.JButton tilesBtn20;
    private javax.swing.JButton tilesBtn21;
    private javax.swing.JButton tilesBtn22;
    private javax.swing.JButton tilesBtn23;
    private javax.swing.JButton tilesBtn24;
    private javax.swing.JButton tilesBtn25;
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
