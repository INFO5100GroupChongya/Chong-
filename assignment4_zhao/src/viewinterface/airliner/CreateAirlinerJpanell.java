/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewinterface.airliner;

import business.Airliner;
import business.TravelAgency;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaozhihan
 */
public class CreateAirlinerJpanell extends javax.swing.JPanel {
    private JPanel funcJpanel;
    private TravelAgency agency;
    private ArrayList<Airliner> airlinerList;

    /**
     * Creates new form CreateAirlinerJpanell
     */
    public CreateAirlinerJpanell(JPanel funcJpanel, TravelAgency agency, ArrayList<Airliner> airlinerList) {
        initComponents();
        this.funcJpanel = funcJpanel;
        this.agency = agency;
        this.airlinerList = airlinerList;
        
    }
    /*
    private void flushTable() {
        DefaultTableModel dTable = (DefaultTableModel) airlinerTable.getModel();
        dTable.setRowCount(0);

        for (Map.Entry<Integer, Airliner> i : this.agency.getAirlinerMap().entrySet()) {
            Object row[] = new Object[4];

            Airliner airliner = i.getValue();
            row[0] = airliner;
            row[1] = airliner.getAirlinerName();
            row[2] = airliner.getAirlinerMap().size();
            row[3] = airliner.getUpdatetime();
            dTable.addRow(row);
        }
    }*/
    
    private boolean checkValid(String airlinerName){
        if (airlinerName == null || airlinerName.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please input the airlinerName", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        airlinernameJtext = new javax.swing.JTextField();
        departureJlabel1 = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        titleJlael = new javax.swing.JLabel();
        departureJlabel = new javax.swing.JLabel();
        airlinerIdJtext = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        airlinernameJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        airlinernameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        departureJlabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel1.setText("AirLinerID :");

        createBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        titleJlael.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJlael.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlael.setText("Create Airliner Information");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleJlael, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createBtn)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(departureJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departureJlabel))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(airlinernameJtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(airlinerIdJtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departureJlabel1)
                    .addComponent(airlinerIdJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinernameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departureJlabel))
                .addGap(37, 37, 37)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        funcJpanel.remove(this);
        CardLayout layout = (CardLayout) funcJpanel.getLayout();
        layout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        String airlinerName = airlinernameJtext.getText();
        if (!checkValid(airlinerName))
            return;
        String airlinerlightID=airlinerIdJtext.getText();
        Integer i = new Integer(airlinerlightID);

        Airliner airliner = this.agency.addAirliner(airlinerName);
        airliner.setAirlinerName(airlinerName);
        airliner.setAirlinerID(i);
        //flushTable();
        airlinerList.add(airliner);
        JOptionPane.showMessageDialog(this, "Create Airliner success.", "CREATE", JOptionPane.INFORMATION_MESSAGE);

        
    }//GEN-LAST:event_createBtnActionPerformed

    private void airlinerIdJtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerIdJtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlinerIdJtextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerIdJtext;
    private javax.swing.JTextField airlinernameJtext;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel departureJlabel;
    private javax.swing.JLabel departureJlabel1;
    private javax.swing.JLabel titleJlael;
    // End of variables declaration//GEN-END:variables
}
