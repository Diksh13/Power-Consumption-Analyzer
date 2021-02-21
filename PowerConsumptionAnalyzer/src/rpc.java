import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import java.sql.*;

public class rpc extends javax.swing.JFrame {

    String adminName;
    public rpc() {
        initComponents();
    }
    public rpc(String adminName) {
        initComponents();
        this.adminName=adminName;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKWARD.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 30, 130, 120);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(960, 570, 140, 100);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("DELETE");
        jPanel1.add(jButton2);
        jButton2.setBounds(1140, 570, 140, 100);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(780, 570, 140, 100);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(1070, 140, 210, 170);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(1070, 340, 210, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(1070, 400, 210, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(1070, 460, 210, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(1070, 80, 210, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Complex Type");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(780, 340, 210, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Monthly Bill");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(780, 410, 200, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Power Plant Source");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(780, 470, 210, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(780, 80, 200, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(780, 180, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RPC.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1310, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1310, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String OwnerName=jTextField1.getText();
        String add=jTextArea1.getText();
        String type=jTextField4.getText();
        float bill=Float.parseFloat(jTextField3.getText());
        String ppno=jTextField2.getText();
        try
        {
            Class.forName("java.sql.DriverManager");
                        Connection con=(Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/powerca?zeroDateTimeBehavior=convertToNull","root","password");
                        Statement stmt=(Statement) con.createStatement();
                        String query = "INSERT INTO rpc VALUES ('"+OwnerName+"','"+add+"','"+type+"','"+bill+"','"+ppno+"');";                  
                        stmt.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Data Inserted"); 
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextArea1.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String eppno=JOptionPane.showInputDialog(this,"Enter the existing address");
        String OwnerName=jTextField1.getText();
        String add=jTextArea1.getText();
        String type=jTextField4.getText();
        float bill=Float.parseFloat(jTextField3.getText());
        String ppno=jTextField2.getText();
        try
        {
            Class.forName("java.sql.DriverManager");
                        Connection con=(Connection)
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/powerca?zeroDateTimeBehavior=convertToNull","root","password");
                        Statement stmt=(Statement) con.createStatement();
                        String query = "UPDATE `rpc` SET `OWNER`='"+OwnerName+"',`address`='"+add+"',`type_of_residence`='"+type+"',`monthly_bill`='"+bill+"',`ppregno`='"+ppno+"' WHERE address='"+eppno+"';";                  
                        stmt.executeUpdate(query);
                        JOptionPane.showMessageDialog(null, "Data Updated!"); 
                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextArea1.setText("");
                        jTextField3.setText("");
                        jTextField4.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        new AHome(adminName).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked
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
            java.util.logging.Logger.getLogger(rpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rpc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rpc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
