package viewinterface.airliner;

import java.awt.CardLayout;
import javax.swing.JPanel;

import business.Airplane;
import business.Flight;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FlightCreateJpanel extends javax.swing.JPanel {

    private JPanel funcJpanel;
    private Airplane airplane;
    private ArrayList<Date> arrivalList = new ArrayList<>();
    private ArrayList<Date> departureList = new ArrayList<>();
    private int counter;

    public FlightCreateJpanel(JPanel funcJpanel, Airplane airplane) {
        initComponents();
        this.funcJpanel = funcJpanel;
        this.airplane = airplane;
        flushTable();
    }

    private void flushTable() {
        DefaultTableModel dTable = (DefaultTableModel) flightTable2.getModel();
        dTable.setRowCount(0);
        
        for (Map.Entry<Integer, Flight> i : this.airplane.getFlightMap().entrySet()) {
            Object row[] = new Object[6];

            Flight flight = i.getValue();
            row[0] = flight;
            row[1] = flight.getDeparture();
            row[2] = flight.getArrival();
            row[3] = flight.getDepartureTime();
            row[4] = flight.getArrivalTime();
            row[5] = getLastTimeString(flight.getLastTime() / 1000);
            dTable.addRow(row);
            arrivalList.add(flight.getArrivalTime());
            departureList.add(flight.getDepartureTime());
            counter++;
        }
    }

    

    private boolean checkValid(String departure, String arrival, String departureTime, String arrivalTime) {
        if (departure == null || departure.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the departure", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (arrival == null || arrival.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the arrival", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (departureTime == null || departureTime.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the departureTime", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isDateString(departureTime)) {
            JOptionPane.showMessageDialog(null, "Please input the correct departureTime:yyyy-mm-dd HH:MM:SS", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (arrivalTime == null || arrivalTime.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the arrivalTime", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isDateString(arrivalTime)) {
            JOptionPane.showMessageDialog(null, "Please input the correct arrivalTime:yyyy-mm-dd HH:MM:SS", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean isDateString(String str) {
        String reg = "^^((([0-9]{2})(0[48]|[2468][048]|[13579][26]))|((0[48]|[2468][048]|[13579][26])00)-02-29)"
                + "|([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-"
                + "(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))) "
                + "(20|21|22|23|[0-1]\\d):[0-5]\\d:[0-5]\\d$";
        return str.matches(reg);
    }

    private String getLastTimeString(int totalTime) {
        String totalTimeStr = totalTime / 86400 + "d" + (totalTime / 3600) % 24 + "h" + (totalTime % 3600) / 60 + "min" + (totalTime % 3600) % 60 + "s";
        return totalTimeStr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        flightTable = new javax.swing.JTable();
        titleJlael = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        arrivalTimeJlabel = new javax.swing.JLabel();
        arrivalTimeJtext = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        flightTable2 = new javax.swing.JTable();
        departureTimeJtext = new javax.swing.JTextField();
        departureJlabel = new javax.swing.JLabel();
        departureJtext = new javax.swing.JTextField();
        arrivalJlabel = new javax.swing.JLabel();
        arrivalJtext = new javax.swing.JTextField();
        departureTimeJlabel = new javax.swing.JLabel();

        flightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FlightID", "Departure", "Arrival", "DepartureTime", "ArrivalTime", "last"
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
        jScrollPane1.setViewportView(flightTable);

        setBackground(new java.awt.Color(204, 204, 204));

        titleJlael.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJlael.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlael.setText("Flight Create");

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        arrivalTimeJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalTimeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalTimeJlabel.setText("Arrival Time:");

        arrivalTimeJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalTimeJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        createBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        flightTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FlightID", "Departure", "Arrival", "DepartureTime", "ArrivalTime", "last"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flightTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(flightTable2);

        departureTimeJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureTimeJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        departureJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel.setText("Departure:");

        departureJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        arrivalJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalJlabel.setText("Arrival:");

        arrivalJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        departureTimeJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureTimeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureTimeJlabel.setText("Departure Time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addGap(54, 54, 54)
                        .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(arrivalTimeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arrivalJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departureTimeJlabel)
                                    .addComponent(departureJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(arrivalTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(arrivalJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(createBtn))
                                    .addComponent(departureJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departureTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departureJlabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(departureJtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arrivalJlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(arrivalJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departureTimeJlabel)
                    .addComponent(departureTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivalTimeJlabel)
                    .addComponent(arrivalTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        funcJpanel.remove(this);
        CardLayout cLayout = (CardLayout) funcJpanel.getLayout();
        cLayout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String departure = departureJtext.getText();
        String arrival = arrivalJtext.getText();
        String departureTime = departureTimeJtext.getText();
        String arrivalTime = arrivalTimeJtext.getText();
        //int len = this.airplane.getFlightMap().entrySet.length;
        if (departure.equals(arrival)){
            JOptionPane.showMessageDialog(this, "Please set different arrival and departure location!    ", "WARNING", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        if (!checkValid(departure, arrival, departureTime, arrivalTime)) {
            return;
        }
        Date arrivalDate, departureDate;
        SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            arrivalDate = sdfTime.parse(arrivalTime);
            departureDate = sdfTime.parse(departureTime);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Please input the correct departure date:yyyy-mm-dd", "Search", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (departureDate.compareTo(arrivalDate)>=0){
            JOptionPane.showMessageDialog(this, "departure time can't later than arrival time!    ", "WARNING", JOptionPane.ERROR_MESSAGE);
        }
//        System.out.println("User input time:");
//        System.out.println(departureDate);
//        System.out.println(arrivalDate+"");
//        System.out.println("System stored time");
        for (int i=0;i<counter;i++){
//            System.out.println(departureList.get(i));
//            System.out.println(arrivalList.get(i)+"\n");
            
            if (departureList.get(i).compareTo(arrivalDate)<0 && departureDate.compareTo(arrivalList.get(i))<0){
                JOptionPane.showMessageDialog(this, "Arrival and departure time overlap with other flight!    ", "WARNING", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        int lastTime = departureDate.compareTo(arrivalDate) <= 0 ? (int)(arrivalDate.getTime()- departureDate.getTime()) : 0;
        Flight flight = this.airplane.addFlight();
        flight.setDeparture(departure);
        flight.setArrival(arrival);
        flight.setArrivalTime(arrivalDate);
        flight.setDepartureTime(departureDate);
        flight.setSeatTotal(this.airplane.getSeatCapacity());
        flight.setLastTime(lastTime);
        //        flight.generateSeat();
        //
        flushTable();
        //        JOptionPane.showMessageDialog(this, "Create Flight success.", "CREATE", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrivalJlabel;
    private javax.swing.JTextField arrivalJtext;
    private javax.swing.JLabel arrivalTimeJlabel;
    private javax.swing.JTextField arrivalTimeJtext;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel departureJlabel;
    private javax.swing.JTextField departureJtext;
    private javax.swing.JLabel departureTimeJlabel;
    private javax.swing.JTextField departureTimeJtext;
    private javax.swing.JTable flightTable;
    private javax.swing.JTable flightTable2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel titleJlael;
    // End of variables declaration//GEN-END:variables
}
