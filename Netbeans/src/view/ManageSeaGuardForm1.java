package view;

import controllers.SeaGuardController;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.SeaGuard;
import other.ComboSearch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class ManageSeaGuardForm1 extends javax.swing.JPanel {

    /**
     * Creates new form SeaGuardForm
     */
    public ManageSeaGuardForm1() {

        initComponents();
        setSids();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteButtton = new javax.swing.JLabel();
        updateButton1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sidCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        teleText1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        birthText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        teleText2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailText1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jLabel7.setBackground(new java.awt.Color(0, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Name");

        jLabel13.setBackground(new java.awt.Color(0, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Name");

        setMinimumSize(new java.awt.Dimension(1175, 675));
        setName("Manage Sea Guard\n"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1175, 675));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 2, true));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Sea Guard Form");

        deleteButtton.setBackground(new java.awt.Color(255, 153, 153));
        deleteButtton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteButtton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteButtton.setText("Delete");
        deleteButtton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        deleteButtton.setOpaque(true);
        deleteButtton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButttonMouseExited(evt);
            }
        });

        updateButton1.setBackground(new java.awt.Color(255, 153, 153));
        updateButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateButton1.setText("Update");
        updateButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        updateButton1.setOpaque(true);
        updateButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButton1MouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButton1MouseClicked(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 153, 153));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelButton.setText("Cancel");
        cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        cancelButton.setOpaque(true);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SID");

        sidCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        sidCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sidComboItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        nameText.setEditable(false);
        nameText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nameText.setPreferredSize(new java.awt.Dimension(4, 29));
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telephone  (Land)");

        teleText1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        teleText1.setPreferredSize(new java.awt.Dimension(4, 29));
        teleText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText1ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");

        addressText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addressText.setPreferredSize(new java.awt.Dimension(4, 29));
        addressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTextActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date Of Birth");

        birthText.setEditable(false);
        birthText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        birthText.setPreferredSize(new java.awt.Dimension(4, 29));
        birthText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthTextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mobile");

        teleText2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        teleText2.setPreferredSize(new java.awt.Dimension(4, 29));
        teleText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleText2ActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email");

        emailText1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        emailText1.setPreferredSize(new java.awt.Dimension(4, 29));
        emailText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailText1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age");

        ageText.setEditable(false);
        ageText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ageText.setPreferredSize(new java.awt.Dimension(4, 29));
        ageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(teleText1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sidCombo, 0, 120, Short.MAX_VALUE)
                                        .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(birthText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teleText2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel2)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(sidCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(teleText1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(addressText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(birthText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(teleText2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(emailText1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButtton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(640, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        getAccessibleContext().setAccessibleName("Sea Guard\n");
        getAccessibleContext().setAccessibleDescription("Add Sea Guard\n");
    }// </editor-fold>//GEN-END:initComponents

    private void teleText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleText2ActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void teleText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleText1ActionPerformed

    private void addressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressTextActionPerformed

    private void ageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextActionPerformed

    private void birthTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthTextActionPerformed

    private void emailText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailText1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        setSids();
    }//GEN-LAST:event_formComponentShown

    private void sidComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sidComboItemStateChanged
        searchSeaGuard();
    }//GEN-LAST:event_sidComboItemStateChanged

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        enter(cancelButton);
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        exit(cancelButton);
    }//GEN-LAST:event_cancelButtonMouseExited

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked

    }//GEN-LAST:event_cancelButtonMouseClicked

    private void deleteButttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButttonMouseClicked
        deleteSeaGuard();
    }//GEN-LAST:event_deleteButttonMouseClicked

    private void deleteButttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButttonMouseEntered
        enter(deleteButtton);
    }//GEN-LAST:event_deleteButttonMouseEntered

    private void deleteButttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButttonMouseExited
        exit(deleteButtton);
    }//GEN-LAST:event_deleteButttonMouseExited

    private void updateButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButton1MouseClicked
        updateSeaGuard();
    }//GEN-LAST:event_updateButton1MouseClicked

    private void updateButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButton1MouseEntered
        enter(updateButton1);
    }//GEN-LAST:event_updateButton1MouseEntered

    private void updateButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButton1MouseExited
        exit(updateButton1);
    }//GEN-LAST:event_updateButton1MouseExited
    public void enter(Component c) {
        c.setBackground(Color.red);
        c.setForeground(Color.white);
    }

    public void exit(Component c) {
        c.setBackground(new Color(255, 153, 153));
        c.setForeground(Color.black);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressText;
    private javax.swing.JTextField ageText;
    private javax.swing.JTextField birthText;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel deleteButtton;
    private javax.swing.JTextField emailText1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameText;
    private javax.swing.JComboBox<String> sidCombo;
    private javax.swing.JTextField teleText1;
    private javax.swing.JTextField teleText2;
    private javax.swing.JLabel updateButton1;
    // End of variables declaration//GEN-END:variables

    private void setSids() {
        sidCombo.removeAllItems();
        try {
            ArrayList<String> sids = SeaGuardController.getAllSids();

            for (String sid : sids) {
                sidCombo.addItem(sid);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageSeaGuardForm1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageSeaGuardForm1.class.getName()).log(Level.SEVERE, null, ex);
        }
        new ComboSearch().setSearchableCombo(sidCombo, true, "No result found...");
    }

    private void searchSeaGuard() {
        if (sidCombo.getItemCount() == 0) {
            return;
        }
        try {
            SeaGuard sG = SeaGuardController.searchSeaGuard(sidCombo.getSelectedItem().toString());
            nameText.setText(sG.getName());
            addressText.setText(sG.getAddress());
            teleText1.setText(sG.getTele() + "");
            teleText2.setText(sG.getMobile() + "");
            emailText1.setText(sG.getEmail() + "");
            birthText.setText(sG.getDob());
            ageText.setText(sG.getAge());
        } catch (SQLException ex) {
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageSeaGuardForm1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteSeaGuard() {
        try {
            if (sidCombo.getSelectedItem() == null) {
                return;
            }
            if (SeaGuardController.deleteSeaGuard(sidCombo.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(ManageSeaGuardForm1.this, "Deleted ...");
            } else {
                JOptionPane.showMessageDialog(ManageSeaGuardForm1.this, "Deleted Failed ...");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageSeaGuardForm1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageSeaGuardForm1.class.getName()).log(Level.SEVERE, null, ex);
        }
        textFieldsClearAll();
        setSids();
    }

    private void textFieldsClearAll() {
        nameText.setText("");
        addressText.setText("");
        emailText1.setText("");
        teleText1.setText("");
        teleText2.setText("");
        ageText.setText("");
        birthText.setText("");

    }

    private void updateSeaGuard() {
        try {
            if (sidCombo.getSelectedItem() == null) {
                return;
            }
            String sid = sidCombo.getSelectedItem().toString();
            String name = nameText.getText();
            String tele = teleText1.getText();
            String mobile = teleText2.getText();
            String address = addressText.getText();
            String email = emailText1.getText();
            String dob = birthText.getText();
            String age = ageText.getText();
            if (name == "" || address == "" || dob == "") {
                JOptionPane.showMessageDialog(ManageSeaGuardForm1.this, "Please enter correct values ");
            }

            boolean updateSeaGuard = SeaGuardController.updateSeaGuard(new SeaGuard(sid, name, tele, mobile, address, email, dob, age));
            if (updateSeaGuard) {
                JOptionPane.showMessageDialog(ManageSeaGuardForm1.this, "Updated Successfully...");
            } else {
                JOptionPane.showMessageDialog(ManageSeaGuardForm1.this, "Update Failed...");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageSeaGuardForm1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageSeaGuardForm1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(ManageSeaGuardForm1.this, "Please Enter Correct Values ");
        }

    }
}
