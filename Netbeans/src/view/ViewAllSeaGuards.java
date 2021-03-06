/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.PaymentController;
import controllers.ReservationController;
import controllers.SalaryController;
import controllers.SeaGuardController;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import model.Payment;
import model.Salary;
import model.SeaGuard;
import model1.ReservationsOfSeaGuard;
import model1.ViewSeaGuard;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dell
 */
public class ViewAllSeaGuards extends javax.swing.JPanel {

    private DefaultTableModel model;
    private DefaultTableModel model1;
    private DefaultTableModel model2;
    private DefaultTableModel model3;

    /**
     * Creates new form ViewAllSeaGuards
     */
    public ViewAllSeaGuards() {
        initComponents();
        setModel();
        setSeaGuards();

        seaGuardTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                setReservationTable();
                model2.setRowCount(0);
                model3.setRowCount(0);
                $Text.setText("0.0");
                rs2Text.setText("0.0");
                rs1Text.setText("0.0");
            }

        });
        reservationTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                setPaymentTable();
                setText1();
                setSalaryTable();
                setText2();
                setTotal();
            }

            private void setText1() {
                double $ = 0;
                double rs = 0;
                if (model2.getRowCount() == 0) {
                    $Text.setText("0.0");
                    rs1Text.setText("0.0");
                }
                for (int i = 0; i < model2.getRowCount(); i++) {
                    $ += Double.parseDouble(model2.getValueAt(i, 3).toString());
                    rs += Double.parseDouble(model2.getValueAt(i, 4).toString());
                }
                $Text.setText($ + "");
                rs1Text.setText(rs + "");
            }

            private void setText2() {
                double rs = 0;
                if (model3.getRowCount() == 0) {
                    rs1Text.setText("0.0");
                    return;
                }
                for (int i = 0; i < model3.getRowCount(); i++) {
                    rs += Double.parseDouble(model3.getValueAt(i, 3).toString());
                }
                rs2Text.setText(rs + "");

            }

            private void setTotal() {
                double t=Double.parseDouble(rs1Text.getText())-Double.parseDouble(rs2Text.getText());
                totalText.setText(t+"");
            }

        });

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
        jScrollPane3 = new javax.swing.JScrollPane();
        seaGuardTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        salaryTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        rs2Text = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        $Text = new javax.swing.JLabel();
        rs1Text = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        totalText = new javax.swing.JLabel();
        printButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1175, 675));
        setName("View All\n\n"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1175, 675));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        seaGuardTable.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        seaGuardTable.setForeground(new java.awt.Color(107, 5, 4));
        seaGuardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SID", "Name", "Address", "Document"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(seaGuardTable);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All Sea Guards");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(441, 296));
        jPanel3.setPreferredSize(new java.awt.Dimension(441, 296));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reservations");

        reservationTable.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        reservationTable.setForeground(new java.awt.Color(107, 5, 4));
        reservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SID", "RID", "Ship Id", "In Date", "Out date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reservationTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(441, 296));
        jPanel4.setName(""); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(441, 296));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymentTable.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        paymentTable.setForeground(new java.awt.Color(107, 5, 4));
        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RID", "PID", "Date", "Amount $", "Amount Rs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(paymentTable);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 451, 180));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Payments");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 28, 190, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Salary");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 18, 190, 49));

        salaryTable.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        salaryTable.setForeground(new java.awt.Color(107, 5, 4));
        salaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RID", "SlID", "Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(salaryTable);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 73, 332, 180));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        rs2Text.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rs2Text.setForeground(new java.awt.Color(255, 0, 0));
        rs2Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rs2Text.setText("0.0");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total");

        $Text.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        $Text.setForeground(new java.awt.Color(255, 0, 0));
        $Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        $Text.setText("0.0");

        rs1Text.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rs1Text.setForeground(new java.awt.Color(255, 0, 0));
        rs1Text.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rs1Text.setText("0.0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent($Text, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rs1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(rs2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(593, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs1Text, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent($Text, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(rs2Text))
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 264, -1, -1));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Total Income");

        totalText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        totalText.setForeground(new java.awt.Color(255, 0, 0));
        totalText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalText.setText("0.0");

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(printButton)
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(totalText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(101, 101, 101)
                .addComponent(printButton)
                .addGap(20, 20, 20))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 73, 222, 240));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
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

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        setSeaGuards();
    }//GEN-LAST:event_formComponentShown

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        printPreview();
    }//GEN-LAST:event_printButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel $Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable paymentTable;
    private javax.swing.JButton printButton;
    private javax.swing.JTable reservationTable;
    private javax.swing.JLabel rs1Text;
    private javax.swing.JLabel rs2Text;
    private javax.swing.JTable salaryTable;
    private javax.swing.JTable seaGuardTable;
    private javax.swing.JLabel totalText;
    // End of variables declaration//GEN-END:variables

    private void setModel() {
        model = (DefaultTableModel) seaGuardTable.getModel();
        model1 = (DefaultTableModel) reservationTable.getModel();
        model2 = (DefaultTableModel) paymentTable.getModel();
        model3 = (DefaultTableModel) salaryTable.getModel();

    }

    private void setSeaGuards() {
        model.setRowCount(0);
        totalText.setText("0.0");
        try {
            ArrayList<ViewSeaGuard> v = SeaGuardController.getSeaGuards();
            for (ViewSeaGuard v1 : v) {
                model.addRow(new Object[]{v1.getSid(), v1.getName(), v1.getAddress(), v1.isStatues()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewAllSeaGuards.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAllSeaGuards.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setReservationTable() {
        model1.setRowCount(0);
        if (seaGuardTable.getSelectedRow()==-1) {
            return ;
        }
        
        String sid = model.getValueAt(seaGuardTable.getSelectedRow(), 0).toString();
        try {
            ArrayList<ReservationsOfSeaGuard> r1 = ReservationController.getSeaGuardsReservations(sid);
            for (ReservationsOfSeaGuard r : r1) {
                model1.addRow(new Object[]{r.getSid(), r.getRid(), r.getShipId(), r.getInDate(), r.getOutDate()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewAllSeaGuards.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAllSeaGuards.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void setPaymentTable() {

        model2.setRowCount(0);
        if (reservationTable.getSelectedRow()==-1) {
            return ;
        }
        String rid = reservationTable.getValueAt(reservationTable.getSelectedRow(), 1).toString();

        try {
            ArrayList<Payment> p1 = PaymentController.getPayments(rid);
            for (Payment p : p1) {
                model2.addRow(new Object[]{p.getRid(), p.getPid(), p.getDate(), p.getAmountUS$(), p.getAmountRs()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewAllSeaGuards.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAllSeaGuards.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void setSalaryTable() {
        model3.setRowCount(0);
        if (reservationTable.getSelectedRow()==-1) {
            return ;
        }
        String rid = reservationTable.getValueAt(reservationTable.getSelectedRow(), 1).toString();

        try {
            ArrayList<Salary> p1 = SalaryController.getSalariesForRid(rid);
            for (Salary p : p1) {
                model3.addRow(new Object[]{p.getRid(), p.getSid(), p.getDate(), p.getAmount()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViewAllSeaGuards.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewAllSeaGuards.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void printPreview() {
        InputStream iS = getClass().getResourceAsStream("/Reports/SalarySheet.jrxml");
        HashMap<String,Object> h=new HashMap<>();
        h.put("Total", rs2Text.getText());
        h.put("Name", model.getValueAt(seaGuardTable.getSelectedRow(), 1));
        h.put("SID",model.getValueAt(seaGuardTable.getSelectedRow(), 0));
        try {
            JasperReport compileReport = JasperCompileManager.compileReport(iS);
            JasperPrint fillReport = JasperFillManager.fillReport(compileReport, h,new JRTableModelDataSource(model3));
            JasperViewer.viewReport(fillReport,false);
        } catch (JRException ex) {
            Logger.getLogger(ViewAllSeaGuards.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
