/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewinterface.airliner;

import business.Flight;

import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kathe
 */
public class CreateFlightJPanel extends javax.swing.JPanel {
    private JPanel funcJpanel;
    private ArrayList<Flight> flightList =  new ArrayList();
    static String timePattern = "yyyy-MM-dd HH:mm:ss";//"yyyy-MM-dd' 'HH:mm:ss";
    /**
     * Creates new form CreateFlightJPanel
     */
    public CreateFlightJPanel(JPanel funcJpanel,ArrayList flightList) {
        initComponents();
        this.funcJpanel = funcJpanel;
        this.flightList= flightList;
    }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arrivalTimeJlabel = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        depatureTimeJtext = new javax.swing.JTextField();
        titleJlael = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        arrivalJtext = new javax.swing.JTextField();
        departureJlabel = new javax.swing.JLabel();
        flightIdJtext = new javax.swing.JTextField();
        arrivalJlabel = new javax.swing.JLabel();
        depatureJtext = new javax.swing.JTextField();
        departureTimeJlabel = new javax.swing.JLabel();
        departureJlabel1 = new javax.swing.JLabel();
        arrivalTimeJtext = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        arrivalTimeJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalTimeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalTimeJlabel.setText("Arrival Time:");

        createBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        depatureTimeJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        depatureTimeJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        titleJlael.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJlael.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlael.setText("Create Flight Information");

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        arrivalJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        departureJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel.setText("Departure:");

        flightIdJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        flightIdJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        flightIdJtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightIdJtextActionPerformed(evt);
            }
        });

        arrivalJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalJlabel.setText("Arrival:");

        depatureJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        depatureJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        departureTimeJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureTimeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureTimeJlabel.setText("Departure Time:");

        departureJlabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel1.setText("Flight ID:");

        arrivalTimeJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalTimeJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleJlael, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(departureJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(departureTimeJlabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(arrivalTimeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(departureJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arrivalJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depatureJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flightIdJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrivalJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(depatureTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrivalTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createBtn)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departureJlabel1)
                            .addComponent(flightIdJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departureJlabel)
                            .addComponent(depatureJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(arrivalJlabel)
                            .addComponent(arrivalJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(departureTimeJlabel)
                            .addComponent(depatureTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(arrivalTimeJlabel)
                        .addComponent(arrivalTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        String flightID=flightIdJtext.getText();
        String departure=depatureJtext.getText();
        String arrival=arrivalJtext.getText();
        //
        String departureTime=depatureTimeJtext.getText();
        String arrivalTime=arrivalTimeJtext.getText();
        //Data->String
        SimpleDateFormat sdfTime = new SimpleDateFormat(timePattern);
        System.out.println(depatureTimeJtext.getText());
        System.out.println(timePattern);
        String depatureFormatedDate = " ", arrivalFormatedDate = " ";
        try {
            Date dateDepature = sdfTime.parse(depatureTimeJtext.getText());
            depatureFormatedDate = sdfTime.format(dateDepature);
            Date dateArrival = sdfTime.parse(arrivalTimeJtext.getText());
            arrivalFormatedDate = sdfTime.format(dateArrival);
        
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Time format error. yyyy-MM-dd HH:mm:ss", "ErrorMsg", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Flight flight= new Flight();
        try {
            flight.setFlightID(Integer.parseInt(flightIdJtext.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Flight ID should be an integer", "ErrorMsg", JOptionPane.ERROR_MESSAGE);
            return;
        }
        flight.setDeparture(depatureJtext.getText());
        flight.setArrival(arrivalJtext.getText());
        try {
            flight.setDepartureTime(sdfTime.parse(depatureFormatedDate));
            flight.setArrivalTime(sdfTime.parse(arrivalFormatedDate));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Time format error. yyyy-MM-dd HH:mm:ss", "ErrorMsg", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
         try{
             if (depatureJtext.getText().isEmpty()) {
                 throw new RuntimeException("Please type in an available name.");
             }
            System.out.println(depatureJtext.getText().charAt(0));
        } catch (RuntimeException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please type in an available name.");
            return;
        } //ADD
        
        try{
             if (arrivalJtext.getText().isEmpty()) {
                 throw new RuntimeException("Please type in an available name.");
             }
            System.out.println(arrivalJtext.getText().charAt(0));
        } catch (RuntimeException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please type in an available name.");
            return;
        } //ADD 
         
        flightList.add(flight);
        JOptionPane.showMessageDialog(null, "Flight Created Successfully");
    }                                         

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        funcJpanel.remove(this);
        CardLayout cLayout = (CardLayout)funcJpanel.getLayout();
        cLayout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void flightIdJtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightIdJtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightIdJtextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrivalJlabel;
    private javax.swing.JTextField arrivalJtext;
    private javax.swing.JLabel arrivalTimeJlabel;
    private javax.swing.JTextField arrivalTimeJtext;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel departureJlabel;
    private javax.swing.JLabel departureJlabel1;
    private javax.swing.JLabel departureTimeJlabel;
    private javax.swing.JTextField depatureJtext;
    private javax.swing.JTextField depatureTimeJtext;
    private javax.swing.JTextField flightIdJtext;
    private javax.swing.JLabel titleJlael;
    // End of variables declaration//GEN-END:variables
}
