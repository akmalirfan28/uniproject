/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictaetoe;

/**
 *
 * @author USER
 */
public class GeneralPage extends javax.swing.JFrame 
{
    
    public GeneralPage() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsGeneralTitleLbl = new javax.swing.JLabel();
        gamemodePnl = new javax.swing.JPanel();
        gamemodeLbl = new javax.swing.JLabel();
        gamemodeComBox = new javax.swing.JComboBox<>();
        boardPnl = new javax.swing.JPanel();
        boardComBox = new javax.swing.JComboBox<>();
        boardLbl = new javax.swing.JLabel();
        generalLbl = new javax.swing.JLabel();
        backGeneralBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsGeneralTitleLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        settingsGeneralTitleLbl.setForeground(new java.awt.Color(39, 102, 120));
        settingsGeneralTitleLbl.setText("Settings");
        getContentPane().add(settingsGeneralTitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 6, -1, -1));

        gamemodePnl.setBackground(new java.awt.Color(255, 255, 255));
        gamemodePnl.setMaximumSize(new java.awt.Dimension(388, 70));
        gamemodePnl.setMinimumSize(new java.awt.Dimension(388, 70));
        gamemodePnl.setPreferredSize(new java.awt.Dimension(388, 70));
        gamemodePnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gamemodeLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        gamemodeLbl.setForeground(new java.awt.Color(39, 102, 120));
        gamemodeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gamemodeicon.png"))); // NOI18N
        gamemodeLbl.setText("Gamemode");
        gamemodePnl.add(gamemodeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 19, -1, -1));

        gamemodeComBox.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        gamemodeComBox.setForeground(new java.awt.Color(39, 102, 120));
        gamemodeComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Singleplayer", "MultiPlayer" }));
        gamemodeComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gamemodeComBoxActionPerformed(evt);
            }
        });
        gamemodePnl.add(gamemodeComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 16, -1, -1));

        getContentPane().add(gamemodePnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, -1, -1));

        boardPnl.setBackground(new java.awt.Color(255, 255, 255));
        boardPnl.setMaximumSize(new java.awt.Dimension(388, 70));
        boardPnl.setMinimumSize(new java.awt.Dimension(388, 70));
        boardPnl.setPreferredSize(new java.awt.Dimension(388, 70));
        boardPnl.setVerifyInputWhenFocusTarget(false);
        boardPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boardComBox.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        boardComBox.setForeground(new java.awt.Color(39, 102, 120));
        boardComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "4x4", "5x5", "6x6" }));
        boardComBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardComBoxActionPerformed(evt);
            }
        });
        boardPnl.add(boardComBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 20, -1, -1));

        boardLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        boardLbl.setForeground(new java.awt.Color(39, 102, 120));
        boardLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boardicon.png"))); // NOI18N
        boardLbl.setText("Board");
        boardPnl.add(boardLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 23, -1, -1));

        getContentPane().add(boardPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 174, -1, -1));

        generalLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        generalLbl.setForeground(new java.awt.Color(39, 102, 120));
        generalLbl.setText("General");
        getContentPane().add(generalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        backGeneralBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        backGeneralBtn.setForeground(new java.awt.Color(39, 102, 120));
        backGeneralBtn.setText("Back");
        backGeneralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backGeneralBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backGeneralBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 261, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backGeneralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backGeneralBtnActionPerformed
        SettingsPage sp = new SettingsPage();
        sp.show();
        dispose();
    }//GEN-LAST:event_backGeneralBtnActionPerformed

    private void gamemodeComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gamemodeComBoxActionPerformed

    }//GEN-LAST:event_gamemodeComBoxActionPerformed

    private void boardComBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardComBoxActionPerformed
    LoginPage lp = new LoginPage();
    String selectedGameMode = (String) gamemodeComBox.getSelectedItem();
    String selectedBoardSize = (String) boardComBox.getSelectedItem();  
        
    lp.setSelectedOptions(selectedGameMode, selectedBoardSize);
    }//GEN-LAST:event_boardComBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new GeneralPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backGeneralBtn;
    private javax.swing.JComboBox<String> boardComBox;
    private javax.swing.JLabel boardLbl;
    private javax.swing.JPanel boardPnl;
    private javax.swing.JComboBox<String> gamemodeComBox;
    private javax.swing.JLabel gamemodeLbl;
    private javax.swing.JPanel gamemodePnl;
    private javax.swing.JLabel generalLbl;
    private javax.swing.JLabel settingsGeneralTitleLbl;
    // End of variables declaration//GEN-END:variables
}
