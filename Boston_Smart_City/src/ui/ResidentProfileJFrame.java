/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import java.sql.SQLException;



import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Vector;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Resident;

/**
 *
 * @author rithvik
 */
public class ResidentProfileJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ResidentProfileJFrame() {
        initComponents();
        updateCombo();
        updateCityCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        btnOther = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        comboCommunity = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        btnCreate = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        lblN = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblPT = new javax.swing.JLabel();
        lblPN = new javax.swing.JLabel();
        lblE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Name :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 170, 27));

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 180, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Age :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 170, 27));

        txtAge.setBackground(new java.awt.Color(204, 204, 204));
        txtAge.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 180, -1));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Gender :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 170, 27));

        genderGroup.add(btnMale);
        btnMale.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnMale.setText("Male");
        btnMale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });
        jPanel2.add(btnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 270, -1, -1));

        genderGroup.add(btnFemale);
        btnFemale.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnFemale.setText("Female");
        btnFemale.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(btnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, -1, -1));

        genderGroup.add(btnOther);
        btnOther.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnOther.setText("Other");
        btnOther.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(btnOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 270, -1, -1));

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Address :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 170, 27));

        txtAddress.setBackground(new java.awt.Color(204, 204, 204));
        txtAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 180, -1));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Community :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 170, 27));

        comboCommunity.setBackground(new java.awt.Color(204, 204, 204));
        comboCommunity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        comboCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roxbury", "South Bay" }));
        comboCommunity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        comboCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCommunityActionPerformed(evt);
            }
        });
        jPanel2.add(comboCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 360, 180, -1));

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("City :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 170, 27));

        comboCity.setBackground(new java.awt.Color(204, 204, 204));
        comboCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        comboCity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        comboCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCityActionPerformed(evt);
            }
        });
        jPanel2.add(comboCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, 180, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Phone Number :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 170, 27));

        txtPhoneNumber.setBackground(new java.awt.Color(204, 204, 204));
        txtPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });
        jPanel2.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 460, 180, -1));

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Email :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 170, 27));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 500, 180, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Password :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, 170, 27));

        txtPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, 180, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Confirm Password :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 170, 27));

        txtConfirmPassword.setBackground(new java.awt.Color(204, 204, 204));
        txtConfirmPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyReleased(evt);
            }
        });
        jPanel2.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, 180, -1));

        btnCreate.setBackground(new java.awt.Color(102, 102, 102));
        btnCreate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create Profile");
        btnCreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, 190, 50));

        btnBack1.setBackground(new java.awt.Color(102, 102, 102));
        btnBack1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("Back");
        btnBack1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 680, 140, 50));

        lblN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblNKeyReleased(evt);
            }
        });
        jPanel2.add(lblN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 190, 182, 29));

        lblA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblAKeyReleased(evt);
            }
        });
        jPanel2.add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 230, 182, 29));

        lblPT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblPTKeyReleased(evt);
            }
        });
        jPanel2.add(lblPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 310, 182, 29));
        jPanel2.add(lblPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 460, 182, 29));

        lblE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblEKeyReleased(evt);
            }
        });
        jPanel2.add(lblE, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 500, 182, 29));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/ResidentProfile.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1650, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCityActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        String name= txtName.getText();
        int age=Integer.parseInt(txtAge.getText());
        String address=txtAddress.getText();
        String city=(String)comboCity.getSelectedItem();
    
        String community=(String)comboCommunity.getSelectedItem();
        Long phonenumber=Long.parseLong(txtPhoneNumber.getText());
        String email=txtEmail.getText();
        String password=txtPassword.getText();
        String confirmpassword=txtConfirmPassword.getText();
        
        this.btnMale.setActionCommand("Male");
        this.btnFemale.setActionCommand("Female");
        this.btnOther.setActionCommand("Other");
        
        String selection = this.genderGroup.getSelection().getActionCommand();

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            

            con1.setNetworkTimeout(Executors.newFixedThreadPool(5), 5000);

            Resident r = new Resident();
            r.setName(name);
            r.setAge(age);
            r.setGender(selection);
            r.setEmail(email);
            r.setPhoneNumber(phonenumber);
            r.setAddress(address);
            r.setCity(city);
            r.setCommunity(community);
            r.setPassword(password);
            r.setConfirmPassword(confirmpassword);
            
            insert=con1.prepareStatement("insert into personregistration(name,age,gender,address,city,community,phonenumber,email,password,confirmpassword)values(?,?,?,?,?,?,?,?,?,?)");

            insert.setString(1, r.getName());
            
            insert.setInt(2, r.getAge());
            // insert.setString(2, gender);
