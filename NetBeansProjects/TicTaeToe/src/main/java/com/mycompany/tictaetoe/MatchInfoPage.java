/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictaetoe;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import swing.EventSwitchSelected;
import swing.SwitchButton;

/**
 *
 * @author USER
 */
public class MatchInfoPage extends javax.swing.JFrame 
{
    private boolean selected;
     
    public boolean isSelected()
    {
        return selected;
    }
    
    public void setSelected(boolean selected)
    {
        this.selected = selected;
    }
    
    public MatchInfoPage() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsMatchInfoLbl = new javax.swing.JLabel();
        matchInfoLbl = new javax.swing.JLabel();
        matchTimerPnl = new javax.swing.JPanel();
        matchTimerLbl = new javax.swing.JLabel();
        matchTimerDescLbl = new javax.swing.JLabel();
        onLbl1 = new javax.swing.JLabel();
        offLbl1 = new javax.swing.JLabel();
        switchButton1 = new swing.SwitchButton();
        boardInfoPnl = new javax.swing.JPanel();
        boardInfoLbl = new javax.swing.JLabel();
        boardInfoDescLbl = new javax.swing.JLabel();
        offLbl2 = new javax.swing.JLabel();
        onLbl2 = new javax.swing.JLabel();
        switchButton2 = new swing.SwitchButton();
        playerCounterPnl = new javax.swing.JPanel();
        playerCounterLbl = new javax.swing.JLabel();
        playerCounterDescLbl = new javax.swing.JLabel();
        offLbl3 = new javax.swing.JLabel();
        onLbl3 = new javax.swing.JLabel();
        switchButton3 = new swing.SwitchButton();
        backMatchInfoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(472, 486));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsMatchInfoLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        settingsMatchInfoLbl.setForeground(new java.awt.Color(39, 102, 120));
        settingsMatchInfoLbl.setText("Settings");
        getContentPane().add(settingsMatchInfoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 6, -1, -1));

        matchInfoLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        matchInfoLbl.setForeground(new java.awt.Color(39, 102, 120));
        matchInfoLbl.setText("Match Info");
        getContentPane().add(matchInfoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        matchTimerPnl.setBackground(new java.awt.Color(255, 255, 255));
        matchTimerPnl.setMaximumSize(new java.awt.Dimension(422, 90));
        matchTimerPnl.setMinimumSize(new java.awt.Dimension(422, 90));
        matchTimerPnl.setPreferredSize(new java.awt.Dimension(422, 90));
        matchTimerPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        matchTimerLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        matchTimerLbl.setForeground(new java.awt.Color(39, 102, 120));
        matchTimerLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/timericon.png"))); // NOI18N
        matchTimerLbl.setText("Match Timer");
        matchTimerPnl.add(matchTimerLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 18, -1, -1));

        matchTimerDescLbl.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        matchTimerDescLbl.setForeground(new java.awt.Color(39, 102, 120));
        matchTimerDescLbl.setText("Keep track of how long the match takes");
        matchTimerPnl.add(matchTimerDescLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        onLbl1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        onLbl1.setForeground(new java.awt.Color(39, 102, 120));
        onLbl1.setText("On");
        matchTimerPnl.add(onLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 30, 20));

        offLbl1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        offLbl1.setForeground(new java.awt.Color(39, 102, 120));
        matchTimerPnl.add(offLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        switchButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchButton1MouseClicked(evt);
            }
        });
        matchTimerPnl.add(switchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        getContentPane().add(matchTimerPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        boardInfoPnl.setBackground(new java.awt.Color(255, 255, 255));
        boardInfoPnl.setMaximumSize(new java.awt.Dimension(422, 90));
        boardInfoPnl.setMinimumSize(new java.awt.Dimension(422, 90));
        boardInfoPnl.setPreferredSize(new java.awt.Dimension(422, 90));
        boardInfoPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boardInfoLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        boardInfoLbl.setForeground(new java.awt.Color(39, 102, 120));
        boardInfoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boardicon.png"))); // NOI18N
        boardInfoLbl.setText("Board Info");
        boardInfoPnl.add(boardInfoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 19, -1, -1));

        boardInfoDescLbl.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        boardInfoDescLbl.setForeground(new java.awt.Color(39, 102, 120));
        boardInfoDescLbl.setText("Displays number of spots taken");
        boardInfoPnl.add(boardInfoDescLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 45, -1, -1));

        offLbl2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        offLbl2.setForeground(new java.awt.Color(39, 102, 120));
        boardInfoPnl.add(offLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        onLbl2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        onLbl2.setForeground(new java.awt.Color(39, 102, 120));
        onLbl2.setText("On");
        boardInfoPnl.add(onLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 30, 20));

        switchButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchButton2MouseClicked(evt);
            }
        });
        boardInfoPnl.add(switchButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        getContentPane().add(boardInfoPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        playerCounterPnl.setBackground(new java.awt.Color(255, 255, 255));
        playerCounterPnl.setMaximumSize(new java.awt.Dimension(422, 90));
        playerCounterPnl.setMinimumSize(new java.awt.Dimension(422, 90));
        playerCounterPnl.setPreferredSize(new java.awt.Dimension(422, 90));
        playerCounterPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playerCounterLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        playerCounterLbl.setForeground(new java.awt.Color(39, 102, 120));
        playerCounterLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/playercountericon.png"))); // NOI18N
        playerCounterLbl.setText("Player Counter");
        playerCounterPnl.add(playerCounterLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 12, -1, -1));

        playerCounterDescLbl.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        playerCounterDescLbl.setForeground(new java.awt.Color(39, 102, 120));
        playerCounterDescLbl.setText("Human or bot wins count");
        playerCounterPnl.add(playerCounterDescLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 38, -1, -1));

        offLbl3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        offLbl3.setForeground(new java.awt.Color(39, 102, 120));
        playerCounterPnl.add(offLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        onLbl3.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 14)); // NOI18N
        onLbl3.setForeground(new java.awt.Color(39, 102, 120));
        onLbl3.setText("On");
        playerCounterPnl.add(onLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 32, 20));

        switchButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchButton3MouseClicked(evt);
            }
        });
        playerCounterPnl.add(switchButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        getContentPane().add(playerCounterPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        backMatchInfoBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        backMatchInfoBtn.setForeground(new java.awt.Color(39, 102, 120));
        backMatchInfoBtn.setText("Back");
        backMatchInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMatchInfoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backMatchInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMatchInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMatchInfoBtnActionPerformed
        SettingsPage sp = new SettingsPage();
        sp.show();
        dispose();
    }//GEN-LAST:event_backMatchInfoBtnActionPerformed

    private void switchButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton1MouseClicked
        selected = !selected;
        
        if(!selected)
        {
            
            onLbl1.setText("On");
            onLbl1.setVisible(true);
            offLbl1.setVisible(false);
        }
        else
        {
            offLbl1.setText("Off");
            offLbl1.setVisible(true);
            onLbl1.setVisible(false);
        }
    }//GEN-LAST:event_switchButton1MouseClicked

    private void switchButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton2MouseClicked
      
        selected = !selected;
        
        if(!selected)
        {
            onLbl2.setText("On");
            onLbl2.setVisible(true);
            offLbl2.setVisible(false);
        }
        else
        {
            offLbl2.setText("Off");
            offLbl2.setVisible(true);
            onLbl2.setVisible(false);
        }
    }//GEN-LAST:event_switchButton2MouseClicked

    private void switchButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchButton3MouseClicked
        selected = !selected;
        
        if(!selected)
        {
            onLbl3.setText("On");
            onLbl3.setVisible(true);
            offLbl3.setVisible(false);
        }
        else
        {
            offLbl3.setText("Off");
            offLbl3.setVisible(true);
            onLbl3.setVisible(false);
        }
    }//GEN-LAST:event_switchButton3MouseClicked
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MatchInfoPage().setVisible(true);
            }
        });
    }

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backMatchInfoBtn;
    private javax.swing.JLabel boardInfoDescLbl;
    private javax.swing.JLabel boardInfoLbl;
    private javax.swing.JPanel boardInfoPnl;
    private javax.swing.JLabel matchInfoLbl;
    private javax.swing.JLabel matchTimerDescLbl;
    private javax.swing.JLabel matchTimerLbl;
    private javax.swing.JPanel matchTimerPnl;
    private javax.swing.JLabel offLbl1;
    private javax.swing.JLabel offLbl2;
    private javax.swing.JLabel offLbl3;
    private javax.swing.JLabel onLbl1;
    private javax.swing.JLabel onLbl2;
    private javax.swing.JLabel onLbl3;
    private javax.swing.JLabel playerCounterDescLbl;
    private javax.swing.JLabel playerCounterLbl;
    private javax.swing.JPanel playerCounterPnl;
    private javax.swing.JLabel settingsMatchInfoLbl;
    private swing.SwitchButton switchButton1;
    private swing.SwitchButton switchButton2;
    private swing.SwitchButton switchButton3;
    // End of variables declaration//GEN-END:variables
}
