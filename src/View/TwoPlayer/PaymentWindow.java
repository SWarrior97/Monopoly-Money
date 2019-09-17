/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TwoPlayer;

import Model.AppManager;
import View.FourPlayer.MainWindowFourPlayer;
import View.ThreePlayer.MainWindowThreePlayer;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Gomez
 */
public class PaymentWindow extends javax.swing.JDialog {
    private int player;
    private PlayersWindow window;
    /**
     * Creates new form PaymentWindow
     */
    public PaymentWindow(java.awt.Frame parent, boolean modal,int player,PlayersWindow window) {
        super(parent, modal);
        initComponents();
        this.player = player;
        this.window = window;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPayer = new javax.swing.JTextField();
        txtReceiver = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Payer:");

        jLabel2.setText("Receiver:");

        txtPayer.setEditable(false);

        txtReceiver.setEditable(false);

        jLabel3.setText("Quantity:");

        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtPayer))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantity)))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        closeWindow();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String insertText = txtQuantity.getText();
        
        try{
            int quantity = Integer.parseInt(insertText);
            int AuxQuantity;
            int money;
            
            if(quantity <0){
                showError(3);
            }else{
               switch(player){
                   case 1:
                       AuxQuantity = AppManager.INSTANCE.getPlayers(0).getMoney() - quantity;
               
                        if(AuxQuantity<0){
                            showError(4);
                        }else{
                            money = AppManager.INSTANCE.getPlayers(1).getMoney() +quantity;
                            AppManager.INSTANCE.getPlayers(0).setMoney(AuxQuantity);
                            AppManager.INSTANCE.getPlayers(1).setMoney(money);
                            window.setCurrentMoneyPLayer1();
                            window.setCurrentMoneyPLayer2();
                            closeWindow();
                        }
                    break;
                    case 2:
                        AuxQuantity = AppManager.INSTANCE.getPlayers(1).getMoney() - quantity;
               
                        if(AuxQuantity<0){
                            showError(4);
                        }else{
                            
                            money = AppManager.INSTANCE.getPlayers(0).getMoney() +quantity;
                            AppManager.INSTANCE.getPlayers(1).setMoney(AuxQuantity);
                            AppManager.INSTANCE.getPlayers(0).setMoney(money);
                            window.setCurrentMoneyPLayer1();
                            window.setCurrentMoneyPLayer2();
                            closeWindow();
                        }
                    break;
               }
            }
        }catch(NumberFormatException e){
            showError(1);
        }catch(Exception e){
            showError(2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtPayer;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtReceiver;
    // End of variables declaration//GEN-END:variables

    private void closeWindow() {
        this.dispose();
    }

    private void init() {
        switch(player){
            case 1:
                //player 1 pay player 2
                txtPayer.setText(AppManager.INSTANCE.getPlayers(0).getName());
                txtReceiver.setText(AppManager.INSTANCE.getPlayers(1).getName());
            break;
            case 2:
                //player 2 pay player 1
                txtPayer.setText(AppManager.INSTANCE.getPlayers(1).getName());
                txtReceiver.setText(AppManager.INSTANCE.getPlayers(0).getName());
            break;
        }
    }
    
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
                //Invalid number of players
                message ="Invalid quantity";
                JOptionPane.showMessageDialog(this, message);
            break;
            case 4:
                message ="Player lost";
                JOptionPane.showMessageDialog(this, message);
            break;
        } 
    }
}
