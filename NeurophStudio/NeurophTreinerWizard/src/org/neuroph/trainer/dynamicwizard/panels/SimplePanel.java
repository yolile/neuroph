/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.neuroph.trainer.dynamicwizard.panels;

import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Sanja
 */
public class SimplePanel extends javax.swing.JPanel {

    private static SimplePanel instance;
    /**
     * Creates new form SimplePanel
     */
    private SimplePanel() {
        initComponents();
    }
    
    public static SimplePanel getPanel(){
        if (instance == null) {
            instance = new SimplePanel();
        }
        return instance;
    }
    public String getName() {
        return "Set Training parameters";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextFieldPercents = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldHiddenNeurons = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldLearningRates = new javax.swing.JTextField();
        jSpinnerCV = new javax.swing.JSpinner();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(SimplePanel.class, "SimplePanel.jLabel4.text")); // NOI18N

        jTextFieldPercents.setText(org.openide.util.NbBundle.getMessage(SimplePanel.class, "SimplePanel.jTextFieldPercents.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(SimplePanel.class, "SimplePanel.jLabel3.text")); // NOI18N

        jTextFieldHiddenNeurons.setText(org.openide.util.NbBundle.getMessage(SimplePanel.class, "SimplePanel.jTextFieldHiddenNeurons.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(SimplePanel.class, "SimplePanel.jLabel2.text")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(SimplePanel.class, "SimplePanel.jLabel1.text")); // NOI18N

        jTextFieldLearningRates.setText(org.openide.util.NbBundle.getMessage(SimplePanel.class, "SimplePanel.jTextFieldLearningRates.text")); // NOI18N

        jSpinnerCV.setValue(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLearningRates)
                    .addComponent(jTextFieldHiddenNeurons)
                    .addComponent(jTextFieldPercents, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerCV, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 177, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldLearningRates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldHiddenNeurons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPercents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JSpinner getjSpinnerCV() {
        return jSpinnerCV;
    }

    

    public JTextField getTextFieldHiddenNeurons() {
        return jTextFieldHiddenNeurons;
    }

    public JTextField getTextFieldLearningRates() {
        return jTextFieldLearningRates;
    }

    public JTextField getTextFieldPercents() {
        return jTextFieldPercents;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSpinnerCV;
    private javax.swing.JTextField jTextFieldHiddenNeurons;
    private javax.swing.JTextField jTextFieldLearningRates;
    private javax.swing.JTextField jTextFieldPercents;
    // End of variables declaration//GEN-END:variables

    
}