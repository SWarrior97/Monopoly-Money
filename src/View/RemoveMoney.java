/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AppManager;
import View.TwoPlayer.PlayersWindow;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Gomez
 */
public class RemoveMoney extends javax.swing.JDialog {
    private int player;
    private PlayersWindow window;
    /**
     * Creates new form RemoveMoney
     */
    public RemoveMoney(java.awt.Frame parent, boolean modal,int player,PlayersWindow window) {
        super(parent, modal);
        initComponents();
        this.player=player;
        this.window=window;
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlayerToRemoveMoney = new javax.swing.JLabel();
        MoneyToRemove = new javax.swing.JTextField();
        Cancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlayerToRemoveMoney)
                .addGap(89, 89, 89)
                .addComponent(MoneyToRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlayerToRemoveMoney)
                    .addComponent(MoneyToRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String insertMoney = MoneyToRemove.getText();

        try{
            int money = Integer.parseInt(insertMoney);

            if(money < 0){
                showError(3);
            }else{
                int actualMoney = 0;

                switch(player){
                    case 1:
                    actualMoney = AppManager.INSTANCE.getPlayers(0).getMoney() - money;

                    if(actualMoney < 0){
                        showError(4);
                    }else{
                        AppManager.INSTANCE.getPlayers(0).setMoney(actualMoney);
                        window.setCurrentMoneyPLayer1();
                    }
                    break;
                    case 2:
                    actualMoney = AppManager.INSTANCE.getPlayers(1).getMoney() - money;

                    if(actualMoney < 0){
                        showError(4);
                    }else{
                        AppManager.INSTANCE.getPlayers(0).setMoney(actualMoney);
                        window.setCurrentMoneyPLayer2();
                    }
                    break;
                    case 3:
                    actualMoney = AppManager.INSTANCE.getPlayers(2).getMoney() - money;

                    if(actualMoney < 0){
                        showError(4);
                    }else{
                        AppManager.INSTANCE.getPlayers(0).setMoney(actualMoney);
                    }
                    break;
                    case 4:
                    actualMoney = AppManager.INSTANCE.getPlayers(3).getMoney() - money;

                    if(actualMoney < 0){
                        showError(4);
                    }else{
                        AppManager.INSTANCE.getPlayers(0).setMoney(actualMoney);
                    }
                    break;
                }
                closeWindow();
            }
        }catch(NumberFormatException e){
            showError(1);
        }catch(Exception e){
            showError(2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        closeWindow();
    }//GEN-LAST:event_CancelActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JTextField MoneyToRemove;
    private javax.swing.JLabel PlayerToRemoveMoney;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    private void showError(int erro) {
        String message;
        switch(erro){
            case 1:
                //Number format 
                message ="Please insert a number";
                JOptionPane.showMessageDialog(this, message);
            break;
            case 2:
                //all exception
                message ="Please insert a number";
                JOptionPane.showMessageDialog(this, message);
            break;
            case 3:
                //Invalid money
                message ="Money must be positive";
                JOptionPane.showMessageDialog(this, message);
            break;
            case 4:
                //Invalid money
                message ="PLayer can't have negative money";
                JOptionPane.showMessageDialog(this, message);
            break;
        } 
    }

    private void closeWindow() {
        this.dispose();
    }
    
    private void init() {
        switch(player){
            case 1:
                PlayerToRemoveMoney.setText(AppManager.INSTANCE.getPlayers(0).getName());
            break;
            case 2:
                PlayerToRemoveMoney.setText(AppManager.INSTANCE.getPlayers(1).getName());
            break;
            case 3:
                PlayerToRemoveMoney.setText(AppManager.INSTANCE.getPlayers(2).getName());
            break;
            case 4:
                PlayerToRemoveMoney.setText(AppManager.INSTANCE.getPlayers(3).getName());
            break;
        }
    }
}
