/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewinterface.airliner;

import business.Airliner;
import java.awt.CardLayout;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhaozhihan
 */
public class ViewAirlinerJPanel extends javax.swing.JPanel {
    private JPanel funcJpanel;
    private Airliner airliner;
    static String timePattern = "yyyy-MM-dd HH:mm:ss";//"yyyy-MM-dd' 'HH:mm:ss";
    AirlinerSearchJPanel airlinerSearchJPanel;
    /**
     * Creates new form ViewAirlinerJPanel
     */    
     private void initData(){
        airlinerIdJtext.setText(String.valueOf(this.airliner.getAirlinerID()));
        airlinernameJtext.setText(this.airliner.getAirlinerName());
        airplanenumJtext.setText(String.valueOf(this.airliner.getAirlinerMap()));
    }

    ViewAirlinerJPanel(JPanel funcJpanel, Airliner airliner, AirlinerSearchJPanel airlinerSearchJPanel) {
        this.funcJpanel = funcJpanel;
        this.airliner = airliner;
        this.airlinerSearchJPanel = airlinerSearchJPanel;
        initComponents();
        initData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlael = new javax.swing.JLabel();
        airplanenumJtext = new javax.swing.JTextField();
        departureJlabel = new javax.swing.JLabel();
        airlinerIdJtext = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        arrivalJlabel = new javax.swing.JLabel();
        airlinernameJtext = new javax.swing.JTextField();
        departureJlabel1 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        titleJlael.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJlael.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlael.setText("View Airliner Information");

        airplanenumJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        airplanenumJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        departureJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel.setText("AirLiner Name:");

        airlinerIdJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        airlinerIdJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        airlinerIdJtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerIdJtextActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        arrivalJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalJlabel.setText("Airplane Info:");

        airlinernameJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        airlinernameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        departureJlabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel1.setText("AirLinerID :");

        updateBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(titleJlael, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(departureJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(arrivalJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(departureJlabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(airlinernameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(airplanenumJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(airlinerIdJtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(updateBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backBtn)))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departureJlabel1)
                    .addComponent(airlinerIdJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinernameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departureJlabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airplanenumJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalJlabel))
                .addGap(18, 18, 18)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlinerIdJtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerIdJtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerIdJtextActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        airlinerSearchJPanel.doCallback();
        funcJpanel.remove(this);
        CardLayout layout = (CardLayout) funcJpanel.getLayout();
        layout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String airlinerId=airlinerIdJtext.getText();
        String airlinername=airlinernameJtext.getText();
        String airluminern=airplanenumJtext.getText();
        Integer itg;
        try {
            itg = new Integer(airlinerId);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please input an integer.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        airliner.setAirlinerID(itg);
        airliner.setAirlinerName(airlinername);
        JOptionPane.showMessageDialog(null, "Flight Changed Successfully");
                  
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerIdJtext;
    private javax.swing.JTextField airlinernameJtext;
    private javax.swing.JTextField airplanenumJtext;
    private javax.swing.JLabel arrivalJlabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel departureJlabel;
    private javax.swing.JLabel departureJlabel1;
    private javax.swing.JLabel titleJlael;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
