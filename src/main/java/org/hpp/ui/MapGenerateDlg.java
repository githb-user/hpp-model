/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hpp.ui;

import javax.swing.JOptionPane;
import org.hpp.domain.MapGeneratorConfig;
import org.hpp.terrain.river.RiverFormer;
import org.hpp.ui.ctrl.MainFormCtrl;

/**
 *
 * @author Gautama
 */
public class MapGenerateDlg extends javax.swing.JDialog {

    private MainFormCtrl formCtrl = null;
    
    /**
     * Creates new form MapGenerateDlg
     */
    public MapGenerateDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void setFormCtrl(MainFormCtrl formCtrl) {
        this.formCtrl = formCtrl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        riverDepthModeGrp = new javax.swing.ButtonGroup();
        mapWidthSpin = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mapHeightSpin = new javax.swing.JSpinner();
        mapScaleSpin = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        monitorPxScale = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        minAngleSpin = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        maxAngleSpin = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        minEdgeSpin = new javax.swing.JSpinner();
        maxEdgeSpin = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        heightDeltaSpin = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        minRiverWidthSpin = new javax.swing.JSpinner();
        maxRiverWidthSpin = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        genMapBtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        minGenXSpin = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        maxGenXSpin = new javax.swing.JSpinner();
        maxGenZSpin = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        minGenZSpin = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        minBankWidthSpin = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        maxBankWidthSpin = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        bankHeightDeltaSpin = new javax.swing.JSpinner();
        naturalGenCheck = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        heightStabilitySpin = new javax.swing.JSpinner();
        buildBankCheck = new javax.swing.JCheckBox();
        forcedBankCheck = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        heightScaleSpin = new javax.swing.JSpinner();
        forcedDepthMode = new javax.swing.JRadioButton();
        smoothedDepthMode = new javax.swing.JRadioButton();
        naturalDepthMode = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Map generating params");
        setLocationByPlatform(true);
        setModal(true);
        setResizable(false);

        mapWidthSpin.setValue(400);

        jLabel1.setText("Width (px)");

        jLabel2.setText("Height (px)");

        mapHeightSpin.setValue(400);

        mapScaleSpin.setValue(10000);

        jLabel3.setText("1:");

        jLabel4.setText("Scale");

        monitorPxScale.setValue(4);

        jLabel5.setText("Monitor scale (px/mm)");

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Map params");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("River params");

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        minAngleSpin.setValue(0);

        jLabel8.setText("Min angle (deg)");

        jLabel9.setText("Max angle (deg)");

        maxAngleSpin.setValue(80);

        jLabel10.setText("Min edge (px)");

        jLabel11.setText("Max edge (px)");

        minEdgeSpin.setValue(20);

        maxEdgeSpin.setValue(60);

        jLabel12.setText("Height delta (m)");

        heightDeltaSpin.setValue(1);

        jLabel14.setText("Min width (px)");

        minRiverWidthSpin.setValue(20);

        maxRiverWidthSpin.setValue(20);
        maxRiverWidthSpin.setVerifyInputWhenFocusTarget(false);

        jLabel15.setText("Max width (px)");

        genMapBtn.setText("generate");
        genMapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genMapBtnActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Generator params");
        jLabel16.setToolTipText("");

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setText("Min X");

        minGenXSpin.setValue(1);

        jLabel18.setText("Max X");

        maxGenXSpin.setValue(4);

        maxGenZSpin.setValue(2);

        jLabel19.setText("Max Z");

        minGenZSpin.setValue(1);

        jLabel20.setText("Min Z");

        jLabel13.setText("Min bank width(px)");

        minBankWidthSpin.setValue(5);

        jLabel21.setText("Max bank width(px)");

        maxBankWidthSpin.setValue(15);

        jLabel22.setText("Bank height delta (m)");

        bankHeightDeltaSpin.setValue(5);

        naturalGenCheck.setSelected(true);
        naturalGenCheck.setText("natural generating");

        jLabel23.setText("Height stability(%)");

        heightStabilitySpin.setValue(65);

        buildBankCheck.setSelected(true);
        buildBankCheck.setText("build banks");

        forcedBankCheck.setText("forced banks");

        jLabel24.setText("Height scale");

        heightScaleSpin.setValue(300);

        riverDepthModeGrp.add(forcedDepthMode);
        forcedDepthMode.setText("forced depth");

        riverDepthModeGrp.add(smoothedDepthMode);
        smoothedDepthMode.setText("smoothed depth");

        riverDepthModeGrp.add(naturalDepthMode);
        naturalDepthMode.setSelected(true);
        naturalDepthMode.setText("natural depth");

        jLabel25.setText("Depth mode");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(genMapBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator3)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buildBankCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(forcedBankCheck)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naturalDepthMode)
                            .addComponent(smoothedDepthMode)
                            .addComponent(forcedDepthMode)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mapWidthSpin, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(mapHeightSpin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monitorPxScale, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(mapScaleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maxGenXSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minGenXSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maxGenZSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minGenZSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(heightScaleSpin))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naturalGenCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(minAngleSpin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maxAngleSpin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minEdgeSpin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maxEdgeSpin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minRiverWidthSpin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bankHeightDeltaSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightStabilitySpin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightDeltaSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minBankWidthSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxBankWidthSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxRiverWidthSpin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel16))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {maxAngleSpin, maxEdgeSpin, minAngleSpin, minEdgeSpin, minRiverWidthSpin});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bankHeightDeltaSpin, heightDeltaSpin, maxBankWidthSpin, maxRiverWidthSpin, minBankWidthSpin});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mapWidthSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(mapScaleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mapHeightSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(monitorPxScale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buildBankCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forcedBankCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(naturalGenCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(minAngleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(maxAngleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(minEdgeSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(maxEdgeSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel14))
                            .addComponent(minRiverWidthSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(forcedDepthMode)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smoothedDepthMode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(naturalDepthMode)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightDeltaSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightStabilitySpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minBankWidthSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxBankWidthSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bankHeightDeltaSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxRiverWidthSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(minGenXSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(maxGenXSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minGenZSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel24)
                            .addComponent(heightScaleSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxGenZSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(genMapBtn)
                .addGap(6, 6, 6))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {maxAngleSpin, maxEdgeSpin, minAngleSpin, minEdgeSpin, minRiverWidthSpin});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bankHeightDeltaSpin, heightDeltaSpin, maxBankWidthSpin, maxRiverWidthSpin, minBankWidthSpin});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genMapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genMapBtnActionPerformed
        if ( formCtrl == null ) {
            JOptionPane.showMessageDialog(this, "No main form controller.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        MapGeneratorConfig cfg = new MapGeneratorConfig();
        
        cfg.setMapWidth( (Integer)mapWidthSpin.getValue() );
        cfg.setMapHeight( (Integer)mapHeightSpin.getValue() );
        cfg.setMapScale((Integer)mapScaleSpin.getValue() );
        cfg.setMonitorScale( (Integer)monitorPxScale.getValue() );
        
        cfg.setMinRiverAngle( (Integer)minAngleSpin.getValue() );
        cfg.setMaxRiverAngle( (Integer)maxAngleSpin.getValue() );
        
        cfg.setMinRiverEdge( (Integer)minEdgeSpin.getValue() );
        cfg.setMaxRiverEdge( (Integer)maxEdgeSpin.getValue() );
        
        cfg.setRiverHeightDelta( (Integer)heightDeltaSpin.getValue() );
       
        cfg.setMinRiverWidth( (Integer)minRiverWidthSpin.getValue() );
        cfg.setMaxRiverWidth( (Integer)maxRiverWidthSpin.getValue() );
        
        cfg.setMinBankWidth( (Integer)minBankWidthSpin.getValue() );
        cfg.setMaxBankWidth( (Integer)maxBankWidthSpin.getValue() );
        
        cfg.setBankHeightDelta( (Integer)bankHeightDeltaSpin.getValue() );
        
        cfg.setIsNaturalGen( naturalGenCheck.isSelected() );
        cfg.setIsBuildBanks( buildBankCheck.isSelected() );
        cfg.setIsForcedBanks( forcedBankCheck.isSelected() );
        
        if ( forcedDepthMode.isSelected() ) {
            cfg.setRiverDepthMode( RiverFormer.RiverDepthMode.FORCED );
        } else if ( smoothedDepthMode.isSelected() ) {
            cfg.setRiverDepthMode( RiverFormer.RiverDepthMode.SMOOTHED );
        } else if ( naturalDepthMode.isSelected() ) {
            cfg.setRiverDepthMode( RiverFormer.RiverDepthMode.NATURAL );
        }
        
        cfg.setHeightStability( (Integer)heightStabilitySpin.getValue() );
        
        cfg.setMinGenX( (Integer)minGenXSpin.getValue() );
        cfg.setMaxGenX( (Integer)maxGenXSpin.getValue() );
        
        cfg.setMinGenZ( (Integer)minGenZSpin.getValue() );
        cfg.setMaxGenZ( (Integer)maxGenZSpin.getValue() );
        
        cfg.setHeightScale( (Integer)heightScaleSpin.getValue() );
        
        if ( formCtrl.generateMap(cfg) ) {
            formCtrl.paintMap();
        }
    }//GEN-LAST:event_genMapBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner bankHeightDeltaSpin;
    private javax.swing.JCheckBox buildBankCheck;
    private javax.swing.JCheckBox forcedBankCheck;
    private javax.swing.JRadioButton forcedDepthMode;
    private javax.swing.JButton genMapBtn;
    private javax.swing.JSpinner heightDeltaSpin;
    private javax.swing.JSpinner heightScaleSpin;
    private javax.swing.JSpinner heightStabilitySpin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner mapHeightSpin;
    private javax.swing.JSpinner mapScaleSpin;
    private javax.swing.JSpinner mapWidthSpin;
    private javax.swing.JSpinner maxAngleSpin;
    private javax.swing.JSpinner maxBankWidthSpin;
    private javax.swing.JSpinner maxEdgeSpin;
    private javax.swing.JSpinner maxGenXSpin;
    private javax.swing.JSpinner maxGenZSpin;
    private javax.swing.JSpinner maxRiverWidthSpin;
    private javax.swing.JSpinner minAngleSpin;
    private javax.swing.JSpinner minBankWidthSpin;
    private javax.swing.JSpinner minEdgeSpin;
    private javax.swing.JSpinner minGenXSpin;
    private javax.swing.JSpinner minGenZSpin;
    private javax.swing.JSpinner minRiverWidthSpin;
    private javax.swing.JSpinner monitorPxScale;
    private javax.swing.JRadioButton naturalDepthMode;
    private javax.swing.JCheckBox naturalGenCheck;
    private javax.swing.ButtonGroup riverDepthModeGrp;
    private javax.swing.JRadioButton smoothedDepthMode;
    // End of variables declaration//GEN-END:variables
}
