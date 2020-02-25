package viewinterface.agency;


import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import business.Customer;
import business.Flight;
import business.Seat;
import business.Ticket;
import business.Overlap;



public class ReserveJpanel extends javax.swing.JPanel {

    private JPanel funcJpanel;
    private Flight flight;
    private Map<Integer, Customer> customerMap;
    private Overlap overlap;

    public ReserveJpanel(JPanel funcJpanel, Flight flight, Map<Integer, Customer> customerMap, Overlap overlap) {
        this.overlap = overlap;
        initComponents();
        this.funcJpanel = funcJpanel;
        this.flight = flight;
        this.customerMap = customerMap;
        initData();
    }

    private void initData() {
        initBox();
        flightJtext.setText(flight.toString());
        departureJtext.setText(flight.getDeparture());
        arrivalJtext.setText(flight.getArrival());
    }

    private void initBox() {
        customerBox.removeAllItems();
        for (Map.Entry<Integer, Customer> customers : this.customerMap.entrySet()) {
            Customer customer = customers.getValue();
            customerBox.addItem(customer);
        }

        Seat[][] seats = flight.getSeatTable();

        windowLeftBox.removeAllItems();
        windowLeftBox.addItem("--select--");
        for (Seat seat : getSeatByCol(seats, 0)) {
            if (!seat.isIsAvai()) {
                continue;
            }
            windowLeftBox.addItem(seat);
        }

        middleLeftBox.removeAllItems();
        middleLeftBox.addItem("--select--");
        for (Seat seat : getSeatByCol(seats, 1)) {
            if (!seat.isIsAvai()) {
                continue;
            }
            middleLeftBox.addItem(seat);
        }

        asideLeftBox.removeAllItems();
        asideLeftBox.addItem("--select--");
        for (Seat seat : getSeatByCol(seats, 2)) {
            if (!seat.isIsAvai()) {
                continue;
            }
            asideLeftBox.addItem(seat);
        }

        asideRightBox.removeAllItems();
        asideRightBox.addItem("--select--");
        for (Seat seat : getSeatByCol(seats, 3)) {
            if (!seat.isIsAvai()) {
                continue;
            }
            asideRightBox.addItem(seat);
        }

        middleRightBox.removeAllItems();
        middleRightBox.addItem("--select--");
        for (Seat seat : getSeatByCol(seats, 4)) {
            if (!seat.isIsAvai()) {
                continue;
            }
            middleRightBox.addItem(seat);
        }

        windowRightBox.removeAllItems();
        windowRightBox.addItem("--select--");
        for (Seat seat : getSeatByCol(seats, 5)) {
            if (!seat.isIsAvai()) {
                continue;
            }
            windowRightBox.addItem(seat);
        }

        customerBox.removeAllItems();
        customerBox.addItem("--select--");
        for (Map.Entry<Integer, Customer> customers : this.customerMap.entrySet()) {
            Customer customer = customers.getValue();
            customerBox.addItem(customer);
        }
    }

