/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std_verwaltung;

import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.lang.*;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
/**
 *
 * @author user1
 */
public class Jframe_DOZENT extends javax.swing.JFrame {

    /**
     * Creates new form Jframe_ADMIN
     */
    public Jframe_DOZENT() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_lva_list = new javax.swing.JComboBox<>();
        jComboBox_dozenten = new javax.swing.JComboBox<>();
        jButton_Anwesenheitsdata_Aendern = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Student_Daten_mit_gesamt_abwesenheit = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_anwesenheit_aendern = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DOZENT PAGE");

        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("Studentdaten Anzeigen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("LVA Auswahl ");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Dozent Auswahl");

        jComboBox_dozenten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_dozentenActionPerformed(evt);
            }
        });

        jButton_Anwesenheitsdata_Aendern.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton_Anwesenheitsdata_Aendern.setText("Anwesenheitsdata Aktualisieren");
        jButton_Anwesenheitsdata_Aendern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Anwesenheitsdata_AendernActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_lva_list, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_dozenten, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(300, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Anwesenheitsdata_Aendern, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_dozenten, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_lva_list, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Anwesenheitsdata_Aendern, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main ", jPanel1);

        jTable_Student_Daten_mit_gesamt_abwesenheit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Vorname", "Martikel_Nummer", "Gesamte Abwesenheit(Stunde)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_Student_Daten_mit_gesamt_abwesenheit);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Studierende mit gesamten Abwesenheitsdata", jPanel2);

        jTable_anwesenheit_aendern.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Mr_Nummer", "Datum", "1", "2", "3", "4", "5", "6"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable_anwesenheit_aendern);
        if (jTable_anwesenheit_aendern.getColumnModel().getColumnCount() > 0) {
            jTable_anwesenheit_aendern.getColumnModel().getColumn(3).setPreferredWidth(10);
            jTable_anwesenheit_aendern.getColumnModel().getColumn(4).setPreferredWidth(10);
            jTable_anwesenheit_aendern.getColumnModel().getColumn(5).setPreferredWidth(10);
            jTable_anwesenheit_aendern.getColumnModel().getColumn(6).setPreferredWidth(10);
            jTable_anwesenheit_aendern.getColumnModel().getColumn(7).setPreferredWidth(10);
            jTable_anwesenheit_aendern.getColumnModel().getColumn(8).setPreferredWidth(10);
        }

        jButton2.setText("Aktualisieren");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        jTabbedPane1.addTab("Anwesenheitsdata Aktualisieren", jPanel4);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String str = anwesenheit_aktualisieren();
        JOptionPane.showMessageDialog(Jframe_DOZENT.this,str);
        fill_jTable_Anwesenheit_aktualisieren();
        refresh_table();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_Anwesenheitsdata_AendernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Anwesenheitsdata_AendernActionPerformed
        check_anw_date();
        fill_jTable_Anwesenheit_aktualisieren();
        jTabbedPane1.setSelectedComponent(jPanel4);
    }//GEN-LAST:event_jButton_Anwesenheitsdata_AendernActionPerformed

    private void jComboBox_dozentenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_dozentenActionPerformed
        fill_lva_combobox();
    }//GEN-LAST:event_jComboBox_dozentenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refresh_table();
        jTabbedPane1.setSelectedComponent(jPanel2);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void fill_dozent_combobox(){
        DBconnect connect = new DBconnect();
        Vector<Dozent> v = connect.get_all_DozentData();
        jComboBox_dozenten.removeAllItems();
        for(int c = 0; c < v.size() ; c++){
            jComboBox_dozenten.addItem(v.elementAt(c).getDozentName()+" "+v.elementAt(c).getDozentNachname()+":"+v.elementAt(c).getDozent_ID());  
        }
    }
    public int split_combobox_data(String s){ // Methode zum Trennen der Combobox/daten
        int i;
        String a[] = s.split(":");
        i = Integer.parseInt(a[1]);
        return i;
    }
    public String split_combobox_data_str(String s){
        int i;
        String a[] = s.split(":");
        return a[1];
    }
    
 
    public String get_date(){
        String str = ((JTextField)jDateChooser.getDateEditor().getUiComponent()).getText();
        return str;
    }
    

    public void refresh_table(){  //methode zur Erfüllung des Tables
        DBconnect connect = new DBconnect(); 
        int gruppe_id = connect.get_gruppe_id_lva_id(split_combobox_data(jComboBox_lva_list.getSelectedItem().toString()));
        Vector<Integer> v1 = connect.get_student_id_from_gruppe(gruppe_id);
        Vector<Student> v = connect.get_all_StudentData(v1);         
        Student s = null;
     
        DefaultTableModel model = (DefaultTableModel)jTable_Student_Daten_mit_gesamt_abwesenheit.getModel();
        model.getDataVector().removeAllElements();
         for(int c = 0; c < v.size(); c++){
             s = v.elementAt(c);
             model.addRow(new Object[]{s.getNachname(), s.getName(), s.getNummer(), connect.anwesenheit_sum(s.getNummer())});       
        }
    }
    
    public void fill_jTable_Anwesenheit_aktualisieren(){
        DBconnect connect = new DBconnect();
        int gruppe_id = connect.get_gruppe_id_lva_id(split_combobox_data(jComboBox_lva_list.getSelectedItem().toString()));  
        Vector<Integer> v_i_s = connect.get_student_id_from_gruppe(gruppe_id) ;
        String date = get_date();
        Vector<Student> v_s = connect.get_all_StudentData(v_i_s) ; 
        Student s;
        Vector<Anwesenheit> v_a;
        DefaultTableModel model = (DefaultTableModel)jTable_anwesenheit_aendern.getModel();
        model.getDataVector().removeAllElements();
        for(int c = 0; c < v_s.size(); c++){
            
               v_a = connect.get_anwesenheit_mr_nummer_date(v_s.elementAt(c).Mr_Num, get_date());
               model.addRow(new Object[]{v_s.elementAt(c).getNachname()+" "+v_s.elementAt(c).getName(),v_s.elementAt(c).getNummer(),get_date(),v_a.elementAt(0).anw_status,v_a.elementAt(1).anw_status,v_a.elementAt(2).anw_status,v_a.elementAt(3).anw_status,v_a.elementAt(4).anw_status,v_a.elementAt(5).anw_status,});
            
        }
    }
    
    /*public void fill_jTable_Anwesenheit_eingeben(){
        DBconnect connect = new DBconnect();
        int gruppe_id = connect.get_gruppe_id_lva_id(split_combobox_data(jComboBox_lva_list.getSelectedItem().toString()));        
        Vector<Integer> v_i_s = connect.get_student_id_from_gruppe(gruppe_id) ;
        Vector<Student> v_s = connect.get_all_StudentData(v_i_s) ;                
        Student s;
        DefaultTableModel model = (DefaultTableModel)jTable_anwesenheit_eingeben.getModel();
        model.getDataVector().removeAllElements();
        for(int c=0; c < v_s.size(); c++){
            s = v_s.elementAt(c);
            model.addRow(new Object[]{s.getNachname()+" "+s.getName(),s.getNummer(),get_date().toString(),true,true,true,true,true,true});
        }
    }*/
    public void anwesenheit_eingeben_alle_studenten(){
        String date = get_date();
        System.out.println(get_date());
        
        DBconnect connect = new DBconnect();
        Vector<Student> v_s = connect.get_all_StudentData_final();
        System.out.println(v_s.size());
        Vector<Anwesenheit> v_a = new Vector<Anwesenheit>();
            for(int c = 0; c < v_s.size(); c++){
                for(int c1=1; c1< 7; c1++){
                    Anwesenheit a = new Anwesenheit(v_s.elementAt(c).getNummer(), date, c1, true);
                    v_a.add(a);
                }
            }
        System.out.println("Anw vector size ="+v_a.size());    
        for(int c = 0; c < v_a.size(); c++){    
            connect.set_anwesenheit(v_a.elementAt(c));
            }
    }
    public void check_anw_date(){   // prüft ob es an bestimmten Datum Rekorde gibt !! 
        DBconnect connect = new DBconnect();
        if(connect.check_if_anw_date_exist(get_date()) == false){
            anwesenheit_eingeben_alle_studenten();
        }
        else
        System.out.println("es gibt schon data an diesem Datum");
    }
    public String anwesenheit_aktualisieren(){
        DBconnect connect = new DBconnect();
        Anwesenheit anw;
        Vector<Anwesenheit> v_a = new Vector<Anwesenheit>();
        String str = " ";
        DefaultTableModel model = (DefaultTableModel)jTable_anwesenheit_aendern.getModel();        
        for(int c = 0; c < model.getDataVector().size(); c++){
            for(int c1 = 3; c1 < 9; c1++){
                System.out.println((int)model.getValueAt(c, 1)); 
                System.out.println(model.getValueAt(c, 2).toString()); 
                System.out.println(c1-2); 
                System.out.println((boolean)model.getValueAt(c, c1));                                 
            anw = new Anwesenheit((int)model.getValueAt(c, 1),model.getValueAt(c, 2).toString(), (c1-2), (boolean)model.getValueAt(c, c1));
            v_a.add(anw);           
            }
        }
        for(int c = 0; c < v_a.size(); c++ ){
            str = connect.update_anwesenheitstable(v_a.elementAt(c));
        }
        return str;
    }
    
    /*
    public String anwesenheit_eingeben(){
        DBconnect connect = new DBconnect();
        Anwesenheit anw;
        Vector<Anwesenheit> v_a = new Vector<Anwesenheit>();
        String str = " ";
        DefaultTableModel model = (DefaultTableModel)jTable_anwesenheit_eingeben.getModel();        
        for(int c = 0; c < model.getDataVector().size(); c++){
            for(int c1 = 3; c1 < 9; c1++){
                System.out.println((int)model.getValueAt(c, 1)); 
                System.out.println(model.getValueAt(c, 2).toString()); 
                System.out.println(c1-2); 
                System.out.println((boolean)model.getValueAt(c, c1));                                 
            anw = new Anwesenheit((int)model.getValueAt(c, 1),model.getValueAt(c, 2).toString(), (c1-2), (boolean)model.getValueAt(c, c1));
            v_a.add(anw);           
            }
        }
        for(int c = 0; c < v_a.size(); c++ ){
            str = connect.set_anwesenheit(v_a.elementAt(c));
        }
        return str;
    }*/
        
    public void fill_lva_combobox(){
        
        DBconnect connect = new DBconnect();
        int a = split_combobox_data(jComboBox_dozenten.getSelectedItem().toString());
        Vector<LVA> v = connect.get_lva(a);
        jComboBox_lva_list.removeAllItems();
        for(int c = 0; c < v.size(); c++){
            jComboBox_lva_list.addItem(v.elementAt(c).getLVAname()+":"+v.elementAt(c).getLVAid());
        }
    }
    
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
            java.util.logging.Logger.getLogger(Jframe_DOZENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe_DOZENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe_DOZENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe_DOZENT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_DOZENT().setVisible(true);                             
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Anwesenheitsdata_Aendern;
    private javax.swing.JComboBox<String> jComboBox_dozenten;
    private javax.swing.JComboBox<String> jComboBox_lva_list;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_Student_Daten_mit_gesamt_abwesenheit;
    private javax.swing.JTable jTable_anwesenheit_aendern;
    // End of variables declaration//GEN-END:variables
}
