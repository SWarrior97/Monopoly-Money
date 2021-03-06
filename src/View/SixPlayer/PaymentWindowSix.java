/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.SixPlayer;

import Model.AppManager;
import Model.Player;
import View.FivePlayer.PlayersWindowFive;
import View.FourPlayer.PlayersWindowFour;
import View.ThreePlayer.PlayersWindowThree;
import View.TwoPlayer.PlayersWindow;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Gomez
 */
public class PaymentWindowSix extends javax.swing.JDialog {
    private PlayersWindow window;
    private PlayersWindowThree windowThree;
    private PlayersWindowFour windowFour;
    private PlayersWindowFive windowFive;
    private PlayersWindowSix windowSix;
    private int playerNumber;
    private Player player;
    /**
     * Creates new form PaymentWindowSix
     */
    public PaymentWindowSix(java.awt.Frame parent, boolean modal,int player,PlayersWindowSix windowSix) {
        super(parent, modal);
        initComponents();
        this.windowSix = windowSix;
        this.playerNumber = player;
        this.player = AppManager.INSTANCE.getPlayers(player-1);
        init();
    }
    
    public PaymentWindowSix(java.awt.Frame parent, boolean modal,int player,PlayersWindowFive windowFive) {
        super(parent, modal);
        initComponents();
        this.windowFive = windowFive;
        this.playerNumber = player;
        this.player = AppManager.INSTANCE.getPlayers(player-1);
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

        lblPayer = new javax.swing.JLabel();
        txtPayer = new javax.swing.JTextField();
        lblReceiver = new javax.swing.JLabel();
        cbPlayer = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPayer.setText("Payer:");

        txtPayer.setEditable(false);

        lblReceiver.setText("Receiver:");

        jLabel3.setText("Quantity:");

        jButton2.setText("Pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPayer)
                        .addGap(42, 42, 42)
                        .addComponent(txtPayer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReceiver)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantity)
                            .addComponent(cbPlayer, 0, 128, Short.MAX_VALUE))))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPayer)
                    .addComponent(txtPayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReceiver)
                    .addComponent(cbPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Player receiver = (Player) cbPlayer.getSelectedItem();
        String insertText = txtQuantity.getText();
        float quantity;
        
        if(insertText.contains("M")){
            quantity = Float.parseFloat(insertText.split("M")[0])* 1000000;
        }else{
            quantity = Float.parseFloat(insertText.split("K")[0])* 1000;
        }
        
        if(player.getMoney() - quantity < 0){
            showError(4);
        }else{
            receiver.setMoney(receiver.getMoney() + quantity);
            player.setMoney(player.getMoney() - quantity);
            if(windowSix != null){
                windowSix.setAllCurrentMoney(); 
                windowSix.setRentMoney(receiver.getNumber(),quantity);
            }else{
                windowFive.setAllCurrentMoney(); 
                windowFive.setRentMoney(receiver.getNumber(),quantity);
            }
            
           
            closeWindow();
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        closeWindow();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbPlayer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPayer;
    private javax.swing.JLabel lblReceiver;
    private javax.swing.JTextField txtPayer;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void init() {
        txtPayer.setText(player.getName());
        
        LinkedList<Player> players = new LinkedList<>();
        
        for(Player p:AppManager.INSTANCE.getPlayers()){
            if(p.getNumber() != player.getNumber()){
                players.add(p);
            }
        }
        
        cbPlayer.setModel(new DefaultComboBoxModel(players.toArray()));
    }

    private void closeWindow() {
        this.dispose();
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
    
    private void verifyWindowToUpdate() {
        if(window == null){
            if(windowThree != null){
                 windowThree.setCurrentMoneyPLayer1();
                 windowThree.setCurrentMoneyPLayer2();
                 windowThree.setCurrentMoneyPLayer3();
            } else if(windowFour != null){
                //janela four
                windowFour.setCurrentMoneyPLayer1();
                windowFour.setCurrentMoneyPLayer2();
                windowFour.setCurrentMoneyPLayer3();
                windowFour.setCurrentMoneyPLayer4();
               }else if(windowSix != null){
                   windowSix.setAllCurrentMoney();
               }else{
                   windowFive.setAllCurrentMoney();
               }
            }else{
                window.setCurrentMoneyPLayer1();
                window.setCurrentMoneyPLayer2();
            }
    }
    
}
