/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictaetoe;

/**
 *
 * @author USER
 */
public class LoginPage extends javax.swing.JFrame 
{
    private static String selectedGameMode;
    private static String selectedBoardSize;

    public static void setSelectedOptions(String gameMode, String boardSize) 
    {
        selectedGameMode = gameMode;
        selectedBoardSize = boardSize;
    }
    
    public LoginPage() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameTitleLbl = new javax.swing.JLabel();
        startBtn = new javax.swing.JButton();
        settingsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(191, 219, 56));
        setPreferredSize(new java.awt.Dimension(400, 300));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gameTitleLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        gameTitleLbl.setForeground(new java.awt.Color(39, 102, 120));
        gameTitleLbl.setText("Tic-Tae-Toe");
        getContentPane().add(gameTitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 6, -1, -1));

        startBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        startBtn.setForeground(new java.awt.Color(39, 102, 120));
        startBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/starticon.png"))); // NOI18N
        startBtn.setText("Start");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });
        getContentPane().add(startBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 94, -1, -1));

        settingsBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        settingsBtn.setForeground(new java.awt.Color(39, 102, 120));
        settingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/settingsicon.png"))); // NOI18N
        settingsBtn.setText("Settings");
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(settingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
        SettingsPage sp = new SettingsPage();
        sp.show();
        dispose();
    }//GEN-LAST:event_settingsBtnActionPerformed

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        hb_3x3 d = new hb_3x3();
        d.setVisible(true);
        dispose();
        if (selectedGameMode.equals("MultiPlayer")) 
         {
            if (selectedBoardSize.equals("Default")) 
            {
                p1p2_3x3 m3 = new p1p2_3x3();
                m3.setVisible(true);
            } 
            else if (selectedBoardSize.equals("4x4")) 
            {
                p1p2_4x4 m4 = new p1p2_4x4();
                m4.setVisible(true);
            } 
            else if (selectedBoardSize.equals("5x5")) 
            {
                p1p2_5x5 m5 = new p1p2_5x5();
                m5.setVisible(true);
            } 
            else if (selectedBoardSize.equals("6x6")) 
            {
                p1p2_6x6 m6 = new p1p2_6x6();
                m6.setVisible(true);
            }
        } 
        else if (selectedGameMode.equals("Singleplayer")) 
        {
            if (selectedBoardSize.equals("Default")) 
            {
                hb_3x3 s3 = new hb_3x3();
                s3.setVisible(true);
            } 
            else if (selectedBoardSize.equals("4x4")) 
            {
                hb_4x4 s4 = new hb_4x4();
                s4.setVisible(true);
            } 
            else if (selectedBoardSize.equals("5x5")) 
            {
                hb_5x5 s5 = new hb_5x5();
                s5.setVisible(true);
            } 
            else if (selectedBoardSize.equals("6x6")) 
            {
                hb_6x6 s6 = new hb_6x6();
                s6.setVisible(true);
            }
        }
    }//GEN-LAST:event_startBtnActionPerformed

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new LoginPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gameTitleLbl;
    private javax.swing.JButton settingsBtn;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables
}
