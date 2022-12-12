/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;




import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rithvik
 */
public class StaffJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StaffJFrame
     */
    public StaffJFrame() {
        initComponents();
    }
    Connection con1;
    PreparedStatement insert;
    ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnView1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtResidentId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtComplaintId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtComplaintType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComplaintBox = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtID6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtAge1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        btnMale1 = new javax.swing.JRadioButton();
        btnFemale1 = new javax.swing.JRadioButton();
        btnOther1 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        btnUpdateMyProfile = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtID3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(68, 125, 125));
        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1113, 609, 140, 50));

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Resident ID", "Complaint ID", "Complaint Type", "Status", "Complaint", "Comment By Worker"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 971, 110));

        btnView1.setBackground(new java.awt.Color(68, 125, 125));
        btnView1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnView1.setText("View");
        btnView1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 90, 40));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Resident ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 170, 33));

        txtResidentId.setBackground(new java.awt.Color(204, 204, 204));
        txtResidentId.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtResidentId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(txtResidentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 150, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Complaint ID :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 170, 33));

        txtComplaintId.setBackground(new java.awt.Color(204, 204, 204));
        txtComplaintId.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtComplaintId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(txtComplaintId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 150, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Complaint Type :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 170, 33));

        txtComplaintType.setBackground(new java.awt.Color(204, 204, 204));
        txtComplaintType.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtComplaintType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(txtComplaintType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 150, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Status :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 170, 30));

        txtStatus.setBackground(new java.awt.Color(204, 204, 204));
        txtStatus.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 150, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Complaint Box :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 170, 33));

        txtComplaintBox.setBackground(new java.awt.Color(204, 204, 204));
        txtComplaintBox.setColumns(10);
        txtComplaintBox.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtComplaintBox.setRows(3);
        txtComplaintBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane2.setViewportView(txtComplaintBox);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 250, 110));

        txtComment.setBackground(new java.awt.Color(204, 204, 204));
        txtComment.setColumns(10);
        txtComment.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtComment.setRows(3);
        txtComment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane3.setViewportView(txtComment);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 250, 110));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel7.setText("Comment By Worker :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 220, 28));

        btnAdd.setBackground(new java.awt.Color(68, 125, 125));
        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnAdd.setText("Submit ");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 234, 50));

        txtID6.setBackground(new java.awt.Color(204, 204, 204));
        txtID6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtID6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtID6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID6ActionPerformed(evt);
            }
        });
        jPanel1.add(txtID6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, 100, -1));

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Staff ID :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Staff1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1300, 680));

        jTabbedPane1.addTab("Staff", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Name :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 143, 180, 27));

        txtName1.setBackground(new java.awt.Color(204, 204, 204));
        txtName1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 142, 148, -1));

        jLabel28.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Age :");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 206, 180, 27));

        txtAge1.setBackground(new java.awt.Color(204, 204, 204));
        txtAge1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtAge1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtAge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAge1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtAge1, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 206, 148, -1));

        jLabel29.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Gender :");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 281, 180, 27));

        genderGroup.add(btnMale1);
        btnMale1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnMale1.setText("Male");
        jPanel2.add(btnMale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 281, -1, -1));

        genderGroup.add(btnFemale1);
        btnFemale1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnFemale1.setText("Female");
        jPanel2.add(btnFemale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 281, -1, -1));

        genderGroup.add(btnOther1);
        btnOther1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnOther1.setText("Other");
        jPanel2.add(btnOther1, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 281, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Email :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 354, 180, 27));

        txtEmail1.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtEmail1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(txtEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 354, 148, -1));

        btnUpdateMyProfile.setText("Update");
        btnUpdateMyProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMyProfileActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdateMyProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 461, 115, 51));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Staff ID :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 110, 30));

        txtID3.setBackground(new java.awt.Color(204, 204, 204));
        txtID3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtID3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        txtID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID3ActionPerformed(evt);
            }
        });
        jPanel2.add(txtID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1149, 24, 100, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Staff1.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1290, 700));

        jTabbedPane1.addTab("Update My Profile", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        MainJFrame mf = new MainJFrame();
        mf.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
         int selectedIndex =  jTable1.getSelectedRow();
         
         
         txtResidentId.setText(Df.getValueAt(selectedIndex,0).toString());
          txtComplaintId.setText(Df.getValueAt(selectedIndex,1).toString());
           txtComplaintType.setText(Df.getValueAt(selectedIndex,2).toString());
            txtStatus.setText(Df.getValueAt(selectedIndex,3).toString());
             txtComplaintBox.setText(Df.getValueAt(selectedIndex,4).toString());
             txtComment.setText(Df.getValueAt(selectedIndex,5).toString());
    }//GEN-LAST:event_btnView1ActionPerformed

    public void table_update_water()
        {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            insert=con1.prepareStatement("select * from raisecomplaint where organization='Water Supply Org'");
            
             ResultSet rs= insert.executeQuery();
             ResultSetMetaData Rss = rs.getMetaData();
             c = Rss.getColumnCount();
             
             DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            
             Df.setRowCount(0);
             
             while(rs.next())
             {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                 v2.add(rs.getString("id"));
                  v2.add(rs.getString("complaintid"));
                   v2.add(rs.getString("organization"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("complaint"));
                    v2.add(rs.getString("workercomment"));
                 
               
               }
               Df.addRow(v2);
             }
           
                     
           
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
     
     public void table_update_street()
        {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            insert=con1.prepareStatement("select * from raisecomplaint where organization='Street Org'");
            
             ResultSet rs= insert.executeQuery();
             ResultSetMetaData Rss = rs.getMetaData();
             c = Rss.getColumnCount();
             
             DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            
             Df.setRowCount(0);
             
             while(rs.next())
             {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                 v2.add(rs.getString("id"));
                  v2.add(rs.getString("complaintid"));
                   v2.add(rs.getString("organization"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("complaint"));
                    v2.add(rs.getString("workercomment"));
                 
               
               }
               Df.addRow(v2);
             }
           
                     
           
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
     
     
     public void table_update_police()
        {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            insert=con1.prepareStatement("select * from raisecomplaint where organization='Police Org'");
            
             ResultSet rs= insert.executeQuery();
             ResultSetMetaData Rss = rs.getMetaData();
             c = Rss.getColumnCount();
             
             DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            
             Df.setRowCount(0);
             
             while(rs.next())
             {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                 v2.add(rs.getString("id"));
                  v2.add(rs.getString("complaintid"));
                   v2.add(rs.getString("organization"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("complaint"));
                    v2.add(rs.getString("workercomment"));
                 
               
               }
               Df.addRow(v2);
             }
           
                     
           
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
     
     public void table_update_hospital()
        {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            insert=con1.prepareStatement("select * from raisecomplaint where organization='Hospital Org'");
            
             ResultSet rs= insert.executeQuery();
             ResultSetMetaData Rss = rs.getMetaData();
             c = Rss.getColumnCount();
             
             DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            
             Df.setRowCount(0);
             
             while(rs.next())
             {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                 v2.add(rs.getString("id"));
                  v2.add(rs.getString("complaintid"));
                   v2.add(rs.getString("organization"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("complaint"));
                    v2.add(rs.getString("workercomment"));
                 
               
               }
               Df.addRow(v2);
             }
           
                     
           
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
     
     public void table_update_fire()
        {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            insert=con1.prepareStatement("select * from raisecomplaint where organization='Fire Org'");
            
             ResultSet rs= insert.executeQuery();
             ResultSetMetaData Rss = rs.getMetaData();
             c = Rss.getColumnCount();
             
             DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            
             Df.setRowCount(0);
             
             while(rs.next())
             {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                 v2.add(rs.getString("id"));
                  v2.add(rs.getString("complaintid"));
                   v2.add(rs.getString("organization"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("complaint"));
                    v2.add(rs.getString("workercomment"));
                 
               
               }
               Df.addRow(v2);
             }
           
                     
           
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
     
     public void table_update_nongov()
        {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            insert=con1.prepareStatement("select * from raisecomplaint where organization='Non Gov Org'");
            
             ResultSet rs= insert.executeQuery();
             ResultSetMetaData Rss = rs.getMetaData();
             c = Rss.getColumnCount();
             
             DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            
             Df.setRowCount(0);
             
             while(rs.next())
             {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                 v2.add(rs.getString("id"));
                  v2.add(rs.getString("complaintid"));
                   v2.add(rs.getString("organization"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("complaint"));
                    v2.add(rs.getString("workercomment"));
                 
               
               }
               Df.addRow(v2);
             }
           
             
                     
           
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
     
     public void table_update_gov()
        {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            insert=con1.prepareStatement("select * from raisecomplaint where organization='Gov Org'");
            
             ResultSet rs= insert.executeQuery();
             ResultSetMetaData Rss = rs.getMetaData();
             c = Rss.getColumnCount();
             
             DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            
             Df.setRowCount(0);
             
             while(rs.next())
             {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                 v2.add(rs.getString("id"));
                  v2.add(rs.getString("complaintid"));
                   v2.add(rs.getString("organization"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("complaint"));
                    v2.add(rs.getString("workercomment"));
                 
               
               }
               Df.addRow(v2);
             }
           
                     
           
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
     
     public void table_update_standalone()
        {
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            insert=con1.prepareStatement("select * from raisecomplaint where organization='Stand Alone'");
            
             ResultSet rs= insert.executeQuery();
             ResultSetMetaData Rss = rs.getMetaData();
             c = Rss.getColumnCount();
             
             DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            
             Df.setRowCount(0);
             
             while(rs.next())
             {
               Vector v2 = new Vector();
               
               for(int a=1; a<=c; a++)
               {
                 v2.add(rs.getString("id"));
                  v2.add(rs.getString("complaintid"));
                   v2.add(rs.getString("organization"));
                    v2.add(rs.getString("status"));
                    v2.add(rs.getString("complaint"));
                    v2.add(rs.getString("workercomment"));
                 
               
               }
               Df.addRow(v2);
             }
           
                     
           
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(SystemAdminJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
    
    
    
    
    private void txtAge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAge1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAge1ActionPerformed

    private void txtID3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID3ActionPerformed

    private void txtID6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID6ActionPerformed

    private void btnUpdateMyProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMyProfileActionPerformed
        // TODO add your handling code here:
        try {
               
              int employeeid=Integer.parseInt(txtID3.getText());
              String name= txtName1.getText();
              int age=Integer.parseInt(txtAge1.getText());
              String email=txtEmail1.getText();
             
        this.btnMale1.setActionCommand("Male");
        this.btnFemale1.setActionCommand("Female");
        this.btnOther1.setActionCommand("Other");
              String selection = this.genderGroup.getSelection().getActionCommand();
              
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            insert=con1.prepareStatement("update employeeregistration set name=?, age=?, gender=?, email=? where employeeid=?");
            
            insert.setString(1, name);
            insert.setInt(2, age);
            insert.setString(3, selection);
            insert.setString(4,email);
            insert.setInt(5, employeeid);
            
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"My Profile Updated");
                  
            txtName1.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ResidentComplaintJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(ResidentComplaintJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnUpdateMyProfileActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
         int selectedIndex = jTable1.getSelectedRow();
         
          try {
              
              
              int complaintid=Integer.parseInt(Df.getValueAt(selectedIndex, 1).toString());
              int residentid=Integer.parseInt(txtResidentId.getText());
              
              String complainttype=txtComplaintType.getText();
              String status=txtStatus.getText();
              String comment=txtComment.getText();
              String complaintbox=txtComplaintBox.getText();
              
              
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bostonsmartcity","root","root@123");
            insert=con1.prepareStatement("update raisecomplaint set id=?,organization=?,complaint=?, status='completed',workercomment=? where complaintid=?");
            
            insert.setInt(1, residentid);
            insert.setString(2, complainttype);
            insert.setString(3, complaintbox);
            //insert.setString(4, status);
            insert.setString(4, comment);
            insert.setInt(5, complaintid);
            
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Record Updated");
            EnterpriseJFrame e = new EnterpriseJFrame ();
            e.table_update_griv();
            e.table_update_covidhelp();
            e.table_update_emergency();
            e.table_update_residence();
            
            
             
             ManagerJFrame m = new ManagerJFrame();
             m.table_update_water();
             m.table_update_fire();
             m.table_update_gov();
             m.table_update_hospital();
             m.table_update_nongov();
             m.table_update_police();
             m.table_update_standalone();
             m.table_update_street();
            
            StaffJFrame sf= new StaffJFrame();
            sf.table_update_water();
            sf.table_update_fire();
             sf.table_update_gov();
             sf.table_update_hospital();
             sf.table_update_nongov();
             sf.table_update_police();
             sf.table_update_standalone();
             sf.table_update_street();
          
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EnterpriseJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(EnterpriseJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(StaffJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    public javax.swing.JRadioButton btnFemale1;
    public javax.swing.JRadioButton btnMale1;
    public javax.swing.JRadioButton btnOther1;
    private javax.swing.JButton btnUpdateMyProfile;
    private javax.swing.JButton btnView1;
    public javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField txtAge1;
    private javax.swing.JTextArea txtComment;
    private javax.swing.JTextArea txtComplaintBox;
    private javax.swing.JTextField txtComplaintId;
    private javax.swing.JTextField txtComplaintType;
    public javax.swing.JTextField txtEmail1;
    public javax.swing.JTextField txtID3;
    public javax.swing.JTextField txtID6;
    public javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtResidentId;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
