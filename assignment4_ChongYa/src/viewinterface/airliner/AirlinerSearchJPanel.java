package viewinterface.airliner;

import java.awt.CardLayout;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;

import business.Airliner;
import business.TravelAgency;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.lang.RuntimeException;

public class AirlinerSearchJPanel extends javax.swing.JPanel {

    private JPanel funcJpanel;
    private Map<Integer, Airliner> airlinerMap;
    private ArrayList<Airliner> airlinerList;
    private TravelAgency agency;

    public AirlinerSearchJPanel(JPanel funcJpanel, ArrayList airlinerList, Map airlinerMap) {
        initComponents();
        this.funcJpanel = funcJpanel;
        this.airlinerMap = airlinerMap;
        this.airlinerList = airlinerList;
        flushTable(this.airlinerList);
    }

    private void flushTable(ArrayList<Airliner> a) {
        DefaultTableModel dTable = (DefaultTableModel) airlinerTable.getModel();
        dTable.setRowCount(0);
        for (Airliner airliner : a) {
            Object row[] = new Object[4];

            row[0] = airliner;
            row[1] = airliner.getAirlinerName();
            row[2] = airliner.getAirlinerMap().size();
            row[3] = airliner.getUpdatetime();
            dTable.addRow(row);
        }
    }
    public void doCallback() {
        flushTable(airlinerList);
    }
    private String getLastTimeString(int totalTime) {
        String totalTimeStr = totalTime / 86400 + "d" + (totalTime / 3600) % 24 + "h" + (totalTime % 3600) / 60 + "min" + (totalTime % 3600) % 60 + "s";
        return totalTimeStr;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlael1 = new javax.swing.JLabel();
        backBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        airlinerTable = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        searchCbox = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        viewAirplaneBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setForeground(new java.awt.Color(0, 51, 102));

        titleJlael1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        titleJlael1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlael1.setText("View Airliner Information");

        backBtn1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        backBtn1.setText("<Back");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        airlinerTable.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        airlinerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AirlinerID", "AirlinerName", "Airplane Num", "LastUpdateTime"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airlinerTable);

        viewBtn.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        viewBtn.setText(" View ");
        viewBtn.setPreferredSize(new java.awt.Dimension(90, 29));
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        searchCbox.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        searchCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Airliner ID", "Airliner Name", "Airplane Num" }));
        searchCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCboxActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setPreferredSize(new java.awt.Dimension(91, 29));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        viewAirplaneBtn.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        viewAirplaneBtn.setText("View Airplane");
        viewAirplaneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirplaneBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(viewAirplaneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(titleJlael1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(titleJlael1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewAirplaneBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        funcJpanel.remove(this);
        CardLayout layout = (CardLayout) funcJpanel.getLayout();
        layout.previous(funcJpanel);
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = airlinerTable.getSelectedRow(), col = 0;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select at least a row.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Airliner airliner = (Airliner) airlinerTable.getValueAt(selectedRow, col);
        this.funcJpanel.add("ViewAirlinerInformation",new ViewAirlinerJPanel(this.funcJpanel, airliner, this));
        CardLayout cLayout = (CardLayout) this.funcJpanel.getLayout();
        cLayout.next(funcJpanel);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = airlinerTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                Airliner airliner = (Airliner) airlinerTable.getValueAt(selectedRow, 0);
                int id = airliner.getAirlinerID();
                for (int i = 0; i < airlinerList.size(); i++) {
                    if (airlinerList.get(i).getAirlinerID() == id) {
                        airlinerList.remove(i);
                    }
                }
                flushTable(airlinerList);
                //prodDir.deleteProduct(prod);
                //populate();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        /*
        int rowCount = airlinerTable.getRowCount();
        switch (String.valueOf(searchCbox.getSelectedItem())) {
            case "AirlineID":
                airliner = airlinerdirectory.searchAirLinerbyID(searchTxt.getText());
                break;
            case "AirlinerName":
                airliner = airlinerdirectory.searchAirLinerbyName(searchTxt.getText());
                break;
        }*/
        String name = searchTxt.getText();
        ArrayList<Airliner> searchedAirliners = new ArrayList();
        if (searchCbox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please at lease make a selection.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (searchCbox.getSelectedIndex() == 0) {
            Integer toSearch;
            try {
                toSearch = new Integer(name);
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please input an integer.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for (Airliner a : airlinerList) {
                if (a.getAirlinerID() == toSearch) {
                    searchedAirliners.add(a);
                }
            }
        } else if (searchCbox.getSelectedIndex() == 1) {
            for (Airliner a : airlinerList) {
                if (a.getAirlinerName().equalsIgnoreCase(name)) {
                    searchedAirliners.add(a);
                }
            }
        } else if (searchCbox.getSelectedIndex() == 2) {
            Integer toSearch;
            try {
                toSearch = new Integer(name);
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please input an integer.", "INFORMATION", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for (Airliner a : airlinerList) {
                if (a.getAirlinerMap().size() == toSearch) {
                    searchedAirliners.add(a);
                }
            }
        } else {
            throw new UnsupportedOperationException();
        }
        flushTable(searchedAirliners);
    }//GEN-LAST:event_searchBtnActionPerformed

    private void viewAirplaneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirplaneBtnActionPerformed
        int selectedRow = airlinerTable.getSelectedRow(), col = 0;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select at least a row.", "CREATE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Airliner airliner = (Airliner) airlinerTable.getValueAt(selectedRow, col);
        this.funcJpanel.add("AirplaneCreateJPanel",new AirplaneCreateJpanel(funcJpanel, airliner));
        CardLayout cLayout = (CardLayout) this.funcJpanel.getLayout();
        cLayout.next(this.funcJpanel);
        flushTable(airlinerList);
    }//GEN-LAST:event_viewAirplaneBtnActionPerformed

    private void searchCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable airlinerTable;
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> searchCbox;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JLabel titleJlael1;
    private javax.swing.JButton viewAirplaneBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
