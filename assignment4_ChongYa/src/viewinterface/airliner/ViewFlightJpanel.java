package viewinterface.airliner;

import java.awt.CardLayout;
import javax.swing.JPanel;

import business.Flight;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import static viewinterface.airliner.CreateFlightJPanel.timePattern;

public class ViewFlightJpanel extends javax.swing.JPanel {
    
    private JPanel funcJpanel;
    private FlightSearchJpanel flightSearchJpanel;
    private Flight flight;
    static String timePattern = "yyyy-MM-dd HH:mm:ss";//"yyyy-MM-dd' 'HH:mm:ss";

    public ViewFlightJpanel(JPanel funcJpanel, Flight flight, FlightSearchJpanel flightSearchJpanel) {
        initComponents();
        this.funcJpanel = funcJpanel;
        this.flight= flight;
        this.flightSearchJpanel = flightSearchJpanel;
        initData();
    }
    private void initData(){
       
        flightIdJtext.setText(String.valueOf(this.flight.getFlightID()));
        arrivalJtext.setText(this.flight.getArrival());
        depatureJtext.setText(this.flight.getDeparture());
        depatureTimeJtext.setText(this.flight.getDepartureTime().toString());
        arrivalTimeJtext.setText(this.flight.getArrivalTime().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlael = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        departureJlabel1 = new javax.swing.JLabel();
        flightIdJtext = new javax.swing.JTextField();
        departureJlabel = new javax.swing.JLabel();
        arrivalJlabel = new javax.swing.JLabel();
        departureTimeJlabel = new javax.swing.JLabel();
        arrivalTimeJlabel = new javax.swing.JLabel();
        arrivalTimeJtext = new javax.swing.JTextField();
        depatureTimeJtext = new javax.swing.JTextField();
        arrivalJtext = new javax.swing.JTextField();
        depatureJtext = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        titleJlael.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJlael.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlael.setText("View Flight Information");

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        departureJlabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel1.setText("Flight ID:");

        flightIdJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        flightIdJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        flightIdJtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightIdJtextActionPerformed(evt);
            }
        });

        departureJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel.setText("Departure:");

        arrivalJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalJlabel.setText("Arrival:");

        departureTimeJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureTimeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureTimeJlabel.setText("Departure Time:");

        arrivalTimeJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalTimeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalTimeJlabel.setText("Arrival Time:");

        arrivalTimeJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalTimeJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        depatureTimeJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        depatureTimeJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        arrivalJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        depatureJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        depatureJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        depatureJtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depatureJtextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleJlael)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(departureTimeJlabel)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(departureJlabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(departureJlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(arrivalTimeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(arrivalJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(depatureTimeJtext, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(arrivalTimeJtext)
                                    .addComponent(arrivalJtext)
                                    .addComponent(depatureJtext)
                                    .addComponent(flightIdJtext)))
                            .addComponent(updateBtn))
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departureJlabel1)
                    .addComponent(flightIdJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depatureJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departureJlabel))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivalJlabel)
                    .addComponent(arrivalJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departureTimeJlabel)
                    .addComponent(depatureTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivalTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalTimeJlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        flightSearchJpanel.doCallback();
        funcJpanel.remove(this);
        CardLayout cLayout = (CardLayout)funcJpanel.getLayout();
        cLayout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
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
        String depatureFormatedDate = "", arrivalFormatedDate = "";
        try {
            Date dateDepature = sdfTime.parse(depatureTimeJtext.getText());
            depatureFormatedDate = sdfTime.format(dateDepature);
            Date dateArrival = sdfTime.parse(arrivalTimeJtext.getText());
            arrivalFormatedDate = sdfTime.format(dateArrival);
        
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Time format error. yyyy-MM-dd HH:mm:ss", "ErrorMsg", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //
        //Flight flight= new Flight();
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

        //flightList.add(flight);
        JOptionPane.showMessageDialog(null, "Flight Changed Successfully");
    }//GEN-LAST:event_updateBtnActionPerformed

    private void flightIdJtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightIdJtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightIdJtextActionPerformed

    private void depatureJtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depatureJtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depatureJtextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrivalJlabel;
    private javax.swing.JTextField arrivalJtext;
    private javax.swing.JLabel arrivalTimeJlabel;
    private javax.swing.JTextField arrivalTimeJtext;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel departureJlabel;
    private javax.swing.JLabel departureJlabel1;
    private javax.swing.JLabel departureTimeJlabel;
    private javax.swing.JTextField depatureJtext;
    private javax.swing.JTextField depatureTimeJtext;
    private javax.swing.JTextField flightIdJtext;
    private javax.swing.JLabel titleJlael;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
