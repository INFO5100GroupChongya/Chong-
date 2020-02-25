package viewinterface.airliner;

import business.Airliner;
import business.Airplane;
import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class AirplaneCreateJpanel extends javax.swing.JPanel {

    private Airliner airliner;
    private JPanel funcJpanel;

    public AirplaneCreateJpanel(JPanel funcJpanel, Airliner airliner) {
        initComponents();
        this.airliner = airliner;
        this.funcJpanel = funcJpanel;
        flushTable();
    }

    private void flushTable() {
        DefaultTableModel dTable = (DefaultTableModel) airplaneTable.getModel();
        dTable.setRowCount(0);

        for (Map.Entry<Integer, Airplane> i : this.airliner.getAirlinerMap().entrySet()) {
            Object row[] = new Object[5];

            Airplane airplane = i.getValue();
            row[0] = airplane;
            row[1] = airplane.getFlightMap().size();
            row[2] = airplane.getCompany();
            row[3] = airplane.getSeatCapacity();
            row[4] = airplane.getModel();
            dTable.addRow(row);
        }
    }

    private boolean checkValid(String company, String model, String seat) {
        if (company == null || company.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the company", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (model == null || model.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the model", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (seat == null || seat.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the capacity", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!isNumber(seat)) {
            JOptionPane.showMessageDialog(null, "Please input the correct seat as number", "CREATE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean isNumber(String str) {
        String reg = "^[0-9]+(.[0-9]+)?$";
        return str.matches(reg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlael = new javax.swing.JLabel();
        companyJlabel = new javax.swing.JLabel();
        companyJtext = new javax.swing.JTextField();
        modelJlabel = new javax.swing.JLabel();
        modelJtext = new javax.swing.JTextField();
        capacityJlabel = new javax.swing.JLabel();
        capacityJtext = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        viewFlightBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        airplaneTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 153, 255));

        titleJlael.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJlael.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlael.setText("Airplane Create");

        companyJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        companyJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyJlabel.setText("Company:");

        companyJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        companyJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        companyJtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyJtextActionPerformed(evt);
            }
        });

        modelJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        modelJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modelJlabel.setText("Model:");

        modelJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        modelJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        capacityJlabel.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        capacityJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        capacityJlabel.setText("Capacity:");

        capacityJtext.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        capacityJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        backBtn.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        createBtn.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewFlightBtn.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        viewFlightBtn.setText("View Flight");
        viewFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFlightBtnActionPerformed(evt);
            }
        });

        airplaneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AirplaneID", "FlightNum", "Company", "Capacity", "Model"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airplaneTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(viewFlightBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(companyJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(capacityJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(modelJlabel)))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(capacityJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(companyJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(modelJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(titleJlael, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(companyJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modelJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(capacityJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(companyJlabel)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelJlabel)
                            .addComponent(viewFlightBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(capacityJlabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createBtn)
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        funcJpanel.remove(this);
        CardLayout cLayout = (CardLayout) funcJpanel.getLayout();
        cLayout.previous(funcJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String company = companyJtext.getText();
        String model = modelJtext.getText();
        String capacity = capacityJtext.getText();

        if (!checkValid(company, model, capacity)) {
            return;
        }
        Airplane airplane = this.airliner.addAirplane(company, model, Integer.parseInt(capacity));
        airplane.setCompany(company);
        airplane.setModel(model);
        airplane.setSeatCapacity(Integer.parseInt(capacity));

        flushTable();
        JOptionPane.showMessageDialog(this, "Create Airplane Success", "CREATE", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_createBtnActionPerformed

    private void viewFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFlightBtnActionPerformed
        int selectedRow = airplaneTable.getSelectedRow(), col = 0;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select at least a row.", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Airplane airplane = (Airplane) airplaneTable.getValueAt(selectedRow, col);
        this.funcJpanel.add("Airliner-FlightCreateJPanel",new FlightCreateJpanel(funcJpanel, airplane));
        CardLayout cLayout = (CardLayout) this.funcJpanel.getLayout();
        cLayout.next(this.funcJpanel);
    }//GEN-LAST:event_viewFlightBtnActionPerformed

    private void companyJtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyJtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyJtextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airplaneTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel capacityJlabel;
    private javax.swing.JTextField capacityJtext;
    private javax.swing.JLabel companyJlabel;
    private javax.swing.JTextField companyJtext;
    private javax.swing.JButton createBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel modelJlabel;
    private javax.swing.JTextField modelJtext;
    private javax.swing.JLabel titleJlael;
    private javax.swing.JButton viewFlightBtn;
    // End of variables declaration//GEN-END:variables
}
