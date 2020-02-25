package viewinterface.agency;

import business.Airliner;
import business.Airplane;
import business.Flight;
import viewinterface.airliner.CreateAirlinerJpanell;
import javax.swing.JPanel;
import business.TravelAgency;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Map;
import viewinterface.airliner.AirlinerSearchJPanel;

public class AirlinerEntryJpanel extends javax.swing.JPanel {

    private JPanel funcJpanel;
    private TravelAgency agency;
    private Map airlinerMap;
    private ArrayList<Airliner> airlinerList;

    public AirlinerEntryJpanel(JPanel funcJpanel, TravelAgency agency, Map airlinerMap, ArrayList<Airliner> airlinerList) {
        initComponents();
        this.funcJpanel = funcJpanel;
        this.agency = agency;
        this.airlinerMap = airlinerMap;
        this.airlinerList = airlinerList;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        titleJabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        createBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        createBtn.setText("Create Airliner");
        createBtn.setMaximumSize(new java.awt.Dimension(101, 29));
        createBtn.setMinimumSize(new java.awt.Dimension(101, 29));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        viewBtn.setText("View Airliner");
        viewBtn.setMaximumSize(new java.awt.Dimension(101, 29));
        viewBtn.setMinimumSize(new java.awt.Dimension(101, 29));
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        titleJabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJabel.setText("Airliner Manage");

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.setMaximumSize(new java.awt.Dimension(101, 29));
        backBtn.setMinimumSize(new java.awt.Dimension(101, 29));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(titleJabel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(titleJabel)
                .addGap(52, 52, 52)
                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        CreateAirlinerJpanell panel = new CreateAirlinerJpanell(funcJpanel, this.agency, airlinerList);
        funcJpanel.add("CreateAirlinerJpanel", panel);
        CardLayout layout = (CardLayout) funcJpanel.getLayout();
        layout.next(funcJpanel);

    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        this.funcJpanel.add("ViewAirlinerJpanel",new AirlinerSearchJPanel(this.funcJpanel, airlinerList, this.airlinerMap));
//        funcJpanel.add("ViewProductJPanel",inforpanel);
        CardLayout layout = (CardLayout) this.funcJpanel.getLayout();
        layout.next(this.funcJpanel);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        funcJpanel.remove(this);
        CardLayout layout = (CardLayout) funcJpanel.getLayout();
        layout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel titleJabel;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
