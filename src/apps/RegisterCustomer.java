/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package apps;

import connection.Connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegisterCustomer extends javax.swing.JDialog {

    public RegisterCustomer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_background = new javax.swing.JPanel();
        jPanel_container = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        jLabel_subtitle = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jLabel_logo = new javax.swing.JLabel();
        jButton_signup = new javax.swing.JButton();
        jTextField_cpf = new javax.swing.JTextField();
        jLabel_cpf = new javax.swing.JLabel();
        jLabel_phone = new javax.swing.JLabel();
        jLabel_name = new javax.swing.JLabel();
        jTextField_phone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel_background.setBackground(new java.awt.Color(240, 238, 226));

        jPanel_container.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_title.setFont(new java.awt.Font("Bosch Sans", 1, 24)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(77, 73, 73));
        jLabel_title.setText("vortex club");

        jLabel_subtitle.setFont(new java.awt.Font("Bosch Sans", 0, 18)); // NOI18N
        jLabel_subtitle.setForeground(new java.awt.Color(173, 173, 173));
        jLabel_subtitle.setText("register your customer");

        jTextField_name.setFont(new java.awt.Font("Bosch Sans", 0, 16)); // NOI18N
        jTextField_name.setForeground(new java.awt.Color(77, 73, 73));

        jLabel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo-medium.png"))); // NOI18N

        jButton_signup.setBackground(new java.awt.Color(77, 73, 73));
        jButton_signup.setFont(new java.awt.Font("Bosch Sans", 1, 16)); // NOI18N
        jButton_signup.setForeground(new java.awt.Color(255, 255, 255));
        jButton_signup.setText("login");

        jTextField_cpf.setFont(new java.awt.Font("Bosch Sans", 0, 16)); // NOI18N
        jTextField_cpf.setForeground(new java.awt.Color(77, 73, 73));

        jLabel_cpf.setFont(new java.awt.Font("Bosch Sans", 0, 16)); // NOI18N
        jLabel_cpf.setForeground(new java.awt.Color(77, 73, 73));
        jLabel_cpf.setText("cpf");

        jLabel_phone.setFont(new java.awt.Font("Bosch Sans", 0, 16)); // NOI18N
        jLabel_phone.setForeground(new java.awt.Color(77, 73, 73));
        jLabel_phone.setText("phone");

        jLabel_name.setFont(new java.awt.Font("Bosch Sans", 0, 16)); // NOI18N
        jLabel_name.setForeground(new java.awt.Color(77, 73, 73));
        jLabel_name.setText("name");

        jTextField_phone.setFont(new java.awt.Font("Bosch Sans", 0, 16)); // NOI18N
        jTextField_phone.setForeground(new java.awt.Color(77, 73, 73));

        javax.swing.GroupLayout jPanel_containerLayout = new javax.swing.GroupLayout(jPanel_container);
        jPanel_container.setLayout(jPanel_containerLayout);
        jPanel_containerLayout.setHorizontalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                        .addGroup(jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_cpf)
                            .addComponent(jTextField_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_name)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_phone)
                            .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                        .addComponent(jLabel_subtitle)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                        .addComponent(jLabel_title)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_containerLayout.createSequentialGroup()
                        .addComponent(jLabel_logo)
                        .addGap(202, 202, 202))))
        );
        jPanel_containerLayout.setVerticalGroup(
            jPanel_containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_containerLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_subtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_cpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_phone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_backgroundLayout = new javax.swing.GroupLayout(jPanel_background);
        jPanel_background.setLayout(jPanel_backgroundLayout);
        jPanel_backgroundLayout.setHorizontalGroup(
            jPanel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_backgroundLayout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366))
            .addGroup(jPanel_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_backgroundLayout.setVerticalGroup(
            jPanel_backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jPanel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(List_products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                List_products dialog = new List_products(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    Connect db = new Connect();
    
    private void createCustomerClub(){
        if(db.getConnection()){
            try{
                String nameCustomer = "daniel@gmail.com"; // Adicionar no input
                String CPFCustomer = "123";
                String phoneCustomer = "123";
                
                String query = "INSERT INTO saler (name_customer, CPF_customer, phone_customer) VALUES (?, ?, ?)";
                PreparedStatement stmt = db.conn.prepareStatement(query);
                
                stmt.setString(1, nameCustomer);
                stmt.setString(2, CPFCustomer);
                stmt.setString(2, phoneCustomer);
                ResultSet result = stmt.executeQuery();
                
                JOptionPane.showMessageDialog(null, "saler registered with success");
                System.out.println(result);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error to get category datas!"+e.toString());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_signup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_cpf;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_phone;
    private javax.swing.JLabel jLabel_subtitle;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel_background;
    private javax.swing.JPanel jPanel_container;
    private javax.swing.JTextField jTextField_cpf;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_phone;
    // End of variables declaration//GEN-END:variables
}
