package viewinterface.agency;

import business.Flight;
import business.Overlap;

import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JPanel;

import business.TravelAgency;
import java.util.ArrayList;
import viewinterface.airliner.CreateFlightJPanel;
import viewinterface.airliner.FlightSearchJpanel;

public class FlightEntryJpanel extends javax.swing.JPanel {

    private JPanel funcJpanel;
    private TravelAgency agency;
    private Map customerMap;
    private ArrayList<Flight> flightList;
    private Overlap overlap;
   
    public FlightEntryJpanel(JPanel funcJpanel, TravelAgency agency,Map customerMap,ArrayList flightList) {
        initComponents();
        this.funcJpanel = funcJpanel;
        this.agency = agency;
        this.customerMap = customerMap;
        this.flightList=flightList;
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        titleJabel = new javax.swing.JLabel();
        viewFlightBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 153, 255));

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.setMaximumSize(new java.awt.Dimension(101, 29));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        titleJabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJabel.setText("Travel Agency");
        titleJabel.setMaximumSize(new java.awt.Dimension(161, 29));

        viewFlightBtn1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        viewFlightBtn1.setText("View Flight");
        viewFlightBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFlightBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleJabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewFlightBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(titleJabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(viewFlightBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        funcJpanel.remove(this);
        CardLayout layout=(CardLayout) funcJpanel.getLayout();
        layout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewFlightBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFlightBtn1ActionPerformed
        // TODO add your handling code here:
        Overlap overlap = new Overlap(); 
        this.funcJpanel.add("ViewFlightJPanel",new FlightSearchJpanel(this.funcJpanel,flightList,this.customerMap, overlap));
        CardLayout cLayout = (CardLayout) this.funcJpanel.getLayout();
        cLayout.next(this.funcJpanel);
    }//GEN-LAST:event_viewFlightBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel titleJabel;
    private javax.swing.JButton viewFlightBtn1;
    // End of variables declaration//GEN-END:variables
}