    private Seat[] getSeatByCol(Seat[][] seats, int col) {
        Seat[] colSeat = new Seat[seats.length];
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                if (j == col) {
                    colSeat[i] = seats[i][j];
                }
            }
        }
        return colSeat;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        backBtn1 = new javax.swing.JButton();
        titleJlael = new javax.swing.JLabel();
        windowLeftBox = new javax.swing.JComboBox<>();
        middleLeftBox = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        reserveBtn = new javax.swing.JButton();
        asideRightBox = new javax.swing.JComboBox<>();
        asideLeftBox = new javax.swing.JComboBox<>();
        windowRightBox = new javax.swing.JComboBox<>();
        middleRightBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        flightJtext = new javax.swing.JTextField();
        departureJlabel = new javax.swing.JLabel();
        departureJtext = new javax.swing.JTextField();
        arrivalJlabel = new javax.swing.JLabel();
        arrivalJtext = new javax.swing.JTextField();
        customerBox = new javax.swing.JComboBox<>();
        customerJlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        backBtn1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn1.setText("<Back");
        backBtn1.setMaximumSize(new java.awt.Dimension(101, 29));
        backBtn1.setMinimumSize(new java.awt.Dimension(101, 29));
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 153, 255));

        titleJlael.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJlael.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlael.setText("Reserve");

        windowLeftBox.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        windowLeftBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LeftWindow" }));

        middleLeftBox.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        middleLeftBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Left Middle" }));

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        reserveBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        reserveBtn.setText("Reserve");
        reserveBtn.setPreferredSize(new java.awt.Dimension(101, 29));
        reserveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveBtnActionPerformed(evt);
            }
        });

        asideRightBox.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        asideRightBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Right Aside" }));

        asideLeftBox.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        asideLeftBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Left Aside" }));

        windowRightBox.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        windowRightBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Right Window" }));

        middleRightBox.setFont(new java.awt.Font("Times New Roman", 2, 10)); // NOI18N
        middleRightBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Right Middle" }));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Flight:");

        flightJtext.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        departureJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        departureJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        departureJlabel.setText("Departure:");

        departureJtext.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        arrivalJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        arrivalJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        arrivalJlabel.setText("Arrival:");

        arrivalJtext.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N

        customerBox.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        customerBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Right Aside" }));

        customerJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        customerJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerJlabel.setText("Select Customer:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel2.setText("row 1    |");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel3.setText("row 2    |");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel4.setText("row 3    |");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel5.setText("row 4    |");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel6.setText("row 5    |");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        jLabel7.setText("row 6 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addGap(56, 56, 56)
                        .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(departureJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(arrivalJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(arrivalJtext, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(departureJtext, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(flightJtext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(windowLeftBox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(middleLeftBox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(asideLeftBox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(asideRightBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(middleRightBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(windowRightBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(customerJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(customerBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(reserveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addComponent(titleJlael, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(windowLeftBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleLeftBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asideLeftBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asideRightBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleRightBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(windowRightBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departureJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departureJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivalJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrivalJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(reserveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        funcJpanel.remove(this);
        CardLayout cLayout = (CardLayout) funcJpanel.getLayout();
        cLayout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void reserveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveBtnActionPerformed
        Object customer = customerBox.getSelectedItem();
        if (!(customer instanceof Customer)) {
            JOptionPane.showMessageDialog(this, "Please select at least a customer.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Customer c = (Customer) customer;
        
        overlap.addToN(c.getUserName());
        overlap.addToD(flight.getDepartureTime());
        overlap.addToA(flight.getArrivalTime());
        
//        debug use
//        for (int i=0;i<overlap.getO_name().size();i++){
//            System.out.println(overlap.getO_name().get(i));
//        }
//        System.out.println(overlap.getO_name().size());
//        System.out.println("");

        for (int i=0;i<overlap.getO_name().size();i++){
            for (int j=0; j<overlap.getO_name().size();j++){
               if(i==j) continue;
               if(overlap.getO_name().get(i).equals(overlap.getO_name().get(j))){
                   if( (overlap.getO_departure().get(i).compareTo(overlap.getO_arrival().get(j))<0)  && (overlap.getO_departure().get(j).compareTo(overlap.getO_arrival().get(i))<0) ){
                        JOptionPane.showMessageDialog(this, "Please select another time.Time overlap!    ", "INFORMATION", JOptionPane.ERROR_MESSAGE);
                        overlap.rmToN(c.getUserName());
                        overlap.rmToD(flight.getDepartureTime());
                        overlap.rmToA(flight.getArrivalTime());
                       return;
                   }
               }
            }
        }

        Object owlSeat = windowLeftBox.getSelectedItem();
        Seat wlSeat;
        Object owrSeat = windowRightBox.getSelectedItem();
        Seat wrSeat;
        Object omlSeat = middleLeftBox.getSelectedItem();
        Seat mlSeat;
        Object omrSeat = middleRightBox.getSelectedItem();
        Seat mrSeat;
        Object oalSeat = asideLeftBox.getSelectedItem();
        Seat alSeat;
        Object oarSeat = asideRightBox.getSelectedItem();
        Seat arSeat;

        if ((!(owlSeat instanceof Seat)) && (!(owrSeat instanceof Seat)) && (!(omlSeat instanceof Seat))
                && (!(omrSeat instanceof Seat)) && (!(oalSeat instanceof Seat)) && (!(oarSeat instanceof Seat))) {
            JOptionPane.showMessageDialog(this, "Please select at least a seat.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Map<Integer, Ticket> ticketMap = c.getTicketMap();
                
        if (owlSeat instanceof Seat) {
            wlSeat = (Seat) owlSeat;
            wlSeat.setIsAvai(false);
            Ticket ticket = new Ticket(wlSeat, flight.getDeparture(), flight.getArrival());
            ticketMap.put(ticket.getTicketID(), ticket);
        }
        if (owrSeat instanceof Seat) {
            wrSeat = (Seat) owrSeat;
            wrSeat.setIsAvai(false);
            Ticket ticket = new Ticket(wrSeat, flight.getDeparture(), flight.getArrival());
            ticketMap.put(ticket.getTicketID(), ticket);
        }
        if (omlSeat instanceof Seat) {
            mlSeat = (Seat) omlSeat;
            mlSeat.setIsAvai(false);
            Ticket ticket = new Ticket(mlSeat, flight.getDeparture(), flight.getArrival());
            ticketMap.put(ticket.getTicketID(), ticket);
        }
        if (omrSeat instanceof Seat) {
            mrSeat = (Seat) omrSeat;
            mrSeat.setIsAvai(false);
            Ticket ticket = new Ticket(mrSeat, flight.getDeparture(), flight.getArrival());
            ticketMap.put(ticket.getTicketID(), ticket);
        }
        if (oalSeat instanceof Seat) {
            alSeat = (Seat) oalSeat;
            alSeat.setIsAvai(false);
            Ticket ticket = new Ticket(alSeat, flight.getDeparture(), flight.getArrival());
            ticketMap.put(ticket.getTicketID(), ticket);
        }
        if (oarSeat instanceof Seat) {
            arSeat = (Seat) oarSeat;
            arSeat.setIsAvai(false);
            Ticket ticket = new Ticket(arSeat, flight.getDeparture(), flight.getArrival());
            ticketMap.put(ticket.getTicketID(), ticket);
        }
        
        initBox();
        JOptionPane.showMessageDialog(this, "Reserve Ok", "CREATE", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_reserveBtnActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        funcJpanel.remove(this);
        CardLayout layout = (CardLayout) funcJpanel.getLayout();
        layout.previous(funcJpanel);
    }//GEN-LAST:event_backBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrivalJlabel;
    private javax.swing.JTextField arrivalJtext;
    private javax.swing.JComboBox<Object> asideLeftBox;
    private javax.swing.JComboBox<Object> asideRightBox;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backBtn1;
    private javax.swing.JComboBox<Object> customerBox;
    private javax.swing.JLabel customerJlabel;
    private javax.swing.JLabel departureJlabel;
    private javax.swing.JTextField departureJtext;
    private javax.swing.JTextField flightJtext;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<Object> middleLeftBox;
    private javax.swing.JComboBox<Object> middleRightBox;
    private javax.swing.JButton reserveBtn;
    private javax.swing.JLabel titleJlael;
    private javax.swing.JComboBox<Object> windowLeftBox;
    private javax.swing.JComboBox<Object> windowRightBox;
    // End of variables declaration//GEN-END:variables
}
