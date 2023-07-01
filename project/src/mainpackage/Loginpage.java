
package mainpackage;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Loginpage extends javax.swing.JFrame {
 Connection c;
 Statement stmt;
 ResultSet rs1,rs2,rs;
    public Loginpage() {
        initComponents();
        setIconImage();
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false","root","1234");
        stmt=c.createStatement();
        }
        catch(Exception e)
        {
           new Register().setVisible(true);
           System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        userid = new javax.swing.JTextField();
        user_error = new javax.swing.JLabel();
        password_error = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(882, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        title1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        title1.setForeground(new java.awt.Color(102, 153, 255));
        title1.setFocusable(true);
        title1.setText("HOSPITAL MANAGEMENT");
        getContentPane().add(title1);
        title1.setBounds(10, 20, 620, 80);

        title2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        title2.setForeground(new java.awt.Color(102, 153, 255));
        title2.setText("SYSTEM");
        getContentPane().add(title2);
        title2.setBounds(230, 90, 210, 70);

        password.setEchoChar((char)0);
        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setText("Enter password");
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(80, 280, 200, 40);

        userid.setText("Enter user id");
        userid.setForeground(new java.awt.Color(102, 102, 102));
        userid.setBackground(new java.awt.Color(255, 255, 255));
        userid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                useridFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                useridFocusLost(evt);
            }
        });
        userid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                useridMouseClicked(evt);
            }
        });
        getContentPane().add(userid);
        userid.setBounds(80, 210, 200, 40);

        user_error.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        user_error.setForeground(new java.awt.Color(255, 0, 0));
        user_error.setText("enter valid user id..!");
        user_error.setToolTipText("");
        getContentPane().add(user_error);
        user_error.setBounds(80, 250, 200, 20);
        user_error.setVisible(false);

        password_error.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        password_error.setForeground(new java.awt.Color(255, 0, 0));
        password_error.setText("enter a valid password!!");
        getContentPane().add(password_error);
        password_error.setBounds(80, 320, 200, 17);
        password_error.setVisible(false);

        jCheckBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(80, 340, 160, 21);

        login.setBackground(new java.awt.Color(51, 255, 0));
        login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGIN");
        login.setBorder(null);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(80, 370, 200, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("New Admin  ?? ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 400, 120, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("<html><u>Register</u></html>");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 400, 70, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainpackage/iStock-949812160.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        // TODO add your handling code here:
        String field1="0",Password1,id1;
        String password2="0",id2="0";
        Password1=new String(password.getPassword());
        id1=userid.getText();
         if(id1.equals("Enter user id")==true)
             user_error.setVisible(true);
         if(Password1.equals("Enter password")==true)
             password_error.setVisible(true);
        if(id1.equals("Enter user id")==false&&Password1.equals("Enter password")==false)
        {
        int count=0;
        try{
        rs=stmt.executeQuery("select count(user_id) from user where user_id='"+id1+"'");
        if(rs.next())
        count=Integer.parseInt(rs.getString(1));
        }
        catch(Exception er)
        {
            System.out.println(er+"1");
        }
         if(count==0)
        {
              user_error.setVisible(true);
              password_error.setVisible(true);
        }
        else
        { 
              try{
           rs=stmt.executeQuery("select * from user where user_id='"+id1+"'");
           if(rs.next()==true)
           {
               field1=rs.getString("field");
               password2=rs.getString("password");
               id2=rs.getString("user_id");
           }
        }
        catch(Exception e)
        {
            System.out.println(e+"2");
        }
        
            if(id1.equalsIgnoreCase(id2)==false)
                user_error.setVisible(true);
            if(Password1.equals(password2)==false)
                  password_error.setVisible(true);
            
            else
            {
                    if(field1.equalsIgnoreCase("doctor")==true)
                    {
                      new doctor(userid.getText()).setVisible(true);
                        dispose();
                         try{
 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
                    }
                     if(field1.equalsIgnoreCase("Admin")==true)
                    {
                        new Admin().setVisible(true);
                        dispose();
                         try{
                             
                              }
                         catch(Exception e)
                            {
                               System.out.println(e);
                              }
                    }
                      if(field1.equalsIgnoreCase("staff_finance")==true)
                    {
                          new staff_finance().setVisible(true);
                        dispose();
                         try{
                              
                             }
                           catch(Exception e)
                             {
                                System.out.println(e);
                              }
                    }
                       if(field1.equalsIgnoreCase("staff_reciopnist")==true)
                    {
                          new staff_reciopnist().setVisible(true);
                        dispose();
                         try{
                             
                              }
                          catch(Exception e)
                              {
                                 System.out.println(e);
                               }
                    }
                        if(field1.equalsIgnoreCase("staff_medicine")==true)
                    {
                          new staff_medicine().setVisible(true);
                        dispose();
                         try{
                                
                            }
                         catch(Exception e)
                              {
                                System.out.println(e);
                               }
                    }
                    
                }  
        }
        }
      
    }//GEN-LAST:event_loginMouseClicked

    private void useridFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_useridFocusGained
        // TODO add your handling code here:
        if(userid.getText().equals("Enter user id")==true)
        {
            userid.setText("");
            userid.setForeground(new java.awt.Color(0,0,0));
        }
    }//GEN-LAST:event_useridFocusGained

    private void useridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_useridFocusLost
        // TODO add your handling code here:
         if(userid.getText().equals("")==true)
        {
            userid.setText("Enter user id");
            userid.setForeground(new java.awt.Color(102,102,102));
        }
    }//GEN-LAST:event_useridFocusLost

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()==true)
            password.setEchoChar((char)0);
        if(jCheckBox1.isSelected()==false&&(new String(password.getPassword())).equals("Enter password")==false)
            password.setEchoChar('\u26AB');
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        if((new String(password.getPassword())).equals("Enter password")==true&&jCheckBox1.isSelected()==false)
        {
            password.setText("");
            password.setEchoChar('\u26AB');
            password.setForeground(new java.awt.Color(0,0,0));
        }
         if((new String(password.getPassword())).equals("Enter password")==true&&jCheckBox1.isSelected()==true)
        {
            password.setText("");
            password.setEchoChar((char)0);
            password.setForeground(new java.awt.Color(0,0,0));
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // TODO add your handling code here:
        if((new String(password.getPassword())).equals("")==true)
        {
            password.setText("Enter password");
            password.setEchoChar((char)0);
            password.setForeground(new java.awt.Color(102,102,102));
        }
    }//GEN-LAST:event_passwordFocusLost

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(new java.awt.Color(204,0,0));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(new java.awt.Color(51,51,255));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
     try {
         // TODO add your handling code here:
         
         rs1=stmt.executeQuery("select count(*) from user");
         
         int i=0,j=0;
         if(rs1.next())
         i=Integer.parseInt(rs1.getString(1));
         rs2=stmt.executeQuery("select count(*) from info");
         if(rs2.next())
         j=Integer.parseInt(rs2.getString(1));
         if(i==j)
             new Register().setVisible(true);
         else
             JOptionPane.showMessageDialog(this,"Admin Already Exist", "Error", JOptionPane.ERROR_MESSAGE);
     } catch (SQLException ex) {
         Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void useridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_useridMouseClicked
        // TODO add your handling code here:
         user_error.setVisible(false);
    }//GEN-LAST:event_useridMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        // TODO add your handling code here:
         password_error.setVisible(false);
        
    }//GEN-LAST:event_passwordMouseClicked

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
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JButton login;
    public javax.swing.JPasswordField password;
    public javax.swing.JLabel password_error;
    public javax.swing.JLabel title1;
    public javax.swing.JLabel title2;
    public javax.swing.JLabel user_error;
    public javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
}
