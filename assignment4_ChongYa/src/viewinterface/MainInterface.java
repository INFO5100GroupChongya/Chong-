package viewinterface;

import business.Airliner;
import business.Airplane;
import business.Flight;
import viewinterface.agency.FlightEntryJpanel;
import viewinterface.customer.CustomerInformationJpanel;
import java.awt.CardLayout;

import business.TravelAgency;
import java.util.ArrayList;
import java.util.Map;
import viewinterface.agency.AirlinerEntryJpanel;

public class MainInterface extends javax.swing.JFrame {

    private TravelAgency agency;
    private ArrayList<Flight> flightList;
    private ArrayList<Airliner> airlinerList;
    
    public MainInterface() {
        initComponents();
        this.agency = TravelAgency.getTravelInstance();
        this.flightList=new ArrayList();
        this.airlinerList=new ArrayList();
        for (Map.Entry<Integer, Airliner> i : this.agency.getAirlinerMap().entrySet()) {
            Airliner airliner = i.getValue();
            for (Map.Entry<Integer, Airplane> j : airliner.getAirlinerMap().entrySet()) {
                Airplane airplane = j.getValue();
                for (Map.Entry<Integer, Flight> element : airplane.getFlightMap().entrySet()) {
                    Flight flight = element.getValue();
                    flightList.add(flight);
                }
            }
        }
        for (Map.Entry<Integer, Airliner> airlinerEntry : agency.getAirlinerMap().entrySet()) {
            this.airlinerList.add(airlinerEntry.getValue());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        splitPane = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        flightBtn = new javax.swing.JButton();
        airlinerBtn = new javax.swing.JButton();
        customerBtn = new javax.swing.JButton();
        functionJpanel = new javax.swing.JPanel();
        rightJPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setBackground(new java.awt.Color(204, 204, 204));
        splitPane.setDividerLocation(160);

        leftJPanel.setBackground(new java.awt.Color(153, 153, 153));
        leftJPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        flightBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        flightBtn.setText("Travel Agency");
        flightBtn.setMaximumSize(new java.awt.Dimension(101, 29));
        flightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightBtnActionPerformed(evt);
            }
        });

        airlinerBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        airlinerBtn.setText("Airliner");
        airlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerBtnActionPerformed(evt);
            }
        });

        customerBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        customerBtn.setText("Customer");
        customerBtn.setMaximumSize(new java.awt.Dimension(101, 29));
        customerBtn.setMinimumSize(new java.awt.Dimension(101, 29));
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airlinerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(leftJPanelLayout.createSequentialGroup()
                        .addComponent(flightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(flightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(airlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(customerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftJPanel);

        functionJpanel.setBackground(new java.awt.Color(204, 204, 204));
        functionJpanel.setLayout(new java.awt.CardLayout());

        rightJPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Times", 3, 36)); // NOI18N
        jLabel3.setText("Chongya Company");

        javax.swing.GroupLayout rightJPanelLayout = new javax.swing.GroupLayout(rightJPanel);
        rightJPanel.setLayout(rightJPanelLayout);
        rightJPanelLayout.setHorizontalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        rightJPanelLayout.setVerticalGroup(
            rightJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightJPanelLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        functionJpanel.add(rightJPanel, "card2");

        splitPane.setRightComponent(functionJpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightBtnActionPerformed
        functionJpanel.add("flightEntryJPanel",new FlightEntryJpanel(functionJpanel, agency, agency.getCustomerMap(),this.flightList));
        CardLayout cLayout = (CardLayout) functionJpanel.getLayout();
        cLayout.next(functionJpanel);
    }//GEN-LAST:event_flightBtnActionPerformed

    private void airlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerBtnActionPerformed
        functionJpanel.add("airlinerEntryJPanel",new AirlinerEntryJpanel(functionJpanel, agency,agency.getAirlinerMap(),this.airlinerList));
        CardLayout cLayout = (CardLayout) functionJpanel.getLayout();
        cLayout.next(functionJpanel);
    }//GEN-LAST:event_airlinerBtnActionPerformed

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
        functionJpanel.add("customerEntryJPanel",new CustomerInformationJpanel(functionJpanel, agency.getCustomerMap()));
        CardLayout cLayout = (CardLayout) functionJpanel.getLayout();
        cLayout.next(functionJpanel);
    }//GEN-LAST:event_customerBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton airlinerBtn;
    private javax.swing.JButton customerBtn;
    private javax.swing.JButton flightBtn;
    private javax.swing.JPanel functionJpanel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JPanel rightJPanel;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables

   
}
