package com.Calculator.JFrame;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;

public class CalculatorFrame extends javax.swing.JFrame {

    String cem = "+";
    String cix = "-";
    String vur = "*";
    String bol = "/";
    String zero = "0";
    String one = "1";
    String two = "2";
    String three = "3";
    String four = "4";
    String five = "5";
    String six = "6";
    String seven = "7";
    String eight = "8";
    String nine = "9";
    String noqte = ".";

    public CalculatorFrame() {
        initComponents();
        this.setResizable(false);
    }

    String procesResult = "";
    String text = "";
    String equalsResult = "";
    String cemProces = "";
    String cixProces = "";
    String vurProces = "";
    String bolProces = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNoqte = new javax.swing.JButton();
        btnCem = new javax.swing.JButton();
        btnCix = new javax.swing.JButton();
        btnVur = new javax.swing.JButton();
        btnBol = new javax.swing.JButton();
        btnKok = new javax.swing.JButton();
        btnKvadrat = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        tfCalculator = new javax.swing.JTextField();
        lblCalculator = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        btnSeven.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnFour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnOne.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnZero.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnThree.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Calculator");

        btnNoqte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNoqte.setText(".");
        btnNoqte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoqteActionPerformed(evt);
            }
        });

        btnCem.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnCem.setText("+");
        btnCem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCemActionPerformed(evt);
            }
        });

        btnCix.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCix.setText("-");
        btnCix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCixActionPerformed(evt);
            }
        });

        btnVur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVur.setText("*");
        btnVur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVurActionPerformed(evt);
            }
        });

        btnBol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBol.setText("/");
        btnBol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBolActionPerformed(evt);
            }
        });

        btnKok.setText("√");
        btnKok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKokActionPerformed(evt);
            }
        });

        btnKvadrat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKvadrat.setText("^2");
        btnKvadrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKvadratActionPerformed(evt);
            }
        });

        btnEquals.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        tfCalculator.setBackground(new java.awt.Color(153, 153, 153));
        tfCalculator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfCalculator.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfCalculator.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfCalculator.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        lblCalculator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCalculator.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfCalculator)
                    .addComponent(lblCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSeven, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(btnFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnZero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNoqte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKvadrat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKvadrat)
                            .addComponent(btnDelete))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSeven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFour)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOne)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnZero))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEight)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFive)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTwo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNoqte))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNine)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSix)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnThree)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKok)))
                                .addGap(1, 1, 1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCix)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBol)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEquals)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        if (text.length() <= 16) {

            procesResult += six;

            tfCalculator.setText(text + six);
            text += six;

        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }
        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";

    }//GEN-LAST:event_btnSixActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        if (text.length() <= 16) {

            procesResult += zero;

            tfCalculator.setText(text + zero);
            text += zero;

        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }
        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";

    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        if (text.length() <= 16) {

            procesResult += one;

            tfCalculator.setText(text + one);
            text += one;

        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }
        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";

    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        if (text.length() <= 16) {

            procesResult += two;

            tfCalculator.setText(text + two);
            text += two;

        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }
        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";

    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        if (text.length() <= 16) {

            procesResult += three;

            tfCalculator.setText(text + three);
            text += three;

        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }
        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";

    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        if (text.length() <= 16) {

            procesResult += four;

            tfCalculator.setText(text + four);
            text += four;

        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }
        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";

    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        if (text.length() <= 16) {

            procesResult += five;

            tfCalculator.setText(text + five);
            text += five;

        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }
        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";

    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        if (text.length() <= 16) {

            procesResult += seven;

            tfCalculator.setText(text + seven);
            text += seven;

        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }
        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";

    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        if (text.length() <= 16) {

            procesResult += eight;

            tfCalculator.setText(text + eight);
            text += eight;

        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }
        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";

    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        if (text.length() <= 16) {

            procesResult += nine;
            tfCalculator.setText(text + nine);
            text += nine;

        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }
        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";

    }//GEN-LAST:event_btnNineActionPerformed

    String kvadratResult = "";
    private void btnKvadratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKvadratActionPerformed
        if (kvadratResult.isEmpty()) {
            kvadratResult += equalsResult;
        }

        if (kvadratResult.isEmpty()) {
            lblCalculator.setText(procesResult + btnKvadrat.getText() + "=" + Math.pow(Double.parseDouble(procesResult), 2));
            tfCalculator.setText("" + Math.pow(Double.parseDouble(procesResult), 2));
            kvadratResult = "" + Math.pow(Double.parseDouble(procesResult), 2);
        } else {
            lblCalculator.setText(kvadratResult + btnKvadrat.getText() + "=" + Math.pow(Double.parseDouble(kvadratResult), 2));
            tfCalculator.setText("" + Math.pow(Double.parseDouble(kvadratResult), 2));
            kvadratResult = "";
            kvadratResult = "" + Math.pow(Double.parseDouble(equalsResult), 2);

        }
        equalsResult = "";
        equalsResult = kvadratResult;

    }//GEN-LAST:event_btnKvadratActionPerformed

    private void btnCemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCemActionPerformed
        if (cemProces.isEmpty() && cixProces.isEmpty() && vurProces.isEmpty() && bolProces.isEmpty() && !procesResult.isEmpty()) {
            if (equalsResult.isEmpty()) {
                lblCalculator.setText(procesResult + cem);
                procesResult += cem;
            } else {
                procesResult = "";
                lblCalculator.setText(equalsResult + cem);
                procesResult += equalsResult + cem;
            }

        }
        text = "";
        tfCalculator.setText("");
        cemProces = cem;
       }//GEN-LAST:event_btnCemActionPerformed

    private void btnCixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCixActionPerformed

        if (cemProces.isEmpty() && cixProces.isEmpty() && vurProces.isEmpty() && bolProces.isEmpty() && !procesResult.isEmpty()) {
            if (equalsResult.isEmpty()) {
                lblCalculator.setText(procesResult + cix);
                procesResult += cix;
            } else {
                procesResult = "";
                lblCalculator.setText(equalsResult + cix);
                procesResult += equalsResult + cix;
            }
        }
        text = "";
        tfCalculator.setText("");
        cixProces = cix;
       }//GEN-LAST:event_btnCixActionPerformed

    private void btnVurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVurActionPerformed

        if (cemProces.isEmpty() && cixProces.isEmpty() && vurProces.isEmpty() && bolProces.isEmpty() && !procesResult.isEmpty()) {
            if (equalsResult.isEmpty()) {
                lblCalculator.setText(procesResult + vur);
                procesResult += vur;
            } else {
                procesResult = "";
                lblCalculator.setText(equalsResult + vur);
                procesResult += equalsResult + vur;
            }
        }
        text = "";
        tfCalculator.setText("");
        vurProces = vur;
       }//GEN-LAST:event_btnVurActionPerformed

    private void btnBolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBolActionPerformed

        if (cemProces.isEmpty() && cixProces.isEmpty() && vurProces.isEmpty() && bolProces.isEmpty() && !procesResult.isEmpty()) {
            if (equalsResult.isEmpty()) {
                lblCalculator.setText(procesResult + bol);
                procesResult += bol;
            } else {
                procesResult = "";
                lblCalculator.setText(equalsResult + bol);
                procesResult += equalsResult + bol;
            }
        }
        text = "";
        tfCalculator.setText("");
        bolProces = bol;
       }//GEN-LAST:event_btnBolActionPerformed
    String kokResult = "";
    private void btnKokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKokActionPerformed
        if (kokResult.isEmpty()) {
            kokResult += equalsResult;
        }

        if (kokResult.isEmpty()) {
            lblCalculator.setText(procesResult + btnKok.getText() + "=" + Math.sqrt(Double.parseDouble(procesResult)));
            tfCalculator.setText("" + Math.sqrt(Double.parseDouble(procesResult)));
            kokResult = "" + Math.sqrt(Double.parseDouble(procesResult));
        } else {
            lblCalculator.setText(kokResult + btnKok.getText() + "=" + Math.sqrt(Double.parseDouble(kokResult)));
            tfCalculator.setText("" + Math.sqrt(Double.parseDouble(kokResult)));
            kokResult = "";
            kokResult = "" + Math.sqrt(Double.parseDouble(equalsResult));

        }
        equalsResult = "";
        equalsResult = kokResult;

    }//GEN-LAST:event_btnKokActionPerformed

    private void btnNoqteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoqteActionPerformed
        if (text.length() <= 16) {
            lblCalculator.setText(procesResult + noqte);
            procesResult += noqte;
            tfCalculator.setText(text + noqte);
            text += noqte;
        } else {
            JOptionPane.showMessageDialog(this, "Rəqəm sayı 16 - dan böyük ola bilməz!");
        }

        cemProces = "";
        cixProces = "";
        vurProces = "";
        bolProces = "";
    }//GEN-LAST:event_btnNoqteActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        try {
            tfCalculator.setText(engine.eval(procesResult).toString());
            lblCalculator.setText(procesResult + " = " + engine.eval(procesResult).toString());
            equalsResult = engine.eval(procesResult).toString();
            lblCalculator.setText("");

        } catch (ScriptException e) {
        }
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        procesResult = "";
        equalsResult = "";
        text = "";
        int lengthTf = tfCalculator.getText().length();
        int lengthLbl = lblCalculator.getText().length();
        tfCalculator.setText(tfCalculator.getText().substring(0, lengthTf - 1));
        text += tfCalculator.getText();
        if (tfCalculator.getText().isEmpty()) {
            tfCalculator.setText("0");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tfCalculator.setText("0");
    }//GEN-LAST:event_formWindowOpened

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed


    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBol;
    private javax.swing.JButton btnCem;
    private javax.swing.JButton btnCix;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnKok;
    private javax.swing.JButton btnKvadrat;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnNoqte;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnVur;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCalculator;
    private javax.swing.JTextField tfCalculator;
    // End of variables declaration//GEN-END:variables
}
