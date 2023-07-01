/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;
import java.awt.*;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_ENTER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rohith pavan
 */
public class doctor extends javax.swing.JFrame {
    DefaultTableModel model1,model2,model;
    /**
     * Creates new form doctor
     */
     Connection c;
 Statement stmt;
 ResultSet rs,bk;
    String id,p_r;
    public doctor(String str) {
        initComponents();
         setIconImage();
         id=str;
         
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?autoReconnect=true&useSSL=false","root","1234");
        stmt=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
    ResultSet.CONCUR_READ_ONLY);
        stmt.executeUpdate("create table if not exists bookmark(note varchar(500),user_id varchar(30))");
        }
        catch(Exception e)
        {
          System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 800));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1500, 800));
        setSize(new java.awt.Dimension(1500, 800));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOME");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 30, 110, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html>PATIENT LIST</html>");
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
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 150, 170, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" COMPLAINT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 230, 170, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ACHIEVEMENTS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 310, 170, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOGOUT");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 660, 170, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BOOKMARK");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 390, 160, 50);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SCHEDULES");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 470, 160, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 190, 800);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 150)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("WELCOME");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 50, 1120, 290);

        jLabel8.setFont(new java.awt.Font("Arial", 3, 150)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("DOCTOR.......");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(230, 310, 1020, 270);

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("PATIENT ID & SCHEDULE");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(420, 20, 510, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("PATIENT NAME:");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(10, 10, 150, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("AGE:");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(10, 150, 70, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel13);
        jLabel13.setBounds(10, 50, 360, 40);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel14);
        jLabel14.setBounds(100, 140, 80, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("GENDER:");
        jPanel7.add(jLabel15);
        jLabel15.setBounds(10, 200, 120, 40);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel16);
        jLabel16.setBounds(130, 200, 100, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("PROBLEM:");
        jPanel7.add(jLabel17);
        jLabel17.setBounds(10, 270, 130, 30);

        jTextArea1.setLineWrap(true);
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(20, 320, 390, 140);

        jLabel21.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("DATE:");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(10, 100, 90, 30);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.add(jLabel22);
        jLabel22.setBounds(100, 100, 120, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PATIENT _ID", "TIME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(420, 70, 530, 440);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(10, 10, 960, 520);

        jTextArea2.setLineWrap(true);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(980, 80, 320, 400);

        jLabel19.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("CURED");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel19);
        jLabel19.setBounds(10, 540, 90, 30);

        jLabel20.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("NEXT APPOINTMENT");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel20);
        jLabel20.setBounds(10, 660, 260, 30);

        jDateChooser1.setVisible(false);
        jPanel3.add(jDateChooser1);
        jDateChooser1.setBounds(420, 540, 170, 30);

        jLabel23.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("OPERATION");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel23);
        jLabel23.setBounds(10, 600, 190, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAVE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(1120, 490, 180, 50);

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BOOKMARK");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(1120, 550, 180, 50);

        jLabel39.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("NOTE:");
        jPanel3.add(jLabel39);
        jLabel39.setBounds(980, 40, 120, 30);

        jButton11.setVisible(false);
        jButton11.setText("SAVE DATE");
        jButton11.setToolTipText("");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel3.add(jButton11);
        jButton11.setBounds(420, 720, 100, 30);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("TIME:");
        jLabel24.setVisible(false);
        jPanel3.add(jLabel24);
        jLabel24.setBounds(340, 630, 60, 30);

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setVisible(false);
        jLabel25.setText("Hours");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(430, 600, 70, 16);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "2", "3", "4", "5", "7", "8", "9", "10", "11", "12", "" }));
        jComboBox2.setVisible(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jComboBox2.setVisible(false);
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(420, 630, 80, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "30" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jComboBox3.setVisible(false);
        jPanel3.add(jComboBox3);
        jComboBox3.setBounds(540, 630, 80, 30);

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setVisible(false);
        jLabel26.setText("Minutes");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(540, 600, 70, 16);

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jTextArea3.setLineWrap(true);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(20, 30, 530, 330);

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("Arial", 3, 28)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("COMPLAINT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(340, 370, 200, 60);

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jPanel19.setLayout(null);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Doctor id:");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel40);
        jLabel40.setBounds(30, 30, 150, 40);

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("<html>No_of_years worked:</html>");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel41);
        jLabel41.setBounds(30, 330, 240, 60);

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("<html>No of patients treated:</html>");
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel42);
        jLabel42.setBounds(30, 110, 240, 60);

        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel43);
        jLabel43.setBounds(330, 30, 210, 40);

        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel44);
        jLabel44.setBounds(330, 110, 110, 40);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("No of operations:");
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel45);
        jLabel45.setBounds(30, 190, 240, 40);

        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel46);
        jLabel46.setBounds(330, 190, 110, 40);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Salary:");
        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel47);
        jLabel47.setBounds(30, 270, 90, 40);

        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel48);
        jLabel48.setBounds(330, 270, 120, 40);

        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel49);
        jLabel49.setBounds(330, 430, 110, 40);

        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel50);
        jLabel50.setBounds(330, 340, 110, 40);

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Specialization:");
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.add(jLabel51);
        jLabel51.setBounds(30, 430, 190, 40);

        jPanel5.add(jPanel19);
        jPanel19.setBounds(340, 140, 630, 510);

        jTabbedPane1.addTab("tab4", jPanel5);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jTextArea4.setLineWrap(true);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setEditable(false);
        jTextArea4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane5.setViewportView(jTextArea4);

        jPanel8.add(jScrollPane5);
        jScrollPane5.setBounds(30, 100, 570, 280);

        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("<-PREV");
        jButton4.setBorder(null);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel8.add(jButton4);
        jButton4.setBounds(30, 390, 90, 30);

        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("NEXT->");
        jButton6.setBorder(null);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel8.add(jButton6);
        jButton6.setBounds(510, 390, 90, 30);

        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("DELETE");
        jButton7.setBorder(null);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel8.add(jButton7);
        jButton7.setBounds(30, 440, 90, 30);

        jTabbedPane1.addTab("tab6", jPanel8);

        jPanel6.setLayout(null);
        jPanel6.add(jDateChooser2);
        jDateChooser2.setBounds(910, 40, 260, 40);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("DATE:");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(820, 40, 70, 30);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PATIENT ID", "TIME", "work type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setShowHorizontalLines(true);
        jTable2.setShowVerticalLines(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel6.add(jScrollPane6);
        jScrollPane6.setBounds(30, 30, 680, 490);

        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("SHEDULE");
        jButton5.setBorder(null);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel6.add(jButton5);
        jButton5.setBounds(1050, 140, 120, 30);

        jTabbedPane1.addTab("tab6", jPanel6);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(190, -40, 1310, 840);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        dispose();
        new Loginpage().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jLabel13.setText("");
               jLabel22.setText("");
                jLabel14.setText("");
                 jLabel16.setText("");
                  jTextArea1.setText("");
                  jTextArea2.setText("");
         jTabbedPane1.setSelectedIndex(1);
          
        if(model1!=null)
        {
            if(model1.getRowCount()>0)
            {
                model1.setRowCount(0);
            }
        }
         model1=(DefaultTableModel)jTable1.getModel();
          java.util.Date date1=new java.util.Date();
        String doj=new SimpleDateFormat("yyyy-MM-dd").format(date1);
         try{
         rs=stmt.executeQuery("select * from patient where doctor_id='"+id+"' and date='"+doj+"' and (patient_regard is null or patient_regard ='re_appoitment')");
         while(rs.next())
         {
                model1.addRow(new Object[]{rs.getString("patient_id"),rs.getString("time")});
         }
                 }
         catch(Exception e)
         {
             System.out.print(e);
         }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(2);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(3);
         int val=0;
        String today=new SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
            jLabel43.setText(id);
            try{
                rs=stmt.executeQuery("select count(*) from patient where doctor_id='"+id+"' and date<'"+today+"'");
                if(rs.next())
                    jLabel44.setText(rs.getString(1));
                rs=stmt.executeQuery("select count(*) from patient where doctor_id='"+id+"' and date<'"+today+"' and patient_regard='operation'");
                if(rs.next())
                    jLabel46.setText(rs.getString(1));
                rs=stmt.executeQuery("select * from info where user_id='"+id+"'");
                if(rs.next())
                {
                    String join[]=rs.getString("date_of_join").split("-");
                    String today2[]=today.split("-");
                     val=Integer.parseInt(today2[0])-Integer.parseInt(join[0]);
                }
                if(val<=0)
                    jLabel50.setText("<1");
                else
                    jLabel50.setText(Integer.toString(val));
                rs=stmt.executeQuery("select * from info where user_id='"+id+"'");
                if(rs.next())
                {
                    jLabel48.setText(rs.getString("salary"));
                    jLabel49.setText(rs.getString("specialised"));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            // TODO add your handling code here:
            jTabbedPane1.setSelectedIndex(4);
            bk=stmt.executeQuery("select * from bookmark where user_id='"+id+"'");
            if(bk.next())
            {
                jTextArea4.setText(bk.getString(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(doctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
         jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
         
          jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
         jLabel2.setForeground(new java.awt.Color(0, 0, 0));
      
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        
          jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
         jLabel3.setForeground(new java.awt.Color(0, 0, 0));
         
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
          jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
         jLabel4.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
          jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        // TODO add your handling code here:
         jLabel9.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
          jLabel9.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
         jLabel5.setForeground(new java.awt.Color(0, 0, 0));
         
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
      
          jLabel5.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if(model1.getRowCount()>0){
       int row=jTable1.getSelectedRow();
       String str=jTable1.getModel().getValueAt(row,0).toString();
       try{
           rs=stmt.executeQuery("select * from patient where patient_id='"+str+"'");
           if(rs.next())
           {
               jLabel13.setText(rs.getString("Patient_name"));
               jLabel22.setText(rs.getString("date"));
                jLabel14.setText(rs.getString("age"));
                 jLabel16.setText(rs.getString("gender"));
                  jTextArea1.setText(rs.getString("problem"));
                  jTextArea2.setText(rs.getString("description"));
           }
         else
        {
            jLabel13.setText("");
               jLabel22.setText("");
                jLabel14.setText("");
                 jLabel16.setText("");
                  jTextArea1.setText("");
                  jTextArea2.setText("");
        }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
        }
        else
        {
            jLabel13.setText("");
               jLabel22.setText("");
                jLabel14.setText("");
                 jLabel16.setText("");
                  jTextArea1.setText("");
                  jTextArea2.setText("");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        int row=-1;
        String str="";
        if(model1!=null)
        {
        if(model1.getRowCount()>0)
        {
            if(jTable1.getSelectedRow()!=-1)
            {
         row=jTable1.getSelectedRow();
         str=jTable1.getModel().getValueAt(row,0).toString();
        
        try{
            stmt.executeUpdate("update patient set patient_regard='cured' where patient_id='"+str+"'");
            JOptionPane.showMessageDialog(this,"saved patient regard");
            model1.removeRow(jTable1.getSelectedRow());
            
            jLabel13.setText("");
               jLabel22.setText("");
                jLabel14.setText("");
                 jLabel16.setText("");
                  jTextArea1.setText("");
                  jTextArea2.setText("");
        
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
            else
            JOptionPane.showMessageDialog(this,"select patient","Alert",JOptionPane.WARNING_MESSAGE);
        }
        
        }
        else
         JOptionPane.showMessageDialog(this,"select patient","Alert",JOptionPane.WARNING_MESSAGE);
        if(model1!=null)
        {
            if(model1.getRowCount()>0)
            {
                model1.setRowCount(0);
            }
        }
        model1=(DefaultTableModel)jTable1.getModel();
          java.util.Date date1=new java.util.Date();
        String doj=new SimpleDateFormat("yyyy-MM-dd").format(date1);
         try{
         rs=stmt.executeQuery("select * from patient where doctor_id='"+id+"' and date='"+doj+"' and (patient_regard is null or patient_regard ='re_appoitment')");
         while(rs.next())
         {
                model1.addRow(new Object[]{rs.getString("patient_id"),rs.getString("time")});
         }
                 }
         catch(Exception e)
         {
             System.out.print(e);
         }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        
         if(jTable1.getModel().getRowCount()>0)
        {
         
            if(jTable1.getSelectedRow()!=-1)
            {
               
            jDateChooser1.setVisible(true);
        jButton11.setVisible(true);
        jLabel24.setVisible(true);
        jLabel25.setVisible(true);
        jLabel26.setVisible(true);
        jComboBox2.setVisible(true);
        jComboBox3.setVisible(true);
        p_r="operation";
        }
             else
           JOptionPane.showMessageDialog(this,"select patient","Alert",JOptionPane.WARNING_MESSAGE);   
        }
         else
           JOptionPane.showMessageDialog(this,"select patient","Alert",JOptionPane.WARNING_MESSAGE);   
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
         if(jTable1.getModel().getRowCount()>0)
        {
            if(jTable1.getSelectedRow()!=-1)
            {       
            jDateChooser1.setVisible(true);
        jButton11.setVisible(true);
          jLabel24.setVisible(true);
        jLabel25.setVisible(true);
        jLabel26.setVisible(true);
        jComboBox2.setVisible(true);
        jComboBox3.setVisible(true);
        p_r="re_appoitment";
        }
         else
         JOptionPane.showMessageDialog(this,"select patient","Alert",JOptionPane.WARNING_MESSAGE);   
        }
         else
         JOptionPane.showMessageDialog(this,"select patient","Alert",JOptionPane.WARNING_MESSAGE);    
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        int row=jTable1.getSelectedRow();
        String str2=jTable1.getModel().getValueAt(row,0).toString();
        int count2=0,count=0;
        StringBuffer sb=new StringBuffer();
        String str=new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser1.getDate());
        try{
             String time_min=jComboBox3.getSelectedItem().toString();
                String time_hour=jComboBox2.getSelectedItem().toString();
                sb.append(time_hour);
                sb.append(":");
                sb.append(time_min);
                sb.append(":");
                sb.append("00");
              rs=stmt.executeQuery("select count(patient_id) from patient where time='"+sb.toString()+"' and doctor_id='"+id+"' and date='"+str+"'");
              System.out.println(sb.toString());
               if(rs.next())
               count=Integer.parseInt(rs.getString(1));
               rs=stmt.executeQuery("select count(patient_id) from patient where patient_regard='operation' and doctor_id='"+id+"' and date='"+str+"'");
                if(rs.next())
               count2=Integer.parseInt(rs.getString(1));
                if(count2==0&&count==0)
                {
             stmt.executeUpdate("update patient set date='"+str+"',time='"+sb.toString()+"' where patient_id='"+str2+"'");
              JOptionPane.showMessageDialog(this,"saved patient date");   
       
            jLabel13.setText("");
               jLabel22.setText("");
                jLabel14.setText("");
                 jLabel16.setText("");
                  jTextArea1.setText("");
                  jTextArea2.setText("");
                    jLabel24.setVisible(false);
                       jLabel25.setVisible(false);
                        jLabel26.setVisible(false);
                          jComboBox2.setVisible(false);
                            jComboBox3.setVisible(false);
                      jDateChooser1.setVisible(false);
                    jButton11.setVisible(false);
                  try{
            stmt.executeUpdate("update patient set patient_regard='"+p_r+"' where patient_id='"+str2+"'");
         JOptionPane.showMessageDialog(this,"saved patient regard");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
                }
                else
                {
                    if(count2!=0)
                    {
                    JOptionPane.showMessageDialog(this,"doctor in operation","alert",JOptionPane.ERROR_MESSAGE);
                    count=0;
                    } 
                    if(count!=0)
                    {
                         JOptionPane.showMessageDialog(this,"doctor in work","alert",JOptionPane.WARNING_MESSAGE);
                    }
                    }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        if(model1!=null)
        {
            if(model1.getRowCount()>0)
            {
                model1.setRowCount(0);
            }
        }
        model1=(DefaultTableModel)jTable1.getModel();
          java.util.Date date1=new java.util.Date();
        String doj=new SimpleDateFormat("yyyy-MM-dd").format(date1);
         try{
         rs=stmt.executeQuery("select * from patient where doctor_id='"+id+"' and date='"+doj+"' and (patient_regard is null or patient_regard ='re_appoitment')");
         while(rs.next())
         {
                model1.addRow(new Object[]{rs.getString("patient_id"),rs.getString("time")});
         }
                 }
         catch(Exception e)
         {
             System.out.print(e);
         }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if(jTextArea3.getText().equals("")==false)
        {
            try{
                stmt.executeUpdate("insert into complaint values('"+id+"','"+jTextArea3.getText()+"')");
                JOptionPane.showMessageDialog(this,"WE will work on this issue");
                jTextArea3.setText("");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Fill Complaint","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()>=0)
        {
         int row=jTable1.getSelectedRow();
       String str=jTable1.getModel().getValueAt(row,0).toString();
        try{
          if(jTextArea2.getText().equals("")==false)
          {
              stmt.executeUpdate("update patient set description='"+jTextArea2.getText()+"' where patient_id='"+str+"'");
              JOptionPane.showMessageDialog(this,"saved note");
              jTextArea2.setText("");
          }
          else
          {
              JOptionPane.showMessageDialog(this,"fill note","alert",JOptionPane.WARNING_MESSAGE);
          }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
        else
        {
                JOptionPane.showMessageDialog(this,"SelectPatient","alert",JOptionPane.WARNING_MESSAGE);
                }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        try{
            if(jTextArea2.getText().equalsIgnoreCase("")==false)
            {
            stmt.executeUpdate("insert into bookmark values('"+jTextArea2.getText()+"','"+id+"')");
             JOptionPane.showMessageDialog(this,"saved note");
            }
            else
                JOptionPane.showMessageDialog(this,"enter something","alert",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        
          try{
            if(bk.next())
                jTextArea4.setText(bk.getString(1));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
         try{
            if(bk.previous())
                jTextArea4.setText(bk.getString(1));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
          
        try{
            
                
               stmt.executeUpdate("delete from bookmark where user_id='"+id+"' and note='"+jTextArea4.getText()+"'");
               JOptionPane.showMessageDialog(this,"Successfully Removed");
               bk=stmt.executeQuery("select * from bookmark where user_id='"+id+"'");
               if(bk.next())
               {
                    jTextArea4.setText(bk.getString(1));
               }
              else if(bk.previous())
               {
                    jTextArea4.setText(bk.getString(1));
               }
               else
              {
                  jTextArea4.setText("");
              }
   
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        jTable1.clearSelection();
            jLabel13.setText("");
               jLabel22.setText("");
                jLabel14.setText("");
                 jLabel16.setText("");
                  jTextArea1.setText("");
                  jTextArea2.setText("");
        
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedComponent(jPanel6);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        if(model!=null)
        {
            if(model.getRowCount()>0)
            {
                model.setRowCount(0);
            }
        }
        
        
            model=(DefaultTableModel) jTable2.getModel();
            
         

            String doj=new SimpleDateFormat("yyyy-MM-dd").format(jDateChooser2.getDate());
            try{
                rs=stmt.executeQuery("select * from patient where doctor_id='"+id+"' and date='"+doj+"'");

                while(rs.next())
                model.addRow(new Object[]{rs.getString("patient_id")+" "+rs.getString("Patient_name"),rs.getString("time"),rs.getString("patient_regard")});

            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
          jLabel6.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
          jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jLabel6MouseExited

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
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor("").setVisible(true);
            }
        });
    }
  private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
