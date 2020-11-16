/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.ReservationController;
import controllers.SalaryController;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Salary;
import other.ComboSearch;
import view.sub1.AllSalaries;
import view.sub1.SalariesOfDate;
import view.sub1.SalariesOfSeaGuard;

/**
 *
 * @author Dell
 */
public class SalaryManage extends javax.swing.JPanel {

    /**
     * Creates new form SalaryManage
     */
    public SalaryManage() {
        initComponents();
        setRidCombo();
        setSlIds();
        
        jTabbedPane1.add(new AllSalaries());
        jTabbedPane1.add(new SalariesOfDate());
        jTabbedPane1.add(new SalariesOfSeaGuard());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ridText = new javax.swing.JTextField();
        rsText = new javax.swing.JTextField();
        slIdCombo = new javax.swing.JComboBox<>();
        ridCombo = new javax.swing.JComboBox<>();
        deleteButton = new javax.swing.JLabel();
        editButton = new javax.swing.JLabel();
        dateText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(1175, 675));
        setMinimumSize(new java.awt.Dimension(1175, 675));
        setName("Salary Manage"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1175, 675));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("Salary Manage"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SLID");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RID");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Amount Rs");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Salary");

        ridText.setEditable(false);
        ridText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        rsText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rsText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rsTextKeyTyped(evt);
            }
        });

        slIdCombo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        slIdCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                slIdComboItemStateChanged(evt);
            }
        });
        slIdCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slIdComboActionPerformed(evt);
            }
        });

        ridCombo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ridCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ridComboItemStateChanged(evt);
            }
        });
        ridCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridComboActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 153, 153));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        deleteButton.setOpaque(true);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(255, 153, 153));
        editButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editButton.setText("Edit");
        editButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        editButton.setOpaque(true);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editButtonMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        dateText.setEditable(false);
        dateText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rsText)
                                    .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(slIdCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ridText, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(ridCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(390, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ridCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ridText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(483, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rsTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rsTextKeyTyped
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || Character.toString(ch).equals("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_rsTextKeyTyped

    private void slIdComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_slIdComboItemStateChanged
        setTexts();
    }//GEN-LAST:event_slIdComboItemStateChanged

    private void slIdComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slIdComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slIdComboActionPerformed

    private void ridComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ridComboItemStateChanged
        setRidText();
    }//GEN-LAST:event_ridComboItemStateChanged

    private void ridComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ridComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ridComboActionPerformed

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        delete();
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void deleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseEntered
        enter(deleteButton);
    }//GEN-LAST:event_deleteButtonMouseEntered

    private void deleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseExited
        exit(deleteButton);
    }//GEN-LAST:event_deleteButtonMouseExited

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        edit();
    }//GEN-LAST:event_editButtonMouseClicked

    private void editButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseEntered
        enter(editButton);
    }//GEN-LAST:event_editButtonMouseEntered
    public void enter(Component c) {
        c.setBackground(Color.red);
        c.setForeground(Color.white);
    }

    public void exit(Component c) {
        c.setBackground(new Color(255, 153, 153));
        c.setForeground(Color.black);
    }
    private void editButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseExited
        exit(editButton);
    }//GEN-LAST:event_editButtonMouseExited

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        setSlIds();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateText;
    private javax.swing.JLabel deleteButton;
    private javax.swing.JLabel editButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> ridCombo;
    private javax.swing.JTextField ridText;
    private javax.swing.JTextField rsText;
    private javax.swing.JComboBox<String> slIdCombo;
    // End of variables declaration//GEN-END:variables

    private void setRidCombo() {
        try {
            ArrayList<String> s1 = ReservationController.getRids();
            if (s1.isEmpty()) {
                return;
            }
            for (String s : s1) {
                ridCombo.addItem(s);
            }
            new ComboSearch().setSearchableCombo(ridCombo, true, "No result found...");
        } catch (SQLException ex) {
            Logger.getLogger(SalaryManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setRidText() {
        try {
            ridText.setText(ridCombo.getSelectedItem().toString());
        } catch (NullPointerException e) {
            ridText.setText("");
        }
    }

    private void setSlIds() {
        slIdCombo.removeAllItems();
        try {
            ArrayList<String> s1 = SalaryController.getSlIds();
            if (s1.isEmpty()) {
                return;
            }
            for (String s : s1) {
                slIdCombo.addItem(s);
            }
            new ComboSearch().setSearchableCombo(slIdCombo, true, "No result found...");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaryManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setTexts() {
        try {
            Salary s1 = null;
            try {
                s1 = SalaryController.getSalary(slIdCombo.getSelectedItem().toString());
            } catch (NullPointerException e) {
                ridText.setText("");
                dateText.setText("");
                rsText.setText("");
                return;
            }
            
                
            
            ridText.setText(s1.getRid());
            dateText.setText(s1.getDate());
            rsText.setText(s1.getAmount() + "");
        } catch (SQLException ex) {
            Logger.getLogger(SalaryManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaryManage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void edit() {
        if (slIdCombo.getSelectedItem() == null || rsText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(SalaryManage.this, "Fill all Records");
            return;
        }
        String slid = slIdCombo.getSelectedItem().toString();
        String rid = ridText.getText();
        String date = dateText.getText();
        double rs = Double.parseDouble(rsText.getText());

        try {
            if (SalaryController.updateSalary(new Salary(slid, rid, date, rs))) {
                JOptionPane.showMessageDialog(SalaryManage.this, "Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(SalaryManage.this, "Update Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalaryManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaryManage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void delete() {
        try {
            if (slIdCombo.getSelectedItem()==null) {
                return ;
            }
            if (SalaryController.deleteSalary(slIdCombo.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(SalaryManage.this, "Deleted Successfully");
                slIdCombo.removeItemAt(slIdCombo.getSelectedIndex());
           }else{
                JOptionPane.showMessageDialog(SalaryManage.this, "Delete Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalaryManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaryManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
