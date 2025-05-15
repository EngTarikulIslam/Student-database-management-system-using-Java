import java.awt.Cursor;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;



public class AddRecord extends javax.swing.JFrame {
    DefaultListModel<String> listModel;
    public AddRecord() {
        initComponents();
        listModel= new DefaultListModel<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdept = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        txtadd = new javax.swing.JButton();
        txtemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtblood = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtclear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtsearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtdisplay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        txtupdate = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Database Managemant System");

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 15)); // NOI18N
        jButton1.setText("Sign Out");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 51)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1560, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1692, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Regestation Form");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 21, 520, 48));

        jLabel3.setBackground(new java.awt.Color(255, 102, 51));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 110, 86, 41));

        txtname.setBackground(new java.awt.Color(255, 102, 51));
        txtname.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 110, 382, 41));

        txtid.setBackground(new java.awt.Color(255, 102, 51));
        txtid.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 179, 382, 41));

        jLabel6.setBackground(new java.awt.Color(255, 102, 51));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 179, 86, 41));

        jLabel7.setBackground(new java.awt.Color(255, 102, 51));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dept.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 252, 86, 41));

        txtdept.setBackground(new java.awt.Color(255, 102, 51));
        txtdept.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtdept.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 252, 382, 41));

        jLabel8.setBackground(new java.awt.Color(255, 102, 51));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mobile");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 328, 86, 41));

        txtmobile.setBackground(new java.awt.Color(255, 102, 51));
        txtmobile.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtmobile.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 328, 382, 41));

        txtadd.setBackground(new java.awt.Color(102, 102, 255));
        txtadd.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        txtadd.setText("Add Record");
        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });
        jPanel2.add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 576, 126, 36));

        txtemail.setBackground(new java.awt.Color(255, 102, 51));
        txtemail.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtemail.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 491, 382, 41));

        jLabel9.setBackground(new java.awt.Color(255, 102, 51));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 491, 86, 41));

        txtblood.setBackground(new java.awt.Color(255, 102, 51));
        txtblood.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtblood.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtblood, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 409, 382, 41));

        jLabel10.setBackground(new java.awt.Color(255, 102, 51));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Blood G");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 409, 86, 41));

        txtclear.setBackground(new java.awt.Color(102, 102, 255));
        txtclear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtclear.setText("Clear");
        txtclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclearActionPerformed(evt);
            }
        });
        jPanel2.add(txtclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 576, 108, 36));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, -1, 702));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtsearch.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        jPanel3.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 18, 227, 42));

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1044, 18, 97, 42));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Student Record");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 230, -1));

        txtdisplay.setBackground(new java.awt.Color(102, 102, 255));
        txtdisplay.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtdisplay.setText("Display");
        txtdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdisplayActionPerformed(evt);
            }
        });
        jPanel3.add(txtdisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 648, 108, 36));

        table.setBackground(new java.awt.Color(0, 0, 0));
        table.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 204), new java.awt.Color(0, 0, 255), new java.awt.Color(51, 255, 0), new java.awt.Color(51, 255, 0)));
        table.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(51, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 72, 1134, 558));

        clear.setBackground(new java.awt.Color(102, 102, 255));
        clear.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1008, 648, 108, 36));

        txtupdate.setBackground(new java.awt.Color(102, 102, 255));
        txtupdate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtupdate.setText("Update");
        txtupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateActionPerformed(evt);
            }
        });
        jPanel3.add(txtupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 648, 108, 36));

        jButton5.setBackground(new java.awt.Color(102, 102, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 648, 108, 36));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 88, 1152, 702));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1329, 88, 9, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
        
    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
        // Add Record
        String name=txtname.getText();
        String id=txtid.getText();
        String dept=txtdept.getText();
        String mobile=txtmobile.getText();
        String blood=txtblood.getText();
        String email=txtemail.getText();
                
        try{
            if(name.isEmpty() || id.isEmpty() || dept.isEmpty() || mobile.isEmpty() || blood.isEmpty() || email.isEmpty()){
                JOptionPane.showMessageDialog(this,"Please fill all field.", "Error", JOptionPane.ERROR_MESSAGE);
        }
            else{
            try(FileWriter f = new FileWriter("StudentInfo.txt", true);
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter p = new PrintWriter(b);){

                p.print(name.toUpperCase()+" /"+id+" /"+dept.toUpperCase()+" /"+mobile+" /"+blood.toUpperCase()+" /"+email.toLowerCase());
                p.print("\n");
                JOptionPane.showMessageDialog(this,"Record add Sucessfull");
                p.flush();
                p.close();
            }catch (Exception ex){
                System.out.println("Add data faield"+ex);
          }
        }
        }catch(HeadlessException e){
            System.out.println("add problem"+e);
        } 
    }//GEN-LAST:event_txtaddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Sign Out
        Login ob=new Login();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclearActionPerformed
       // Clear Record Button
       txtname.setText(null);
       txtid.setText(null);
       txtdept.setText(null);
       txtmobile.setText(null);
       txtblood.setText(null);
       txtemail.setText(null);
       
       txtname.setFocusable(true);
       txtname.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
       txtname.grabFocus();
       this.setVisible(true);
    }//GEN-LAST:event_txtclearActionPerformed

    private void txtdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdisplayActionPerformed
        // Show Record Display
        try{
            BufferedReader br=new BufferedReader(new FileReader("StudentInfo.txt"));
            String firstLine=br.readLine().trim();
            String[] columnsName;
            columnsName = firstLine.split(",");
            DefaultTableModel model= (DefaultTableModel)table.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();
            try{
            for(int i=0; i<=tableLines.length-1;i++){
                String line=tableLines[i].toString().trim(); 
                String[] dataRow=line.split("/");
                model.addRow(dataRow);
            }
            }catch(Exception e){
                System.out.println(""+e);
            }
        }catch(IOException ex){
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_txtdisplayActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // Clear Table Display
        DefaultTableModel clr = (DefaultTableModel)table.getModel();
        clr.getDataVector().removeAllElements();
        clr.fireTableDataChanged();
    }//GEN-LAST:event_clearActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Delet any record
            txtid.setFocusable(true);
            txtid.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            txtid.grabFocus();
            this.setVisible(true);
        
    DefaultTableModel tblModel=(DefaultTableModel) table.getModel();
    if(table.getSelectedRowCount()==1){
        tblModel.removeRow(table.getSelectedRow());
        txtid.setText("");
        txtname.setText("");
        txtdept.setText("");
        txtmobile.setText("");
        txtblood.setText("");
        txtemail.setText("");
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Studentinfo.txt"));
            PrintWriter pw = new PrintWriter(bw);){
            try{
                for(int i = 0; i <= table.getRowCount()+5; i++){     
                    String headers = String.valueOf(table.getColumnName(i).toUpperCase(Locale.ENGLISH));
                    pw.print(headers);
                    pw.print(",");
                }
            }catch(Exception e){
                System.out.println("header problem"+e);
            }
            
            try{
                DefaultTableModel model= (DefaultTableModel)table.getModel();
                pw.println("");
                for(int i=0; i<model.getRowCount(); ++i)
                {
                    for(int j=0; j<model.getColumnCount(); ++j)
                    {
                        String data = model.getValueAt(i,j).toString();
                        pw.print(data);
                        pw.print("/");
                    }
                    pw.println("");
                }      
                pw.close();
                JOptionPane.showMessageDialog(null, "Data Delete Sucessfully");
            }catch(HeadlessException e){
                System.out.println("data dilition problem"+e);
            }
        }catch(HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, "Failure");
        }
     
    }
    else{
        if(table.getRowCount()==0){
            //if table is empty(no data)than display message
            JOptionPane.showMessageDialog(this,"Table is empty!");
        }else{
            //if table not empty but row is not selected or multiple selected
            JOptionPane.showMessageDialog(this,"Please select single row to delete!");
        }
    }
        

    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Search any data
        txtsearch.setFocusable(true);
        txtsearch.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        txtsearch.grabFocus();
        this.setVisible(true);
        
        String data=txtsearch.getText();
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtsearch.getText().trim().toUpperCase()));
        
    
          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateActionPerformed
        // Update Record
        
        
    if(table.getSelectedRowCount()==1){    
        
    try(BufferedWriter bw = new BufferedWriter(new FileWriter("Studentinfo.txt"));
            PrintWriter pw = new PrintWriter(bw);){
            try{
                for(int i = 0; i <= table.getRowCount()+5; i++){     
                    String headers = String.valueOf(table.getColumnName(i).toUpperCase(Locale.ENGLISH));
                    pw.print(headers);
                    pw.print(",");
                }
            }catch(Exception e){
                System.out.println("header problem"+e);
            }
            
            try{
                DefaultTableModel model= (DefaultTableModel)table.getModel();
                pw.println("");
                for(int i=0; i<model.getRowCount(); ++i)
                {
                    for(int j=0; j<model.getColumnCount(); ++j)
                    {
                        String data = model.getValueAt(i,j).toString();
                        pw.print(data);
                        pw.print("/");
                    }
                    pw.println("");
                }      
                pw.close();
                JOptionPane.showMessageDialog(null, "Data Update Sucessfull");
            }catch(HeadlessException e){
                System.out.println("data eidit problem"+e);
            }
        }catch(HeadlessException | IOException ex){
            JOptionPane.showMessageDialog(null, "Failure");
        }
    }else{
        if(table.getRowCount()==0){
            //if table is empty(no data)than display message
            JOptionPane.showMessageDialog(this,"Table is empty!");
        }else{
            //if table not empty but row is not selected or multiple selected
            JOptionPane.showMessageDialog(this,"Please select single row to Update!");
        }
    }
        
        
    }//GEN-LAST:event_txtupdateActionPerformed

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
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> {
            new AddRecord().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JButton txtadd;
    private javax.swing.JTextField txtblood;
    private javax.swing.JButton txtclear;
    private javax.swing.JTextField txtdept;
    private javax.swing.JButton txtdisplay;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JButton txtupdate;
    // End of variables declaration//GEN-END:variables
  
}
