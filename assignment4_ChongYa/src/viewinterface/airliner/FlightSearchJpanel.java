package viewinterface.airliner;


import viewinterface.agency.ReserveJpanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Map;
import javax.swing.table.DefaultTableModel;


import business.Flight;
import business.Overlap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static viewinterface.airliner.ViewFlightJpanel.timePattern;

public class FlightSearchJpanel extends javax.swing.JPanel {

    private ArrayList<Flight> flightList;
    private JPanel funcJpanel;
    private Map customerMap;
    private Overlap overlap;

    public FlightSearchJpanel(JPanel funcJpanel, ArrayList flightList, Map customerMap, Overlap overlap) {
        this.overlap = overlap;
        initComponents();
        this.funcJpanel = funcJpanel;
        this.flightList = flightList;
        this.customerMap = customerMap;
        flushTable(this.flightList);
    }

    public void flushTable(ArrayList<Flight> f) {
        DefaultTableModel dTable = (DefaultTableModel) flightTable.getModel();
        dTable.setRowCount(0);

        for (Flight flight : f) {
            Object row[] = new Object[8];
            row[0] = flight;
            row[1] = flight.getDeparture();
            row[2] = flight.getArrival();
            row[3] = flight.getDepartureTime();
            row[4] = flight.getArrivalTime();
            row[5] = getLastTimeString(flight.getLastTime()/1000);
            dTable.addRow(row);
        }
    }
    
    public void doCallback() {
        flushTable(flightList);
    }
    
    private String getLastTimeString(int totalTime){
        String totalTimeStr = totalTime / 86400 + "d" + (totalTime / 3600) % 24 + "h" + (totalTime % 3600) / 60 + "min" + (totalTime % 3600) % 60 + "s";
        return totalTimeStr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reserveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightTable = new javax.swing.JTable();
        titleJlael = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchLocationBtn = new javax.swing.JButton();
        departureJTextField = new javax.swing.JTextField();
        arrivalJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        timeTextField = new javax.swing.JTextField();
        searchTimeBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        reserveBtn.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        reserveBtn.setText("Reserve");
        reserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveBtnActionPerformed(evt);
            }
        });

        flightTable.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        flightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FlightID", "Departure", "Arrival", "DepartureTime", "ArrivalTime", "Last"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flightTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        flightTable.setAutoscrolls(false);
        flightTable.setDragEnabled(true);
        jScrollPane1.setViewportView(flightTable);

        titleJlael.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJlael.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlael.setText("View Flight Information");

        viewBtn.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchLocationBtn.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        searchLocationBtn.setText("Search Loc");
        searchLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchLocationBtnActionPerformed(evt);
            }
        });

        departureJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureJTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("--");

        timeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTextFieldActionPerformed(evt);
            }
        });

        searchTimeBtn1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        searchTimeBtn1.setText("Search Time");
        searchTimeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTimeBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(viewBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reserveBtn))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(arrivalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(searchLocationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchTimeBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(viewBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(reserveBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLocationBtn)
                    .addComponent(departureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTimeBtn1))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveBtnActionPerformed
        int selectedRow = flightTable.getSelectedRow(), col = 0;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select at least a row.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Flight flight = (Flight) flightTable.getValueAt(selectedRow, col);
        this.funcJpanel.add(new ReserveJpanel(this.funcJpanel, flight, this.customerMap, overlap));
        CardLayout cLayout = (CardLayout) this.funcJpanel.getLayout();
        cLayout.next(funcJpanel);
    }//GEN-LAST:event_reserveBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedRow = flightTable.getSelectedRow(), col = 0;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select at least a row.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Flight flight = (Flight) flightTable.getValueAt(selectedRow, col);
        this.funcJpanel.add("ViewFilightInformationJPanel",new ViewFlightJpanel(this.funcJpanel, flight, this));
        CardLayout cLayout = (CardLayout) this.funcJpanel.getLayout();
        cLayout.next(funcJpanel);
        flushTable(flightList);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        funcJpanel.remove(this);
        CardLayout cLayout = (CardLayout) funcJpanel.getLayout();
        cLayout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = flightTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Flight flight = (Flight)flightTable.getValueAt(selectedRow, 0);
                int id = flight.getFlightID();
                for (int i = 0; i < flightList.size(); i++) {
                    if (flightList.get(i).getFlightID() == id) {
                        flightList.remove(i);
                    }
                }
                flushTable(flightList);
                //prodDir.deleteProduct(prod);
                //populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchLocationBtnActionPerformed
        // TODO add your handling code here:
        String departure = departureJTextField.getText();
        String arrival = arrivalJTextField.getText();
        ArrayList<Flight> searchedFlights = new ArrayList();
        for (Flight f : flightList) {
            if (f.getDeparture().equalsIgnoreCase(departure)) {
                if (f.getArrival().equalsIgnoreCase(arrival)) {
                    searchedFlights.add(f);
                }
            }
        }
        flushTable(searchedFlights);
    }//GEN-LAST:event_searchLocationBtnActionPerformed

    private void departureJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureJTextFieldActionPerformed

    private void timeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTextFieldActionPerformed

    private void searchTimeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTimeBtn1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date searchDate = sdfTime.parse(timeTextField.getText());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Please input the correct departure date:yyyy-mm-dd", "Search", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Flight> searchedFlights = new ArrayList();
        for (Flight f : flightList) {
            if (sdfTime.format(f.getDepartureTime()).equals(timeTextField.getText())) {
                 searchedFlights.add(f);
            }
        }
        flushTable(searchedFlights);
    }//GEN-LAST:event_searchTimeBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arrivalJTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField departureJTextField;
    private javax.swing.JTable flightTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reserveBtn;
    private javax.swing.JButton searchLocationBtn;
    private javax.swing.JButton searchTimeBtn1;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JLabel titleJlael;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
