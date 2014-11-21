/*
 * x1.java
 *
 * Created on 26 Mar 2014, 11:29:28 PM
 */
package com.sensepost.yeti.gui;

import com.sensepost.yeti.common.NetworkTools;

/**
 *
 * @author willem
 */
public class DoWhois extends BaseDlg {

    /**
     * Creates new form x1
     */
    public DoWhois() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setModalityType(ModalityType.APPLICATION_MODAL);
        this.txtWhoisResult.setContentType("text/plain");
    }

    public DoWhois(String name, String tld) {
        super();
        initComponents();
        this.txtWhoisResult.setContentType("text/plain");
        txtName.setText(name);
        txtTld.setText(tld);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtTld = new javax.swing.JTextField();
        btnDomainWhois = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtWhoisResult = new javax.swing.JEditorPane();

        setMinimumSize(new java.awt.Dimension(544, 389));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Domain detail"));
        jPanel1.setName("jPanel1"); // NOI18N

        jLabel1.setText("Name"); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText("Tld"); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        txtName.setName("txtName"); // NOI18N

        txtTld.setName("txtTld"); // NOI18N

        btnDomainWhois.setText("Whois"); // NOI18N
        btnDomainWhois.setName("btnDomainWhois"); // NOI18N
        btnDomainWhois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDomainWhoisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTld, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDomainWhois)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnDomainWhois)
                .addComponent(txtTld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
        );

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        txtWhoisResult.setName("txtWhoisResult"); // NOI18N
        jScrollPane1.setViewportView(txtWhoisResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btnDomainWhoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDomainWhoisActionPerformed
    String whoisResult = NetworkTools.getHostNameWhoisResult(txtName.getText(), txtTld.getText(), true);
    txtWhoisResult.setText(whoisResult);
}//GEN-LAST:event_btnDomainWhoisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDomainWhois;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTld;
    private javax.swing.JEditorPane txtWhoisResult;
    // End of variables declaration//GEN-END:variables
}