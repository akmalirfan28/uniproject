/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictaetoe;

/**
 *
 * @author USER
 */
public class SettingsPage extends javax.swing.JFrame 
{
    public SettingsPage() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsTitleLbl = new javax.swing.JLabel();
        generalBtn = new javax.swing.JButton();
        matchInfoBtn = new javax.swing.JButton();
        backSettingsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settingsTitleLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        settingsTitleLbl.setForeground(new java.awt.Color(39, 102, 120));
        settingsTitleLbl.setText("Settings");
        getContentPane().add(settingsTitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 6, -1, -1));

        generalBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        generalBtn.setForeground(new java.awt.Color(39, 102, 120));
        generalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/generalicon.png"))); // NOI18N
        generalBtn.setText("General");
        generalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(generalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        matchInfoBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        matchInfoBtn.setForeground(new java.awt.Color(39, 102, 120));
        matchInfoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infoicon.png"))); // NOI18N
        matchInfoBtn.setText("Match Info");
        matchInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchInfoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(matchInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        backSettingsBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        backSettingsBtn.setForeground(new java.awt.Color(39, 102, 120));
        backSettingsBtn.setText("Back");
        backSettingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backSettingsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backSettingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 174, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalBtnActionPerformed
        GeneralPage gp = new GeneralPage();
        gp.show();
        dispose();
    }//GEN-LAST:event_generalBtnActionPerformed

    private void matchInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchInfoBtnActionPerformed
        MatchInfoPage mip = new MatchInfoPage();
        mip.show();
        dispose();
    }//GEN-LAST:event_matchInfoBtnActionPerformed

    private void backSettingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backSettingsBtnActionPerformed
        LoginPage lp = new LoginPage();
        lp.show();
        dispose();
    }//GEN-LAST:event_backSettingsBtnActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new SettingsPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backSettingsBtn;
    private javax.swing.JButton generalBtn;
    private javax.swing.JButton matchInfoBtn;
    private javax.swing.JLabel settingsTitleLbl;
    // End of variables declaration//GEN-END:variables
}
