/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dulana
 */
public class newuser extends javax.swing.JFrame {
    
    Connection con = null;
    Statement stmt = null;
    PreparedStatement pst = null;
    ResultSet rs =null;

    /**
     * Creates new form newuser
     */
    public newuser() {
        initComponents();
        con = database_connection.connection();
       
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRcpwd = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtphnb = new javax.swing.JTextField();
        usertype1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtcpwd = new javax.swing.JPasswordField();
        txtpwd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Recover pwd");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("NEW USER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 270, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Phone nb");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Confirm Pwd");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("User type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        txtRcpwd.setBackground(new java.awt.Color(255, 255, 153));
        txtRcpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRcpwdActionPerformed(evt);
            }
        });
        getContentPane().add(txtRcpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 140, 30));

        txtname.setBackground(new java.awt.Color(255, 255, 153));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 140, 30));

        txtusername.setBackground(new java.awt.Color(255, 255, 153));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 140, 30));

        txtphnb.setBackground(new java.awt.Color(255, 255, 153));
        txtphnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphnbActionPerformed(evt);
            }
        });
        getContentPane().add(txtphnb, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 140, 30));

        usertype1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        getContentPane().add(usertype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 140, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dulana\\Downloads\\Icon 1\\Icon 1\\red-x-mark-transparent-background-3.png")); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 120, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dulana\\Downloads\\Icon 1\\Icon 1\\save-icon--1.png")); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 110, 30));

        txtcpwd.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(txtcpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 140, 30));

        txtpwd.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagment/new user.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRcpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRcpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRcpwdActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtphnbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphnbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphnbActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // save button
        
        try{
            stmt= con.createStatement();
            
            String uName = txtname.getText();
            String uUsername = txtusername.getText();
            int Phonenb = Integer.parseInt(txtphnb.getText());
            String Password = txtpwd.getText();
            String Confirmpwd = txtcpwd.getText();
            String usertype = (String) usertype1.getSelectedItem();
            String Recoverpwd= txtRcpwd.getText();
            
            String query = "INSERT INTO newuser (name,username,phonenb,password,confirmpwd,usertype,recoverpwd) VALUES(?,?,?,?,?,?,?) ";
            
            
            
            pst = con.prepareStatement(query);
            
            pst.setString(1, uName);
            pst.setString(2, uUsername);
            pst.setInt(3, Phonenb);
            pst.setString(4, Password);
            pst.setString(5, Confirmpwd);
            pst.setString(6, usertype);
            pst.setString(7, Recoverpwd);
            
            pst.execute();
            
           
            
            JOptionPane.showMessageDialog(null, "Data Added Succesfully");
            txtname.setText("");
            txtusername.setText("");
            txtphnb.setText("");
            txtpwd.setText("");
            txtcpwd.setText("");
            usertype1.setSelectedIndex(0);
            txtRcpwd.setText("");
            
            
            
        }
        catch(Exception e)
                {
                  System.out.println(e);
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i<=1.0; i = i + 0.1)
        {
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                
               Thread.sleep(50);
            }
            catch(Exception e)
            {
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtRcpwd;
    private javax.swing.JPasswordField txtcpwd;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphnb;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JTextField txtusername;
    private javax.swing.JComboBox<String> usertype1;
    // End of variables declaration//GEN-END:variables
}
