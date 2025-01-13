/*
 * @author Bitta Boibhob Barmon
 * @time 22 Feb, 23, Tue
 */
package system;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class spa extends javax.swing.JFrame {

    public spa() {
        initComponents();
        setExtendedState(spa.MAXIMIZED_BOTH);
        DBconnect();

        p5_t_modal_edit_c_details.setVisible(false);
        p5_t_modal_edit_c_details.setBackground(new java.awt.Color(0, 0, 0, 100));

        p1_in_tmp.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p1_in_email.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p1_in_password.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_n.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_g.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_bg.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_mn.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_id.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_s.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_dept.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_prg.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_e.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_p.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p3_in_cp.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p4_in_n.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p4_in_g.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p4_in_bg.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p4_in_mn.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p4_in_d.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p4_in_dept.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p4_in_e.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p4_in_p.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p4_in_cp.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        p5_t_in_cn.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p5_t_in_cc.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p5_t_in_d.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p5_t_in_p.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p5_t_in_s.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        p6_t_in_cn.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p6_t_in_cc.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p6_t_in_d.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p6_t_in_p.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p6_t_in_s.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        p5_t_in_search_key.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p5_s_in_search_key.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p6_s_in_course_id.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p7_t_in_search.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p7_s_in_search.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        p9_t_in_form_name.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        p7_t_table_all_record.getTableHeader().setFont(new Font("Heebo", Font.PLAIN, 16));
        p7_t_table_all_record.getTableHeader().setOpaque(false);
        p7_t_table_all_record.getTableHeader().setBackground(new Color(24, 75, 113));
        p7_t_table_all_record.getTableHeader().setForeground(new Color(255, 255, 255));

        p7_s_table_all_record.getTableHeader().setFont(new Font("Heebo", Font.PLAIN, 16));
        p7_s_table_all_record.getTableHeader().setOpaque(false);
        p7_s_table_all_record.getTableHeader().setBackground(new Color(24, 75, 113));
        p7_s_table_all_record.getTableHeader().setForeground(new Color(255, 255, 255));

        p8_t_table_single_record.getTableHeader().setFont(new Font("Heebo", Font.PLAIN, 16));
        p8_t_table_single_record.getTableHeader().setOpaque(false);
        p8_t_table_single_record.getTableHeader().setBackground(new Color(24, 75, 113));
        p8_t_table_single_record.getTableHeader().setForeground(new Color(255, 255, 255));

        p8_s_table_single_record.getTableHeader().setFont(new Font("Heebo", Font.PLAIN, 16));
        p8_s_table_single_record.getTableHeader().setOpaque(false);
        p8_s_table_single_record.getTableHeader().setBackground(new Color(24, 75, 113));
        p8_s_table_single_record.getTableHeader().setForeground(new Color(255, 255, 255));

        p9_t_table_attendance_form.getTableHeader().setFont(new Font("Heebo", Font.PLAIN, 16));
        p9_t_table_attendance_form.getTableHeader().setOpaque(false);
        p9_t_table_attendance_form.getTableHeader().setBackground(new Color(24, 75, 113));
        p9_t_table_attendance_form.getTableHeader().setForeground(new Color(255, 255, 255));

        p9_s_table_absent_list.getTableHeader().setFont(new Font("Heebo", Font.PLAIN, 16));
        p9_s_table_absent_list.getTableHeader().setOpaque(false);
        p9_s_table_absent_list.getTableHeader().setBackground(new Color(24, 75, 113));
        p9_s_table_absent_list.getTableHeader().setForeground(new Color(255, 255, 255));

        table_t_course_list.setIntercellSpacing(new Dimension(20, 0));
        table_s_course_list.setIntercellSpacing(new Dimension(20, 0));
        p7_t_table_all_record.setIntercellSpacing(new Dimension(20, 0));
        p7_s_table_all_record.setIntercellSpacing(new Dimension(20, 0));
        p8_t_table_single_record.setIntercellSpacing(new Dimension(20, 0));
        p8_s_table_single_record.setIntercellSpacing(new Dimension(20, 0));
        p9_t_table_attendance_form.setIntercellSpacing(new Dimension(20, 0));
        p9_s_table_absent_list.setIntercellSpacing(new Dimension(20, 0));

        table_t_course_list.getTableHeader().setPreferredSize(new Dimension(100, 40));
        table_s_course_list.getTableHeader().setPreferredSize(new Dimension(100, 40));
        p7_t_table_all_record.getTableHeader().setPreferredSize(new Dimension(100, 40));
        p7_s_table_all_record.getTableHeader().setPreferredSize(new Dimension(100, 40));
        p8_t_table_single_record.getTableHeader().setPreferredSize(new Dimension(100, 40));
        p8_s_table_single_record.getTableHeader().setPreferredSize(new Dimension(100, 40));
        p9_t_table_attendance_form.getTableHeader().setPreferredSize(new Dimension(100, 40));
        p9_s_table_absent_list.getTableHeader().setPreferredSize(new Dimension(100, 40));
    }

//    ************************************************************
    Connection con;
    PreparedStatement pst, pst2, pst3;
    ResultSet rs, rs2, rs3;

//    ************************************************************
    private void DBconnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_bdu_sas", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spa_container = new javax.swing.JPanel();
        p1_login = new javax.swing.JPanel();
        p1_in_null = new javax.swing.JLabel();
        p1_in_email = new javax.swing.JTextField();
        p1_btn_create_account = new javax.swing.JLabel();
        p1_btn_login = new javax.swing.JLabel();
        p1_in_password = new javax.swing.JPasswordField();
        img_login = new javax.swing.JLabel();
        p1_in_tmp = new javax.swing.JTextField();
        value_holder_1 = new javax.swing.JLabel();
        p2_reg_choose_role = new javax.swing.JPanel();
        p2_btn_sign_in_insted = new javax.swing.JLabel();
        p2_btn_student = new javax.swing.JLabel();
        p2_btn_teacher = new javax.swing.JLabel();
        img_reg_choose_role = new javax.swing.JLabel();
        p3_reg_stu_form = new javax.swing.JPanel();
        p3_btn_back = new javax.swing.JLabel();
        p3_in_n = new javax.swing.JTextField();
        p3_in_g = new javax.swing.JTextField();
        p3_in_bg = new javax.swing.JTextField();
        p3_in_mn = new javax.swing.JTextField();
        p3_in_id = new javax.swing.JTextField();
        p3_in_s = new javax.swing.JTextField();
        p3_in_dept = new javax.swing.JTextField();
        p3_in_prg = new javax.swing.JTextField();
        p3_in_e = new javax.swing.JTextField();
        p3_in_p = new javax.swing.JTextField();
        p3_in_cp = new javax.swing.JTextField();
        p3_btn_submit = new javax.swing.JLabel();
        img_reg_stu_form = new javax.swing.JLabel();
        p4_reg_tea_form = new javax.swing.JPanel();
        p4_btn_back = new javax.swing.JLabel();
        p4_in_n = new javax.swing.JTextField();
        p4_in_cp = new javax.swing.JTextField();
        p4_in_mn = new javax.swing.JTextField();
        p4_in_e = new javax.swing.JTextField();
        p4_in_p = new javax.swing.JTextField();
        p4_in_d = new javax.swing.JTextField();
        p4_in_dept = new javax.swing.JTextField();
        p4_in_g = new javax.swing.JTextField();
        p4_in_bg = new javax.swing.JTextField();
        p4_btn_submit = new javax.swing.JLabel();
        img_reg_tea_form = new javax.swing.JLabel();
        p5_t_course_list = new javax.swing.JPanel();
        p5_t_modal_edit_c_details = new javax.swing.JPanel();
        p5_t_in_cn = new javax.swing.JTextField();
        p5_t_in_cc = new javax.swing.JTextField();
        p5_t_in_d = new javax.swing.JTextField();
        p5_t_in_p = new javax.swing.JTextField();
        p5_t_in_s = new javax.swing.JTextField();
        p5_t_btn_cancel = new javax.swing.JLabel();
        p5_t_btn_update_now = new javax.swing.JLabel();
        p5_t_modal_form = new javax.swing.JLabel();
        table_scroll_t_course_list = new javax.swing.JScrollPane();
        table_t_course_list = new javax.swing.JTable();
        p5_t_btn_create_new = new javax.swing.JLabel();
        p5_t_btn_delete = new javax.swing.JLabel();
        p5_t_btn_refresh = new javax.swing.JLabel();
        p5_t_btn_logout = new javax.swing.JLabel();
        p5_t_in_search_key = new javax.swing.JTextField();
        p5_t_btn_open = new javax.swing.JLabel();
        p5_btn_edit = new javax.swing.JLabel();
        p5_t_in_tmp = new javax.swing.JLabel();
        p5_t_uname = new javax.swing.JLabel();
        img_t_course_list = new javax.swing.JLabel();
        p5_t_in_tmp_2 = new javax.swing.JTextField();
        p5_t_in_tmp_3_course_name = new javax.swing.JLabel();
        p5_s_course_list = new javax.swing.JPanel();
        table_scroll_s_course_list = new javax.swing.JScrollPane();
        table_s_course_list = new javax.swing.JTable();
        p5_s_btn_unenroll = new javax.swing.JLabel();
        p5_s_btn_enroll_now = new javax.swing.JLabel();
        p5_s_btn_logout = new javax.swing.JLabel();
        p5_s_btn_refresh = new javax.swing.JLabel();
        p5_s_in_search_key = new javax.swing.JTextField();
        p5_s_btn_open = new javax.swing.JLabel();
        p5_s_in_tmp = new javax.swing.JLabel();
        p5_s_uname = new javax.swing.JLabel();
        img_s_course_list = new javax.swing.JLabel();
        p5_s_in_tmp_2 = new javax.swing.JLabel();
        p5_s_in_tmp_3_course_name = new javax.swing.JLabel();
        p6_t_create_new = new javax.swing.JPanel();
        p6_t_btn_course_list = new javax.swing.JLabel();
        p6_t_in_cc = new javax.swing.JTextField();
        p6_t_in_d = new javax.swing.JTextField();
        p6_t_in_s = new javax.swing.JTextField();
        p6_t_in_cn = new javax.swing.JTextField();
        p6_t_in_p = new javax.swing.JTextField();
        p6_t_btn_reset = new javax.swing.JLabel();
        p6_t_btn_create_now = new javax.swing.JLabel();
        p6_t_uname = new javax.swing.JLabel();
        p6_t_btn_logout = new javax.swing.JLabel();
        img_t_create_new = new javax.swing.JLabel();
        p6_s_enroll_new = new javax.swing.JPanel();
        p6_s_btn_course_list = new javax.swing.JLabel();
        p6_s_in_course_id = new javax.swing.JTextField();
        p6_s_btn_reset = new javax.swing.JLabel();
        p6_s_btn_enroll = new javax.swing.JLabel();
        p6_s_uname = new javax.swing.JLabel();
        p6_s_btn_logout = new javax.swing.JLabel();
        img_s_enroll_new = new javax.swing.JLabel();
        p7_t_all_record = new javax.swing.JPanel();
        p7_t_in_search = new javax.swing.JTextField();
        p7_t_scroll_table_all_record = new javax.swing.JScrollPane();
        p7_t_table_all_record = new javax.swing.JTable();
        p7_t_label_course_name = new javax.swing.JLabel();
        p7_t_back_btn = new javax.swing.JLabel();
        p7_t_btn_single_record = new javax.swing.JLabel();
        p7_t_btn_attendance_form = new javax.swing.JLabel();
        p7_t_uname = new javax.swing.JLabel();
        p7_t_btn_logout = new javax.swing.JLabel();
        p7_t_btn_print = new javax.swing.JLabel();
        img_t_all_record = new javax.swing.JLabel();
        p7_s_all_record = new javax.swing.JPanel();
        p7_t_scroll_table_all_record1 = new javax.swing.JScrollPane();
        p7_s_table_all_record = new javax.swing.JTable();
        p7_s_in_search = new javax.swing.JTextField();
        p7_s_btn_single_record = new javax.swing.JLabel();
        p7_s_btn_attendance_form = new javax.swing.JLabel();
        p7_s_label_course_name = new javax.swing.JLabel();
        p7_s_back_btn = new javax.swing.JLabel();
        p7_s_uname = new javax.swing.JLabel();
        p7_s_btn_logout = new javax.swing.JLabel();
        p7_s_btn_print = new javax.swing.JLabel();
        img_t_all_record1 = new javax.swing.JLabel();
        p8_t_single_record = new javax.swing.JPanel();
        p8_t_select_box = new javax.swing.JComboBox<>();
        p8_t_scroll_table_single_record = new javax.swing.JScrollPane();
        p8_t_table_single_record = new javax.swing.JTable();
        p8_t_label_course_name = new javax.swing.JLabel();
        p8_t_btn_all_record = new javax.swing.JLabel();
        p8_t_btn_attendance_form = new javax.swing.JLabel();
        p8_t_back_btn = new javax.swing.JLabel();
        p8_t_btn_show = new javax.swing.JLabel();
        p8_t_label_title = new javax.swing.JLabel();
        p8_t_btn_submit = new javax.swing.JLabel();
        p8_t_btn_set_to_all_present = new javax.swing.JLabel();
        p8_t_uname = new javax.swing.JLabel();
        p8_t_btn_logout = new javax.swing.JLabel();
        img_t_single_record = new javax.swing.JLabel();
        p8_t_in_tmp_af_id = new javax.swing.JLabel();
        p8_s_single_record = new javax.swing.JPanel();
        p8_s_back_btn = new javax.swing.JLabel();
        p8_s_label_course_name = new javax.swing.JLabel();
        p8_t_scroll_table_single_record1 = new javax.swing.JScrollPane();
        p8_s_table_single_record = new javax.swing.JTable();
        p8_s_select_box = new javax.swing.JComboBox<>();
        p8_s_label_title = new javax.swing.JLabel();
        p8_s_btn_show = new javax.swing.JLabel();
        p8_s_btn_all_record = new javax.swing.JLabel();
        p8_s_btn_attendance_form = new javax.swing.JLabel();
        p8_s_uname = new javax.swing.JLabel();
        p8_s_btn_logout = new javax.swing.JLabel();
        img_t_single_record1 = new javax.swing.JLabel();
        p8_s_in_tmp_af_id = new javax.swing.JLabel();
        p9_t_attendance_form = new javax.swing.JPanel();
        p9_t_label_course_name = new javax.swing.JLabel();
        p9_t_scroll_table_attendance_form = new javax.swing.JScrollPane();
        p9_t_table_attendance_form = new javax.swing.JTable();
        p9_t_btn_all_record = new javax.swing.JLabel();
        p9_t_btn_single_record = new javax.swing.JLabel();
        p9_t_in_form_name = new javax.swing.JTextField();
        p9_t_btn_create = new javax.swing.JLabel();
        p9_t_back_btn = new javax.swing.JLabel();
        p9_t_btn_remove = new javax.swing.JLabel();
        p9_t_uname = new javax.swing.JLabel();
        p9_t_btn_logout = new javax.swing.JLabel();
        img_t_attendance_form = new javax.swing.JLabel();
        p9_t_in_tmp_af_name = new javax.swing.JLabel();
        p9_s_absent_list = new javax.swing.JPanel();
        p9_s_label_course_name = new javax.swing.JLabel();
        p9_s_scroll_table_absent_list = new javax.swing.JScrollPane();
        p9_s_table_absent_list = new javax.swing.JTable();
        p9_s_btn_all_record = new javax.swing.JLabel();
        p9_s_btn_single_record = new javax.swing.JLabel();
        p9_s_back_btn = new javax.swing.JLabel();
        p9_s_uname = new javax.swing.JLabel();
        p9_s_btn_logout = new javax.swing.JLabel();
        img_s_absent_list = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        getContentPane().setLayout(new java.awt.CardLayout());

        spa_container.setBackground(new java.awt.Color(0, 153, 153));
        spa_container.setLayout(new java.awt.CardLayout());

        p1_login.setBackground(new java.awt.Color(255, 255, 255));
        p1_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        p1_login.add(p1_in_null, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        p1_in_email.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p1_in_email.setForeground(new java.awt.Color(153, 153, 153));
        p1_in_email.setText("Email");
        p1_in_email.setToolTipText("Email");
        p1_in_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p1_in_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p1_in_emailFocusLost(evt);
            }
        });
        p1_in_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1_in_emailActionPerformed(evt);
            }
        });
        p1_login.add(p1_in_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 482, 390, 50));

        p1_btn_create_account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p1_btn_create_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1_btn_create_accountMouseClicked(evt);
            }
        });
        p1_login.add(p1_btn_create_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 690, 110, 20));

        p1_btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p1_btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1_btn_loginMouseClicked(evt);
            }
        });
        p1_login.add(p1_btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 730, 420, 50));

        p1_in_password.setForeground(new java.awt.Color(153, 153, 153));
        p1_in_password.setText("Password");
        p1_in_password.setToolTipText("Password");
        p1_in_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p1_in_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p1_in_passwordFocusLost(evt);
            }
        });
        p1_login.add(p1_in_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 390, 50));

        img_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/p1_login.jpg"))); // NOI18N
        p1_login.add(img_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 1080));
        p1_login.add(p1_in_tmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 10));
        p1_login.add(value_holder_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        spa_container.add(p1_login, "card2");

        p2_reg_choose_role.setBackground(new java.awt.Color(255, 255, 255));
        p2_reg_choose_role.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p2_btn_sign_in_insted.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2_btn_sign_in_insted.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2_btn_sign_in_instedMouseClicked(evt);
            }
        });
        p2_reg_choose_role.add(p2_btn_sign_in_insted, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 640, 110, 20));

        p2_btn_student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2_btn_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2_btn_studentMouseClicked(evt);
            }
        });
        p2_reg_choose_role.add(p2_btn_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 80, 30));

        p2_btn_teacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p2_btn_teacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2_btn_teacherMouseClicked(evt);
            }
        });
        p2_reg_choose_role.add(p2_btn_teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, 90, 30));

        img_reg_choose_role.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/p2_reg_choose_role.jpg"))); // NOI18N
        p2_reg_choose_role.add(img_reg_choose_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 1080));

        spa_container.add(p2_reg_choose_role, "card3");

        p3_reg_stu_form.setBackground(new java.awt.Color(255, 255, 255));
        p3_reg_stu_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p3_btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p3_btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p3_btn_backMouseClicked(evt);
            }
        });
        p3_reg_stu_form.add(p3_btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 840, 80, 30));

        p3_in_n.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_n.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_n.setText("Name");
        p3_in_n.setToolTipText("Name");
        p3_in_n.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_nFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_nFocusLost(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 310, 360, 40));

        p3_in_g.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_g.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_g.setText("Gender");
        p3_in_g.setToolTipText("Gender");
        p3_in_g.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_gFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_gFocusLost(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_g, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 392, 160, 30));

        p3_in_bg.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_bg.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_bg.setText("Blood Group");
        p3_in_bg.setToolTipText("Blood Group");
        p3_in_bg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_bgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_bgFocusLost(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 392, 160, 30));

        p3_in_mn.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_mn.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_mn.setText("Mobile No");
        p3_in_mn.setToolTipText("Mobile No");
        p3_in_mn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_mnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_mnFocusLost(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_mn, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 468, 360, 30));

        p3_in_id.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_id.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_id.setText("ID");
        p3_in_id.setToolTipText("ID");
        p3_in_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_idFocusLost(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 545, 170, 30));

        p3_in_s.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_s.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_s.setText("Session");
        p3_in_s.setToolTipText("Session");
        p3_in_s.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_sFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_sFocusLost(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 543, 160, 30));

        p3_in_dept.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_dept.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_dept.setText("Department");
        p3_in_dept.setToolTipText("Department");
        p3_in_dept.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_deptFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_deptFocusLost(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 620, 160, 30));

        p3_in_prg.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_prg.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_prg.setText("Program");
        p3_in_prg.setToolTipText("Program");
        p3_in_prg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_prgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_prgFocusLost(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_prg, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 620, 160, 30));

        p3_in_e.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_e.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_e.setText("Email");
        p3_in_e.setToolTipText("Email");
        p3_in_e.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_eFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_eFocusLost(evt);
            }
        });
        p3_in_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3_in_eActionPerformed(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 690, 360, 40));

        p3_in_p.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_p.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_p.setText("Password");
        p3_in_p.setToolTipText("Password");
        p3_in_p.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_pFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_pFocusLost(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 772, 160, 30));

        p3_in_cp.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p3_in_cp.setForeground(new java.awt.Color(153, 153, 153));
        p3_in_cp.setText("Confirm Password");
        p3_in_cp.setToolTipText("Confirm Password");
        p3_in_cp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p3_in_cpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p3_in_cpFocusLost(evt);
            }
        });
        p3_reg_stu_form.add(p3_in_cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 772, 160, 30));

        p3_btn_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p3_btn_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p3_btn_submitMouseClicked(evt);
            }
        });
        p3_reg_stu_form.add(p3_btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 840, 80, 40));

        img_reg_stu_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/p3_reg_stu_form.jpg"))); // NOI18N
        p3_reg_stu_form.add(img_reg_stu_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 1080));

        spa_container.add(p3_reg_stu_form, "card4");

        p4_reg_tea_form.setBackground(new java.awt.Color(255, 255, 255));
        p4_reg_tea_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p4_btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4_btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p4_btn_backMouseClicked(evt);
            }
        });
        p4_reg_tea_form.add(p4_btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 800, 80, 40));

        p4_in_n.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p4_in_n.setForeground(new java.awt.Color(153, 153, 153));
        p4_in_n.setText("Name");
        p4_in_n.setToolTipText("Name");
        p4_in_n.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p4_in_nFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p4_in_nFocusLost(evt);
            }
        });
        p4_reg_tea_form.add(p4_in_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 352, 350, 30));

        p4_in_cp.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p4_in_cp.setForeground(new java.awt.Color(153, 153, 153));
        p4_in_cp.setText("Confirm Password");
        p4_in_cp.setToolTipText("Confirm Password");
        p4_in_cp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p4_in_cpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p4_in_cpFocusLost(evt);
            }
        });
        p4_reg_tea_form.add(p4_in_cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 733, 160, 30));

        p4_in_mn.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p4_in_mn.setForeground(new java.awt.Color(153, 153, 153));
        p4_in_mn.setText("Mobile No");
        p4_in_mn.setToolTipText("Mobile No");
        p4_in_mn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p4_in_mnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p4_in_mnFocusLost(evt);
            }
        });
        p4_reg_tea_form.add(p4_in_mn, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 505, 350, 30));

        p4_in_e.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p4_in_e.setForeground(new java.awt.Color(153, 153, 153));
        p4_in_e.setText("Email");
        p4_in_e.setToolTipText("Email");
        p4_in_e.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p4_in_eFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p4_in_eFocusLost(evt);
            }
        });
        p4_reg_tea_form.add(p4_in_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 657, 350, 30));

        p4_in_p.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p4_in_p.setForeground(new java.awt.Color(153, 153, 153));
        p4_in_p.setText("Password");
        p4_in_p.setToolTipText("Password");
        p4_in_p.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p4_in_pFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p4_in_pFocusLost(evt);
            }
        });
        p4_reg_tea_form.add(p4_in_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 733, 160, 30));

        p4_in_d.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p4_in_d.setForeground(new java.awt.Color(153, 153, 153));
        p4_in_d.setText("Designation");
        p4_in_d.setToolTipText("Designation");
        p4_in_d.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p4_in_dFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p4_in_dFocusLost(evt);
            }
        });
        p4_reg_tea_form.add(p4_in_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 580, 160, 30));

        p4_in_dept.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p4_in_dept.setForeground(new java.awt.Color(153, 153, 153));
        p4_in_dept.setText("Department");
        p4_in_dept.setToolTipText("Department");
        p4_in_dept.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p4_in_deptFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p4_in_deptFocusLost(evt);
            }
        });
        p4_reg_tea_form.add(p4_in_dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 580, 160, 30));

        p4_in_g.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p4_in_g.setForeground(new java.awt.Color(153, 153, 153));
        p4_in_g.setText("Gender");
        p4_in_g.setToolTipText("Gender");
        p4_in_g.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p4_in_gFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p4_in_gFocusLost(evt);
            }
        });
        p4_reg_tea_form.add(p4_in_g, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 430, 160, 30));

        p4_in_bg.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p4_in_bg.setForeground(new java.awt.Color(153, 153, 153));
        p4_in_bg.setText("Blood Group");
        p4_in_bg.setToolTipText("Blood Group");
        p4_in_bg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p4_in_bgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p4_in_bgFocusLost(evt);
            }
        });
        p4_reg_tea_form.add(p4_in_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 430, 160, 30));

        p4_btn_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p4_btn_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p4_btn_submitMouseClicked(evt);
            }
        });
        p4_reg_tea_form.add(p4_btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 800, 80, 40));

        img_reg_tea_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/p4_reg_tea_form.jpg"))); // NOI18N
        p4_reg_tea_form.add(img_reg_tea_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 1080));

        spa_container.add(p4_reg_tea_form, "card5");

        p5_t_course_list.setBackground(new java.awt.Color(0, 102, 204));
        p5_t_course_list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p5_t_modal_edit_c_details.setBackground(new java.awt.Color(0, 0, 0));
        p5_t_modal_edit_c_details.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p5_t_in_cn.setBackground(new java.awt.Color(232, 240, 254));
        p5_t_in_cn.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p5_t_in_cn.setText("Course Name");
        p5_t_in_cn.setToolTipText("Course Name");
        p5_t_in_cn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p5_t_in_cnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p5_t_in_cnFocusLost(evt);
            }
        });
        p5_t_modal_edit_c_details.add(p5_t_in_cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, 460, 40));

        p5_t_in_cc.setBackground(new java.awt.Color(232, 240, 254));
        p5_t_in_cc.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p5_t_in_cc.setText("Course Code");
        p5_t_in_cc.setToolTipText("Course Code");
        p5_t_in_cc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p5_t_in_ccFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p5_t_in_ccFocusLost(evt);
            }
        });
        p5_t_modal_edit_c_details.add(p5_t_in_cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, 460, 50));

        p5_t_in_d.setBackground(new java.awt.Color(232, 240, 254));
        p5_t_in_d.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p5_t_in_d.setText("Department");
        p5_t_in_d.setToolTipText("Department");
        p5_t_in_d.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p5_t_in_dFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p5_t_in_dFocusLost(evt);
            }
        });
        p5_t_modal_edit_c_details.add(p5_t_in_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 460, 40));

        p5_t_in_p.setBackground(new java.awt.Color(232, 240, 254));
        p5_t_in_p.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p5_t_in_p.setText("Program");
        p5_t_in_p.setToolTipText("Program");
        p5_t_in_p.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p5_t_in_pFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p5_t_in_pFocusLost(evt);
            }
        });
        p5_t_modal_edit_c_details.add(p5_t_in_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 580, 460, 40));

        p5_t_in_s.setBackground(new java.awt.Color(232, 240, 254));
        p5_t_in_s.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p5_t_in_s.setText("Session");
        p5_t_in_s.setToolTipText("Session");
        p5_t_in_s.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p5_t_in_sFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p5_t_in_sFocusLost(evt);
            }
        });
        p5_t_modal_edit_c_details.add(p5_t_in_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, 460, 50));

        p5_t_btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_t_btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_t_btn_cancelMouseClicked(evt);
            }
        });
        p5_t_modal_edit_c_details.add(p5_t_btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 770, 60, 20));

        p5_t_btn_update_now.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_t_btn_update_now.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_t_btn_update_nowMouseClicked(evt);
            }
        });
        p5_t_modal_edit_c_details.add(p5_t_btn_update_now, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 770, 90, 20));

        p5_t_modal_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/t_edit_course_details.jpg"))); // NOI18N
        p5_t_modal_edit_c_details.add(p5_t_modal_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 580, 620));

        p5_t_course_list.add(p5_t_modal_edit_c_details, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        table_t_course_list.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        table_t_course_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"22", "Object oriented Programing 2", "ICT 4344", "gahr34", "ICT", "IOT", "2019-20", "32"},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Course Name", "Course Code", "Course ID", "Department", "Program", "Session", "Total Student"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_t_course_list.setToolTipText("Select a row");
        table_t_course_list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table_t_course_list.setRowHeight(40);
        table_t_course_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_t_course_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_t_course_list.setShowHorizontalLines(true);
        table_t_course_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_t_course_listMouseClicked(evt);
            }
        });
        table_scroll_t_course_list.setViewportView(table_t_course_list);
        if (table_t_course_list.getColumnModel().getColumnCount() > 0) {
            table_t_course_list.getColumnModel().getColumn(0).setMinWidth(45);
            table_t_course_list.getColumnModel().getColumn(0).setMaxWidth(45);
            table_t_course_list.getColumnModel().getColumn(1).setMinWidth(280);
            table_t_course_list.getColumnModel().getColumn(1).setMaxWidth(280);
        }

        p5_t_course_list.add(table_scroll_t_course_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 1020, 740));

        p5_t_btn_create_new.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_t_btn_create_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_t_btn_create_newMouseClicked(evt);
            }
        });
        p5_t_course_list.add(p5_t_btn_create_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 90, 60));

        p5_t_btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_t_btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_t_btn_deleteMouseClicked(evt);
            }
        });
        p5_t_course_list.add(p5_t_btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 940, 90, 40));

        p5_t_btn_refresh.setToolTipText("Refresh Now");
        p5_t_btn_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_t_btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_t_btn_refreshMouseClicked(evt);
            }
        });
        p5_t_course_list.add(p5_t_btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 10, 40, 40));

        p5_t_btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_t_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_t_btn_logoutMouseClicked(evt);
            }
        });
        p5_t_course_list.add(p5_t_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 10, 110, 40));

        p5_t_in_search_key.setBackground(new java.awt.Color(232, 240, 254));
        p5_t_in_search_key.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p5_t_in_search_key.setForeground(new java.awt.Color(153, 153, 153));
        p5_t_in_search_key.setText("Search Here");
        p5_t_in_search_key.setToolTipText("Search Here");
        p5_t_in_search_key.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        p5_t_in_search_key.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p5_t_in_search_keyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p5_t_in_search_keyFocusLost(evt);
            }
        });
        p5_t_in_search_key.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p5_t_in_search_keyKeyReleased(evt);
            }
        });
        p5_t_course_list.add(p5_t_in_search_key, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 97, 660, 40));

        p5_t_btn_open.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_t_btn_open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_t_btn_openMouseClicked(evt);
            }
        });
        p5_t_course_list.add(p5_t_btn_open, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 938, 70, 40));

        p5_btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_btn_editMouseClicked(evt);
            }
        });
        p5_t_course_list.add(p5_btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 937, 70, 40));

        p5_t_in_tmp.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        p5_t_course_list.add(p5_t_in_tmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 20, 10));

        p5_t_uname.setFont(new java.awt.Font("Product Sans Medium", 0, 15)); // NOI18N
        p5_t_uname.setForeground(new java.awt.Color(0, 123, 255));
        p5_t_uname.setText("Bitta Boibhob Barmon");
        p5_t_course_list.add(p5_t_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 150, -1));

        img_t_course_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/t_course_list.jpg"))); // NOI18N
        p5_t_course_list.add(img_t_course_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
        p5_t_course_list.add(p5_t_in_tmp_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 0, 40));
        p5_t_course_list.add(p5_t_in_tmp_3_course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        spa_container.add(p5_t_course_list, "card7");

        p5_s_course_list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table_s_course_list.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        table_s_course_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"22", "Object oriented Programing 2", "ICT 4344", null, "ICT", "IOT", "2019-20", "32"},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Course Name", "Course Code", "Couese ID", "Department", "Program", "Session", "Total Student"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_s_course_list.setToolTipText("Select a row");
        table_s_course_list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table_s_course_list.setRowHeight(40);
        table_s_course_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_s_course_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table_s_course_list.setShowHorizontalLines(true);
        table_s_course_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_s_course_listMouseClicked(evt);
            }
        });
        table_scroll_s_course_list.setViewportView(table_s_course_list);
        if (table_s_course_list.getColumnModel().getColumnCount() > 0) {
            table_s_course_list.getColumnModel().getColumn(0).setMinWidth(45);
            table_s_course_list.getColumnModel().getColumn(0).setMaxWidth(45);
            table_s_course_list.getColumnModel().getColumn(1).setMinWidth(280);
            table_s_course_list.getColumnModel().getColumn(1).setMaxWidth(280);
            table_s_course_list.getColumnModel().getColumn(6).setResizable(false);
            table_s_course_list.getColumnModel().getColumn(7).setResizable(false);
        }

        p5_s_course_list.add(table_scroll_s_course_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 1020, 750));

        p5_s_btn_unenroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_s_btn_unenroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_s_btn_unenrollMouseClicked(evt);
            }
        });
        p5_s_course_list.add(p5_s_btn_unenroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 938, 90, 40));

        p5_s_btn_enroll_now.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_s_btn_enroll_now.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_s_btn_enroll_nowMouseClicked(evt);
            }
        });
        p5_s_course_list.add(p5_s_btn_enroll_now, new org.netbeans.lib.awtextra.AbsoluteConstraints(975, 0, 80, 60));

        p5_s_btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_s_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_s_btn_logoutMouseClicked(evt);
            }
        });
        p5_s_course_list.add(p5_s_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 10, 110, 40));

        p5_s_btn_refresh.setToolTipText("Refresh Now");
        p5_s_btn_refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_s_btn_refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_s_btn_refreshMouseClicked(evt);
            }
        });
        p5_s_course_list.add(p5_s_btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 10, 40, 40));

        p5_s_in_search_key.setBackground(new java.awt.Color(232, 240, 254));
        p5_s_in_search_key.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p5_s_in_search_key.setForeground(new java.awt.Color(153, 153, 153));
        p5_s_in_search_key.setText("Search Here");
        p5_s_in_search_key.setToolTipText("Search Here");
        p5_s_in_search_key.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        p5_s_in_search_key.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p5_s_in_search_keyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p5_s_in_search_keyFocusLost(evt);
            }
        });
        p5_s_in_search_key.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p5_s_in_search_keyKeyReleased(evt);
            }
        });
        p5_s_course_list.add(p5_s_in_search_key, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 97, 660, 40));

        p5_s_btn_open.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p5_s_btn_open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5_s_btn_openMouseClicked(evt);
            }
        });
        p5_s_course_list.add(p5_s_btn_open, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 943, 70, 30));

        p5_s_in_tmp.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        p5_s_course_list.add(p5_s_in_tmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 20, 10));

        p5_s_uname.setFont(new java.awt.Font("Product Sans Medium", 0, 15)); // NOI18N
        p5_s_uname.setForeground(new java.awt.Color(0, 123, 255));
        p5_s_uname.setText("Bitta Boibhob Barmon");
        p5_s_course_list.add(p5_s_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 150, -1));

        img_s_course_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s_course_list.jpg"))); // NOI18N
        p5_s_course_list.add(img_s_course_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
        p5_s_course_list.add(p5_s_in_tmp_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 40));
        p5_s_course_list.add(p5_s_in_tmp_3_course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        spa_container.add(p5_s_course_list, "card8");

        p6_t_create_new.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p6_t_btn_course_list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p6_t_btn_course_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6_t_btn_course_listMouseClicked(evt);
            }
        });
        p6_t_create_new.add(p6_t_btn_course_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 80, 60));

        p6_t_in_cc.setBackground(new java.awt.Color(232, 240, 254));
        p6_t_in_cc.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p6_t_in_cc.setText("Course Code");
        p6_t_in_cc.setToolTipText("Course Code");
        p6_t_in_cc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p6_t_in_ccFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p6_t_in_ccFocusLost(evt);
            }
        });
        p6_t_create_new.add(p6_t_in_cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 350, 460, 50));

        p6_t_in_d.setBackground(new java.awt.Color(232, 240, 254));
        p6_t_in_d.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p6_t_in_d.setText("Department");
        p6_t_in_d.setToolTipText("Department");
        p6_t_in_d.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p6_t_in_dFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p6_t_in_dFocusLost(evt);
            }
        });
        p6_t_create_new.add(p6_t_in_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 440, 460, 40));

        p6_t_in_s.setBackground(new java.awt.Color(232, 240, 254));
        p6_t_in_s.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p6_t_in_s.setText("Session");
        p6_t_in_s.setToolTipText("Session");
        p6_t_in_s.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p6_t_in_sFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p6_t_in_sFocusLost(evt);
            }
        });
        p6_t_create_new.add(p6_t_in_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 610, 460, 50));

        p6_t_in_cn.setBackground(new java.awt.Color(232, 240, 254));
        p6_t_in_cn.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p6_t_in_cn.setText("Course Name");
        p6_t_in_cn.setToolTipText("Course Name");
        p6_t_in_cn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p6_t_in_cnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p6_t_in_cnFocusLost(evt);
            }
        });
        p6_t_create_new.add(p6_t_in_cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 272, 460, 40));

        p6_t_in_p.setBackground(new java.awt.Color(232, 240, 254));
        p6_t_in_p.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p6_t_in_p.setText("Program");
        p6_t_in_p.setToolTipText("Program");
        p6_t_in_p.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p6_t_in_pFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p6_t_in_pFocusLost(evt);
            }
        });
        p6_t_create_new.add(p6_t_in_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 530, 460, 40));

        p6_t_btn_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p6_t_btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6_t_btn_resetMouseClicked(evt);
            }
        });
        p6_t_create_new.add(p6_t_btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 710, 50, 40));

        p6_t_btn_create_now.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p6_t_btn_create_now.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6_t_btn_create_nowMouseClicked(evt);
            }
        });
        p6_t_create_new.add(p6_t_btn_create_now, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 710, 90, 40));

        p6_t_uname.setFont(new java.awt.Font("Product Sans Medium", 0, 15)); // NOI18N
        p6_t_uname.setForeground(new java.awt.Color(0, 123, 255));
        p6_t_uname.setText("Bitta Boibhob Barmon");
        p6_t_create_new.add(p6_t_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 150, -1));

        p6_t_btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p6_t_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6_t_btn_logoutMouseClicked(evt);
            }
        });
        p6_t_create_new.add(p6_t_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 10, 110, 40));

        img_t_create_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/t_create_new.jpg"))); // NOI18N
        p6_t_create_new.add(img_t_create_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        spa_container.add(p6_t_create_new, "card7");

        p6_s_enroll_new.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p6_s_btn_course_list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p6_s_btn_course_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6_s_btn_course_listMouseClicked(evt);
            }
        });
        p6_s_enroll_new.add(p6_s_btn_course_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 90, 60));

        p6_s_in_course_id.setBackground(new java.awt.Color(232, 240, 254));
        p6_s_in_course_id.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p6_s_in_course_id.setText("Course ID");
        p6_s_in_course_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p6_s_in_course_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p6_s_in_course_idFocusLost(evt);
            }
        });
        p6_s_enroll_new.add(p6_s_in_course_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 303, 470, 40));

        p6_s_btn_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p6_s_btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6_s_btn_resetMouseClicked(evt);
            }
        });
        p6_s_enroll_new.add(p6_s_btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 434, 50, 30));

        p6_s_btn_enroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p6_s_btn_enroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6_s_btn_enrollMouseClicked(evt);
            }
        });
        p6_s_enroll_new.add(p6_s_btn_enroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 433, 80, 30));

        p6_s_uname.setFont(new java.awt.Font("Product Sans Medium", 0, 15)); // NOI18N
        p6_s_uname.setForeground(new java.awt.Color(0, 123, 255));
        p6_s_uname.setText("Bitta Boibhob Barmon");
        p6_s_enroll_new.add(p6_s_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 150, -1));

        p6_s_btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p6_s_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6_s_btn_logoutMouseClicked(evt);
            }
        });
        p6_s_enroll_new.add(p6_s_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 10, 110, 40));

        img_s_enroll_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s_enroll_new.jpg"))); // NOI18N
        p6_s_enroll_new.add(img_s_enroll_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        spa_container.add(p6_s_enroll_new, "card9");

        p7_t_all_record.setBackground(new java.awt.Color(0, 153, 153));
        p7_t_all_record.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p7_t_in_search.setBackground(new java.awt.Color(232, 240, 254));
        p7_t_in_search.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p7_t_in_search.setText("Search Here");
        p7_t_in_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p7_t_in_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p7_t_in_searchFocusLost(evt);
            }
        });
        p7_t_in_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p7_t_in_searchKeyReleased(evt);
            }
        });
        p7_t_all_record.add(p7_t_in_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 96, 340, 40));

        p7_t_scroll_table_all_record.setToolTipText("");
        p7_t_scroll_table_all_record.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N

        p7_t_table_all_record.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p7_t_table_all_record.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"22", "1901050", "Bitta Boibhob Barmon", "38/42", null, "80%", "30"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Student ID", "Student Name", "Present", "Late", "Percent", "Mark"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p7_t_table_all_record.setToolTipText("");
        p7_t_table_all_record.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p7_t_table_all_record.setRowHeight(40);
        p7_t_table_all_record.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        p7_t_table_all_record.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        p7_t_table_all_record.setShowHorizontalLines(true);
        p7_t_table_all_record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_t_table_all_recordMouseClicked(evt);
            }
        });
        p7_t_scroll_table_all_record.setViewportView(p7_t_table_all_record);
        if (p7_t_table_all_record.getColumnModel().getColumnCount() > 0) {
            p7_t_table_all_record.getColumnModel().getColumn(0).setMinWidth(45);
            p7_t_table_all_record.getColumnModel().getColumn(0).setMaxWidth(45);
            p7_t_table_all_record.getColumnModel().getColumn(2).setMinWidth(280);
            p7_t_table_all_record.getColumnModel().getColumn(2).setMaxWidth(280);
        }

        p7_t_all_record.add(p7_t_scroll_table_all_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 840, 770));

        p7_t_label_course_name.setFont(new java.awt.Font("Product Sans Medium", 0, 20)); // NOI18N
        p7_t_label_course_name.setForeground(new java.awt.Color(0, 123, 255));
        p7_t_label_course_name.setText("Course Name");
        p7_t_all_record.add(p7_t_label_course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 490, 20));

        p7_t_back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7_t_back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_t_back_btnMouseClicked(evt);
            }
        });
        p7_t_all_record.add(p7_t_back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        p7_t_btn_single_record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7_t_btn_single_record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_t_btn_single_recordMouseClicked(evt);
            }
        });
        p7_t_all_record.add(p7_t_btn_single_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 110, 60));

        p7_t_btn_attendance_form.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7_t_btn_attendance_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_t_btn_attendance_formMouseClicked(evt);
            }
        });
        p7_t_all_record.add(p7_t_btn_attendance_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 130, 60));

        p7_t_uname.setFont(new java.awt.Font("Product Sans Medium", 0, 15)); // NOI18N
        p7_t_uname.setForeground(new java.awt.Color(0, 123, 255));
        p7_t_uname.setText("Bitta Boibhob Barmon");
        p7_t_all_record.add(p7_t_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 150, -1));

        p7_t_btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7_t_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_t_btn_logoutMouseClicked(evt);
            }
        });
        p7_t_all_record.add(p7_t_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 10, 110, 40));

        p7_t_btn_print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7_t_btn_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_t_btn_printMouseClicked(evt);
            }
        });
        p7_t_all_record.add(p7_t_btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 960, 70, 40));

        img_t_all_record.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/t_all_record.png"))); // NOI18N
        p7_t_all_record.add(img_t_all_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        spa_container.add(p7_t_all_record, "card10");

        p7_s_all_record.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p7_t_scroll_table_all_record1.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N

        p7_s_table_all_record.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p7_s_table_all_record.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"22", "1901050", "Bitta Boibhob Barmon", "38/42", null, "80%", "30"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Student ID", "Student Name", "Present", "Late", "Percentage", "Mark"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p7_s_table_all_record.setToolTipText("");
        p7_s_table_all_record.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p7_s_table_all_record.setRowHeight(40);
        p7_s_table_all_record.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        p7_s_table_all_record.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        p7_s_table_all_record.setShowHorizontalLines(true);
        p7_s_table_all_record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_s_table_all_recordMouseClicked(evt);
            }
        });
        p7_t_scroll_table_all_record1.setViewportView(p7_s_table_all_record);
        if (p7_s_table_all_record.getColumnModel().getColumnCount() > 0) {
            p7_s_table_all_record.getColumnModel().getColumn(0).setMinWidth(45);
            p7_s_table_all_record.getColumnModel().getColumn(0).setMaxWidth(45);
            p7_s_table_all_record.getColumnModel().getColumn(2).setMinWidth(280);
            p7_s_table_all_record.getColumnModel().getColumn(2).setMaxWidth(280);
        }

        p7_s_all_record.add(p7_t_scroll_table_all_record1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 840, 770));

        p7_s_in_search.setBackground(new java.awt.Color(232, 240, 254));
        p7_s_in_search.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p7_s_in_search.setText("Search Here");
        p7_s_in_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p7_s_in_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p7_s_in_searchFocusLost(evt);
            }
        });
        p7_s_in_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p7_s_in_searchKeyReleased(evt);
            }
        });
        p7_s_all_record.add(p7_s_in_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 96, 340, 40));

        p7_s_btn_single_record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7_s_btn_single_record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_s_btn_single_recordMouseClicked(evt);
            }
        });
        p7_s_all_record.add(p7_s_btn_single_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 110, 60));

        p7_s_btn_attendance_form.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7_s_btn_attendance_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_s_btn_attendance_formMouseClicked(evt);
            }
        });
        p7_s_all_record.add(p7_s_btn_attendance_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 110, 60));

        p7_s_label_course_name.setFont(new java.awt.Font("Product Sans Medium", 0, 20)); // NOI18N
        p7_s_label_course_name.setForeground(new java.awt.Color(0, 123, 255));
        p7_s_label_course_name.setText("Course Name");
        p7_s_all_record.add(p7_s_label_course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 490, 20));

        p7_s_back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7_s_back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_s_back_btnMouseClicked(evt);
            }
        });
        p7_s_all_record.add(p7_s_back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        p7_s_uname.setFont(new java.awt.Font("Product Sans Medium", 0, 15)); // NOI18N
        p7_s_uname.setForeground(new java.awt.Color(0, 123, 255));
        p7_s_uname.setText("Bitta Boibhob Barmon");
        p7_s_all_record.add(p7_s_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 150, -1));

        p7_s_btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7_s_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_s_btn_logoutMouseClicked(evt);
            }
        });
        p7_s_all_record.add(p7_s_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 10, 110, 40));

        p7_s_btn_print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p7_s_btn_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7_s_btn_printMouseClicked(evt);
            }
        });
        p7_s_all_record.add(p7_s_btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 960, 70, 40));

        img_t_all_record1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s_all_record.png"))); // NOI18N
        p7_s_all_record.add(img_t_all_record1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        spa_container.add(p7_s_all_record, "card13");

        p8_t_single_record.setBackground(new java.awt.Color(153, 102, 0));
        p8_t_single_record.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p8_t_select_box.setBackground(new java.awt.Color(232, 240, 254));
        p8_t_select_box.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p8_t_select_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p8_t_single_record.add(p8_t_select_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 95, 260, 30));

        p8_t_table_single_record.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p8_t_table_single_record.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Student ID", "Student Name", "Status", "Present ?", "Late ?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p8_t_table_single_record.setRowHeight(40);
        p8_t_scroll_table_single_record.setViewportView(p8_t_table_single_record);
        if (p8_t_table_single_record.getColumnModel().getColumnCount() > 0) {
            p8_t_table_single_record.getColumnModel().getColumn(0).setMinWidth(45);
            p8_t_table_single_record.getColumnModel().getColumn(0).setMaxWidth(45);
            p8_t_table_single_record.getColumnModel().getColumn(2).setMinWidth(280);
            p8_t_table_single_record.getColumnModel().getColumn(2).setMaxWidth(280);
        }

        p8_t_single_record.add(p8_t_scroll_table_single_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 680, 750));

        p8_t_label_course_name.setFont(new java.awt.Font("Product Sans Medium", 0, 20)); // NOI18N
        p8_t_label_course_name.setForeground(new java.awt.Color(0, 123, 255));
        p8_t_label_course_name.setText("Course Name");
        p8_t_single_record.add(p8_t_label_course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 490, 20));

        p8_t_btn_all_record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_t_btn_all_record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_t_btn_all_recordMouseClicked(evt);
            }
        });
        p8_t_single_record.add(p8_t_btn_all_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 80, 60));

        p8_t_btn_attendance_form.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_t_btn_attendance_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_t_btn_attendance_formMouseClicked(evt);
            }
        });
        p8_t_single_record.add(p8_t_btn_attendance_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 130, 60));

        p8_t_back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_t_back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_t_back_btnMouseClicked(evt);
            }
        });
        p8_t_single_record.add(p8_t_back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        p8_t_btn_show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_t_btn_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_t_btn_showMouseClicked(evt);
            }
        });
        p8_t_single_record.add(p8_t_btn_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 90, 70, 40));

        p8_t_label_title.setFont(new java.awt.Font("Product Sans Medium", 0, 20)); // NOI18N
        p8_t_label_title.setForeground(new java.awt.Color(0, 123, 255));
        p8_t_label_title.setText("One Attendance Form Result");
        p8_t_single_record.add(p8_t_label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 96, 310, 30));

        p8_t_btn_submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_t_btn_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_t_btn_submitMouseClicked(evt);
            }
        });
        p8_t_single_record.add(p8_t_btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 940, 90, 40));

        p8_t_btn_set_to_all_present.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_t_btn_set_to_all_present.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_t_btn_set_to_all_presentMouseClicked(evt);
            }
        });
        p8_t_single_record.add(p8_t_btn_set_to_all_present, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 940, 110, 40));

        p8_t_uname.setFont(new java.awt.Font("Product Sans Medium", 0, 15)); // NOI18N
        p8_t_uname.setForeground(new java.awt.Color(0, 123, 255));
        p8_t_uname.setText("Bitta Boibhob Barmon");
        p8_t_single_record.add(p8_t_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 150, -1));

        p8_t_btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_t_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_t_btn_logoutMouseClicked(evt);
            }
        });
        p8_t_single_record.add(p8_t_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 10, 110, 40));

        img_t_single_record.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/t_single_record.jpg"))); // NOI18N
        img_t_single_record.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p8_t_single_record.add(img_t_single_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));
        p8_t_single_record.add(p8_t_in_tmp_af_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        spa_container.add(p8_t_single_record, "card11");

        p8_s_single_record.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p8_s_back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_s_back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_s_back_btnMouseClicked(evt);
            }
        });
        p8_s_single_record.add(p8_s_back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        p8_s_label_course_name.setFont(new java.awt.Font("Product Sans Medium", 0, 20)); // NOI18N
        p8_s_label_course_name.setForeground(new java.awt.Color(0, 123, 255));
        p8_s_label_course_name.setText("Course Name");
        p8_s_single_record.add(p8_s_label_course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 490, 20));

        p8_s_table_single_record.setFont(new java.awt.Font("Heebo", 0, 14)); // NOI18N
        p8_s_table_single_record.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Student ID", "Student Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p8_s_table_single_record.setRowHeight(40);
        p8_t_scroll_table_single_record1.setViewportView(p8_s_table_single_record);
        if (p8_s_table_single_record.getColumnModel().getColumnCount() > 0) {
            p8_s_table_single_record.getColumnModel().getColumn(0).setMinWidth(45);
            p8_s_table_single_record.getColumnModel().getColumn(0).setMaxWidth(45);
            p8_s_table_single_record.getColumnModel().getColumn(2).setMinWidth(280);
            p8_s_table_single_record.getColumnModel().getColumn(2).setMaxWidth(280);
        }

        p8_s_single_record.add(p8_t_scroll_table_single_record1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 680, 750));

        p8_s_select_box.setBackground(new java.awt.Color(232, 240, 254));
        p8_s_select_box.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p8_s_select_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        p8_s_single_record.add(p8_s_select_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 95, 260, 30));

        p8_s_label_title.setFont(new java.awt.Font("Product Sans Medium", 0, 20)); // NOI18N
        p8_s_label_title.setForeground(new java.awt.Color(0, 123, 255));
        p8_s_label_title.setText("One Attendance Form Result");
        p8_s_single_record.add(p8_s_label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 96, 310, 30));

        p8_s_btn_show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_s_btn_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_s_btn_showMouseClicked(evt);
            }
        });
        p8_s_single_record.add(p8_s_btn_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 90, 70, 40));

        p8_s_btn_all_record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_s_btn_all_record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_s_btn_all_recordMouseClicked(evt);
            }
        });
        p8_s_single_record.add(p8_s_btn_all_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 80, 60));

        p8_s_btn_attendance_form.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_s_btn_attendance_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_s_btn_attendance_formMouseClicked(evt);
            }
        });
        p8_s_single_record.add(p8_s_btn_attendance_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 100, 60));

        p8_s_uname.setFont(new java.awt.Font("Product Sans Medium", 0, 15)); // NOI18N
        p8_s_uname.setForeground(new java.awt.Color(0, 123, 255));
        p8_s_uname.setText("Bitta Boibhob Barmon");
        p8_s_single_record.add(p8_s_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 150, -1));

        p8_s_btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p8_s_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p8_s_btn_logoutMouseClicked(evt);
            }
        });
        p8_s_single_record.add(p8_s_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 10, 110, 40));

        img_t_single_record1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s_single_record.png"))); // NOI18N
        img_t_single_record1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p8_s_single_record.add(img_t_single_record1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));
        p8_s_single_record.add(p8_s_in_tmp_af_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        spa_container.add(p8_s_single_record, "card14");

        p9_t_attendance_form.setBackground(new java.awt.Color(255, 255, 255));
        p9_t_attendance_form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p9_t_label_course_name.setFont(new java.awt.Font("Product Sans Medium", 0, 20)); // NOI18N
        p9_t_label_course_name.setForeground(new java.awt.Color(0, 123, 255));
        p9_t_label_course_name.setText("Course Name");
        p9_t_attendance_form.add(p9_t_label_course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 490, 20));

        p9_t_table_attendance_form.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p9_t_table_attendance_form.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Form Name", "Created Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p9_t_table_attendance_form.setRowHeight(40);
        p9_t_table_attendance_form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_t_table_attendance_formMouseClicked(evt);
            }
        });
        p9_t_scroll_table_attendance_form.setViewportView(p9_t_table_attendance_form);
        if (p9_t_table_attendance_form.getColumnModel().getColumnCount() > 0) {
            p9_t_table_attendance_form.getColumnModel().getColumn(0).setMinWidth(45);
            p9_t_table_attendance_form.getColumnModel().getColumn(0).setMaxWidth(45);
            p9_t_table_attendance_form.getColumnModel().getColumn(1).setMinWidth(280);
            p9_t_table_attendance_form.getColumnModel().getColumn(1).setMaxWidth(280);
        }

        p9_t_attendance_form.add(p9_t_scroll_table_attendance_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 260, 540, 650));

        p9_t_btn_all_record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9_t_btn_all_record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_t_btn_all_recordMouseClicked(evt);
            }
        });
        p9_t_attendance_form.add(p9_t_btn_all_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 80, 60));

        p9_t_btn_single_record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9_t_btn_single_record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_t_btn_single_recordMouseClicked(evt);
            }
        });
        p9_t_attendance_form.add(p9_t_btn_single_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 110, 60));

        p9_t_in_form_name.setBackground(new java.awt.Color(232, 240, 254));
        p9_t_in_form_name.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p9_t_in_form_name.setForeground(new java.awt.Color(153, 153, 153));
        p9_t_in_form_name.setText("Form Name");
        p9_t_in_form_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                p9_t_in_form_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                p9_t_in_form_nameFocusLost(evt);
            }
        });
        p9_t_in_form_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_t_in_form_nameMouseClicked(evt);
            }
        });
        p9_t_attendance_form.add(p9_t_in_form_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 142, 250, 30));

        p9_t_btn_create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9_t_btn_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_t_btn_createMouseClicked(evt);
            }
        });
        p9_t_attendance_form.add(p9_t_btn_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 142, 80, 30));

        p9_t_back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9_t_back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_t_back_btnMouseClicked(evt);
            }
        });
        p9_t_attendance_form.add(p9_t_back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        p9_t_btn_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9_t_btn_remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_t_btn_removeMouseClicked(evt);
            }
        });
        p9_t_attendance_form.add(p9_t_btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 940, 90, 40));

        p9_t_uname.setFont(new java.awt.Font("Product Sans Medium", 0, 15)); // NOI18N
        p9_t_uname.setForeground(new java.awt.Color(0, 123, 255));
        p9_t_uname.setText("Bitta Boibhob Barmon");
        p9_t_attendance_form.add(p9_t_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 150, -1));

        p9_t_btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9_t_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_t_btn_logoutMouseClicked(evt);
            }
        });
        p9_t_attendance_form.add(p9_t_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 10, 110, 40));

        img_t_attendance_form.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/t_attendance_form.jpg"))); // NOI18N
        p9_t_attendance_form.add(img_t_attendance_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));
        p9_t_attendance_form.add(p9_t_in_tmp_af_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        spa_container.add(p9_t_attendance_form, "card12");

        p9_s_absent_list.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p9_s_label_course_name.setFont(new java.awt.Font("Product Sans Medium", 0, 20)); // NOI18N
        p9_s_label_course_name.setForeground(new java.awt.Color(0, 123, 255));
        p9_s_label_course_name.setText("Course Name");
        p9_s_absent_list.add(p9_s_label_course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 490, 20));

        p9_s_table_absent_list.setFont(new java.awt.Font("Heebo", 0, 15)); // NOI18N
        p9_s_table_absent_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Form Name", "Created Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p9_s_table_absent_list.setRowHeight(40);
        p9_s_table_absent_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_s_table_absent_listMouseClicked(evt);
            }
        });
        p9_s_scroll_table_absent_list.setViewportView(p9_s_table_absent_list);
        if (p9_s_table_absent_list.getColumnModel().getColumnCount() > 0) {
            p9_s_table_absent_list.getColumnModel().getColumn(0).setMinWidth(45);
            p9_s_table_absent_list.getColumnModel().getColumn(0).setMaxWidth(45);
            p9_s_table_absent_list.getColumnModel().getColumn(1).setMinWidth(280);
            p9_s_table_absent_list.getColumnModel().getColumn(1).setMaxWidth(280);
        }

        p9_s_absent_list.add(p9_s_scroll_table_absent_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 140, 540, 770));

        p9_s_btn_all_record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9_s_btn_all_record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_s_btn_all_recordMouseClicked(evt);
            }
        });
        p9_s_absent_list.add(p9_s_btn_all_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 80, 60));

        p9_s_btn_single_record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9_s_btn_single_record.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_s_btn_single_recordMouseClicked(evt);
            }
        });
        p9_s_absent_list.add(p9_s_btn_single_record, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 110, 60));

        p9_s_back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9_s_back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_s_back_btnMouseClicked(evt);
            }
        });
        p9_s_absent_list.add(p9_s_back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        p9_s_uname.setFont(new java.awt.Font("Product Sans Medium", 0, 15)); // NOI18N
        p9_s_uname.setForeground(new java.awt.Color(0, 123, 255));
        p9_s_uname.setText("Bitta Boibhob Barmon");
        p9_s_absent_list.add(p9_s_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 20, 150, -1));

        p9_s_btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p9_s_btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p9_s_btn_logoutMouseClicked(evt);
            }
        });
        p9_s_absent_list.add(p9_s_btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1550, 10, 110, 40));

        img_s_absent_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/s_absent_list.png"))); // NOI18N
        p9_s_absent_list.add(img_s_absent_list, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        spa_container.add(p9_s_absent_list, "card15");

        getContentPane().add(spa_container, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    ************************************************************
    public void logout() {
        spa_container.removeAll();
        spa_container.add(p1_login);
        spa_container.repaint();
        spa_container.revalidate();
        value_holder_1.setText("");
    }

//    ************************************************************
    public void t_btn_back() {
        spa_container.removeAll();
        spa_container.add(p5_t_course_list);
        spa_container.repaint();
        spa_container.revalidate();
        fetch_t_course_list();
    }

//    ************************************************************
    public void s_btn_back() {
        spa_container.removeAll();
        spa_container.add(p5_s_course_list);
        spa_container.repaint();
        spa_container.revalidate();
        fetch_s_course_list();
    }

//    ************************************************************

    private void p1_in_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p1_in_emailFocusGained
        if (p1_in_email.getText().equals("Email")) {
            p1_in_email.setText("");
            p1_in_email.setForeground(new Color(0, 0, 0));
        } else {
            p1_in_email.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p1_in_emailFocusGained

    private void p1_in_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p1_in_emailFocusLost
        if (p1_in_email.getText().equals("")) {
            p1_in_email.setText("Email");
            p1_in_email.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p1_in_emailFocusLost

//    ************************************************************

    private void p1_btn_create_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1_btn_create_accountMouseClicked
        spa_container.removeAll();
        spa_container.add(p2_reg_choose_role);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p1_btn_create_accountMouseClicked

//    ************************************************************

    private void p2_btn_sign_in_instedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2_btn_sign_in_instedMouseClicked
        spa_container.removeAll();
        spa_container.add(p1_login);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p2_btn_sign_in_instedMouseClicked

//    ************************************************************

    private void p2_btn_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2_btn_studentMouseClicked
        spa_container.removeAll();
        spa_container.add(p3_reg_stu_form);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p2_btn_studentMouseClicked

//    ************************************************************

    private void p3_btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3_btn_backMouseClicked
        spa_container.removeAll();
        spa_container.add(p2_reg_choose_role);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p3_btn_backMouseClicked

//    ************************************************************

    private void p4_btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4_btn_backMouseClicked
        spa_container.removeAll();
        spa_container.add(p2_reg_choose_role);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p4_btn_backMouseClicked

//    ************************************************************

    private void p1_btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1_btn_loginMouseClicked
        String email = p1_in_email.getText();
        String password = new String(p1_in_password.getPassword());
        if (email.equals("") || email.equals("Email") || password.equals("") || password.equals("Password"))
            JOptionPane.showMessageDialog(this, "All fields are required");
        else {
            try {
                pst = con.prepareStatement("SELECT * FROM stu_info");
                rs = pst.executeQuery();
                int found = 0;
                while (rs.next()) {
                    String stu_email = rs.getString("stu_email");
                    String stu_password = rs.getString("stu_password");
                    String stu_id = rs.getString("stu_id");
                    String stu_name = rs.getString("stu_name");
                    if ((email.equals(stu_email)) && (password.equals(stu_password))) {
                        found = 1;
                        value_holder_1.setText(stu_id);
                        p5_s_uname.setText(stu_name);
                        p6_s_uname.setText(stu_name);
                        p7_s_uname.setText(stu_name);
                        p8_s_uname.setText(stu_name);
                        p9_s_uname.setText(stu_name);
                        break;
                    } else {
                        found = 0;
                    }
                }
                if (found == 0) {
                    try {
                        pst = con.prepareStatement("SELECT * FROM teacher_info");
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            String t_email = rs.getString("t_email");
                            String t_password = rs.getString("t_password");
                            String t_id = rs.getString("t_id");
                            String t_name = rs.getString("t_name");
                            if ((email.equals(t_email)) && (password.equals(t_password))) {
                                found = 1;
                                value_holder_1.setText(t_id);
                                p5_t_uname.setText(t_name);
                                p6_t_uname.setText(t_name);
                                p7_t_uname.setText(t_name);
                                p8_t_uname.setText(t_name);
                                p9_t_uname.setText(t_name);
                                break;
                            } else {
                                found = 0;
                            }
                        }
                        if (found == 0) {
                            JOptionPane.showMessageDialog(this, "Username or Password is incorrect.");
                        } else {
//                           p1_in_email.setText("Email");
//                    p1_in_password.setText("Password");
                            spa_container.removeAll();
                            spa_container.add(p5_t_course_list);
                            spa_container.repaint();
                            spa_container.revalidate();
                            fetch_t_course_list();
//                JOptionPane.showMessageDialog(this, "Username and Password Matched");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
//                    p1_in_email.setText("Email");
//                    p1_in_password.setText("Password");
                    spa_container.removeAll();
                    spa_container.add(p5_s_course_list);
                    spa_container.repaint();
                    spa_container.revalidate();
                    fetch_s_course_list();
//                JOptionPane.showMessageDialog(this, "Username and Password Matched");
                }
            } catch (SQLException ex) {
                Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
            }
        } // else
    }//GEN-LAST:event_p1_btn_loginMouseClicked

//    ************************************************************

    private void p2_btn_teacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2_btn_teacherMouseClicked
        spa_container.removeAll();
        spa_container.add(p4_reg_tea_form);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p2_btn_teacherMouseClicked

    private void p3_in_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3_in_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3_in_eActionPerformed

    private void p3_btn_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3_btn_submitMouseClicked
        String name = p3_in_n.getText();
        String gender = p3_in_g.getText();
        String blood = p3_in_bg.getText();
        String mobile = p3_in_mn.getText();
        String id = p3_in_id.getText();
        String session = p3_in_s.getText();
        String dept = p3_in_dept.getText();
        String prg = p3_in_prg.getText();
        String email = p3_in_e.getText();
        String psw = p3_in_p.getText();
        String cpsw = p3_in_cp.getText();

        if (name.equals("") || name.equals("Name") || gender.equals("") || gender.equals("Gender") || blood.equals("") || blood.equals("Blood Group") || mobile.equals("") || mobile.equals("Mobile No") || id.equals("") || id.equals("ID") || session.equals("") || session.equals("Session") || dept.equals("") || dept.equals("Department") || prg.equals("") || prg.equals("Program") || email.equals("") || email.equals("Email") || psw.equals("") || psw.equals("Password"))
            JOptionPane.showMessageDialog(this, "All fields are required");
        else if (!(psw.equals(cpsw)))
            JOptionPane.showMessageDialog(this, "Confirm Password not matched");
        else {
            try {
                int found = 0;
                pst = con.prepareStatement("SELECT * FROM stu_info WHERE stu_email=?");
                pst.setString(1, email);
                rs = pst.executeQuery();
                while (rs.next()) {
                    found++;
                }
                if (found > 0) {
                    JOptionPane.showMessageDialog(this, "This Email already registered");
                } else {
                    pst = con.prepareStatement("SELECT * FROM teacher_info WHERE t_email=?");
                    pst.setString(1, email);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        found++;
                    }
                    if (found > 0) {
                        JOptionPane.showMessageDialog(this, "This Email already registered");
                    } else {
                        try {
                            pst = con.prepareStatement("INSERT INTO `stu_info`(`stu_id`, `stu_name`, `stu_gender`, `stu_blood_group`, `stu_mobile_no`, `stu_session`, `stu_department`, `stu_program`, `stu_email`, `stu_password`) VALUES (?,?,?,?,?,?,?,?,?,?)");
                            pst.setString(1, id);
                            pst.setString(2, name);
                            pst.setString(3, gender);
                            pst.setString(4, blood);
                            pst.setString(5, mobile);
                            pst.setString(6, session);
                            pst.setString(7, dept);
                            pst.setString(8, prg);
                            pst.setString(9, email);
                            pst.setString(10, psw);
                            int k = pst.executeUpdate();
                            if (k == 1) {
                                JOptionPane.showMessageDialog(this, "Record added successfully");
                                p3_in_n.setText("Name");
                                p3_in_g.setText("Gender");
                                p3_in_bg.setText("Bloog Group");
                                p3_in_mn.setText("Mobile No");
                                p3_in_id.setText("ID");
                                p3_in_s.setText("Session");
                                p3_in_dept.setText("Department");
                                p3_in_prg.setText("Program");
                                p3_in_e.setText("Email");
                                p3_in_p.setText("Password");
                                p3_in_cp.setText("Confirm Password");
                                p3_in_n.setForeground(new Color(153, 153, 153));
                                p3_in_g.setForeground(new Color(153, 153, 153));
                                p3_in_bg.setForeground(new Color(153, 153, 153));
                                p3_in_mn.setForeground(new Color(153, 153, 153));
                                p3_in_id.setForeground(new Color(153, 153, 153));
                                p3_in_s.setForeground(new Color(153, 153, 153));
                                p3_in_dept.setForeground(new Color(153, 153, 153));
                                p3_in_prg.setForeground(new Color(153, 153, 153));
                                p3_in_e.setForeground(new Color(153, 153, 153));
                                p3_in_p.setForeground(new Color(153, 153, 153));
                                p3_in_cp.setForeground(new Color(153, 153, 153));
                                spa_container.removeAll();
                                spa_container.add(p1_login);
                                spa_container.repaint();
                                spa_container.revalidate();
                            } else {
                                JOptionPane.showMessageDialog(this, "Record added failed");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }//else
                }//else
            } catch (SQLException ex) {
                Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//else
    }//GEN-LAST:event_p3_btn_submitMouseClicked

    private void p3_in_nFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_nFocusGained
        if (p3_in_n.getText().equals("Name")) {
            p3_in_n.setText("");
            p3_in_n.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_n.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_nFocusGained

    private void p3_in_nFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_nFocusLost
        if (p3_in_n.getText().equals("")) {
            p3_in_n.setText("Name");
            p3_in_n.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_nFocusLost

    private void p3_in_gFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_gFocusGained
        if (p3_in_g.getText().equals("Gender")) {
            p3_in_g.setText("");
            p3_in_g.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_g.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_gFocusGained

    private void p3_in_gFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_gFocusLost
        if (p3_in_g.getText().equals("")) {
            p3_in_g.setText("Gender");
            p3_in_g.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_gFocusLost

    private void p3_in_bgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_bgFocusGained
        if (p3_in_bg.getText().equals("Blood Group")) {
            p3_in_bg.setText("");
            p3_in_bg.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_bg.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_bgFocusGained

    private void p3_in_bgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_bgFocusLost
        if (p3_in_bg.getText().equals("")) {
            p3_in_bg.setText("Blood Group");
            p3_in_bg.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_bgFocusLost

    private void p3_in_mnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_mnFocusGained
        if (p3_in_mn.getText().equals("Mobile No")) {
            p3_in_mn.setText("");
            p3_in_mn.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_mn.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_mnFocusGained

    private void p3_in_mnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_mnFocusLost
        if (p3_in_mn.getText().equals("")) {
            p3_in_mn.setText("Mobile No");
            p3_in_mn.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_mnFocusLost

    private void p3_in_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_idFocusGained
        if (p3_in_id.getText().equals("ID")) {
            p3_in_id.setText("");
            p3_in_id.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_id.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_idFocusGained

    private void p3_in_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_idFocusLost
        if (p3_in_id.getText().equals("")) {
            p3_in_id.setText("ID");
            p3_in_id.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_idFocusLost

    private void p3_in_sFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_sFocusGained
        if (p3_in_s.getText().equals("Session")) {
            p3_in_s.setText("");
            p3_in_s.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_s.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_sFocusGained

    private void p3_in_sFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_sFocusLost
        if (p3_in_s.getText().equals("")) {
            p3_in_s.setText("Session");
            p3_in_s.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_sFocusLost

    private void p3_in_deptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_deptFocusGained
        if (p3_in_dept.getText().equals("Department")) {
            p3_in_dept.setText("");
            p3_in_dept.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_dept.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_deptFocusGained

    private void p3_in_deptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_deptFocusLost
        if (p3_in_dept.getText().equals("")) {
            p3_in_dept.setText("Department");
            p3_in_dept.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_deptFocusLost

    private void p3_in_prgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_prgFocusGained
        if (p3_in_prg.getText().equals("Program")) {
            p3_in_prg.setText("");
            p3_in_prg.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_prg.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_prgFocusGained

    private void p3_in_prgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_prgFocusLost
        if (p3_in_prg.getText().equals("")) {
            p3_in_prg.setText("Program");
            p3_in_prg.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_prgFocusLost

    private void p3_in_eFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_eFocusGained
        if (p3_in_e.getText().equals("Email")) {
            p3_in_e.setText("");
            p3_in_e.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_e.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_eFocusGained

    private void p3_in_eFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_eFocusLost
        if (p3_in_e.getText().equals("")) {
            p3_in_e.setText("Email");
            p3_in_e.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_eFocusLost

    private void p3_in_pFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_pFocusGained
        if (p3_in_p.getText().equals("Password")) {
            p3_in_p.setText("");
            p3_in_p.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_p.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_pFocusGained

    private void p3_in_pFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_pFocusLost
        if (p3_in_p.getText().equals("")) {
            p3_in_p.setText("Password");
            p3_in_p.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_pFocusLost

    private void p3_in_cpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_cpFocusGained
        if (p3_in_cp.getText().equals("Confirm Password")) {
            p3_in_cp.setText("");
            p3_in_cp.setForeground(new Color(0, 0, 0));
        } else {
            p3_in_cp.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p3_in_cpFocusGained

    private void p3_in_cpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p3_in_cpFocusLost
        if (p3_in_cp.getText().equals("")) {
            p3_in_cp.setText("Confirm Password");
            p3_in_cp.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p3_in_cpFocusLost

//    ************************************************************

    private void p4_btn_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4_btn_submitMouseClicked
        String name = p4_in_n.getText();
        String gender = p4_in_g.getText();
        String blood = p4_in_bg.getText();
        String mobile = p4_in_mn.getText();
        String dept = p4_in_dept.getText();
        String des = p4_in_d.getText();
        String email = p4_in_e.getText();
        String psw = p4_in_p.getText();
        String cpsw = p4_in_cp.getText();

        if (name.equals("") || name.equals("Name") || gender.equals("") || gender.equals("Gender") || blood.equals("") || blood.equals("Blood Group") || mobile.equals("") || mobile.equals("Mobile No") || dept.equals("") || dept.equals("Department") || des.equals("") || des.equals("Designation") || email.equals("") || email.equals("Email") || psw.equals("") || psw.equals("Password"))
            JOptionPane.showMessageDialog(this, "All fields are required");
        else if (!(psw.equals(cpsw)))
            JOptionPane.showMessageDialog(this, "Confirm Password not matched");
        else {
            try {
                int found = 0;
                pst = con.prepareStatement("SELECT * FROM stu_info WHERE stu_email=?");
                pst.setString(1, email);
                rs = pst.executeQuery();
                while (rs.next()) {
                    found++;
                }
                if (found > 0) {
                    JOptionPane.showMessageDialog(this, "This Email already registered");
                } else {
                    pst = con.prepareStatement("SELECT * FROM teacher_info WHERE t_email=?");
                    pst.setString(1, email);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        found++;
                    }
                    if (found > 0) {
                        JOptionPane.showMessageDialog(this, "This Email already registered");
                    } else {
                        try {
                            pst = con.prepareStatement("INSERT INTO `teacher_info`(`t_name`, `t_gender`, `t_blood_group`, `t_mobile_no`, `t_department`, `t_designation`, `t_email`, `t_password`) VALUES (?,?,?,?,?,?,?,?)");
                            pst.setString(1, name);
                            pst.setString(2, gender);
                            pst.setString(3, blood);
                            pst.setString(4, mobile);
                            pst.setString(5, dept);
                            pst.setString(6, des);
                            pst.setString(7, email);
                            pst.setString(8, psw);
                            int k = pst.executeUpdate();
                            if (k == 1) {
                                JOptionPane.showMessageDialog(this, "Record added successfully");
                                p4_in_n.setText("Name");
                                p4_in_g.setText("Gender");
                                p4_in_bg.setText("Bloog Group");
                                p4_in_mn.setText("Mobile No");
                                p4_in_dept.setText("Department");
                                p4_in_d.setText("Designation");
                                p4_in_e.setText("Email");
                                p4_in_p.setText("Password");
                                p4_in_cp.setText("Confirm Password");
                                p4_in_n.setForeground(new Color(153, 153, 153));
                                p4_in_g.setForeground(new Color(153, 153, 153));
                                p4_in_bg.setForeground(new Color(153, 153, 153));
                                p4_in_mn.setForeground(new Color(153, 153, 153));
                                p4_in_dept.setForeground(new Color(153, 153, 153));
                                p4_in_d.setForeground(new Color(153, 153, 153));
                                p4_in_e.setForeground(new Color(153, 153, 153));
                                p4_in_p.setForeground(new Color(153, 153, 153));
                                p4_in_cp.setForeground(new Color(153, 153, 153));
                                spa_container.removeAll();
                                spa_container.add(p1_login);
                                spa_container.repaint();
                                spa_container.revalidate();
                            } else {
                                JOptionPane.showMessageDialog(this, "Record added failed");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }//else
                }//else
            } catch (SQLException ex) {
                Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//else
    }//GEN-LAST:event_p4_btn_submitMouseClicked

    private void p4_in_nFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_nFocusGained
        if (p4_in_n.getText().equals("Name")) {
            p4_in_n.setText("");
            p4_in_n.setForeground(new Color(0, 0, 0));
        } else {
            p4_in_n.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p4_in_nFocusGained

    private void p4_in_nFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_nFocusLost
        if (p4_in_n.getText().equals("")) {
            p4_in_n.setText("Name");
            p4_in_n.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p4_in_nFocusLost

    private void p4_in_gFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_gFocusGained
        if (p4_in_g.getText().equals("Gender")) {
            p4_in_g.setText("");
            p4_in_g.setForeground(new Color(0, 0, 0));
        } else {
            p4_in_g.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p4_in_gFocusGained

    private void p4_in_gFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_gFocusLost
        if (p4_in_g.getText().equals("")) {
            p4_in_g.setText("Gender");
            p4_in_g.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p4_in_gFocusLost

    private void p4_in_bgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_bgFocusGained
        if (p4_in_bg.getText().equals("Blood Group")) {
            p4_in_bg.setText("");
            p4_in_bg.setForeground(new Color(0, 0, 0));
        } else {
            p4_in_bg.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p4_in_bgFocusGained

    private void p4_in_bgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_bgFocusLost
        if (p4_in_bg.getText().equals("")) {
            p4_in_bg.setText("Blood Group");
            p4_in_bg.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p4_in_bgFocusLost

    private void p4_in_mnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_mnFocusGained
        if (p4_in_mn.getText().equals("Mobile No")) {
            p4_in_mn.setText("");
            p4_in_mn.setForeground(new Color(0, 0, 0));
        } else {
            p4_in_mn.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p4_in_mnFocusGained

    private void p4_in_mnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_mnFocusLost
        if (p4_in_mn.getText().equals("")) {
            p4_in_mn.setText("Mobile No");
            p4_in_mn.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p4_in_mnFocusLost

    private void p4_in_deptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_deptFocusGained
        if (p4_in_dept.getText().equals("Department")) {
            p4_in_dept.setText("");
            p4_in_dept.setForeground(new Color(0, 0, 0));
        } else {
            p4_in_dept.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p4_in_deptFocusGained

    private void p4_in_deptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_deptFocusLost
        if (p4_in_dept.getText().equals("")) {
            p4_in_dept.setText("Department");
            p4_in_dept.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p4_in_deptFocusLost

    private void p4_in_dFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_dFocusGained
        if (p4_in_d.getText().equals("Designation")) {
            p4_in_d.setText("");
            p4_in_d.setForeground(new Color(0, 0, 0));
        } else {
            p4_in_d.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p4_in_dFocusGained

    private void p4_in_dFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_dFocusLost
        if (p4_in_d.getText().equals("")) {
            p4_in_d.setText("Designation");
            p4_in_d.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p4_in_dFocusLost

    private void p4_in_eFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_eFocusGained
        if (p4_in_e.getText().equals("Email")) {
            p4_in_e.setText("");
            p4_in_e.setForeground(new Color(0, 0, 0));
        } else {
            p4_in_e.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p4_in_eFocusGained

    private void p4_in_eFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_eFocusLost
        if (p4_in_e.getText().equals("")) {
            p4_in_e.setText("Email");
            p4_in_e.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p4_in_eFocusLost

    private void p4_in_pFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_pFocusGained
        if (p4_in_p.getText().equals("Password")) {
            p4_in_p.setText("");
            p4_in_p.setForeground(new Color(0, 0, 0));
        } else {
            p4_in_p.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p4_in_pFocusGained

    private void p4_in_pFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_pFocusLost
        if (p4_in_p.getText().equals("")) {
            p4_in_p.setText("Password");
            p4_in_p.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p4_in_pFocusLost

    private void p4_in_cpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_cpFocusGained
        if (p4_in_cp.getText().equals("Confirm Password")) {
            p4_in_cp.setText("");
            p4_in_cp.setForeground(new Color(0, 0, 0));
        } else {
            p4_in_cp.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p4_in_cpFocusGained

    private void p4_in_cpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p4_in_cpFocusLost
        if (p4_in_cp.getText().equals("")) {
            p4_in_cp.setText("Confirm Password");
            p4_in_cp.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p4_in_cpFocusLost

//************************************************************

    private void table_t_course_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_t_course_listMouseClicked
        try {
            DefaultTableModel tblModel = (DefaultTableModel) table_t_course_list.getModel();
            String course_id = tblModel.getValueAt(table_t_course_list.getSelectedRow(), 3).toString();
//        String course_id = tblModel.getValueAt(table_t_course_list.getSelectedRow(), table_t_course_list.getSelectedColumn()).toString();
            pst = con.prepareStatement("SELECT c_id, course_name FROM `course_list` WHERE course_id=?");
            pst.setString(1, course_id);
            rs = pst.executeQuery();
            rs.next();
            p5_t_in_tmp.setText(rs.getString("c_id"));
            p5_t_in_tmp_3_course_name.setText(rs.getString("course_name"));
//            int cid = Integer.parseInt(p5_t_in_tmp.getText());
//            JOptionPane.showMessageDialog(this, cid);
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table_t_course_listMouseClicked

//    ************************************************************
    public void fetch_t_course_list() {
        table_t_course_list.getTableHeader().setFont(new Font("Heebo", Font.PLAIN, 16));
        table_t_course_list.getTableHeader().setOpaque(false);
        table_t_course_list.getTableHeader().setBackground(new Color(24, 75, 113));
        table_t_course_list.getTableHeader().setForeground(new Color(255, 255, 255));
        String sk = p5_t_in_tmp_2.getText();
        try {
            String tid = value_holder_1.getText();
            pst = con.prepareStatement("""
                                       SELECT * FROM course_list WHERE t_id=? AND course_name LIKE ? UNION
                                       SELECT * FROM course_list WHERE t_id=? AND course_code LIKE ? UNION
                                       SELECT * FROM course_list WHERE t_id=? AND course_id LIKE ? UNION
                                       SELECT * FROM course_list WHERE t_id=? AND department LIKE ? UNION
                                       SELECT * FROM course_list WHERE t_id=? AND program LIKE ? UNION
                                       SELECT * FROM course_list WHERE t_id=? AND session LIKE ? ORDER BY course_name ASC""");
            pst.setString(1, tid);
            pst.setString(2, "%" + sk + "%");
            pst.setString(3, tid);
            pst.setString(4, "%" + sk + "%");
            pst.setString(5, tid);
            pst.setString(6, "%" + sk + "%");
            pst.setString(7, tid);
            pst.setString(8, "%" + sk + "%");
            pst.setString(9, tid);
            pst.setString(10, "%" + sk + "%");
            pst.setString(11, tid);
            pst.setString(12, "%" + sk + "%");

            rs = pst.executeQuery();
//            ResultSetMetaData rss = rs.getMetaData();
//            int q = rss.getColumnCount();

            DefaultTableModel df = (DefaultTableModel) table_t_course_list.getModel();
            df.setRowCount(0);
            int i = 0;
            while (rs.next()) {
                df.addRow(new Object[0]);
//                df.setValueAt(false, i, 0);
                df.setValueAt(i + 1, i, 0);
                df.setValueAt(rs.getString("course_name"), i, 1);
                df.setValueAt(rs.getString("course_code"), i, 2);
                df.setValueAt(rs.getString("course_id"), i, 3);
                df.setValueAt(rs.getString("department"), i, 4);
                df.setValueAt(rs.getString("program"), i, 5);
                df.setValueAt(rs.getString("session"), i, 6);

                String c_id = rs.getString("c_id");
                pst2 = con.prepareStatement("SELECT COUNT(stu_id) FROM `stu_foreach_class` WHERE c_id=?");
                pst2.setString(1, c_id);
                rs2 = pst2.executeQuery();
                rs2.next();
                df.setValueAt(rs2.getString("COUNT(stu_id)"), i, 7);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    ************************************************************

    private void p5_t_btn_create_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_t_btn_create_newMouseClicked
        spa_container.removeAll();
        spa_container.add(p6_t_create_new);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p5_t_btn_create_newMouseClicked

    private void p6_t_btn_course_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6_t_btn_course_listMouseClicked
        spa_container.removeAll();
        spa_container.add(p5_t_course_list);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p6_t_btn_course_listMouseClicked

//************************************************************

    private void p6_t_in_cnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_t_in_cnFocusGained
        if (p6_t_in_cn.getText().equals("Course Name")) {
            p6_t_in_cn.setText("");
        }
    }//GEN-LAST:event_p6_t_in_cnFocusGained

    private void p6_t_in_cnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_t_in_cnFocusLost
        if (p6_t_in_cn.getText().equals("")) {
            p6_t_in_cn.setText("Course Name");
        }
    }//GEN-LAST:event_p6_t_in_cnFocusLost

    private void p6_t_in_ccFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_t_in_ccFocusGained
        if (p6_t_in_cc.getText().equals("Course Code")) {
            p6_t_in_cc.setText("");
        }
    }//GEN-LAST:event_p6_t_in_ccFocusGained

    private void p6_t_in_ccFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_t_in_ccFocusLost
        if (p6_t_in_cc.getText().equals("")) {
            p6_t_in_cc.setText("Course Code");
        }
    }//GEN-LAST:event_p6_t_in_ccFocusLost

    private void p6_t_in_dFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_t_in_dFocusGained
        if (p6_t_in_d.getText().equals("Department")) {
            p6_t_in_d.setText("");
        }
    }//GEN-LAST:event_p6_t_in_dFocusGained

    private void p6_t_in_dFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_t_in_dFocusLost
        if (p6_t_in_d.getText().equals("")) {
            p6_t_in_d.setText("Department");
        }
    }//GEN-LAST:event_p6_t_in_dFocusLost

    private void p6_t_in_pFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_t_in_pFocusGained
        if (p6_t_in_p.getText().equals("Program")) {
            p6_t_in_p.setText("");
        }
    }//GEN-LAST:event_p6_t_in_pFocusGained

    private void p6_t_in_pFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_t_in_pFocusLost
        if (p6_t_in_p.getText().equals("")) {
            p6_t_in_p.setText("Program");
        }
    }//GEN-LAST:event_p6_t_in_pFocusLost

    private void p6_t_in_sFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_t_in_sFocusGained
        if (p6_t_in_s.getText().equals("Session")) {
            p6_t_in_s.setText("");
        }
    }//GEN-LAST:event_p6_t_in_sFocusGained

    private void p6_t_in_sFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_t_in_sFocusLost
        if (p6_t_in_s.getText().equals("")) {
            p6_t_in_s.setText("Session");
        }
    }//GEN-LAST:event_p6_t_in_sFocusLost

//************************************************************

    private void p6_t_btn_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6_t_btn_resetMouseClicked
        p6_t_in_cn.setText("Course Name");
        p6_t_in_cc.setText("Course Code");
        p6_t_in_d.setText("Department");
        p6_t_in_p.setText("Program");
        p6_t_in_s.setText("Session");
        spa_container.removeAll();
        spa_container.add(p6_t_create_new);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p6_t_btn_resetMouseClicked

//************************************************************
    static String getAlphaNumericString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // generate a random number between 0 to AlphaNumericString variable length
            int index = (int) (AlphaNumericString.length() * Math.random());
            // add Character one by one in end of sb
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

//************************************************************

    private void p6_t_btn_create_nowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6_t_btn_create_nowMouseClicked
        String cn = p6_t_in_cn.getText();
        String cc = p6_t_in_cc.getText();
        String d = p6_t_in_d.getText();
        String p = p6_t_in_p.getText();
        String s = p6_t_in_s.getText();
        String tid = value_holder_1.getText();
        if (cn.equals("") || cn.equals("Course Name") || cc.equals("") || cc.equals("Course Code") || d.equals("") || d.equals("Department") || p.equals("") || p.equals("Program") || s.equals("") || s.equals("Session"))
            JOptionPane.showMessageDialog(this, "All fields are required");
        else {
            String cid;
            while (true) {
                try {
                    cid = spa.getAlphaNumericString(6);
                    pst = con.prepareStatement("SELECT * FROM `course_list` WHERE course_id=?");
                    pst.setString(1, cid);
                    rs = pst.executeQuery();
                    int total_row = 0;
                    while (rs.next()) {
                        total_row++;
                    }
                    if (total_row == 0) {
                        break;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                }
            } // while

            try {
                pst = con.prepareStatement("INSERT INTO `course_list`(`course_name`, `course_code`, `department`, `program`, `session`, `t_id`, `course_id`) VALUES (?,?,?,?,?,?,?)");
                pst.setString(1, cn);
                pst.setString(2, cc);
                pst.setString(3, d);
                pst.setString(4, p);
                pst.setString(5, s);
                pst.setString(6, tid);
                pst.setString(7, cid);
                int k = pst.executeUpdate();
                if (k == 1) {
                    p6_t_in_cn.setText("Course Name");
                    p6_t_in_cc.setText("Course Code");
                    p6_t_in_d.setText("Department");
                    p6_t_in_p.setText("Program");
                    p6_t_in_s.setText("Session");
                    spa_container.removeAll();
                    spa_container.add(p5_t_course_list);
                    spa_container.repaint();
                    spa_container.revalidate();
                    fetch_t_course_list();
                    JOptionPane.showMessageDialog(this, "Course created successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Course creation failed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
            }
        } // else
    }//GEN-LAST:event_p6_t_btn_create_nowMouseClicked

//************************************************************

    private void p5_t_btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_t_btn_deleteMouseClicked
        String cid = p5_t_in_tmp.getText();
        if (cid.equals("")) {
            JOptionPane.showMessageDialog(this, "No table row is selected.");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure to remove?", "Remove a course", JOptionPane.YES_NO_OPTION);
//          0 means Yes
            if (confirm == 0) {
                try {
                    pst = con.prepareStatement("DELETE FROM `course_list` WHERE c_id=?");
                    pst.setString(1, cid);
                    int r = pst.executeUpdate();
                    if (r == 1) {
//                    JOptionPane.showMessageDialog(this, "Record deleted successfully");
                        p5_t_in_tmp.setText("");
                        fetch_t_course_list();
                    } else {
                        JOptionPane.showMessageDialog(this, "Recored Deletion failed");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }//if(confirm == 0)
        }//else
    }//GEN-LAST:event_p5_t_btn_deleteMouseClicked

    //************************************************************

    private void p5_t_btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_t_btn_refreshMouseClicked
        p5_t_in_tmp.setText("");
        fetch_t_course_list();
    }//GEN-LAST:event_p5_t_btn_refreshMouseClicked

//************************************************************

    private void p5_t_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_t_btn_logoutMouseClicked
        logout();
    }//GEN-LAST:event_p5_t_btn_logoutMouseClicked

    //************************************************************

    private void p5_t_in_search_keyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_search_keyFocusGained
        if (p5_t_in_search_key.getText().equals("Search Here")) {
            p5_t_in_search_key.setText("");
            p5_t_in_search_key.setForeground(new Color(0, 0, 0));
        } else {
            p5_t_in_search_key.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p5_t_in_search_keyFocusGained

    private void p5_t_in_search_keyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_search_keyFocusLost
        if (p5_t_in_search_key.getText().equals("")) {
            p5_t_in_search_key.setText("Search Here");
            p5_t_in_search_key.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p5_t_in_search_keyFocusLost

    //************************************************************

    private void p5_t_in_search_keyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p5_t_in_search_keyKeyReleased
        String sk = p5_t_in_search_key.getText();
        p5_t_in_tmp_2.setText(sk);
        fetch_t_course_list();
    }//GEN-LAST:event_p5_t_in_search_keyKeyReleased

    private void table_s_course_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_s_course_listMouseClicked
        try {
            DefaultTableModel tblModel = (DefaultTableModel) table_s_course_list.getModel();
            String course_id = tblModel.getValueAt(table_s_course_list.getSelectedRow(), 3).toString();
//        String course_id = tblModel.getValueAt(table_t_course_list.getSelectedRow(), table_t_course_list.getSelectedColumn()).toString();
            pst = con.prepareStatement("SELECT c_id, course_name FROM `course_list` WHERE course_id=?");
            pst.setString(1, course_id);
            rs = pst.executeQuery();
            rs.next();
            p5_s_in_tmp.setText(rs.getString("c_id"));
            p5_s_in_tmp_3_course_name.setText(rs.getString("course_name"));
//            int cid = Integer.parseInt(p5_t_in_tmp.getText());
//            JOptionPane.showMessageDialog(this, cid);
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table_s_course_listMouseClicked

    private void p5_s_in_search_keyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_s_in_search_keyFocusGained
        if (p5_s_in_search_key.getText().equals("Search Here")) {
            p5_s_in_search_key.setText("");
            p5_s_in_search_key.setForeground(new Color(0, 0, 0));
        } else {
            p5_s_in_search_key.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p5_s_in_search_keyFocusGained

    private void p5_s_in_search_keyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_s_in_search_keyFocusLost
        if (p5_s_in_search_key.getText().equals("")) {
            p5_s_in_search_key.setText("Search Here");
            p5_s_in_search_key.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p5_s_in_search_keyFocusLost

    private void p5_s_in_search_keyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p5_s_in_search_keyKeyReleased
        String sk = p5_s_in_search_key.getText();
        p5_s_in_tmp_2.setText(sk);
        fetch_s_course_list();
    }//GEN-LAST:event_p5_s_in_search_keyKeyReleased

    //************************************************************

    private void p5_s_btn_unenrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_s_btn_unenrollMouseClicked
        String sid = value_holder_1.getText();
        String cid = p5_s_in_tmp.getText();
        if (cid.equals("")) {
            JOptionPane.showMessageDialog(this, "No table row is selected.");
        } else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure to unenroll this course?", "Unroll a course", JOptionPane.YES_NO_OPTION);
//          0 means Yes
            if (confirm == 0) {
                try {
                    pst = con.prepareStatement("DELETE FROM `stu_foreach_class` WHERE stu_id=? AND c_id=?");
                    pst.setString(1, sid);
                    pst.setString(2, cid);
                    int r = pst.executeUpdate();
                    if (r == 1) {
//                    JOptionPane.showMessageDialog(this, "Course Unenrolled successfully");
                        p5_s_in_tmp.setText("");
                        fetch_s_course_list();
                    } else {
                        JOptionPane.showMessageDialog(this, "Course Unenrolled failed");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                }
            } // if(confirm == 0)
        }//else
    }//GEN-LAST:event_p5_s_btn_unenrollMouseClicked

//************************************************************

    private void p6_s_btn_course_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6_s_btn_course_listMouseClicked
        spa_container.removeAll();
        spa_container.add(p5_s_course_list);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p6_s_btn_course_listMouseClicked

//************************************************************

    private void p5_s_btn_enroll_nowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_s_btn_enroll_nowMouseClicked
        spa_container.removeAll();
        spa_container.add(p6_s_enroll_new);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p5_s_btn_enroll_nowMouseClicked

    //************************************************************
    public void fetch_s_course_list() {
        table_s_course_list.getTableHeader().setFont(new Font("Heebo", Font.PLAIN, 16));
        table_s_course_list.getTableHeader().setOpaque(false);
        table_s_course_list.getTableHeader().setBackground(new Color(24, 75, 113));
        table_s_course_list.getTableHeader().setForeground(new Color(255, 255, 255));
        String sk = p5_s_in_tmp_2.getText();
        try {
            String sid = value_holder_1.getText();
            pst = con.prepareStatement("""
                                       SELECT * FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id JOIN course_list c on c.c_id=a.c_id WHERE a.stu_id=? AND course_name LIKE ? UNION
                                       SELECT * FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id JOIN course_list c on c.c_id=a.c_id WHERE a.stu_id=? AND course_code LIKE ? UNION
                                       SELECT * FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id JOIN course_list c on c.c_id=a.c_id WHERE a.stu_id=? AND course_id LIKE ? UNION
                                       SELECT * FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id JOIN course_list c on c.c_id=a.c_id WHERE a.stu_id=? AND department LIKE ? UNION
                                       SELECT * FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id JOIN course_list c on c.c_id=a.c_id WHERE a.stu_id=? AND program LIKE ? UNION
                                       SELECT * FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id JOIN course_list c on c.c_id=a.c_id WHERE a.stu_id=? AND session LIKE ? ORDER BY course_name ASC""");
            pst.setString(1, sid);
            pst.setString(2, "%" + sk + "%");
            pst.setString(3, sid);
            pst.setString(4, "%" + sk + "%");
            pst.setString(5, sid);
            pst.setString(6, "%" + sk + "%");
            pst.setString(7, sid);
            pst.setString(8, "%" + sk + "%");
            pst.setString(9, sid);
            pst.setString(10, "%" + sk + "%");
            pst.setString(11, sid);
            pst.setString(12, "%" + sk + "%");

            rs = pst.executeQuery();

            DefaultTableModel df = (DefaultTableModel) table_s_course_list.getModel();
            df.setRowCount(0);
            int i = 0;
            while (rs.next()) {
                df.addRow(new Object[0]);
//                df.setValueAt(false, i, 0);
                df.setValueAt(i + 1, i, 0);
                df.setValueAt(rs.getString("course_name"), i, 1);
                df.setValueAt(rs.getString("course_code"), i, 2);
                df.setValueAt(rs.getString("course_id"), i, 3);
                df.setValueAt(rs.getString("department"), i, 4);
                df.setValueAt(rs.getString("program"), i, 5);
                df.setValueAt(rs.getString("session"), i, 6);

                String c_id = rs.getString("c_id");
                pst2 = con.prepareStatement("SELECT COUNT(stu_id) FROM `stu_foreach_class` WHERE c_id=?");
                pst2.setString(1, c_id);
                rs2 = pst2.executeQuery();
                rs2.next();
                df.setValueAt(rs2.getString("COUNT(stu_id)"), i, 7);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //************************************************************

    private void p5_s_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_s_btn_logoutMouseClicked
        logout();
    }//GEN-LAST:event_p5_s_btn_logoutMouseClicked

    //************************************************************

    private void p5_s_btn_refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_s_btn_refreshMouseClicked
        p5_s_in_tmp.setText("");
        fetch_s_course_list();
    }//GEN-LAST:event_p5_s_btn_refreshMouseClicked

    private void p6_s_in_course_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_s_in_course_idFocusGained
        if (p6_s_in_course_id.getText().equals("Course ID")) {
            p6_s_in_course_id.setText("");
        }
    }//GEN-LAST:event_p6_s_in_course_idFocusGained

    private void p6_s_in_course_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p6_s_in_course_idFocusLost
        if (p6_s_in_course_id.getText().equals("")) {
            p6_s_in_course_id.setText("Course ID");
        }
    }//GEN-LAST:event_p6_s_in_course_idFocusLost

    private void p6_s_btn_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6_s_btn_resetMouseClicked
        p6_s_in_course_id.setText("Course ID");
        spa_container.removeAll();
        spa_container.add(p6_s_enroll_new);
        spa_container.repaint();
        spa_container.revalidate();
    }//GEN-LAST:event_p6_s_btn_resetMouseClicked

    private void p1_in_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1_in_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1_in_emailActionPerformed

    private void p1_in_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p1_in_passwordFocusGained
        String psw = new String(p1_in_password.getPassword());
        if (psw.equals("Password")) {
            p1_in_password.setText("");
            p1_in_password.setForeground(new Color(0, 0, 0));
        } else {
            p1_in_password.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p1_in_passwordFocusGained

    private void p1_in_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p1_in_passwordFocusLost
        String psw = new String(p1_in_password.getPassword());
        if (psw.equals("")) {
            p1_in_password.setText("Password");
            p1_in_password.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p1_in_passwordFocusLost

//************************************************************

    private void p6_s_btn_enrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6_s_btn_enrollMouseClicked
        String sid = value_holder_1.getText();
        String course_id = p6_s_in_course_id.getText();
        if (course_id.equals("") || course_id.equals("Course ID"))
            JOptionPane.showMessageDialog(this, "Input field is required");
        else {
            int found = 0;
            try {
                pst = con.prepareStatement("SELECT * FROM `course_list` WHERE course_id=?");
                pst.setString(1, course_id);
                rs = pst.executeQuery();
                String cid = "";
                while (rs.next()) {
                    found++;
                    cid = rs.getString("c_id");
                }
                if (found == 0) {
                    JOptionPane.showMessageDialog(this, "Invalid Course ID");
                } else {
                    found = 0;
                    pst = con.prepareStatement("SELECT * FROM `stu_foreach_class` WHERE stu_id=? AND c_id=(SELECT c_id FROM course_list WHERE course_id=?)");
                    pst.setString(1, sid);
                    pst.setString(2, course_id);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        found++;
                    }
                    if (found > 0) {
                        JOptionPane.showMessageDialog(this, "You are already enrolled here.");
                    } else {
                        try {
                            pst = con.prepareStatement("INSERT INTO `stu_foreach_class`( `stu_id`, `c_id`) VALUES (?,?)");
                            pst.setString(1, sid);
                            pst.setString(2, cid);
                            int r = pst.executeUpdate();
                            if (r == 1) {
                                p6_s_in_course_id.setText("Course ID");
                                spa_container.removeAll();
                                spa_container.add(p5_s_course_list);
                                spa_container.repaint();
                                spa_container.revalidate();
                                fetch_s_course_list();
                                JOptionPane.showMessageDialog(this, "Course enrolled successfully");
                            } else {
                                JOptionPane.showMessageDialog(this, "Course enrolled failed");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }//else
                }//else
            } catch (SQLException ex) {
                Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//else
    }//GEN-LAST:event_p6_s_btn_enrollMouseClicked

    private void p7_t_table_all_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_t_table_all_recordMouseClicked

    }//GEN-LAST:event_p7_t_table_all_recordMouseClicked

    private void p7_t_in_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p7_t_in_searchFocusGained
        if (p7_t_in_search.getText().equals("Search Here")) {
            p7_t_in_search.setText("");
        }
    }//GEN-LAST:event_p7_t_in_searchFocusGained

    private void p7_t_in_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p7_t_in_searchFocusLost
        if (p7_t_in_search.getText().equals("")) {
            p7_t_in_search.setText("Search Here");
        }
    }//GEN-LAST:event_p7_t_in_searchFocusLost

    //************************************************************

    private void p5_t_btn_openMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_t_btn_openMouseClicked
        String check_cid = p5_t_in_tmp.getText();
        if (check_cid.equals("")) {
            JOptionPane.showMessageDialog(this, "No table row is selected.");
        } else {
            spa_container.removeAll();
            spa_container.add(p7_t_all_record);
            spa_container.repaint();
            spa_container.revalidate();
            String cname = p5_t_in_tmp_3_course_name.getText();
            p7_t_label_course_name.setText(cname);
            p8_t_label_course_name.setText(cname);
            p9_t_label_course_name.setText(cname);
            fetch_t_all_record_attendance();
        }

    }//GEN-LAST:event_p5_t_btn_openMouseClicked

//************************************************************

    private void p7_t_back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_t_back_btnMouseClicked
        t_btn_back();
    }//GEN-LAST:event_p7_t_back_btnMouseClicked

//************************************************************

    private void p7_t_in_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p7_t_in_searchKeyReleased
        fetch_t_all_record_attendance();
    }//GEN-LAST:event_p7_t_in_searchKeyReleased

    //************************************************************
    public void fetch_t_all_record_attendance() {
        try {
            String sk = p7_t_in_search.getText();
            if (sk.equals("Search Here")) {
                sk = "";
            }
//        JOptionPane.showMessageDialog(this, sk);
            int cid = Integer.parseInt(p5_t_in_tmp.getText());
//            Get stu_id, stu_name of this course
            pst = con.prepareStatement("""
                                      SELECT a.stu_id, stu_name FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id WHERE c_id=? AND a.stu_id LIKE ? UNION
                                        SELECT a.stu_id, stu_name FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id WHERE c_id=? AND stu_name LIKE ? ORDER BY stu_id ASC""");
            pst.setInt(1, cid);
            pst.setString(2, "%" + sk + "%");
            pst.setInt(3, cid);
            pst.setString(4, "%" + sk + "%");
            rs = pst.executeQuery();

            DefaultTableModel df = (DefaultTableModel) p7_t_table_all_record.getModel();
            df.setRowCount(0);
            int i = 0;
            while (rs.next()) {
                String sid = rs.getString("stu_id");
                df.addRow(new Object[0]);
                df.setValueAt(i + 1, i, 0);
                df.setValueAt(sid, i, 1);
                df.setValueAt(rs.getString("stu_name"), i, 2);

//              Calculate total present of a student
                pst2 = con.prepareStatement("SELECT COUNT(stu_id) FROM `stu_foreach_attendance_form` a JOIN attendance_form b ON a.af_id=b.af_id JOIN course_list c ON b.c_id=c.c_id WHERE c.c_id=? AND stu_id=? AND status=1");
                pst2.setInt(1, cid);
                pst2.setString(2, sid);
                rs2 = pst2.executeQuery();
                rs2.next();
                int present1 = Integer.parseInt(rs2.getString("COUNT(stu_id)"));
                
                pst2 = con.prepareStatement("SELECT COUNT(stu_id) FROM `stu_foreach_attendance_form` a JOIN attendance_form b ON a.af_id=b.af_id JOIN course_list c ON b.c_id=c.c_id WHERE c.c_id=? AND stu_id=? AND status=2");
                pst2.setInt(1, cid);
                pst2.setString(2, sid);
                rs2 = pst2.executeQuery();
                rs2.next();
                int late = Integer.parseInt(rs2.getString("COUNT(stu_id)"));

                int present = present1+late;
                
//              Calculate total class of this course
                pst3 = con.prepareStatement("SELECT COUNT(af_id) FROM `attendance_form` WHERE c_id=?");
                pst3.setInt(1, cid);
                rs3 = pst3.executeQuery();
                rs3.next();
                int total_class = Integer.parseInt(rs3.getString("COUNT(af_id)"));

                df.setValueAt(present + "/" + total_class, i, 3);
                df.setValueAt(late, i, 4);

//              Calculate percentage
                float percent = percent(present, total_class);
                df.setValueAt(percent + "%", i, 5);
                df.setValueAt(mark(percent, late), i, 6);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//************************************************************

    public void fetch_s_all_record_attendance() {
        try {
            String sk = p7_s_in_search.getText();
            if (sk.equals("Search Here")) {
                sk = "";
            }
//        JOptionPane.showMessageDialog(this, sk);
            int cid = Integer.parseInt(p5_s_in_tmp.getText());
//            Get stu_id, stu_name of this course
            pst = con.prepareStatement("""
                                      SELECT a.stu_id, stu_name FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id WHERE c_id=? AND a.stu_id LIKE ? UNION
                                        SELECT a.stu_id, stu_name FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id WHERE c_id=? AND stu_name LIKE ? ORDER BY stu_id ASC""");
            pst.setInt(1, cid);
            pst.setString(2, "%" + sk + "%");
            pst.setInt(3, cid);
            pst.setString(4, "%" + sk + "%");
            rs = pst.executeQuery();

            DefaultTableModel df = (DefaultTableModel) p7_s_table_all_record.getModel();
            df.setRowCount(0);
            int i = 0;
            while (rs.next()) {
                String sid = rs.getString("stu_id");
                df.addRow(new Object[0]);
                df.setValueAt(i + 1, i, 0);
                df.setValueAt(sid, i, 1);
                df.setValueAt(rs.getString("stu_name"), i, 2);

//              Calculate total present of a student
                pst2 = con.prepareStatement("SELECT COUNT(stu_id) FROM `stu_foreach_attendance_form` a JOIN attendance_form b ON a.af_id=b.af_id JOIN course_list c ON b.c_id=c.c_id WHERE c.c_id=? AND stu_id=? and status=1");
                pst2.setInt(1, cid);
                pst2.setString(2, sid);
                rs2 = pst2.executeQuery();
                rs2.next();
                int present1 = Integer.parseInt(rs2.getString("COUNT(stu_id)"));
                
                pst2 = con.prepareStatement("SELECT COUNT(stu_id) FROM `stu_foreach_attendance_form` a JOIN attendance_form b ON a.af_id=b.af_id JOIN course_list c ON b.c_id=c.c_id WHERE c.c_id=? AND stu_id=? AND status=2");
                pst2.setInt(1, cid);
                pst2.setString(2, sid);
                rs2 = pst2.executeQuery();
                rs2.next();
                int late = Integer.parseInt(rs2.getString("COUNT(stu_id)"));

                int present = present1+late;
                
//              Calculate total class of this course
                pst3 = con.prepareStatement("SELECT COUNT(af_id) FROM `attendance_form` WHERE c_id=?");
                pst3.setInt(1, cid);
                rs3 = pst3.executeQuery();
                rs3.next();
                int total_class = Integer.parseInt(rs3.getString("COUNT(af_id)"));

                df.setValueAt(present + "/" + total_class, i, 3);
                df.setValueAt(late, i, 4);

//              Calculate percentage
                float percent = percent(present, total_class);
                df.setValueAt(percent + "%", i, 5);
                df.setValueAt(mark(percent, late), i, 6);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//************************************************************

    public float percent(float a, float b) {
        float c = ((a / b) * 100);
        BigDecimal bd = new BigDecimal(Float.toString(c));
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }

    public int mark(float percent, int late) {
        if (percent >= 90) {
            return 30;
        } else {
            return (int) Math.ceil(((percent * 30) / 90) - (late * 0.5));
        }
    }
//************************************************************

    private void p7_t_btn_single_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_t_btn_single_recordMouseClicked
        spa_container.removeAll();
        spa_container.add(p8_t_single_record);
        spa_container.repaint();
        spa_container.revalidate();
        p8_t_fetch_select_box_opt();
        p8_t_fetch_table_of_single_record();
    }//GEN-LAST:event_p7_t_btn_single_recordMouseClicked

    private void p7_t_btn_attendance_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_t_btn_attendance_formMouseClicked
        spa_container.removeAll();
        spa_container.add(p9_t_attendance_form);
        spa_container.repaint();
        spa_container.revalidate();
        p9_t_fetch_table_of_attendance_form();
    }//GEN-LAST:event_p7_t_btn_attendance_formMouseClicked

    private void p8_t_btn_attendance_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_t_btn_attendance_formMouseClicked
        spa_container.removeAll();
        spa_container.add(p9_t_attendance_form);
        spa_container.repaint();
        spa_container.revalidate();
        p9_t_fetch_table_of_attendance_form();
    }//GEN-LAST:event_p8_t_btn_attendance_formMouseClicked

    private void p8_t_btn_all_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_t_btn_all_recordMouseClicked
        spa_container.removeAll();
        spa_container.add(p7_t_all_record);
        spa_container.repaint();
        spa_container.revalidate();
        fetch_t_all_record_attendance();
    }//GEN-LAST:event_p8_t_btn_all_recordMouseClicked

    private void p9_t_btn_all_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_t_btn_all_recordMouseClicked
        spa_container.removeAll();
        spa_container.add(p7_t_all_record);
        spa_container.repaint();
        spa_container.revalidate();
        fetch_t_all_record_attendance();
    }//GEN-LAST:event_p9_t_btn_all_recordMouseClicked

    private void p9_t_btn_single_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_t_btn_single_recordMouseClicked
        spa_container.removeAll();
        spa_container.add(p8_t_single_record);
        spa_container.repaint();
        spa_container.revalidate();
        p8_t_fetch_select_box_opt();
        p8_t_fetch_table_of_single_record();
    }//GEN-LAST:event_p9_t_btn_single_recordMouseClicked

    private void p9_t_in_form_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_t_in_form_nameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p9_t_in_form_nameMouseClicked

    private void p9_t_in_form_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p9_t_in_form_nameFocusGained
        if (p9_t_in_form_name.getText().equals("Form Name")) {
            p9_t_in_form_name.setText("");
            p9_t_in_form_name.setForeground(new Color(0, 0, 0));
        } else {
            p9_t_in_form_name.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_p9_t_in_form_nameFocusGained

    private void p9_t_in_form_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p9_t_in_form_nameFocusLost
        if (p9_t_in_form_name.getText().equals("")) {
            p9_t_in_form_name.setText("Form Name");
            p9_t_in_form_name.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_p9_t_in_form_nameFocusLost

    private void p9_t_btn_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_t_btn_createMouseClicked
        String fname = p9_t_in_form_name.getText();
        if (fname.equals(""))
            JOptionPane.showMessageDialog(this, "Form name field is required.");
        else {
            try {
                int found = 0;
                int cid = Integer.parseInt(p5_t_in_tmp.getText());
                pst = con.prepareStatement("SELECT * FROM `attendance_form` WHERE af_name=? AND c_id=?");
                pst.setString(1, fname);
                pst.setInt(2, cid);
                rs = pst.executeQuery();
                while (rs.next()) {
                    found++;
                }
                if (found > 0) {
                    JOptionPane.showMessageDialog(this, "This form name cann't be duplicated.");
                } else {
                    pst = con.prepareStatement("INSERT INTO `attendance_form`(`af_name`, `c_id`) VALUES (?,?)");
                    pst.setString(1, fname);
                    pst.setInt(2, cid);
                    int k = pst.executeUpdate();
                    if (k == 1) {
                        pst = con.prepareStatement("SELECT * FROM `attendance_form` WHERE af_name=? AND c_id=?");
                        pst.setString(1, fname);
                        pst.setInt(2, cid);
                        rs = pst.executeQuery();
                        rs.next();
                        String af_id = rs.getString("af_id");

                        pst = con.prepareStatement("SELECT * FROM `stu_foreach_class` WHERE c_id=?");
                        pst.setInt(1, cid);
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            String sid = rs.getString("stu_id");
                            pst2 = con.prepareStatement("INSERT INTO `stu_foreach_attendance_form`(`af_id`, `stu_id`) VALUES (?,?)");
                            pst2.setString(1, af_id);
                            pst2.setString(2, sid);
                            pst2.executeUpdate();
                        }//while

                        p9_t_in_form_name.setText("Form Name");
                        p9_t_in_form_name.setForeground(new Color(153, 153, 153));
                        p9_t_fetch_table_of_attendance_form();
                        JOptionPane.showMessageDialog(this, "Record added successfully");

                    } else {
                        JOptionPane.showMessageDialog(this, "Record added failed");
                    }
                } // else
            } catch (SQLException ex) {
                Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//else
    }//GEN-LAST:event_p9_t_btn_createMouseClicked

//************************************************************

    private void p8_t_back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_t_back_btnMouseClicked
        t_btn_back();
    }//GEN-LAST:event_p8_t_back_btnMouseClicked

    private void p9_t_back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_t_back_btnMouseClicked
        t_btn_back();
    }//GEN-LAST:event_p9_t_back_btnMouseClicked

    private void p5_btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_btn_editMouseClicked
        String check_cid = p5_t_in_tmp.getText();
        if (check_cid.equals("")) {
            JOptionPane.showMessageDialog(this, "No table row is selected.");
        } else {
            try {
                p5_t_modal_edit_c_details.setVisible(true);
                int cid = Integer.parseInt(p5_t_in_tmp.getText());
                pst = con.prepareStatement("SELECT * FROM `course_list` WHERE c_id=?");
                pst.setInt(1, cid);
                rs = pst.executeQuery();
                rs.next();
                String cn = rs.getString("course_name");
                String cc = rs.getString("course_code");
                String d = rs.getString("department");
                String p = rs.getString("program");
                String s = rs.getString("session");

                p5_t_in_cn.setText(cn);
                p5_t_in_cc.setText(cc);
                p5_t_in_d.setText(d);
                p5_t_in_p.setText(p);
                p5_t_in_s.setText(s);

            } catch (SQLException ex) {
                Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//else
    }//GEN-LAST:event_p5_btn_editMouseClicked

    private void p5_t_in_cnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_cnFocusGained
        if (p5_t_in_cn.getText().equals("Course Name")) {
            p5_t_in_cn.setText("");
        }
    }//GEN-LAST:event_p5_t_in_cnFocusGained

    private void p5_t_in_cnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_cnFocusLost
        if (p5_t_in_cn.getText().equals("")) {
            p5_t_in_cn.setText("Course Name");
        }
    }//GEN-LAST:event_p5_t_in_cnFocusLost

    private void p5_t_in_ccFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_ccFocusGained
        if (p5_t_in_cc.getText().equals("Course Code")) {
            p5_t_in_cc.setText("");
        }
    }//GEN-LAST:event_p5_t_in_ccFocusGained

    private void p5_t_in_ccFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_ccFocusLost
        if (p5_t_in_cc.getText().equals("")) {
            p5_t_in_cc.setText("Course Code");
        }
    }//GEN-LAST:event_p5_t_in_ccFocusLost

    private void p5_t_in_dFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_dFocusGained
        if (p5_t_in_d.getText().equals("Department")) {
            p5_t_in_d.setText("");
        }
    }//GEN-LAST:event_p5_t_in_dFocusGained

    private void p5_t_in_dFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_dFocusLost
        if (p5_t_in_d.getText().equals("")) {
            p5_t_in_d.setText("Department");
        }
    }//GEN-LAST:event_p5_t_in_dFocusLost

    private void p5_t_in_pFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_pFocusGained
        if (p5_t_in_p.getText().equals("Program")) {
            p5_t_in_p.setText("");
        }
    }//GEN-LAST:event_p5_t_in_pFocusGained

    private void p5_t_in_pFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_pFocusLost
        if (p5_t_in_p.getText().equals("")) {
            p5_t_in_p.setText("Program");
        }
    }//GEN-LAST:event_p5_t_in_pFocusLost

    private void p5_t_in_sFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_sFocusGained
        if (p5_t_in_s.getText().equals("Session")) {
            p5_t_in_s.setText("");
        }
    }//GEN-LAST:event_p5_t_in_sFocusGained

    private void p5_t_in_sFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p5_t_in_sFocusLost
        if (p5_t_in_s.getText().equals("")) {
            p5_t_in_s.setText("Session");
        }
    }//GEN-LAST:event_p5_t_in_sFocusLost

    private void p5_t_btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_t_btn_cancelMouseClicked
        p5_t_modal_edit_c_details.setVisible(false);
    }//GEN-LAST:event_p5_t_btn_cancelMouseClicked

    private void p5_t_btn_update_nowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_t_btn_update_nowMouseClicked
        try {
            int cid = Integer.parseInt(p5_t_in_tmp.getText());
            String cn = p5_t_in_cn.getText();
            String cc = p5_t_in_cc.getText();
            String d = p5_t_in_d.getText();
            String p = p5_t_in_p.getText();
            String s = p5_t_in_s.getText();

            pst = con.prepareStatement("UPDATE `course_list` SET `course_name`=?,`course_code`=?,`department`=?,`program`=?,`session`=? WHERE c_id=?");
            pst.setString(1, cn);
            pst.setString(2, cc);
            pst.setString(3, d);
            pst.setString(4, p);
            pst.setString(5, s);
            pst.setInt(6, cid);
            int k = pst.executeUpdate();
            if (k == 1) {
                p5_t_in_cn.setText("");
                p5_t_in_cc.setText("");
                p5_t_in_d.setText("");
                p5_t_in_p.setText("");
                p5_t_in_s.setText("");
                p5_t_modal_edit_c_details.setVisible(false);
                fetch_t_course_list();
                JOptionPane.showMessageDialog(this, "Record Updated Successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Record Updation Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_p5_t_btn_update_nowMouseClicked

//************************************************************
    public void p8_t_fetch_select_box_opt() {
        try {
            int cid = Integer.parseInt(p5_t_in_tmp.getText());
            pst = con.prepareStatement("SELECT * FROM `attendance_form` WHERE c_id=? ORDER BY af_id DESC");
            pst.setInt(1, cid);
            rs = pst.executeQuery();
            p8_t_select_box.removeAllItems();
            while (rs.next()) {
                p8_t_select_box.addItem(rs.getString("af_name"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //************************************************************
    public void p8_s_fetch_select_box_opt() {
        try {
            int cid = Integer.parseInt(p5_s_in_tmp.getText());
            pst = con.prepareStatement("SELECT * FROM `attendance_form` WHERE c_id=? ORDER BY af_id DESC");
            pst.setInt(1, cid);
            rs = pst.executeQuery();
            p8_s_select_box.removeAllItems();
            while (rs.next()) {
                p8_s_select_box.addItem(rs.getString("af_name"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //************************************************************
    public void p8_t_fetch_table_of_single_record() {
        try {
            int cid = Integer.parseInt(p5_t_in_tmp.getText());
            String af_name = p8_t_select_box.getSelectedItem().toString();
            p8_t_label_title.setText(af_name);

            pst = con.prepareStatement("SELECT * FROM `attendance_form` WHERE af_name=? AND c_id=?");
            pst.setString(1, af_name);
            pst.setInt(2, cid);
            rs = pst.executeQuery();
            rs.next();
            String af_id = rs.getString("af_id");
            p8_t_in_tmp_af_id.setText(af_id);

            pst = con.prepareStatement("SELECT * FROM `stu_foreach_attendance_form` a JOIN stu_info b ON a.stu_id=b.stu_id WHERE af_id=? ORDER BY a.stu_id ASC");
            pst.setString(1, af_id);
            rs = pst.executeQuery();
            DefaultTableModel df = (DefaultTableModel) p8_t_table_single_record.getModel();
            df.setRowCount(0);
            int i = 0;
            while (rs.next()) {
                df.addRow(new Object[0]);
                df.setValueAt(i + 1, i, 0);
                df.setValueAt(rs.getString("stu_id"), i, 1);
                df.setValueAt(rs.getString("stu_name"), i, 2);
                if (Integer.parseInt(rs.getString("status")) == 2) {
                    df.setValueAt("Late", i, 3);
                    df.setValueAt(false, i, 4);
                    df.setValueAt(true, i, 5);
                } else if (Integer.parseInt(rs.getString("status")) == 1) {
                    df.setValueAt("Present", i, 3);
                    df.setValueAt(true, i, 4);
                    df.setValueAt(false, i, 5);
                } else {
                    df.setValueAt("A", i, 3);
                    df.setValueAt(false, i, 4);
                    df.setValueAt(false, i, 5);
                }
                i++;

            }//while
        } catch (SQLException ex) {
            Logger.getLogger(spa.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

//************************************************************
    public void p8_s_fetch_table_of_single_record() {
        try {
            int cid = Integer.parseInt(p5_s_in_tmp.getText());
            String af_name = p8_s_select_box.getSelectedItem().toString();
            p8_s_label_title.setText(af_name);

            pst = con.prepareStatement("SELECT * FROM `attendance_form` WHERE af_name=? AND c_id=?");
            pst.setString(1, af_name);
            pst.setInt(2, cid);
            rs = pst.executeQuery();
            rs.next();
            String af_id = rs.getString("af_id");
            p8_s_in_tmp_af_id.setText(af_id);

            pst = con.prepareStatement("SELECT * FROM `stu_foreach_attendance_form` a JOIN stu_info b ON a.stu_id=b.stu_id WHERE af_id=? ORDER BY a.stu_id ASC");
            pst.setString(1, af_id);
            rs = pst.executeQuery();
            DefaultTableModel df = (DefaultTableModel) p8_s_table_single_record.getModel();
            df.setRowCount(0);
            int i = 0;
            while (rs.next()) {
                df.addRow(new Object[0]);
                df.setValueAt(i + 1, i, 0);
                df.setValueAt(rs.getString("stu_id"), i, 1);
                df.setValueAt(rs.getString("stu_name"), i, 2);
                if (Integer.parseInt(rs.getString("status")) == 2) {
                    df.setValueAt("Late", i, 3);
                } else if (Integer.parseInt(rs.getString("status")) == 1) {
                    df.setValueAt("Present", i, 3);
                } else {
                    df.setValueAt("A", i, 3);
                }
                i++;

            }//while
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //************************************************************

    private void p8_t_btn_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_t_btn_showMouseClicked
        p8_t_fetch_table_of_single_record();
    }//GEN-LAST:event_p8_t_btn_showMouseClicked

//************************************************************

    private void p8_t_btn_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_t_btn_submitMouseClicked
//        int confirm = JOptionPane.showConfirmDialog(this, "You can't edit after submission. Are you sure to submit?", "Attendance Form Submission", JOptionPane.YES_NO_OPTION);
//          0 means Yes
//            if (confirm == 0) {
        for (int i = 0; i < p8_t_table_single_record.getRowCount(); i++) {

            Boolean checked_late = Boolean.valueOf(p8_t_table_single_record.getValueAt(i, 5).toString());
            String sid = p8_t_table_single_record.getValueAt(i, 1).toString();
            if (checked_late) {
                try {
                    String af_id = p8_t_in_tmp_af_id.getText();
                    pst = con.prepareStatement("UPDATE `stu_foreach_attendance_form` SET `status`=2 WHERE af_id=? AND stu_id=?");
                    pst.setString(1, af_id);
                    pst.setString(2, sid);
                    pst.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                Boolean checked = Boolean.valueOf(p8_t_table_single_record.getValueAt(i, 4).toString());
                if (checked) {
                    try {
                        String af_id = p8_t_in_tmp_af_id.getText();
                        pst = con.prepareStatement("UPDATE `stu_foreach_attendance_form` SET `status`=1 WHERE af_id=? AND stu_id=?");
                        pst.setString(1, af_id);
                        pst.setString(2, sid);
                        pst.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        String af_id = p8_t_in_tmp_af_id.getText();
                        pst = con.prepareStatement("UPDATE `stu_foreach_attendance_form` SET `status`=0 WHERE af_id=? AND stu_id=?");
                        pst.setString(1, af_id);
                        pst.setString(2, sid);
                        pst.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }//else <-- if (checked)
            }//else <--  // if (checked_late)
//            

        }//for
        p8_t_fetch_table_of_single_record();
        JOptionPane.showMessageDialog(this, "Record Submitted Successfully");
//        try {
//            String af_id = p8_t_in_tmp_af_id.getText();
//            pst = con.prepareStatement("UPDATE `attendance_form` SET `submit`=1 WHERE af_id=?");
//            pst.setString(1, af_id);
//            pst.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            }//if
    }//GEN-LAST:event_p8_t_btn_submitMouseClicked

//************************************************************

    private void p8_t_btn_set_to_all_presentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_t_btn_set_to_all_presentMouseClicked
        DefaultTableModel df = (DefaultTableModel) p8_t_table_single_record.getModel();
//            df.setRowCount(0);            
        for (int i = 0; i < p8_t_table_single_record.getRowCount(); i++) {
            df.setValueAt(true, i, 4);
        }
    }//GEN-LAST:event_p8_t_btn_set_to_all_presentMouseClicked

//************************************************************

    private void p9_t_table_attendance_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_t_table_attendance_formMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel) p9_t_table_attendance_form.getModel();
        String af_name = tblModel.getValueAt(p9_t_table_attendance_form.getSelectedRow(), 1).toString();
        p9_t_in_tmp_af_name.setText(af_name);
    }//GEN-LAST:event_p9_t_table_attendance_formMouseClicked

//************************************************************

    private void p9_t_btn_removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_t_btn_removeMouseClicked
        String fname = p9_t_in_tmp_af_name.getText();
        if (fname.equals(""))
            JOptionPane.showMessageDialog(this, "No table row is selected.");
        else {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure to delete?", "Delete Attendance Form", JOptionPane.YES_NO_OPTION);
//          0 means Yes
            if (confirm == 0) {
                try {
//                String fname = p9_t_in_tmp_af_name.getText();
                    // Get af_id
                    int cid = Integer.parseInt(p5_t_in_tmp.getText());
                    pst = con.prepareStatement("SELECT * FROM `attendance_form` WHERE af_name=? AND c_id=?");
                    pst.setString(1, fname);
                    pst.setInt(2, cid);
                    rs = pst.executeQuery();
                    rs.next();
                    String af_id = rs.getString("af_id");

                    pst = con.prepareStatement("DELETE FROM `attendance_form` WHERE af_id=?");
                    pst.setString(1, af_id);
                    int k = pst.executeUpdate();
                    if (k == 1) {
                        pst = con.prepareStatement("DELETE FROM `stu_foreach_attendance_form` WHERE af_id=?");
                        pst.setString(1, af_id);
                        pst.executeUpdate();
                        p9_t_fetch_table_of_attendance_form();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }//if
        }//else
    }//GEN-LAST:event_p9_t_btn_removeMouseClicked

    private void p7_s_table_all_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_s_table_all_recordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p7_s_table_all_recordMouseClicked

    private void p7_s_in_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p7_s_in_searchFocusGained
        if (p7_s_in_search.getText().equals("Search Here")) {
            p7_s_in_search.setText("");
        }
    }//GEN-LAST:event_p7_s_in_searchFocusGained

    private void p7_s_in_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_p7_s_in_searchFocusLost
        if (p7_s_in_search.getText().equals("")) {
            p7_s_in_search.setText("Search Here");
        }
    }//GEN-LAST:event_p7_s_in_searchFocusLost

//    **************************************************

    private void p7_s_in_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p7_s_in_searchKeyReleased
        fetch_s_all_record_attendance();
    }//GEN-LAST:event_p7_s_in_searchKeyReleased

//  **************************************************  

    private void p7_s_btn_single_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_s_btn_single_recordMouseClicked
        spa_container.removeAll();
        spa_container.add(p8_s_single_record);
        spa_container.repaint();
        spa_container.revalidate();
        p8_s_fetch_select_box_opt();
        p8_s_fetch_table_of_single_record();
    }//GEN-LAST:event_p7_s_btn_single_recordMouseClicked

//    **************************************************

    private void p7_s_btn_attendance_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_s_btn_attendance_formMouseClicked
        spa_container.removeAll();
        spa_container.add(p9_s_absent_list);
        spa_container.repaint();
        spa_container.revalidate();
        fetch_s_absent_list();
    }//GEN-LAST:event_p7_s_btn_attendance_formMouseClicked

//    **************************************************

    private void p5_s_btn_openMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5_s_btn_openMouseClicked
        String course_id = p5_s_in_tmp.getText();
        if (course_id.equals("")) {
            JOptionPane.showMessageDialog(this, "No table row is selected.");
        } else {
            spa_container.removeAll();
            spa_container.add(p7_s_all_record);
            spa_container.repaint();
            spa_container.revalidate();
            String cname = p5_s_in_tmp_3_course_name.getText();
            p7_s_label_course_name.setText(cname);
            p8_s_label_course_name.setText(cname);
            p9_s_label_course_name.setText(cname);
            fetch_s_all_record_attendance();
        }
    }//GEN-LAST:event_p5_s_btn_openMouseClicked

//    **************************************************

    private void p7_s_back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_s_back_btnMouseClicked
        s_btn_back();
    }//GEN-LAST:event_p7_s_back_btnMouseClicked

//    **************************************************

    private void p8_s_back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_s_back_btnMouseClicked
        s_btn_back();
    }//GEN-LAST:event_p8_s_back_btnMouseClicked

//    **************************************************

    private void p8_s_btn_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_s_btn_showMouseClicked
        p8_s_fetch_table_of_single_record();
    }//GEN-LAST:event_p8_s_btn_showMouseClicked

//    **************************************************

    private void p8_s_btn_all_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_s_btn_all_recordMouseClicked
        spa_container.removeAll();
        spa_container.add(p7_s_all_record);
        spa_container.repaint();
        spa_container.revalidate();
        fetch_t_all_record_attendance();
    }//GEN-LAST:event_p8_s_btn_all_recordMouseClicked

//    **************************************************

    private void p8_s_btn_attendance_formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_s_btn_attendance_formMouseClicked
        spa_container.removeAll();
        spa_container.add(p9_s_absent_list);
        spa_container.repaint();
        spa_container.revalidate();
        fetch_s_absent_list();
    }//GEN-LAST:event_p8_s_btn_attendance_formMouseClicked

//    **************************************************

    private void p9_s_table_absent_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_s_table_absent_listMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p9_s_table_absent_listMouseClicked

//    **************************************************

    private void p9_s_btn_all_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_s_btn_all_recordMouseClicked
        spa_container.removeAll();
        spa_container.add(p7_s_all_record);
        spa_container.repaint();
        spa_container.revalidate();
        fetch_t_all_record_attendance();
    }//GEN-LAST:event_p9_s_btn_all_recordMouseClicked

//    **************************************************

    private void p9_s_btn_single_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_s_btn_single_recordMouseClicked
        spa_container.removeAll();
        spa_container.add(p8_s_single_record);
        spa_container.repaint();
        spa_container.revalidate();
        p8_s_fetch_select_box_opt();
        p8_s_fetch_table_of_single_record();
    }//GEN-LAST:event_p9_s_btn_single_recordMouseClicked

//    **************************************************

    private void p9_s_back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_s_back_btnMouseClicked
        s_btn_back();
    }//GEN-LAST:event_p9_s_back_btnMouseClicked

    private void p6_t_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6_t_btn_logoutMouseClicked
        logout();
    }//GEN-LAST:event_p6_t_btn_logoutMouseClicked

    private void p6_s_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6_s_btn_logoutMouseClicked
        logout();
    }//GEN-LAST:event_p6_s_btn_logoutMouseClicked

    private void p7_t_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_t_btn_logoutMouseClicked
        logout();
    }//GEN-LAST:event_p7_t_btn_logoutMouseClicked

    private void p7_s_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_s_btn_logoutMouseClicked
        logout();
    }//GEN-LAST:event_p7_s_btn_logoutMouseClicked

    private void p8_t_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_t_btn_logoutMouseClicked
        logout();
    }//GEN-LAST:event_p8_t_btn_logoutMouseClicked

    private void p8_s_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p8_s_btn_logoutMouseClicked
        logout();
    }//GEN-LAST:event_p8_s_btn_logoutMouseClicked

    private void p9_t_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_t_btn_logoutMouseClicked
        logout();
    }//GEN-LAST:event_p9_t_btn_logoutMouseClicked

    private void p9_s_btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p9_s_btn_logoutMouseClicked
        logout();
    }//GEN-LAST:event_p9_s_btn_logoutMouseClicked

//************************************************************
    
    private void p7_t_btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_t_btn_printMouseClicked
       try {
            int cid = Integer.parseInt(p5_t_in_tmp.getText());
            pst = con.prepareStatement("SELECT a.stu_id, stu_name FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id WHERE c_id=? ORDER BY stu_id ASC");
            pst.setInt(1, cid);
            rs = pst.executeQuery();

            Document PDFreport = new Document();
            PdfWriter.getInstance(PDFreport, new FileOutputStream("D:\\print_"+cid+".pdf"));

//        Rectangle one = new Rectangle(70,140);
//        PDFreport.setPageSize(one);
        
            PDFreport.open();

            pst2 = con.prepareStatement("SELECT * FROM `course_list` WHERE c_id=?");
            pst2.setInt(1, cid);
            rs2 = pst2.executeQuery();
            rs2.next();
            
            Paragraph p1 = new Paragraph("               Course Name : "+rs2.getString("course_name")+"\n");
            PDFreport.add(p1);
            Paragraph p2 = new Paragraph("               Course Code : "+rs2.getString("course_code")+"\n");
            PDFreport.add(p2);
            Paragraph p3 = new Paragraph("               Department : "+rs2.getString("department")+"\n");
            PDFreport.add(p3);
            Paragraph p4 = new Paragraph("               Program : "+rs2.getString("program")+"\n");
            PDFreport.add(p4);
            Paragraph p5 = new Paragraph("               Session : "+rs2.getString("session")+"\n\n");
            PDFreport.add(p5);

            PdfPTable PDFTable = new PdfPTable(6);
            PdfPCell table_cell;
            PDFTable.setWidths(new int[]{60, 190, 60, 40, 60, 40});

            table_cell = new PdfPCell(new Phrase("ID"));
            PDFTable.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase("Student Name"));
            PDFTable.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase("Present"));
            PDFTable.addCell(table_cell);
            
            table_cell = new PdfPCell(new Phrase("Late"));
            PDFTable.addCell(table_cell);
            
            table_cell = new PdfPCell(new Phrase("Percent"));
            PDFTable.addCell(table_cell);
            
            table_cell = new PdfPCell(new Phrase("Mark"));
            PDFTable.addCell(table_cell);

            while (rs.next()) {
                String sid = rs.getString("stu_id");
                table_cell = new PdfPCell(new Phrase(sid));
                PDFTable.addCell(table_cell);

                String stu_name = rs.getString("stu_name");
                table_cell = new PdfPCell(new Phrase(stu_name));
                PDFTable.addCell(table_cell);
                
 
                //              Calculate total present of a student
                pst2 = con.prepareStatement("SELECT COUNT(stu_id) FROM `stu_foreach_attendance_form` a JOIN attendance_form b ON a.af_id=b.af_id JOIN course_list c ON b.c_id=c.c_id WHERE c.c_id=? AND stu_id=? and status=1");
                pst2.setInt(1, cid);
                pst2.setString(2, sid);
                rs2 = pst2.executeQuery();
                rs2.next();
                int present1 = Integer.parseInt(rs2.getString("COUNT(stu_id)"));
                
                pst2 = con.prepareStatement("SELECT COUNT(stu_id) FROM `stu_foreach_attendance_form` a JOIN attendance_form b ON a.af_id=b.af_id JOIN course_list c ON b.c_id=c.c_id WHERE c.c_id=? AND stu_id=? AND status=2");
                pst2.setInt(1, cid);
                pst2.setString(2, sid);
                rs2 = pst2.executeQuery();
                rs2.next();
                int late = Integer.parseInt(rs2.getString("COUNT(stu_id)"));

                int present = present1+late;

//              Calculate total class of this course
                pst3 = con.prepareStatement("SELECT COUNT(af_id) FROM `attendance_form` WHERE c_id=?");
                pst3.setInt(1, cid);
                rs3 = pst3.executeQuery();
                rs3.next();
                int total_class = Integer.parseInt(rs3.getString("COUNT(af_id)"));

                String status = present + "/" + total_class;
                table_cell = new PdfPCell(new Phrase(status));
                PDFTable.addCell(table_cell);
                
                String l = Integer.toString(late);
                table_cell = new PdfPCell(new Phrase(l));
                PDFTable.addCell(table_cell);
                
//              Calculate percentage
                float percent = percent(present, total_class);
                String p = percent + "%";
                table_cell = new PdfPCell(new Phrase(p));
                PDFTable.addCell(table_cell);
                
                int m = mark(percent,late);
                String n = Integer.toString(m);
                table_cell = new PdfPCell(new Phrase(n));
                PDFTable.addCell(table_cell); 
            }
            JOptionPane.showMessageDialog(this, "PDF file is exported successfully");
            PDFreport.add(PDFTable);
            PDFreport.close();

//          ----

            try {
                File file = new File("D:\\print_"+cid+".pdf");
//check if file exist then open otherwise not
                if (file.exists()) {
                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().open(file);
                    } else {
                        JOptionPane.showMessageDialog(this, "Not Supported");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "File Not Exist");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_p7_t_btn_printMouseClicked

//************************************************************
    
    private void p7_s_btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7_s_btn_printMouseClicked
        try {
            int cid = Integer.parseInt(p5_s_in_tmp.getText());
            pst = con.prepareStatement("SELECT a.stu_id, stu_name FROM `stu_foreach_class` a JOIN stu_info b ON a.stu_id=b.stu_id WHERE c_id=? ORDER BY stu_id ASC");
            pst.setInt(1, cid);
            rs = pst.executeQuery();

            Document PDFreport = new Document();
            PdfWriter.getInstance(PDFreport, new FileOutputStream("D:\\print_"+cid+".pdf"));

//        Rectangle one = new Rectangle(70,140);
//        PDFreport.setPageSize(one);
        
            PDFreport.open();

            pst2 = con.prepareStatement("SELECT * FROM `course_list` WHERE c_id=?");
            pst2.setInt(1, cid);
            rs2 = pst2.executeQuery();
            rs2.next();
            
            Paragraph p1 = new Paragraph("               Course Name : "+rs2.getString("course_name")+"\n");
            PDFreport.add(p1);
            Paragraph p2 = new Paragraph("               Course Code : "+rs2.getString("course_code")+"\n");
            PDFreport.add(p2);
            Paragraph p3 = new Paragraph("               Department : "+rs2.getString("department")+"\n");
            PDFreport.add(p3);
            Paragraph p4 = new Paragraph("               Program : "+rs2.getString("program")+"\n");
            PDFreport.add(p4);
            Paragraph p5 = new Paragraph("               Session : "+rs2.getString("session")+"\n\n");
            PDFreport.add(p5);

            PdfPTable PDFTable = new PdfPTable(6);
            PdfPCell table_cell;
            PDFTable.setWidths(new int[]{60, 190, 60, 40, 60, 40});

            table_cell = new PdfPCell(new Phrase("ID"));
            PDFTable.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase("Student Name"));
            PDFTable.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase("Present"));
            PDFTable.addCell(table_cell);
            
            table_cell = new PdfPCell(new Phrase("Late"));
            PDFTable.addCell(table_cell);
            
            table_cell = new PdfPCell(new Phrase("Percent"));
            PDFTable.addCell(table_cell);
            
            table_cell = new PdfPCell(new Phrase("Mark"));
            PDFTable.addCell(table_cell);

            while (rs.next()) {
                String sid = rs.getString("stu_id");
                table_cell = new PdfPCell(new Phrase(sid));
                PDFTable.addCell(table_cell);

                String stu_name = rs.getString("stu_name");
                table_cell = new PdfPCell(new Phrase(stu_name));
                PDFTable.addCell(table_cell);
                
 
                //              Calculate total present of a student
                pst2 = con.prepareStatement("SELECT COUNT(stu_id) FROM `stu_foreach_attendance_form` a JOIN attendance_form b ON a.af_id=b.af_id JOIN course_list c ON b.c_id=c.c_id WHERE c.c_id=? AND stu_id=? and status=1");
                pst2.setInt(1, cid);
                pst2.setString(2, sid);
                rs2 = pst2.executeQuery();
                rs2.next();
                int present1 = Integer.parseInt(rs2.getString("COUNT(stu_id)"));
                
                pst2 = con.prepareStatement("SELECT COUNT(stu_id) FROM `stu_foreach_attendance_form` a JOIN attendance_form b ON a.af_id=b.af_id JOIN course_list c ON b.c_id=c.c_id WHERE c.c_id=? AND stu_id=? AND status=2");
                pst2.setInt(1, cid);
                pst2.setString(2, sid);
                rs2 = pst2.executeQuery();
                rs2.next();
                int late = Integer.parseInt(rs2.getString("COUNT(stu_id)"));

                int present = present1+late;

//              Calculate total class of this course
                pst3 = con.prepareStatement("SELECT COUNT(af_id) FROM `attendance_form` WHERE c_id=?");
                pst3.setInt(1, cid);
                rs3 = pst3.executeQuery();
                rs3.next();
                int total_class = Integer.parseInt(rs3.getString("COUNT(af_id)"));

                String status = present + "/" + total_class;
                table_cell = new PdfPCell(new Phrase(status));
                PDFTable.addCell(table_cell);
                
                String l = Integer.toString(late);
                table_cell = new PdfPCell(new Phrase(l));
                PDFTable.addCell(table_cell);
                
//              Calculate percentage
                float percent = percent(present, total_class);
                String p = percent + "%";
                table_cell = new PdfPCell(new Phrase(p));
                PDFTable.addCell(table_cell);
                
                int m = mark(percent,late);
                String n = Integer.toString(m);
                table_cell = new PdfPCell(new Phrase(n));
                PDFTable.addCell(table_cell); 
            }
            JOptionPane.showMessageDialog(this, "PDF file is exported successfully");
            PDFreport.add(PDFTable);
            PDFreport.close();

//          ----

            try {
                File file = new File("D:\\print_"+cid+".pdf");
//check if file exist then open otherwise not
                if (file.exists()) {
                    if (Desktop.isDesktopSupported()) {
                        Desktop.getDesktop().open(file);
                    } else {
                        JOptionPane.showMessageDialog(this, "Not Supported");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "File Not Exist");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_p7_s_btn_printMouseClicked

//************************************************************
    public void p9_t_fetch_table_of_attendance_form() {
        try {
            p9_t_in_tmp_af_name.setText("");
            int cid = Integer.parseInt(p5_t_in_tmp.getText());

            pst = con.prepareStatement("SELECT * FROM `attendance_form` WHERE c_id=?");
            pst.setInt(1, cid);
            rs = pst.executeQuery();

            DefaultTableModel df = (DefaultTableModel) p9_t_table_attendance_form.getModel();
            df.setRowCount(0);
            int i = 0;
            while (rs.next()) {
                df.addRow(new Object[0]);
                df.setValueAt(i + 1, i, 0);
                df.setValueAt(rs.getString("af_name"), i, 1);
                df.setValueAt(rs.getString("af_created_date"), i, 2);
                i++;

            }//while
        } catch (SQLException ex) {
            Logger.getLogger(spa.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    //************************************************************
    public void fetch_s_absent_list() {
        try {
            String uid = value_holder_1.getText();
            int cid = Integer.parseInt(p5_s_in_tmp.getText());

            pst = con.prepareStatement("SELECT * FROM `stu_foreach_attendance_form` a JOIN attendance_form b ON a.af_id=b.af_id WHERE stu_id=? AND status=0 AND c_id=?");
            pst.setString(1, uid);
            pst.setInt(2, cid);
            rs = pst.executeQuery();

            DefaultTableModel df = (DefaultTableModel) p9_s_table_absent_list.getModel();
            df.setRowCount(0);
            int i = 0;
            while (rs.next()) {
                df.addRow(new Object[0]);
                df.setValueAt(i + 1, i, 0);
                df.setValueAt(rs.getString("af_name"), i, 1);
                df.setValueAt(rs.getString("af_created_date"), i, 2);
                i++;

            }//while
        } catch (SQLException ex) {
            Logger.getLogger(spa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //************************************************************
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new spa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_login;
    private javax.swing.JLabel img_reg_choose_role;
    private javax.swing.JLabel img_reg_stu_form;
    private javax.swing.JLabel img_reg_tea_form;
    private javax.swing.JLabel img_s_absent_list;
    private javax.swing.JLabel img_s_course_list;
    private javax.swing.JLabel img_s_enroll_new;
    private javax.swing.JLabel img_t_all_record;
    private javax.swing.JLabel img_t_all_record1;
    private javax.swing.JLabel img_t_attendance_form;
    private javax.swing.JLabel img_t_course_list;
    private javax.swing.JLabel img_t_create_new;
    private javax.swing.JLabel img_t_single_record;
    private javax.swing.JLabel img_t_single_record1;
    private javax.swing.JLabel p1_btn_create_account;
    private javax.swing.JLabel p1_btn_login;
    private javax.swing.JTextField p1_in_email;
    private javax.swing.JLabel p1_in_null;
    private javax.swing.JPasswordField p1_in_password;
    private javax.swing.JTextField p1_in_tmp;
    private javax.swing.JPanel p1_login;
    private javax.swing.JLabel p2_btn_sign_in_insted;
    private javax.swing.JLabel p2_btn_student;
    private javax.swing.JLabel p2_btn_teacher;
    private javax.swing.JPanel p2_reg_choose_role;
    private javax.swing.JLabel p3_btn_back;
    private javax.swing.JLabel p3_btn_submit;
    private javax.swing.JTextField p3_in_bg;
    private javax.swing.JTextField p3_in_cp;
    private javax.swing.JTextField p3_in_dept;
    private javax.swing.JTextField p3_in_e;
    private javax.swing.JTextField p3_in_g;
    private javax.swing.JTextField p3_in_id;
    private javax.swing.JTextField p3_in_mn;
    private javax.swing.JTextField p3_in_n;
    private javax.swing.JTextField p3_in_p;
    private javax.swing.JTextField p3_in_prg;
    private javax.swing.JTextField p3_in_s;
    private javax.swing.JPanel p3_reg_stu_form;
    private javax.swing.JLabel p4_btn_back;
    private javax.swing.JLabel p4_btn_submit;
    private javax.swing.JTextField p4_in_bg;
    private javax.swing.JTextField p4_in_cp;
    private javax.swing.JTextField p4_in_d;
    private javax.swing.JTextField p4_in_dept;
    private javax.swing.JTextField p4_in_e;
    private javax.swing.JTextField p4_in_g;
    private javax.swing.JTextField p4_in_mn;
    private javax.swing.JTextField p4_in_n;
    private javax.swing.JTextField p4_in_p;
    private javax.swing.JPanel p4_reg_tea_form;
    private javax.swing.JLabel p5_btn_edit;
    private javax.swing.JLabel p5_s_btn_enroll_now;
    private javax.swing.JLabel p5_s_btn_logout;
    private javax.swing.JLabel p5_s_btn_open;
    private javax.swing.JLabel p5_s_btn_refresh;
    private javax.swing.JLabel p5_s_btn_unenroll;
    private javax.swing.JPanel p5_s_course_list;
    private javax.swing.JTextField p5_s_in_search_key;
    private javax.swing.JLabel p5_s_in_tmp;
    private javax.swing.JLabel p5_s_in_tmp_2;
    private javax.swing.JLabel p5_s_in_tmp_3_course_name;
    private javax.swing.JLabel p5_s_uname;
    private javax.swing.JLabel p5_t_btn_cancel;
    private javax.swing.JLabel p5_t_btn_create_new;
    private javax.swing.JLabel p5_t_btn_delete;
    private javax.swing.JLabel p5_t_btn_logout;
    private javax.swing.JLabel p5_t_btn_open;
    private javax.swing.JLabel p5_t_btn_refresh;
    private javax.swing.JLabel p5_t_btn_update_now;
    private javax.swing.JPanel p5_t_course_list;
    private javax.swing.JTextField p5_t_in_cc;
    private javax.swing.JTextField p5_t_in_cn;
    private javax.swing.JTextField p5_t_in_d;
    private javax.swing.JTextField p5_t_in_p;
    private javax.swing.JTextField p5_t_in_s;
    private javax.swing.JTextField p5_t_in_search_key;
    private javax.swing.JLabel p5_t_in_tmp;
    private javax.swing.JTextField p5_t_in_tmp_2;
    private javax.swing.JLabel p5_t_in_tmp_3_course_name;
    private javax.swing.JPanel p5_t_modal_edit_c_details;
    private javax.swing.JLabel p5_t_modal_form;
    private javax.swing.JLabel p5_t_uname;
    private javax.swing.JLabel p6_s_btn_course_list;
    private javax.swing.JLabel p6_s_btn_enroll;
    private javax.swing.JLabel p6_s_btn_logout;
    private javax.swing.JLabel p6_s_btn_reset;
    private javax.swing.JPanel p6_s_enroll_new;
    private javax.swing.JTextField p6_s_in_course_id;
    private javax.swing.JLabel p6_s_uname;
    private javax.swing.JLabel p6_t_btn_course_list;
    private javax.swing.JLabel p6_t_btn_create_now;
    private javax.swing.JLabel p6_t_btn_logout;
    private javax.swing.JLabel p6_t_btn_reset;
    private javax.swing.JPanel p6_t_create_new;
    private javax.swing.JTextField p6_t_in_cc;
    private javax.swing.JTextField p6_t_in_cn;
    private javax.swing.JTextField p6_t_in_d;
    private javax.swing.JTextField p6_t_in_p;
    private javax.swing.JTextField p6_t_in_s;
    private javax.swing.JLabel p6_t_uname;
    private javax.swing.JPanel p7_s_all_record;
    private javax.swing.JLabel p7_s_back_btn;
    private javax.swing.JLabel p7_s_btn_attendance_form;
    private javax.swing.JLabel p7_s_btn_logout;
    private javax.swing.JLabel p7_s_btn_print;
    private javax.swing.JLabel p7_s_btn_single_record;
    private javax.swing.JTextField p7_s_in_search;
    private javax.swing.JLabel p7_s_label_course_name;
    private javax.swing.JTable p7_s_table_all_record;
    private javax.swing.JLabel p7_s_uname;
    private javax.swing.JPanel p7_t_all_record;
    private javax.swing.JLabel p7_t_back_btn;
    private javax.swing.JLabel p7_t_btn_attendance_form;
    private javax.swing.JLabel p7_t_btn_logout;
    private javax.swing.JLabel p7_t_btn_print;
    private javax.swing.JLabel p7_t_btn_single_record;
    private javax.swing.JTextField p7_t_in_search;
    private javax.swing.JLabel p7_t_label_course_name;
    private javax.swing.JScrollPane p7_t_scroll_table_all_record;
    private javax.swing.JScrollPane p7_t_scroll_table_all_record1;
    private javax.swing.JTable p7_t_table_all_record;
    private javax.swing.JLabel p7_t_uname;
    private javax.swing.JLabel p8_s_back_btn;
    private javax.swing.JLabel p8_s_btn_all_record;
    private javax.swing.JLabel p8_s_btn_attendance_form;
    private javax.swing.JLabel p8_s_btn_logout;
    private javax.swing.JLabel p8_s_btn_show;
    private javax.swing.JLabel p8_s_in_tmp_af_id;
    private javax.swing.JLabel p8_s_label_course_name;
    private javax.swing.JLabel p8_s_label_title;
    private javax.swing.JComboBox<String> p8_s_select_box;
    private javax.swing.JPanel p8_s_single_record;
    private javax.swing.JTable p8_s_table_single_record;
    private javax.swing.JLabel p8_s_uname;
    private javax.swing.JLabel p8_t_back_btn;
    private javax.swing.JLabel p8_t_btn_all_record;
    private javax.swing.JLabel p8_t_btn_attendance_form;
    private javax.swing.JLabel p8_t_btn_logout;
    private javax.swing.JLabel p8_t_btn_set_to_all_present;
    private javax.swing.JLabel p8_t_btn_show;
    private javax.swing.JLabel p8_t_btn_submit;
    private javax.swing.JLabel p8_t_in_tmp_af_id;
    private javax.swing.JLabel p8_t_label_course_name;
    private javax.swing.JLabel p8_t_label_title;
    private javax.swing.JScrollPane p8_t_scroll_table_single_record;
    private javax.swing.JScrollPane p8_t_scroll_table_single_record1;
    private javax.swing.JComboBox<String> p8_t_select_box;
    private javax.swing.JPanel p8_t_single_record;
    private javax.swing.JTable p8_t_table_single_record;
    private javax.swing.JLabel p8_t_uname;
    private javax.swing.JPanel p9_s_absent_list;
    private javax.swing.JLabel p9_s_back_btn;
    private javax.swing.JLabel p9_s_btn_all_record;
    private javax.swing.JLabel p9_s_btn_logout;
    private javax.swing.JLabel p9_s_btn_single_record;
    private javax.swing.JLabel p9_s_label_course_name;
    private javax.swing.JScrollPane p9_s_scroll_table_absent_list;
    private javax.swing.JTable p9_s_table_absent_list;
    private javax.swing.JLabel p9_s_uname;
    private javax.swing.JPanel p9_t_attendance_form;
    private javax.swing.JLabel p9_t_back_btn;
    private javax.swing.JLabel p9_t_btn_all_record;
    private javax.swing.JLabel p9_t_btn_create;
    private javax.swing.JLabel p9_t_btn_logout;
    private javax.swing.JLabel p9_t_btn_remove;
    private javax.swing.JLabel p9_t_btn_single_record;
    private javax.swing.JTextField p9_t_in_form_name;
    private javax.swing.JLabel p9_t_in_tmp_af_name;
    private javax.swing.JLabel p9_t_label_course_name;
    private javax.swing.JScrollPane p9_t_scroll_table_attendance_form;
    private javax.swing.JTable p9_t_table_attendance_form;
    private javax.swing.JLabel p9_t_uname;
    private javax.swing.JPanel spa_container;
    private javax.swing.JTable table_s_course_list;
    private javax.swing.JScrollPane table_scroll_s_course_list;
    private javax.swing.JScrollPane table_scroll_t_course_list;
    private javax.swing.JTable table_t_course_list;
    private javax.swing.JLabel value_holder_1;
    // End of variables declaration//GEN-END:variables
}
