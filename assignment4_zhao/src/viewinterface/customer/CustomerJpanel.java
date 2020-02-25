package viewinterface.customer;


import java.awt.CardLayout;
import javax.swing.JPanel;

import business.Customer;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import business.Ticket;

public class CustomerJpanel extends javax.swing.JPanel {

    private JPanel funcJpanel;
    private Customer customer;

    public CustomerJpanel(JPanel funcJpanel, Customer customer) {
        initComponents();
        this.funcJpanel = funcJpanel;
        this.customer = customer;
        initData();
    }

    private void initData() {
        customerIDJtext.setText(String.valueOf(customer.getUserID()));
        customerNameJtext.setText(customer.getUserName());
        flushTable();
    }

    private void flushTable() {
        DefaultTableModel dTable = (DefaultTableModel) ticketTable.getModel();
        dTable.setRowCount(0);

        for (Map.Entry<Integer, Ticket> tickets : this.customer.getTicketMap().entrySet()) {
            Ticket ticket = tickets.getValue();
            Object row[] = new Object[3];
            row[0] = ticket;
            row[1] = ticket.getDeparture();
            row[2] = ticket.getArrival();
            dTable.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlael = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        customerIDJlabel = new javax.swing.JLabel();
        customerIDJtext = new javax.swing.JTextField();
        customerNameJlabel = new javax.swing.JLabel();
        customerNameJtext = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticketTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 153, 255));

        titleJlael.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJlael.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlael.setText("Customer Information");

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        customerIDJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        customerIDJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerIDJlabel.setText("Customer ID:");

        customerIDJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        customerIDJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerIDJtext.setEnabled(false);

        customerNameJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        customerNameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerNameJlabel.setText("Customer Name:");

        customerNameJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        customerNameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        customerNameJtext.setEnabled(false);

        ticketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket", "Departure", "Arrival"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ticketTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerNameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerIDJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerIDJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerNameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIDJlabel)
                    .addComponent(customerIDJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameJlabel)
                    .addComponent(customerNameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        funcJpanel.remove(this);
        CardLayout cLayout = (CardLayout) funcJpanel.getLayout();
        cLayout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel customerIDJlabel;
    private javax.swing.JTextField customerIDJtext;
    private javax.swing.JLabel customerNameJlabel;
    private javax.swing.JTextField customerNameJtext;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ticketTable;
    private javax.swing.JLabel titleJlael;
    // End of variables declaration//GEN-END:variables
}
