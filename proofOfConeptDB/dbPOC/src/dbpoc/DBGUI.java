/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbpoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AIC8118
 */
public class DBGUI extends javax.swing.JFrame {

    private String userName = "root";
    private String password = "";
    private String dbms = "derby";
    private String dbName = "utilMeters";
    
    /**
     * Creates new form DBGUI
     */
    public DBGUI() {
        
        boolean createDBSuccess = createTables();
        if(createDBSuccess){
            JOptionPane.showMessageDialog(null, "Database was successfully initilized");
        }
        else{
            JOptionPane.showMessageDialog(null,"Database failed to initilize.");
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meter ID", "Street", "City", "Zip"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("get meter data from database");
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

        jButton2.setText("update database with changes");
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

        jButton3.setText("clear table");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("street");

        jLabel2.setText("city");

        jLabel3.setText("zip");

        jLabel4.setText("Create new meter:");

        jButton4.setText("add to database");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        clearTable();
        
        Connection conn;
        Statement getMeterData;
        
        try{
             conn = getConnection();
             getMeterData  = conn.createStatement();
             String sql = "SELECT * FROM METERS";
             ResultSet results = getMeterData.executeQuery(sql);
             
             int rowCounter = 0;
             
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             
             int meterID;
             String street;
             String city;
             String zip;
             
             while(results.next()){ 
                 meterID = results .getInt("id");
                 String meterIDString = Integer.toString(meterID);
                 street = results.getString("street");
                 city = results.getString("city");
                 zip = results.getString("zip");
                 
                 model.addRow(new Object[]{meterIDString, street, city, zip});
             }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        

        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        Connection conn = null;
        
        try{
             conn = getConnection();
        }
            catch (SQLException e){
                e.printStackTrace();
        }
     
        try{
            Statement addMeter = conn.createStatement();
            
            String street = jTextField1.getText();
            String city = jTextField2.getText();
            String zip = jTextField3.getText();
                    
            jTextField1.setText(""); 
            jTextField2.setText("");
            jTextField3.setText("");
            
            addMeter.executeUpdate("INSERT INTO Meters (street, city, zip) " +
                                    "VALUES ('" + street + "','" + city + "','" + zip + "')");
        }
        catch (SQLException e){
            e.printStackTrace();
        } 
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        clearTable();
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rowCount = model.getRowCount();
        
        int columnCount = model.getColumnCount();
        
        Object[][] tableData = new Object[rowCount][columnCount];
        
        Connection conn = null;
        Statement updateMeters = null;
        String sql;
        
        try{
             conn = getConnection();
             updateMeters = conn.createStatement();
        }
            catch (SQLException e){
                e.printStackTrace();
        }
        
        int i;
        int j;
        
        //Collect table data in array and execute update
        for (i = 0; i < rowCount; i++) {
            for(j = 0; j < columnCount; j++){
                tableData[i][j] = model.getValueAt(i, j);
            }
            String street = tableData[i][j-3].toString();
            String city = tableData[i][j-2].toString();
            String zip = tableData[i][j-1].toString();
            String stringID = tableData[i][j-4].toString();    
            int id = Integer.parseInt(stringID);
            
            //Build SQL String
            sql = "UPDATE Meters " +
                "SET street='" + street + "'," +
                "city='" + city + "'," +
                "zip='" + zip + "' " +
                "WHERE id=" + id;
            
            //Execute update at last column
            try{
                updateMeters.executeUpdate(sql);
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(DBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    public boolean createTables(){
        
        Connection conn;
        
        try{
             conn = getConnection();
        }
            catch (SQLException e){
                e.printStackTrace();
                return false;
        }
        
        Statement createMeters;
     
        try{
            createMeters = conn.createStatement();
            
            //Delete table if it already exists
            try{
                createMeters.executeUpdate("DROP TABLE Meters");   
            }
            catch(SQLException e){
                //ignore error if table does not exist
                if (!e.getSQLState().equals("42Y55")){
                    throw e;
                } 
            }

            String createTableSQL = "CREATE TABLE Meters " +
                             "(id INTEGER not NULL PRIMARY KEY " +
                             "GENERATED ALWAYS AS IDENTITY " +
                             "(START WITH 1, INCREMENT BY 1)," +
                             " street VARCHAR(255), " + 
                             " city VARCHAR(255), " + 
                             " zip VARCHAR(255) " + 
                             " )"; 

            createMeters.executeUpdate(createTableSQL);
            
            String createMetersSQL = "INSERT INTO Meters (street, city, zip) " + 
                                     "VALUES ('Test Street 1','Test City 1','Test Zip 1'), " +
                                     "('Test Street 2','Test City 2','Test Zip 2'), " +
                                     "('Test Street 3','Test City 3','Test Zip 3')";
            
            createMeters.executeUpdate(createMetersSQL);        
        }
        catch (SQLException e){
            e.printStackTrace();
            return false; 
        } 
        
        return true;
        
    }
    
    public Connection getConnection() throws SQLException {

        Connection cn=DriverManager.getConnection("jdbc:derby:testdb3;create=true", "testdb3", "testdb3");
        return cn;
        
    }
    
    public void clearTable(){
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rowCount=model.getRowCount();
        for (int i = rowCount - 1;i>=0;i--) {
            model.removeRow(i);
        }
    }
   
}
