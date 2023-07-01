package mainpackage;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Register extends javax.swing.JFrame {
    boolean check1(String a)
    {
        int size=a.length();
        if(size>=8&&size<=30)
            return true;
           return false;
    }
    boolean check2(String a)
    {
        char arr[]=a.toCharArray();
        int size=a.length();
        for(int i=0;i<size;i++)
            if(arr[i]>='a'&&arr[i]<='z')
                return true;
        return false;
    }
    boolean check3(String a)
    {
          char arr[]=a.toCharArray();
        int size=a.length();
        for(int i=0;i<size;i++)
            if(arr[i]>='A'&&arr[i]<='Z')
                return true;
        return false;
    }
    boolean check4(String a)
    {
          char arr[]=a.toCharArray();
        int size=a.length();
        for(int i=0;i<size;i++)
            if(arr[i]=='!'||arr[i]=='@'||arr[i]=='#'||arr[i]=='$'||arr[i]=='&'||arr[i]=='*')
                return true;
        return false;
    }
    Connection c;
 Statement stmt;
 ResultSet rs1,rs2,rs;
    public Register() {
        initComponents();
        setIconImage();
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false","root","1234");
        stmt=c.createStatement();
        }
        catch(Exception e)
        {
           System.out.println();
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(760, 485));
        setPreferredSize(new java.awt.Dimension(760, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        jPasswordField1.setText("Enter password");
        jPasswordField1.setEchoChar((char)0);
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jPasswordField1CaretUpdate(evt);
            }
        });
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(160, 200, 200, 30);

        jPasswordField2.setText("Re_type password");
        jPasswordField2.setEchoChar((char)0);
        jPasswordField2.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jPasswordField2CaretUpdate(evt);
            }
        });
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        jPasswordField2.setEditable(false);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(160, 240, 200, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("REGISTER");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 330, 120, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("password is not same as above");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 270, 220, 20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(null);

        jCheckBox1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox1.setText("<html>the password should consist atleast 8-30 characters</html>");
        jCheckBox1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseExited(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(0, 20, 280, 40);

        jCheckBox2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox2.setText("Atleast 1 small letter.");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseExited(evt);
            }
        });
        jPanel1.add(jCheckBox2);
        jCheckBox2.setBounds(0, 60, 290, 21);

        jCheckBox3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox3.setText("Atleast 1 Capital letter.");
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseExited(evt);
            }
        });
        jPanel1.add(jCheckBox3);
        jCheckBox3.setBounds(0, 80, 290, 21);

        jCheckBox6.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(204, 0, 0));
        jCheckBox6.setText("<html>Atleast 1 Special Symbol i.e '!'.,'@','#','$','&','*'.</html>");
        jCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseExited(evt);
            }
        });
        jPanel1.add(jCheckBox6);
        jCheckBox6.setBounds(0, 100, 290, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Note:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 60, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(390, 160, 350, 140);
        jPanel1.setVisible(false);

        jCheckBox4.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setText("show password");
        jCheckBox4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox4StateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(160, 300, 190, 21);

        jLabel9.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("The user name already taken..!");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 180, 210, 17);
        jLabel9.setVisible(false);

        jTextField2.setText("Enter user id");
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField2CaretUpdate(evt);
            }
        });
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 150, 200, 30);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel1.setFocusable(true);
        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("            Admin register page");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 760, 80);

        jTextField1.setText("Enter user name");
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 110, 200, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jPasswordField1CaretUpdate
        // TODO add your handling code here:       
         boolean length,small,large,special;
         length=check1(new String(jPasswordField1.getPassword()));
         small=check2(new String(jPasswordField1.getPassword()));
         large=check3(new String(jPasswordField1.getPassword()));
         special=check4(new String(jPasswordField1.getPassword()));
         jCheckBox1.setSelected(length);
         jCheckBox2.setSelected(small);
         jCheckBox3.setSelected(large);
         jCheckBox6.setSelected(special);
         if(jCheckBox1.isSelected())
              jCheckBox1.setForeground(new java.awt.Color(0, 204, 0));
         else
          jCheckBox1.setForeground(new java.awt.Color(204,0, 0)); 
          if(jCheckBox2.isSelected())
              jCheckBox2.setForeground(new java.awt.Color(0, 204, 0));
          else
             jCheckBox2.setForeground(new java.awt.Color(204,0, 0));
           if(jCheckBox3.isSelected())
              jCheckBox3.setForeground(new java.awt.Color(0, 204, 0));
           else
             jCheckBox3.setForeground(new java.awt.Color(204,0, 0));
            if(jCheckBox6.isSelected())
            {
              jCheckBox6.setForeground(new java.awt.Color(0, 204, 0));
            
            }
            else
            {
             jCheckBox6.setForeground(new java.awt.Color(204,0, 0));
             
            }
          if(jCheckBox1.isVisible()==true&&jCheckBox2.isVisible()==true&&jCheckBox3.isVisible()==true&&jCheckBox6.isVisible()==true)
              jPasswordField2.setEditable(true);
          else
              jPasswordField2.setEditable(false);
    }//GEN-LAST:event_jPasswordField1CaretUpdate

    private void jCheckBox1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseEntered
        // TODO add your handling code here:
        jCheckBox1.setEnabled(false);
        
    }//GEN-LAST:event_jCheckBox1MouseEntered

    private void jCheckBox1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseExited
        // TODO add your handling code here:
         jCheckBox1.setEnabled(true);
    }//GEN-LAST:event_jCheckBox1MouseExited

    private void jCheckBox2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseEntered
        // TODO add your handling code here:
        jCheckBox2.setEnabled(false);
    }//GEN-LAST:event_jCheckBox2MouseEntered

    private void jCheckBox2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseExited
        // TODO add your handling code here:
         jCheckBox2.setEnabled(true);
    }//GEN-LAST:event_jCheckBox2MouseExited

    private void jCheckBox3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseEntered
        // TODO add your handling code here:
        jCheckBox3.setEnabled(false);
    }//GEN-LAST:event_jCheckBox3MouseEntered

    private void jCheckBox3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseExited
        // TODO add your handling code here:
        jCheckBox3.setEnabled(true);
    }//GEN-LAST:event_jCheckBox3MouseExited

    private void jCheckBox6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox6MouseEntered
        // TODO add your handling code here:
        jCheckBox6.setEnabled(false);
    }//GEN-LAST:event_jCheckBox6MouseEntered

    private void jCheckBox6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox6MouseExited
        // TODO add your handling code here:
        jCheckBox6.setEnabled(true);
    }//GEN-LAST:event_jCheckBox6MouseExited

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        if(new String(jPasswordField1.getPassword()).equals("")==true)
        {
            jPasswordField1.setText("Enter password");
            jPasswordField1.setEchoChar((char)0);
            jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        }
        
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
         jPanel1.setVisible(true);
         if(new String(jPasswordField1.getPassword()).equals("Enter password")==true&&jCheckBox4.isSelected()==false)
         {
         jPasswordField1.setText("");
         jPasswordField1.setEchoChar('\u26AB');
         jPasswordField1.setForeground(new java.awt.Color(0,0,0));
         }
          if(new String(jPasswordField1.getPassword()).equals("Enter password")==true&&jCheckBox4.isSelected()==true)
         {
         jPasswordField1.setText("");
         jPasswordField1.setEchoChar((char)0);
         jPasswordField1.setForeground(new java.awt.Color(0,0,0));
         }  
              
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jCheckBox4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox4StateChanged
        // TODO add your handling code here:
        if(jCheckBox4.isSelected()==true)
        {
            jPasswordField1.setEchoChar((char)0);
            jPasswordField2.setEchoChar((char)0);
        }
        if(jCheckBox4.isSelected()==false&&(new String(jPasswordField1.getPassword()).equals("Enter password"))==false)
        {
            jPasswordField1.setEchoChar('\u26AB');
          
        }
        if(jCheckBox4.isSelected()==false&&(new String(jPasswordField2.getPassword()).equals("Re_type password"))==false)
             jPasswordField2.setEchoChar('\u26AB');
    }//GEN-LAST:event_jCheckBox4StateChanged

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
        // TODO add your handling code here:\
        if(new String(jPasswordField2.getPassword()).equals("Re_type password")==true&&jCheckBox4.isSelected()==false)
        {
         jPasswordField2.setText("");
         jPasswordField2.setEchoChar('\u26AB');
         jPasswordField2.setForeground(new java.awt.Color(0,0,0));
        }
         if(new String(jPasswordField2.getPassword()).equals("Re_type password")==true&&jCheckBox4.isSelected()==true)
        {
         jPasswordField2.setText("");
         jPasswordField2.setEchoChar((char)0);
         jPasswordField2.setForeground(new java.awt.Color(0,0,0));
        }
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        // TODO add your handling code here:
        if(new String(jPasswordField2.getPassword()).equals("")==true)
        {
           jPasswordField2.setText("Re_type password");
        jPasswordField2.setEchoChar((char)0);
        jPasswordField2.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
         if(jTextField2.getText().equals("Enter user id")==true)
        {    
        jTextField2.setText("");
        jTextField2.setForeground(new java.awt.Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
          if(jTextField2.getText().equals("")==true)
        {
        jTextField2.setText("Enter user id");
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if(jTextField1.getText().equals("Enter user name")==true)
        {    
        jTextField1.setText("");
        jTextField1.setForeground(new java.awt.Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
         if(jTextField1.getText().equals("")==true)
        {
        jTextField1.setText("Enter user name");
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(jLabel9.isVisible()==false&&jLabel2.isVisible()==false)
        {
            try {
                stmt.executeUpdate("insert into user values('"+jTextField2.getText()+"','"+new String(jPasswordField1.getPassword())+"','admin')");
                JOptionPane.showMessageDialog(this,"egister succeesfull");
                dispose();
                new Loginpage().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jPasswordField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jPasswordField2CaretUpdate
        // TODO add your handling code here:
        if(new String(jPasswordField1.getPassword()).equals(new String(jPasswordField2.getPassword()))==true)
            jLabel2.setVisible(false);
        else
            jLabel2.setVisible(true);
    }//GEN-LAST:event_jPasswordField2CaretUpdate

    private void jTextField2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField2CaretUpdate
        // TODO add your handling code here:
        try{
           rs=stmt.executeQuery("select * from user where user_id='"+jTextField2.getText()+"'");
           if(rs.next())
               jLabel9.setVisible(true);
           else
               jLabel9.setVisible(false); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField2CaretUpdate

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
}
