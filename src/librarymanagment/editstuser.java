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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dulana
 */
public class editstuser extends javax.swing.JFrame {

    /**
     * Creates new form editstuser
     */
    Connection con = null;
    Statement stmt = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    public editstuser() {
        initComponents();
        tabledata();
    }
     private void Reset(){
        txtregnb.setText("");
        txtname.setText("");
        txtcourse.setText("");
        txtaddress.setText("");
        txtphonenb.setText("");
    }
    
    private void tabledata()
    {
        try{
            con = database_connection.connection();
            stmt = con.createStatement();
           
                String query = "SELECT * FROM student";
                rs = stmt.executeQuery(query);
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "connection error");
        }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtphonenb = new javax.swing.JTextField();
        txtregnb = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "regnumber", "name", "course", "address", "phonenumber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 120, 30));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 100, 30));

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 100, 30));
        getContentPane().add(txtphonenb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 160, 30));
        getContentPane().add(txtregnb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 160, 30));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 160, 30));
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 160, 30));
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagment/editstuser.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try
        {
            stmt = con.createStatement();
            String regnb= txtregnb.getText();
            String Name = txtname.getText();
            String Course= txtcourse.getText();
            String Address= txtaddress.getText();
            int Phone = Integer.parseInt(txtphonenb.getText());
           
            
            String query = "UPDATE student SET  name=?, course=?, address=?, phonenumber=? WHERE regnumber=? ";
          
            PreparedStatement prepareStmp = con.prepareStatement(query);
            
            
            prepareStmp.setString(1, Name);
            prepareStmp.setString(2, Course);
            prepareStmp.setString(3, Address);
            prepareStmp.setInt(4, Phone);
            prepareStmp.setString(5, regnb);
            
            
            prepareStmp.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated");
            tabledata();
            Reset();
            
        
        }
        catch(Exception e)
        {
            
            System.out.print(e);
        
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
          try
        {
            stmt = con.createStatement();
            
            String Regnumber = txtregnb.getText();
           // int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            
            String query = "DELETE FROM student WHERE regnumber = '"+Regnumber+"' ";
            
                 
            stmt.executeUpdate(query);
            tabledata();
            JOptionPane.showMessageDialog(null, "Record Deleted!!");
            Reset();
            
            
              
        
        }
        catch(Exception e)
        {
            System.out.print(e);
        
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         this.dispose();
       new  newstuser().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(editstuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editstuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editstuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editstuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editstuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphonenb;
    private javax.swing.JTextField txtregnb;
    // End of variables declaration//GEN-END:variables
}