/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Component;

/**
 *
 * @author Dell
 */
public class View1 extends javax.swing.JFrame {

    int sea = 0;
    int sh = 0;
    int res = 0;
    int pay = 0;
    int sal = 0;
    int acc = 0;

    /**
     * Creates new form View1
     */
    public View1() {
        initComponents();
        AddSeaGuardForm s1 = new AddSeaGuardForm();
        // s1.setBounds(165, 30, 1175, 675);
        OtherDetails a1 = new OtherDetails();
        //a1.setBounds(165, 30, 1175, 675);
        ManageSeaGuardForm1 m1 = new ManageSeaGuardForm1();
        //m1.setBounds(165, 30, 1175, 675);
        ViewAllSeaGuards v1 = new ViewAllSeaGuards();
        //v1.setBounds(165, 30, 1175, 675);

        tabbedPane.add(s1);
        tabbedPane.add(m1);
        tabbedPane.add(a1);
        tabbedPane.add(v1);
        seaGuard.setBackground(Color.white);
        seaGuardLabel.setForeground(Color.black);
        sea = 1;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ship = new javax.swing.JPanel();
        shipLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        seaGuard = new javax.swing.JPanel();
        seaGuardLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        payments = new javax.swing.JPanel();
        paymentLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        reservation = new javax.swing.JPanel();
        reservationLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salary = new javax.swing.JPanel();
        salaryLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();
        accountPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        accountLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);

