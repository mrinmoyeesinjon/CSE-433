/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem.system.analysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Jishan
 */
public class AddStudentInformation extends javax.swing.JFrame {

    /**
     * Creates new form AddStudentInformation
     */
    public AddStudentInformation() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtname = new javax.swing.JTextField();
        jtxtfullN = new javax.swing.JTextField();
        jtxtFNAME = new javax.swing.JTextField();
        JTXTLASTN = new javax.swing.JTextField();
        jtxtdob = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtgender = new javax.swing.JTextField();
        jtxtFather = new javax.swing.JTextField();
        jtxtMother = new javax.swing.JTextField();
        jtxtroad = new javax.swing.JTextField();
        jtxtsection = new javax.swing.JTextField();
        jtxtdistrict = new javax.swing.JTextField();
        jtxtblock = new javax.swing.JTextField();
        jtxtkl = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtxtjgg = new javax.swing.JTextField();
        jtxtkliop = new javax.swing.JTextField();
        jtxtjishan = new javax.swing.JTextField();
        jtxtlol = new javax.swing.JTextField();
        jtxthgsdd = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtxybloodg = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jtxtcontc = new javax.swing.JTextField();
        JTXTJSC = new javax.swing.JTextField();
        Jtxtpsc = new javax.swing.JTextField();
        jtxtssc = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jbtnsave = new javax.swing.JButton();
        jbtnreset1 = new javax.swing.JButton();
        jbtnback1 = new javax.swing.JButton();
        jbtnexit = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jtxtdate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("SUNRISE PARISH PUBLIC SCHOOL SYSTEM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 0, 590, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Add New Student Information");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 30, 410, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Student's ID Number");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 80, 180, 16);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Student's Full Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 110, 140, 16);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Student's First Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 140, 160, 16);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Student's Last Name");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 170, 160, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Date of Birth");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 200, 150, 16);

        jtxtname.setBackground(new java.awt.Color(204, 255, 255));
        jtxtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtname);
        jtxtname.setBounds(320, 80, 320, 18);

        jtxtfullN.setBackground(new java.awt.Color(204, 255, 255));
        jtxtfullN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtfullN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtfullN);
        jtxtfullN.setBounds(320, 110, 320, 18);

        jtxtFNAME.setBackground(new java.awt.Color(204, 255, 255));
        jtxtFNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFNAME.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtFNAME);
        jtxtFNAME.setBounds(320, 140, 320, 20);

        JTXTLASTN.setBackground(new java.awt.Color(204, 255, 255));
        JTXTLASTN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTXTLASTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTXTLASTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTXTLASTNActionPerformed(evt);
            }
        });
        jPanel1.add(JTXTLASTN);
        JTXTLASTN.setBounds(320, 170, 320, 20);

        jtxtdob.setBackground(new java.awt.Color(204, 255, 255));
        jtxtdob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtdob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtdob);
        jtxtdob.setBounds(320, 200, 320, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 230, 110, 16);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("Father's Name");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 260, 190, 16);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Mother's Name");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(70, 290, 150, 16);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Present Address :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(70, 320, 150, 16);

        jtxtgender.setBackground(new java.awt.Color(204, 255, 255));
        jtxtgender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtgender.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtgender);
        jtxtgender.setBounds(320, 230, 320, 18);

        jtxtFather.setBackground(new java.awt.Color(204, 255, 255));
        jtxtFather.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFather.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtFather);
        jtxtFather.setBounds(320, 260, 320, 18);

        jtxtMother.setBackground(new java.awt.Color(204, 255, 255));
        jtxtMother.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtMother.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtMother);
        jtxtMother.setBounds(320, 290, 320, 18);

        jtxtroad.setBackground(new java.awt.Color(204, 255, 255));
        jtxtroad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtroad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtroad);
        jtxtroad.setBounds(170, 350, 140, 18);

        jtxtsection.setBackground(new java.awt.Color(204, 255, 255));
        jtxtsection.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtsection.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtsection);
        jtxtsection.setBounds(450, 350, 140, 18);

        jtxtdistrict.setBackground(new java.awt.Color(204, 255, 255));
        jtxtdistrict.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtdistrict.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtdistrict);
        jtxtdistrict.setBounds(290, 410, 230, 18);

        jtxtblock.setBackground(new java.awt.Color(204, 255, 255));
        jtxtblock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtblock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtblock);
        jtxtblock.setBounds(170, 380, 140, 18);

        jtxtkl.setBackground(new java.awt.Color(204, 255, 255));
        jtxtkl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtkl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtkl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtklActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtkl);
        jtxtkl.setBounds(450, 380, 140, 18);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("Road No.");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(100, 350, 100, 16);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("Section No.");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(360, 350, 140, 16);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("Block No.");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(100, 380, 100, 16);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("Plot No.");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(360, 380, 100, 16);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("District :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(220, 410, 80, 16);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("Permenant Address :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(70, 450, 150, 16);

        jtxtjgg.setBackground(new java.awt.Color(204, 255, 255));
        jtxtjgg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtjgg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtjgg);
        jtxtjgg.setBounds(170, 480, 140, 18);

        jtxtkliop.setBackground(new java.awt.Color(204, 255, 255));
        jtxtkliop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtkliop.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtkliop);
        jtxtkliop.setBounds(450, 480, 140, 18);

        jtxtjishan.setBackground(new java.awt.Color(204, 255, 255));
        jtxtjishan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtjishan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtjishan);
        jtxtjishan.setBounds(450, 510, 140, 18);

        jtxtlol.setBackground(new java.awt.Color(204, 255, 255));
        jtxtlol.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtlol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtlol);
        jtxtlol.setBounds(290, 540, 230, 18);

        jtxthgsdd.setBackground(new java.awt.Color(204, 255, 255));
        jtxthgsdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxthgsdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxthgsdd);
        jtxthgsdd.setBounds(170, 510, 140, 18);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 51));
        jLabel19.setText("Road No.");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(100, 480, 170, 16);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("Block No.");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(100, 510, 120, 16);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("Section No.");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(360, 480, 130, 16);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("Plot No.");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(360, 510, 110, 16);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 51, 51));
        jLabel23.setText("District :");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(220, 540, 150, 16);

        jtxybloodg.setBackground(new java.awt.Color(204, 255, 255));
        jtxybloodg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxybloodg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxybloodgActionPerformed(evt);
            }
        });
        jPanel1.add(jtxybloodg);
        jtxybloodg.setBounds(250, 570, 390, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 51, 51));
        jLabel24.setText("Blood Group");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(70, 570, 190, 16);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 51, 51));
        jLabel25.setText("Contact Number ");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(70, 600, 130, 16);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 51));
        jLabel26.setText("Educational Qualification :");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(70, 630, 220, 16);

        jtxtcontc.setBackground(new java.awt.Color(204, 255, 255));
        jtxtcontc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtcontc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtcontc);
        jtxtcontc.setBounds(250, 600, 390, 20);

        JTXTJSC.setBackground(new java.awt.Color(204, 255, 255));
        JTXTJSC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTXTJSC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(JTXTJSC);
        JTXTJSC.setBounds(360, 650, 110, 20);

        Jtxtpsc.setBackground(new java.awt.Color(204, 255, 255));
        Jtxtpsc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Jtxtpsc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Jtxtpsc);
        Jtxtpsc.setBounds(180, 650, 110, 18);

        jtxtssc.setBackground(new java.awt.Color(204, 255, 255));
        jtxtssc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtssc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtssc);
        jtxtssc.setBounds(540, 650, 110, 18);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 51, 51));
        jLabel27.setText("PSC/PEC :");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(110, 650, 70, 16);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 51));
        jLabel28.setText("JSC :");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(320, 650, 80, 20);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 51, 51));
        jLabel29.setText("SSC :");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(500, 650, 40, 20);

        jbtnsave.setBackground(new java.awt.Color(0, 51, 51));
        jbtnsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnsave.setText("Save");
        jbtnsave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnsave);
        jbtnsave.setBounds(30, 679, 110, 30);

        jbtnreset1.setBackground(new java.awt.Color(0, 51, 51));
        jbtnreset1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnreset1.setText("Reset");
        jbtnreset1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnreset1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnreset1);
        jbtnreset1.setBounds(220, 680, 110, 30);

        jbtnback1.setBackground(new java.awt.Color(0, 51, 51));
        jbtnback1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnback1.setText("Back");
        jbtnback1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnback1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnback1);
        jbtnback1.setBounds(420, 680, 110, 30);

        jbtnexit.setBackground(new java.awt.Color(0, 51, 51));
        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnexit);
        jbtnexit.setBounds(610, 680, 110, 30);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel30.setText("         © 2017 Sunrise Parish Public School System | All Rights Reserved By Sunrise School | Dhaka, Bangladesh-1208 | Phone +88-02-01977239551");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(60, 720, 700, 11);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 51));
        jLabel31.setText("Date :");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(580, 50, 60, 16);

        jtxtdate.setBackground(new java.awt.Color(204, 255, 255));
        jtxtdate.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jPanel1.add(jtxtdate);
        jtxtdate.setBounds(630, 50, 100, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/system/analysis/35289715-education-elementary-school-learning-and-people-concept-group-of-school-kids-with-pens-and-notebooks-Stock-Photo.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 740, 750);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTXTLASTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTXTLASTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXTLASTNActionPerformed

    private void jtxtklActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtklActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtklActionPerformed

    private void jtxybloodgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxybloodgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxybloodgActionPerformed

    private void jbtnreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnreset1ActionPerformed
        jtxtname.setText(null);
        jtxtfullN.setText(null);
        jtxtFNAME.setText(null);
        JTXTLASTN.setText(null);
        jtxtdob.setText(null);
        jtxtgender.setText(null);
        jtxtFather.setText(null);
        jtxtMother.setText(null);
        jtxtroad.setText(null);
        jtxtsection.setText(null);
        jtxtblock.setText(null);
        jtxtkl.setText(null);
        jtxtdistrict.setText(null);
        jtxtjgg.setText(null);
        jtxtkliop.setText(null);
        jtxthgsdd.setText(null);
        jtxtjishan.setText(null);
        jtxtlol.setText(null);
        jtxybloodg.setText(null);
        jtxtcontc.setText(null);
        Jtxtpsc.setText(null);
        JTXTJSC.setText(null);
        jtxtssc.setText(null);
        jtxtdate.setText(null);
    }//GEN-LAST:event_jbtnreset1ActionPerformed

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnback1ActionPerformed
        this.hide();
        Interface frm = new Interface();
        frm.setVisible(true);
    }//GEN-LAST:event_jbtnback1ActionPerformed

    private void jbtnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsaveActionPerformed
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Security", "security", "security");
            PreparedStatement ps = conn.prepareStatement("insert into ADDNEWSTUDENT values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, jtxtname.getText());
            ps.setString(2, jtxtfullN.getText());
            ps.setString(3, jtxtFNAME.getText());
            ps.setString(4, JTXTLASTN.getText());
            ps.setString(5, jtxtdob.getText());
            ps.setString(6, jtxtgender.getText());
            ps.setString(7, jtxtFather.getText());
            ps.setString(8, jtxtMother.getText());
            ps.setString(9, jtxtroad.getText());
            ps.setString(10, jtxtsection.getText());
            ps.setString(11, jtxtblock.getText());
            ps.setString(12, jtxtkl.getText());
            ps.setString(13, jtxtdistrict.getText());
            ps.setString(14, jtxtjgg.getText());
            ps.setString(15, jtxtkliop.getText());
            ps.setString(16, jtxthgsdd.getText());
            ps.setString(17, jtxtjishan.getText());
            ps.setString(18, jtxtlol.getText());
            ps.setString(19, jtxybloodg.getText());
            ps.setString(20, jtxtcontc.getText());
            ps.setString(21, Jtxtpsc.getText());
            ps.setString(22, JTXTJSC.getText());
            ps.setString(23, jtxtssc.getText());
            ps.setString(24, jtxtdate.getText());
            ps.executeUpdate();
            conn.close();
            JOptionPane.showMessageDialog(null, "Congratulations...!!! \nYour data has been successfully store in our database...!!! \nThank you for using student management system...!!!");
            System.out.println("Congratulations...!!! Data save successfully...!!!");
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbtnsaveActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudentInformation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentInformation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentInformation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentInformation.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTXTJSC;
    private javax.swing.JTextField JTXTLASTN;
    private javax.swing.JTextField Jtxtpsc;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnback1;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset1;
    private javax.swing.JButton jbtnsave;
    private javax.swing.JTextField jtxtFNAME;
    private javax.swing.JTextField jtxtFather;
    private javax.swing.JTextField jtxtMother;
    private javax.swing.JTextField jtxtblock;
    private javax.swing.JTextField jtxtcontc;
    private javax.swing.JTextField jtxtdate;
    private javax.swing.JTextField jtxtdistrict;
    private javax.swing.JTextField jtxtdob;
    private javax.swing.JTextField jtxtfullN;
    private javax.swing.JTextField jtxtgender;
    private javax.swing.JTextField jtxthgsdd;
    private javax.swing.JTextField jtxtjgg;
    private javax.swing.JTextField jtxtjishan;
    private javax.swing.JTextField jtxtkl;
    private javax.swing.JTextField jtxtkliop;
    private javax.swing.JTextField jtxtlol;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JTextField jtxtroad;
    private javax.swing.JTextField jtxtsection;
    private javax.swing.JTextField jtxtssc;
    private javax.swing.JTextField jtxybloodg;
    // End of variables declaration//GEN-END:variables
}