//            if(btnMale.isSelected()){
//                insert.setString(3, btnMale.getText());
//            }
//            else if(btnFemale.isSelected()){
//                insert.setString(3, btnFemale.getText());
//            }
//            else{
//                insert.setString(3, btnOther.getText());
//            }
            insert.setString(3, r.getGender());

            insert.setString(4, r.getAddress());

            insert.setString(5, r.getCity());
            
            insert.setString(6, r.getCommunity());

            insert.setLong(7, r.getPhoneNumber());
            
            insert.setString(8,r.getEmail());
            
            insert.setString(9, r.getPassword());
            
            insert.setString(10, r.getConfirmPassword());

            insert.executeUpdate();

            JOptionPane.showMessageDialog(this,"Registered Successfully");

            txtName.setText("");
            txtAge.setText("");
            genderGroup.clearSelection();
            txtAddress.setText("");
            comboCommunity.setSelectedIndex(-1);
            comboCity.setSelectedIndex(-1);
            txtPhoneNumber.setText("");
            txtEmail.setText("");
            txtPassword.setText("");
            txtConfirmPassword.setText("");

              con1.close();


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResidentProfileJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        catch (SQLException ex) {
            Logger.getLogger(ResidentProfileJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
 
              if(con1!=null)
              try {
                  con1.close();
              } catch (SQLException ex) {
                  Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
              }
}
        

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        MainJFrame mf = new MainJFrame();
        mf.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaleActionPerformed

    private void comboCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCommunityActionPerformed

    private void lblNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblNKeyReleased
        
    }//GEN-LAST:event_lblNKeyReleased

    private void lblAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblAKeyReleased
      
    }//GEN-LAST:event_lblAKeyReleased

    private void lblPTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPTKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblPTKeyReleased

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtName.getText());
        if(!match.matches()){
            lblN.setText("Name is incorrect");
        }
        else{
            lblN.setText("");
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9]{1,2}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtAge.getText());
        if(!match.matches()){
            lblA.setText("Age is incorrect");
        }
        else{
            lblA.setText("");
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9]{0,200}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtAddress.getText());
        if(!match.matches()){
            lblPT.setText("Address is incorrect");
        }
        else{
            lblPT.setText("");
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[0-9]{10,10}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtPhoneNumber.getText());
        if(!match.matches()){
            lblPN.setText("Phone Number is incorrect");
        }
        else{
            lblPN.setText("");
        }
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void lblEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblEKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblEKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9]{4,30}[@][a-zA-Z]{2,10}[.][a-zA-Z]{1,5}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtEmail.getText());
        if(!match.matches()){
            lblE.setText("Email is incorrect");
        }
        else{
            lblE.setText("");
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyReleased
        
    }//GEN-LAST:event_txtConfirmPasswordKeyReleased
       
    private void updateCombo() {
         
    String sql="select * from community";
   
    try{
       Class.forName("com.mysql.jdbc.Driver");

        con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");

        con1.setNetworkTimeout(Executors.newFixedThreadPool(5), 5000);

        insert=con1.prepareStatement(sql);
        
        rs=insert.executeQuery();
        while(rs.next()){
        comboCommunity.addItem(rs.getString("communityname"));
        con1.close();
        }
        
    }catch(Exception e){
    }finally{
    if(con1!=null){
        try {
            con1.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResidentProfileJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    }
    
    
     private void updateCityCombo(){
         
    String sql="select * from city";
   
    try{
       Class.forName("com.mysql.jdbc.Driver");

        con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");

        con1.setNetworkTimeout(Executors.newFixedThreadPool(5), 5000);

        insert=con1.prepareStatement(sql);
        
        rs=insert.executeQuery();
        while(rs.next()){
        comboCity.addItem(rs.getString("cityname"));

          con1.close();
        

        }
        
    }catch(Exception e){
    }finally{
    if(con1!=null){
        try {
            con1.close();
        } catch (SQLException ex) {
            Logger.getLogger(ResidentProfileJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    }
    
    
    Connection con1;
    PreparedStatement insert;
    ResultSet rs;
        
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
            java.util.logging.Logger.getLogger(ResidentProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResidentProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResidentProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResidentProfileJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResidentProfileJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCreate;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnOther;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCommunity;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblE;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblPN;
    private javax.swing.JLabel lblPT;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