        ship.setBackground(new java.awt.Color(0, 0, 0));
        ship.setPreferredSize(new java.awt.Dimension(150, 105));
        ship.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shipMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shipMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shipMouseClicked(evt);
            }
        });

        shipLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        shipLabel.setForeground(new java.awt.Color(255, 255, 255));
        shipLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shipLabel.setText("Ship ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images/images/shipIcon.png"))); // NOI18N

        javax.swing.GroupLayout shipLayout = new javax.swing.GroupLayout(ship);
        ship.setLayout(shipLayout);
        shipLayout.setHorizontalGroup(
            shipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shipLayout.createSequentialGroup()
                .addGroup(shipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shipLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(shipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(shipLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        shipLayout.setVerticalGroup(
            shipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shipLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shipLabel)
                .addContainerGap())
        );

        seaGuard.setBackground(new java.awt.Color(0, 0, 0));
        seaGuard.setPreferredSize(new java.awt.Dimension(150, 105));
        seaGuard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seaGuardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seaGuardMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seaGuardMouseClicked(evt);
            }
        });

        seaGuardLabel.setBackground(new java.awt.Color(0, 0, 0));
        seaGuardLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        seaGuardLabel.setForeground(new java.awt.Color(255, 255, 255));
        seaGuardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seaGuardLabel.setText("Sea Guard");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images/images/seaGuard.png"))); // NOI18N

        javax.swing.GroupLayout seaGuardLayout = new javax.swing.GroupLayout(seaGuard);
        seaGuard.setLayout(seaGuardLayout);
        seaGuardLayout.setHorizontalGroup(
            seaGuardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seaGuardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seaGuardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(seaGuardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        seaGuardLayout.setVerticalGroup(
            seaGuardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seaGuardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seaGuardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        payments.setBackground(new java.awt.Color(0, 0, 0));
        payments.setPreferredSize(new java.awt.Dimension(150, 105));
        payments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentsMouseExited(evt);
            }
        });

        paymentLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        paymentLabel.setForeground(new java.awt.Color(255, 255, 255));
        paymentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paymentLabel.setText("Payments");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images/images/$Icon.png"))); // NOI18N

        javax.swing.GroupLayout paymentsLayout = new javax.swing.GroupLayout(payments);
        payments.setLayout(paymentsLayout);
        paymentsLayout.setHorizontalGroup(
            paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paymentsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        paymentsLayout.setVerticalGroup(
            paymentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reservation.setBackground(new java.awt.Color(0, 0, 0));
        reservation.setPreferredSize(new java.awt.Dimension(150, 105));
        reservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reservationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reservationMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationMouseClicked(evt);
            }
        });

        reservationLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        reservationLabel.setForeground(new java.awt.Color(255, 255, 255));
        reservationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reservationLabel.setText(" Reservation");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images/images/handShake.png"))); // NOI18N

        javax.swing.GroupLayout reservationLayout = new javax.swing.GroupLayout(reservation);
        reservation.setLayout(reservationLayout);
        reservationLayout.setHorizontalGroup(
            reservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationLayout.createSequentialGroup()
                .addGroup(reservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reservationLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(reservationLabel))
                    .addGroup(reservationLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        reservationLayout.setVerticalGroup(
            reservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reservationLabel)
                .addContainerGap())
        );

        salary.setBackground(new java.awt.Color(0, 0, 0));
        salary.setPreferredSize(new java.awt.Dimension(150, 105));
        salary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salaryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salaryMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaryMouseClicked(evt);
            }
        });

        salaryLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        salaryLabel.setForeground(new java.awt.Color(255, 255, 255));
        salaryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salaryLabel.setText("Salary");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images/images/moneyIcon.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(130, 50));
        jLabel5.setMinimumSize(new java.awt.Dimension(130, 50));
        jLabel5.setPreferredSize(new java.awt.Dimension(130, 50));

        javax.swing.GroupLayout salaryLayout = new javax.swing.GroupLayout(salary);
        salary.setLayout(salaryLayout);
        salaryLayout.setHorizontalGroup(
            salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaryLayout.createSequentialGroup()
                .addGroup(salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salaryLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(salaryLabel))
                    .addGroup(salaryLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        salaryLayout.setVerticalGroup(
            salaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salaryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaryLabel)
                .addContainerGap())
        );

        tabbedPane.setBackground(new java.awt.Color(153, 153, 255));
        tabbedPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabbedPane.setForeground(new java.awt.Color(153, 153, 255));
        tabbedPane.setMaximumSize(new java.awt.Dimension(1175, 675));
        tabbedPane.setMinimumSize(new java.awt.Dimension(1175, 675));
        tabbedPane.setOpaque(true);
        tabbedPane.setPreferredSize(new java.awt.Dimension(1175, 675));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images/images/closeButton2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        accountPanel.setBackground(new java.awt.Color(0, 0, 0));
        accountPanel.setMinimumSize(new java.awt.Dimension(150, 105));
        accountPanel.setPreferredSize(new java.awt.Dimension(150, 105));
        accountPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountPanelMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/images/images/account.png"))); // NOI18N

        accountLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        accountLabel.setForeground(new java.awt.Color(255, 255, 255));
        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountLabel.setText("User Accounts");

        javax.swing.GroupLayout accountPanelLayout = new javax.swing.GroupLayout(accountPanel);
        accountPanel.setLayout(accountPanelLayout);
        accountPanelLayout.setHorizontalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(21, 21, 21))
        );
        accountPanelLayout.setVerticalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accountLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Back Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seaGuard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(52, 52, 52)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seaGuard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(ship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(reservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(payments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void seaGuardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seaGuardMouseEntered
        seaGuard.setBackground(Color.white);
        seaGuardLabel.setForeground(Color.black);
    }//GEN-LAST:event_seaGuardMouseEntered

    private void seaGuardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seaGuardMouseExited
        if (sea == 1) {
            return;
        }
        seaGuard.setBackground(Color.black);
        seaGuardLabel.setForeground(Color.white);
    }//GEN-LAST:event_seaGuardMouseExited

    private void shipMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shipMouseEntered

        ship.setBackground(Color.white);
        shipLabel.setForeground(Color.black);
    }//GEN-LAST:event_shipMouseEntered

    private void shipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shipMouseExited
        if (sh == 1) {
            return;
        }
        ship.setBackground(Color.black);
        shipLabel.setForeground(Color.white);
    }//GEN-LAST:event_shipMouseExited

    private void reservationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationMouseEntered
        reservation.setBackground(Color.white);
        reservationLabel.setForeground(Color.black);
    }//GEN-LAST:event_reservationMouseEntered

    private void reservationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationMouseExited
        if (res == 1) {
            return;
        }
        reservation.setBackground(Color.black);
        reservationLabel.setForeground(Color.white);
    }//GEN-LAST:event_reservationMouseExited

    private void paymentsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsMouseEntered
        payments.setBackground(Color.white);
        paymentLabel.setForeground(Color.black);
    }//GEN-LAST:event_paymentsMouseEntered

    private void paymentsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsMouseExited
        if (pay == 1) {
            return;
        }
        payments.setBackground(Color.black);
        paymentLabel.setForeground(Color.white);
    }//GEN-LAST:event_paymentsMouseExited

    private void salaryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryMouseEntered

        salary.setBackground(Color.white);
        salaryLabel.setForeground(Color.black);
    }//GEN-LAST:event_salaryMouseEntered

    private void salaryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryMouseExited
        if (sal == 1) {
            return;
        }
        salary.setBackground(Color.black);
        salaryLabel.setForeground(Color.white);
    }//GEN-LAST:event_salaryMouseExited

    private void seaGuardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seaGuardMouseClicked
        sea = 1;
        sh = 0;
        res = 0;
        pay = 0;
        sal = 0;
        acc = 0;

        ship.setBackground(Color.black);
        accountPanel.setBackground(Color.black);
        accountLabel.setForeground(Color.white);
        reservation.setBackground(Color.black);
        payments.setBackground(Color.black);
        salary.setBackground(Color.black);
        salaryLabel.setForeground(Color.white);
        shipLabel.setForeground(Color.white);
        reservationLabel.setForeground(Color.white);
        paymentLabel.setForeground(Color.white);

        tabbedPane.removeAll();
        AddSeaGuardForm s1 = new AddSeaGuardForm();
        // s1.setBounds(165, 30, 1175, 675);
        OtherDetails a1 = new OtherDetails();
        //a1.setBounds(165, 30, 1175, 675);
        ManageSeaGuardForm1 m1 = new ManageSeaGuardForm1();
        //m1.setBounds(165, 30, 1175, 675);
        ViewAllSeaGuards v1 = new ViewAllSeaGuards();
        //v1.setBounds(165, 30, 1175, 675);

        tabbedPane.add(s1);
        tabbedPane.add(m1);
        tabbedPane.add(a1);
        tabbedPane.add(v1);


    }//GEN-LAST:event_seaGuardMouseClicked

    private void shipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shipMouseClicked
        sh = 1;
        sea = 0;
        sal = 0;
        res = 0;
        pay = 0;
        acc = 0;
        seaGuard.setBackground(Color.black);

        reservation.setBackground(Color.black);
        payments.setBackground(Color.black);

        seaGuardLabel.setForeground(Color.white);
        accountPanel.setBackground(Color.black);
        accountLabel.setForeground(Color.white);
        reservationLabel.setForeground(Color.white);
        paymentLabel.setForeground(Color.white);
        salary.setBackground(Color.black);
        salaryLabel.setForeground(Color.white);
        tabbedPane.removeAll();
        ShipView s1 = new ShipView();
        ManageShips m1 = new ManageShips();
        //s1.setBounds(165, 30, 1175, 675);
        tabbedPane.add(s1);
        tabbedPane.add(m1);


    }//GEN-LAST:event_shipMouseClicked

    private void reservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationMouseClicked
        res = 1;
        sea = 0;
        sh = 0;
        sal = 0;
        pay = 0;
        acc = 0;

        seaGuard.setBackground(Color.black);
        ship.setBackground(Color.black);

        payments.setBackground(Color.black);

        seaGuardLabel.setForeground(Color.white);
        shipLabel.setForeground(Color.white);

        paymentLabel.setForeground(Color.white);
        salary.setBackground(Color.black);
        salaryLabel.setForeground(Color.white);
        accountPanel.setBackground(Color.black);
        accountLabel.setForeground(Color.white);
        tabbedPane.removeAll();
        ReservationView r1 = new ReservationView();
        ReservationManage r2 = new ReservationManage();
        tabbedPane.add(r1);
        tabbedPane.add(r2);
    }//GEN-LAST:event_reservationMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void paymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsMouseClicked
        pay = 1;
        sea = 0;
        sh = 0;
        res = 0;
        sal = 0;
        acc = 0;
        seaGuard.setBackground(Color.black);
        ship.setBackground(Color.black);
        reservation.setBackground(Color.black);
        accountPanel.setBackground(Color.black);
        accountLabel.setForeground(Color.white);
        seaGuardLabel.setForeground(Color.white);
        shipLabel.setForeground(Color.white);
        reservationLabel.setForeground(Color.white);
        salary.setBackground(Color.black);
        salaryLabel.setForeground(Color.white);

        tabbedPane.removeAll();
        PaymentsView p1 = new PaymentsView();
        PaymentManage p2 = new PaymentManage();

        tabbedPane.add(p1);
        tabbedPane.add(p2);
    }//GEN-LAST:event_paymentsMouseClicked

    private void salaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaryMouseClicked
        tabbedPane.removeAll();
        SalaryManage s2 = new SalaryManage();
        SalaryView s1 = new SalaryView();
        tabbedPane.add(s1);
        tabbedPane.add(s2);

        accountPanel.setBackground(Color.black);
        accountLabel.setForeground(Color.white);
        seaGuard.setBackground(Color.black);
        ship.setBackground(Color.black);
        reservation.setBackground(Color.black);
        payments.setBackground(Color.black);
        paymentLabel.setForeground(Color.white);
        seaGuardLabel.setForeground(Color.white);
        shipLabel.setForeground(Color.white);
        reservationLabel.setForeground(Color.white);

        pay = 0;
        sea = 0;
        sh = 0;
        res = 0;
        sal = 1;
        acc = 0;
    }//GEN-LAST:event_salaryMouseClicked

    private void accountPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPanelMouseClicked
        pay = 0;
        sea = 0;
        sh = 0;
        res = 0;
        sal = 0;
        acc = 1;
        ship.setBackground(Color.black);
        seaGuardLabel.setForeground(Color.white);
        seaGuard.setBackground(Color.black);
        reservation.setBackground(Color.black);
        payments.setBackground(Color.black);
        salary.setBackground(Color.black);
        salaryLabel.setForeground(Color.white);
        shipLabel.setForeground(Color.white);
        reservationLabel.setForeground(Color.white);
        paymentLabel.setForeground(Color.white);
        this.dispose();
        new Account().setVisible(true);
    }//GEN-LAST:event_accountPanelMouseClicked

    private void accountPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPanelMouseEntered
        accountPanel.setBackground(Color.white);
        accountLabel.setForeground(Color.black);
    }//GEN-LAST:event_accountPanelMouseEntered

    private void accountPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPanelMouseExited
        if (acc == 1) {
            return;
        }
        accountPanel.setBackground(Color.black);
        accountLabel.setForeground(Color.white);
    }//GEN-LAST:event_accountPanelMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountLabel;
    private javax.swing.JPanel accountPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JPanel payments;
    private javax.swing.JPanel reservation;
    private javax.swing.JLabel reservationLabel;
    private javax.swing.JPanel salary;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JPanel seaGuard;
    private javax.swing.JLabel seaGuardLabel;
    private javax.swing.JPanel ship;
    private javax.swing.JLabel shipLabel;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables

}