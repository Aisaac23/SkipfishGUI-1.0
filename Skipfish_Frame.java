/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skipfish_gui;

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Isaac
 */
public class Skipfish_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Skipfish_Frame
     */
    public Skipfish_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(6, 0), new java.awt.Dimension(16, 0), new java.awt.Dimension(6, 32767));
        jTextField1 = new javax.swing.JTextField();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 5), new java.awt.Dimension(73, 0), new java.awt.Dimension(5, 32767));
        jTextField2 = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jLabel3 = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(0, 32767));
        jTextField3 = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(8, 0), new java.awt.Dimension(8, 32767));
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(16, 0), new java.awt.Dimension(10, 32767));
        jTextField4 = new javax.swing.JTextField();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(22, 32767));
        jButton1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        jTextField5 = new javax.swing.JTextField();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jButton3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(16, 0), new java.awt.Dimension(10, 32767));
        jTextField6 = new javax.swing.JTextField();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jCheckBox4 = new javax.swing.JCheckBox();
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        jPanel14 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        jPanel15 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jCheckBox5 = new javax.swing.JCheckBox();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jTextField8 = new javax.swing.JTextField();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 5), new java.awt.Dimension(0, 5), new java.awt.Dimension(32767, 5));
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jPanel17 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        jTextField7 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        jFileChooser1.setDialogTitle("Set project directory");
        jFileChooser1.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        jFileChooser2.setAcceptAllFileFilterUsed(false);
        jFileChooser2.setApproveButtonText("Select");
        jFileChooser2.setFileFilter(new FileNameExtensionFilter("Dictionary files", "wl"));
        jFileChooser2.setFileHidingEnabled(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setPreferredSize(new java.awt.Dimension((int)java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth()/2, (int)java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight() - 80));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Administration"));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 120));
        jPanel2.setPreferredSize(new java.awt.Dimension(515, 120));
        jPanel2.setLayout(new java.awt.GridLayout(2, 1, 0, 10));

        jPanel3.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jPanel3.setMinimumSize(new java.awt.Dimension(199, 40));
        jPanel3.setPreferredSize(new java.awt.Dimension(503, 40));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Default directory");
        jPanel3.add(jLabel1);
        jPanel3.add(filler5);

        jTextField1.setEditable(false);
        jTextField1.setText(System.getProperty("user.dir"));
        jTextField1.setMaximumSize(new java.awt.Dimension(2147483647, 35));
        jTextField1.setMinimumSize(new java.awt.Dimension(6, 35));
        jTextField1.setPreferredSize(new java.awt.Dimension(300, 35));
        jPanel3.add(jTextField1);
        jPanel3.add(filler6);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Change");
        jButton2.setMaximumSize(new java.awt.Dimension(75, 30));
        jButton2.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jPanel3.add(jButton2);

        jPanel2.add(jPanel3);

        jPanel6.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(220, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(293, 40));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Scan ID");
        jPanel6.add(jLabel2);
        jPanel6.add(filler2);

        jTextField2.setEditable(false);
        jTextField2.setText(String.valueOf((int)(Math.random()*1000+1)).concat("0000").substring(0, 4)
        );
        jTextField2.setMaximumSize(new java.awt.Dimension(100, 35));
        jTextField2.setMinimumSize(new java.awt.Dimension(70, 35));
        jTextField2.setName(""); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(70, 35));
        jPanel6.add(jTextField2);
        jPanel6.add(filler3);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("-");
        jPanel6.add(jLabel3);
        jPanel6.add(filler4);

        jTextField3.setToolTipText("");
        jTextField3.setMaximumSize(new java.awt.Dimension(2147483647, 35));
        jTextField3.setMinimumSize(new java.awt.Dimension(6, 35));
        jTextField3.setPreferredSize(new java.awt.Dimension(6, 35));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jPanel6.add(jTextField3);
        jPanel6.add(filler1);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox1.setText("Custom ID");
        jCheckBox1.setMaximumSize(new java.awt.Dimension(90, 30));
        jCheckBox1.setPreferredSize(new java.awt.Dimension(90, 30));
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        jPanel6.add(jCheckBox1);

        jButton9.setText("New ID");
        jButton9.setMaximumSize(new java.awt.Dimension(75, 30));
        jButton9.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton9MouseReleased(evt);
            }
        });
        jPanel6.add(jButton9);

        jPanel2.add(jPanel6);

        jPanel1.add(jPanel2);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dictionaries"));
        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 160));
        jPanel5.setPreferredSize(new java.awt.Dimension(223, 160));
        jPanel5.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        jPanel4.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Results directory");
        jLabel4.setMaximumSize(new java.awt.Dimension(104, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(104, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(104, 20));
        jPanel4.add(jLabel4);
        jPanel4.add(filler7);

        jTextField4.setEditable(false);
        jTextField4.setToolTipText("");
        jTextField4.setMaximumSize(new java.awt.Dimension(2147483647, 35));
        jTextField4.setPreferredSize(new java.awt.Dimension(6, 35));
        jPanel4.add(jTextField4);
        jPanel4.add(filler8);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Change");
        jButton1.setToolTipText("");
        jButton1.setMaximumSize(new java.awt.Dimension(75, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(60, 20));
        jButton1.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jPanel4.add(jButton1);

        jPanel5.add(jPanel4);

        jPanel9.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.X_AXIS));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Learned words");
        jPanel9.add(jLabel5);
        jPanel9.add(filler9);

        jTextField5.setEditable(false);
        jTextField5.setMaximumSize(new java.awt.Dimension(2147483647, 35));
        jTextField5.setPreferredSize(new java.awt.Dimension(6, 35));
        jPanel9.add(jTextField5);
        jPanel9.add(filler10);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Change");
        jButton3.setMaximumSize(new java.awt.Dimension(75, 30));
        jButton3.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jPanel9.add(jButton3);

        jPanel5.add(jPanel9);

        jPanel10.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Input dictionary ");
        jPanel10.add(jLabel6);
        jPanel10.add(filler11);

        jTextField6.setEditable(false);
        jTextField6.setText(System.getProperty("user.dir") + "/Dictionaries/complete.wl");
        jTextField6.setMaximumSize(new java.awt.Dimension(2147483647, 35));
        jTextField6.setPreferredSize(new java.awt.Dimension(6, 35));
        jPanel10.add(jTextField6);
        jPanel10.add(filler12);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Change");
        jButton4.setMaximumSize(new java.awt.Dimension(67, 30));
        jButton4.setName(""); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(75, 30));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jPanel10.add(jButton4);

        jPanel5.add(jPanel10);

        jPanel1.add(jPanel5);

        jPanel7.setMinimumSize(new java.awt.Dimension(174, 300));
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.Y_AXIS));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Authentication"));
        jPanel11.setMinimumSize(new java.awt.Dimension(174, 200));
        jPanel11.setPreferredSize(new java.awt.Dimension(300, 73));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.Y_AXIS));

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox4.setText("Cookies (Format: name1:value1;name2:value2;name3:value3...)");
        jCheckBox4.setMaximumSize(new java.awt.Dimension(2147483647, 30));
        jCheckBox4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox4StateChanged(evt);
            }
        });
        jPanel8.add(jCheckBox4);

        jPanel11.add(jPanel8);
        jPanel11.add(filler19);

        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.Y_AXIS));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(166, 70));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jTextArea1.setMinimumSize(new java.awt.Dimension(4, 50));
        jScrollPane1.setViewportView(jTextArea1);

        jPanel14.add(jScrollPane1);

        jPanel11.add(jPanel14);
        jPanel11.add(filler16);

        jPanel15.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        jPanel15.setMinimumSize(new java.awt.Dimension(162, 40));
        jPanel15.setPreferredSize(new java.awt.Dimension(631, 40));
        jPanel15.setLayout(new javax.swing.BoxLayout(jPanel15, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBox3.setText("Reject new cookies");
        jCheckBox3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox3StateChanged(evt);
            }
        });
        jPanel15.add(jCheckBox3);
        jPanel15.add(filler17);

        jCheckBox5.setText("Authentication Header:");
        jCheckBox5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox5StateChanged(evt);
            }
        });
        jPanel15.add(jCheckBox5);
        jPanel15.add(filler18);

        jTextField8.setEnabled(false);
        jPanel15.add(jTextField8);

        jPanel11.add(jPanel15);
        jPanel11.add(filler15);

        jPanel7.add(jPanel11);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Performance"));
        jPanel16.setMaximumSize(new java.awt.Dimension(32839, 80));
        jPanel16.setPreferredSize(new java.awt.Dimension(423, 80));
        jPanel16.setLayout(new javax.swing.BoxLayout(jPanel16, javax.swing.BoxLayout.LINE_AXIS));

        jPanel18.setMaximumSize(new java.awt.Dimension(32767, 60));
        jPanel18.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        jCheckBox8.setText("No binary docs in RAM");
        jPanel18.add(jCheckBox8);

        jCheckBox6.setText("No extension guessing");
        jPanel18.add(jCheckBox6);

        jCheckBox7.setText("Flush request/response data to disk");
        jPanel18.add(jCheckBox7);

        jCheckBox9.setText("Max requests per second");
        jCheckBox9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jCheckBox9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jCheckBox9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox9StateChanged(evt);
            }
        });
        jPanel18.add(jCheckBox9);

        jPanel16.add(jPanel18);

        jPanel17.setMaximumSize(new java.awt.Dimension(60, 60));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 1000, 1));
        jSpinner1.setEnabled(false);
        jSpinner1.setMaximumSize(new java.awt.Dimension(60, 35));
        jSpinner1.setMinimumSize(new java.awt.Dimension(60, 20));
        jSpinner1.setPreferredSize(new java.awt.Dimension(60, 20));
        jPanel17.add(jSpinner1, java.awt.BorderLayout.CENTER);

        jPanel16.add(jPanel17);

        jPanel7.add(jPanel16);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Site"));
        jPanel12.setMaximumSize(new java.awt.Dimension(2147483647, 80));
        jPanel12.setMinimumSize(new java.awt.Dimension(75, 80));
        jPanel12.setPreferredSize(new java.awt.Dimension(159, 80));
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("URL");
        jPanel12.add(jLabel7);
        jPanel12.add(filler13);

        jTextField7.setMaximumSize(new java.awt.Dimension(2147483647, 35));
        jTextField7.setPreferredSize(new java.awt.Dimension(6, 35));
        jPanel12.add(jTextField7);

        jCheckBox2.setText("<html>Append new words<br>to input dictionary</html>");
        jCheckBox2.setToolTipText("");
        jCheckBox2.setMaximumSize(new java.awt.Dimension(150, 60));
        jCheckBox2.setMinimumSize(new java.awt.Dimension(150, 60));
        jCheckBox2.setPreferredSize(new java.awt.Dimension(150, 50));
        jPanel12.add(jCheckBox2);

        jPanel7.add(jPanel12);

        jPanel13.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel13.setMinimumSize(new java.awt.Dimension(75, 40));
        jPanel13.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel13.setLayout(new java.awt.GridLayout(1, 1, 20, 10));

        jButton5.setText("Advanced settings");
        jButton5.setMaximumSize(new java.awt.Dimension(100, 23));
        jButton5.setPreferredSize(new java.awt.Dimension(100, 23));
        jPanel13.add(jButton5);

        jButton6.setText("Save Settings");
        jPanel13.add(jButton6);

        jButton7.setText("Show command");
        jPanel13.add(jButton7);

        jButton8.setText("Run");
        jPanel13.add(jButton8);

        jPanel7.add(jPanel13);

        jPanel1.add(jPanel7);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        
        String directory = jTextField1.getText();
        if(this.jFileChooser1.showOpenDialog(jPanel1) == JFileChooser.APPROVE_OPTION)
            directory= jFileChooser1.getSelectedFile().toString();
        this.jTextField1.setText(directory);
    }//GEN-LAST:event_jButton2MouseReleased

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
       
        this.jTextField2.setEditable(this.jCheckBox1.isSelected());
        this.jTextField2.requestFocus();
        
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void jButton9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseReleased
        this.jTextField2.setText(String.valueOf((int)(Math.random()*1000+1)).concat("0000").substring(0, 4));
        this.jTextField3.requestFocus();
    }//GEN-LAST:event_jButton9MouseReleased

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        
        this.jTextField3.setText(this.jTextField3.getText().replaceAll("\\W", ""));
        
        if(!this.jTextField3.getText().isEmpty()){
        String outputDir = new File(this.jTextField1.getText() + "\\" +
                this.jTextField2.getText() + "-" + this.jTextField3.getText() + this.RESULTS).getAbsolutePath();
        String outputDic = new File(this.jTextField1.getText() + "\\" +
                this.jTextField2.getText() + "-" + this.jTextField3.getText() + this.LEARNED).getAbsolutePath();
        
        this.jTextField4.setText(outputDir);
        this.jTextField5.setText(outputDic);
        this.outputFile = this.jTextField2.getText() + "-" + this.jTextField3.getText() + this.outputFile;
        }
        
    }//GEN-LAST:event_jTextField3FocusLost

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        
        String directory = jTextField4.getText();
        if(this.jFileChooser1.showOpenDialog(jPanel1) == JFileChooser.APPROVE_OPTION)
            directory= jFileChooser1.getSelectedFile().toString();
        this.jTextField4.setText(directory);
        
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        
        String directory = jTextField5.getText();
        if(this.jFileChooser1.showOpenDialog(jPanel1) == JFileChooser.APPROVE_OPTION)
            directory= jFileChooser1.getSelectedFile().toString();
        this.jTextField5.setText(directory);
        
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        
        String directory = jTextField6.getText();
        if(this.jFileChooser2.showOpenDialog(jPanel1) == JFileChooser.APPROVE_OPTION)
            directory= jFileChooser2.getSelectedFile().toString();
        this.jTextField6.setText(directory);
        
    }//GEN-LAST:event_jButton4MouseReleased

    private void jCheckBox4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox4StateChanged
        
        this.jTextArea1.setEnabled(this.jCheckBox4.isSelected());
        this.jTextArea1.requestFocus();
        
    }//GEN-LAST:event_jCheckBox4StateChanged

    private void jCheckBox3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox3StateChanged
        
        
    }//GEN-LAST:event_jCheckBox3StateChanged

    private void jCheckBox5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox5StateChanged
        this.jTextField8.setEnabled(this.jCheckBox5.isSelected());
        this.jTextField8.requestFocus();
    }//GEN-LAST:event_jCheckBox5StateChanged

    private void jCheckBox9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox9StateChanged
        this.jSpinner1.setEnabled(this.jCheckBox9.isSelected());
        this.jSpinner1.requestFocus();
    }//GEN-LAST:event_jCheckBox9StateChanged

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
            java.util.logging.Logger.getLogger(Skipfish_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Skipfish_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Skipfish_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Skipfish_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Skipfish_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
    private final String RESULTS = "\\Results";
    private final String LEARNED = "\\LearnedWords";
    private String outputFile = ".wl";
    private String mkdirCommand = "mkdir ";
    private String touchCommand = "touch ";
    private String mainCommand = "skipfish ";
    private String os = System.getProperty("os.name");
}