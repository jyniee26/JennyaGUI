/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsss;

import config.connectDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class REGISTRATION extends javax.swing.JFrame {
    
public static String mail, user;
    public boolean dupcheck(){
        
        connectDB db = new connectDB();
         
        try{
        String que = "SELECT * FROM user WHERE Username='"+username.getText()+"' OR Email='"+email.getText()+"'";    
            ResultSet resultset = db.getData(que);
            if(resultset.next()){
                mail = resultset.getString("Email");
            
                if(mail.equals(email.getText())){
                    
                    JOptionPane.showMessageDialog(null, "The email already existed",
                "Error Registration", JOptionPane.ERROR_MESSAGE);
                    email.setText("");
                }
                username = (JLabel) resultset.getObject("Username");
                 if(username.equals(userName.getText())){
                    
                    JOptionPane.showMessageDialog(null, "The username already existed",
                "Error Registration", JOptionPane.ERROR_MESSAGE);
                    userName.setText("");
                }
                System.out.println(""+username);
             return true;   
            }
            
            else {
                
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;

        }
    }
    /**
     * Creates new form REGISTRATION
     */
    public REGISTRATION() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        firstname = new javax.swing.JTextField();
        userole = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        userName = new javax.swing.JPasswordField();
        usertype = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0,0,0,60));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 27)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" APPOINTMENT RECORD SYSTEM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRATION FORM:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 180, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 250, 25));

        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Password:");
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, 20));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 250, 25));
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 250, 25));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setText("Register");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 80, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Exit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 80, 30));

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 250, 25));

        userole.setForeground(new java.awt.Color(255, 255, 255));
        userole.setText("User Type:");
        jPanel1.add(userole, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("User Name:");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, 20));
        jPanel1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 250, 25));

        usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User", "Doctor", "Nurse", " " }));
        usertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertypeActionPerformed(evt);
            }
        });
        jPanel1.add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 250, 25));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 610, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void usertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertypeActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String firstName = firstname.getText().trim();
        String lastName = lastname.getText().trim();
        String Email = email.getText().trim();
        String userType = usertype.getSelectedItem().toString();
        String username = userName.getText().trim();
        String password = Password.getText().trim();
        
        String status = (userType.equals("Doctor")) ? "active" : "pending";
 connectDB connect = new connectDB();
        
        if (firstName.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please Enter your First Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (lastName.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please Enter your Last Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Email.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please Enter an Email!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (usertype.getSelectedIndex() == 0) {
    JOptionPane.showMessageDialog(null, "Please select a User Type!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (username.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please Enter a Username!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (password.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please Enter a Password!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (password.length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (dupcheck()){
    
        System.out.println("Duplicated Exist!");
     
} 
else {
    try {
        if (connect.fieldExists("username", username)) {
            JOptionPane.showMessageDialog(null, "Username already taken!", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (connect.fieldExists("Email", Email)) {
            JOptionPane.showMessageDialog(null, "Email already used!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            connect.insertData("INSERT INTO `user` (firstName, lastName, Email, userType, username, password) VALUES ('"
                    + firstName + "','" + lastName + "','" + Email + "','" + userType + "','" + username + "','" + password + "','"+ status +"')");
            JOptionPane.showMessageDialog(null, "Registered Successfully!");

            if (userType.equals("Doctor")) {
                 LOGIN r = new LOGIN ();
        r.setVisible(true);
        this.dispose();  
            } else if (userType.equals("Nurse")) {
                 LOGIN r = new LOGIN ();
        r.setVisible(true);
        this.dispose();  
            }
            this.dispose();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }                                     
    {
        
        
     
        
        
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
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRATION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField userName;
    private javax.swing.JLabel username;
    private javax.swing.JLabel userole;
    private javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables
}
