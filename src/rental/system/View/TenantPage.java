/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rental.system.View;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import rental.system.Control.Control;
import rental.system.Model.Property;
import rental.system.Model.User;

/**
 *
 * @author alahm
 */
public class TenantPage extends javax.swing.JFrame {

    private static User user;
    private static Property property;
    private static Vector<Property> holdTheDataOfProperties;

    Control control = new Control();

    /**
     * Creates new form TenantPage2
     */
    public TenantPage(User u) {
        initComponents();
        setIcon();
        user = u;
        userNamejLabel.setText(user.getFullName());
        userIdjLabel.setText(String.valueOf(user.getId()));
        userTypejLabel.setText(user.getUserType());
        displayPropertiesInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barjPanel = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        userNamejLabel = new javax.swing.JLabel();
        userIdjLabel = new javax.swing.JLabel();
        userTypejLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        viewPropertyBtn = new javax.swing.JButton();
        containrjPanel = new javax.swing.JTabbedPane();
        viewPropetyjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewProperties = new javax.swing.JTable();
        bookBtn = new javax.swing.JButton();
        loadDataFromDB = new javax.swing.JButton();
        imageP = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        filejMenu = new javax.swing.JMenu();
        viewPropertyjMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitjMenu = new javax.swing.JMenuItem();
        helpjMenu = new javax.swing.JMenu();
        helpjMenuItem = new javax.swing.JMenuItem();
        aboutUsjMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cyberjaya online rental managment system - Tenant ");
        setMaximumSize(new java.awt.Dimension(910, 450));
        setMinimumSize(new java.awt.Dimension(910, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barjPanel.setBackground(new java.awt.Color(0, 0, 26));
        barjPanel.setMaximumSize(new java.awt.Dimension(180, 450));
        barjPanel.setMinimumSize(new java.awt.Dimension(180, 450));

        userIcon.setForeground(new java.awt.Color(255, 255, 255));
        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/system/Icons/icons8_user_100px.png"))); // NOI18N

        userNamejLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNamejLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userNamejLabel.setMaximumSize(new java.awt.Dimension(160, 22));
        userNamejLabel.setMinimumSize(new java.awt.Dimension(160, 22));
        userNamejLabel.setPreferredSize(new java.awt.Dimension(160, 22));

        userIdjLabel.setForeground(new java.awt.Color(255, 255, 255));
        userIdjLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userIdjLabel.setMaximumSize(new java.awt.Dimension(160, 22));
        userIdjLabel.setMinimumSize(new java.awt.Dimension(160, 22));
        userIdjLabel.setPreferredSize(new java.awt.Dimension(160, 22));

        userTypejLabel.setForeground(new java.awt.Color(255, 255, 255));
        userTypejLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userTypejLabel.setMaximumSize(new java.awt.Dimension(160, 22));
        userTypejLabel.setMinimumSize(new java.awt.Dimension(160, 22));
        userTypejLabel.setPreferredSize(new java.awt.Dimension(160, 22));

        viewPropertyBtn.setBackground(new java.awt.Color(204, 204, 204));
        viewPropertyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/system/Icons/icons8_show_property_26px.png"))); // NOI18N
        viewPropertyBtn.setText("View Properties");
        viewPropertyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPropertyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barjPanelLayout = new javax.swing.GroupLayout(barjPanel);
        barjPanel.setLayout(barjPanelLayout);
        barjPanelLayout.setHorizontalGroup(
            barjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userIcon)
                .addGap(39, 39, 39))
            .addGroup(barjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userIdjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userTypejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewPropertyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        barjPanelLayout.setVerticalGroup(
            barjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userIcon)
                .addGap(18, 18, 18)
                .addComponent(userNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userIdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(viewPropertyBtn)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        getContentPane().add(barjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        viewPropetyjPanel.setBackground(new java.awt.Color(115, 181, 239));

        tableViewProperties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Type", "Furniture", "Facitltise"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableViewProperties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewPropertiesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableViewProperties);

        bookBtn.setBackground(new java.awt.Color(204, 204, 204));
        bookBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/system/Icons/icons8_reserve_32px.png"))); // NOI18N
        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        loadDataFromDB.setBackground(new java.awt.Color(204, 204, 204));
        loadDataFromDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/system/Icons/icons8_data_backup_26px.png"))); // NOI18N
        loadDataFromDB.setText("Load Data");
        loadDataFromDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadDataFromDBActionPerformed(evt);
            }
        });

        fArea.setEditable(false);
        fArea.setBackground(new java.awt.Color(115, 181, 239));
        fArea.setColumns(20);
        fArea.setRows(5);
        fArea.setBorder(null);
        jScrollPane2.setViewportView(fArea);

        javax.swing.GroupLayout viewPropetyjPanelLayout = new javax.swing.GroupLayout(viewPropetyjPanel);
        viewPropetyjPanel.setLayout(viewPropetyjPanelLayout);
        viewPropetyjPanelLayout.setHorizontalGroup(
            viewPropetyjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPropetyjPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(viewPropetyjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewPropetyjPanelLayout.createSequentialGroup()
                        .addComponent(loadDataFromDB)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(imageP, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(viewPropetyjPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        viewPropetyjPanelLayout.setVerticalGroup(
            viewPropetyjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPropetyjPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(viewPropetyjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewPropetyjPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(imageP, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(viewPropetyjPanelLayout.createSequentialGroup()
                        .addGroup(viewPropetyjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewPropetyjPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(viewPropetyjPanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(loadDataFromDB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(bookBtn)
                        .addGap(29, 29, 29))))
        );

        containrjPanel.addTab("tab1", viewPropetyjPanel);

        getContentPane().add(containrjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -50, 730, 500));

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        filejMenu.setBackground(new java.awt.Color(204, 204, 204));
        filejMenu.setBorder(null);
        filejMenu.setText("File");

        viewPropertyjMenuItem.setBackground(new java.awt.Color(204, 204, 204));
        viewPropertyjMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/system/Icons/icons8_show_property_26px.png"))); // NOI18N
        viewPropertyjMenuItem.setText("View Properties");
        viewPropertyjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPropertyjMenuItemActionPerformed(evt);
            }
        });
        filejMenu.add(viewPropertyjMenuItem);
        filejMenu.add(jSeparator2);

        exitjMenu.setBackground(new java.awt.Color(204, 204, 204));
        exitjMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/system/Icons/icons8_cancel_26px.png"))); // NOI18N
        exitjMenu.setText("Exit");
        exitjMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitjMenuActionPerformed(evt);
            }
        });
        filejMenu.add(exitjMenu);

        jMenuBar1.add(filejMenu);

        helpjMenu.setBackground(new java.awt.Color(204, 204, 204));
        helpjMenu.setBorder(null);
        helpjMenu.setText("Help");

        helpjMenuItem.setBackground(new java.awt.Color(204, 204, 204));
        helpjMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/system/Icons/icons8_help_26px.png"))); // NOI18N
        helpjMenuItem.setText("Help !");
        helpjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpjMenuItemActionPerformed(evt);
            }
        });
        helpjMenu.add(helpjMenuItem);

        aboutUsjMenuItem.setBackground(new java.awt.Color(204, 204, 204));
        aboutUsjMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rental/system/Icons/icons8_about_26px.png"))); // NOI18N
        aboutUsjMenuItem.setText("About Us");
        aboutUsjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsjMenuItemActionPerformed(evt);
            }
        });
        helpjMenu.add(aboutUsjMenuItem);

        jMenuBar1.add(helpjMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewPropertyjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPropertyjMenuItemActionPerformed
        // TODO add your handling code here:
        containrjPanel.setSelectedIndex(0);
    }//GEN-LAST:event_viewPropertyjMenuItemActionPerformed

    private void exitjMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitjMenuActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_exitjMenuActionPerformed

    private void helpjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpjMenuItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "A tenant must register to the system in order to view or rent properties.\n"
                + "After the tenant creates an account, an approval from the management will be needed for to use the application.\n"
                + "An agent or an owner can use the application to publish their properties and they can make any modifications needed.\n"
                + "A management approval is also required for agents or owners to use their accounts.", "Help", 1);
    }//GEN-LAST:event_helpjMenuItemActionPerformed

    private void aboutUsjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsjMenuItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Our application provides an easy to use online platform for accommodation rental. \n"
                + "We aim to make our application to be user friendly for those who are willing to \n"
                + "rent accommodation and also for oweners and agents who are looking for tenants for their properties.", "About Us", 1);

    }//GEN-LAST:event_aboutUsjMenuItemActionPerformed

    private void viewPropertyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPropertyBtnActionPerformed
        // TODO add your handling code here:
        containrjPanel.setSelectedIndex(0);
    }//GEN-LAST:event_viewPropertyBtnActionPerformed

    private void loadDataFromDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadDataFromDBActionPerformed
        // TODO add your handling code here:
        displayPropertiesInfo();
    }//GEN-LAST:event_loadDataFromDBActionPerformed

    private void tableViewPropertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewPropertiesMouseClicked
        // TODO add your handling code here:
        getSelectedProperty(tableViewProperties);
    }//GEN-LAST:event_tableViewPropertiesMouseClicked

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        confirmBooking(property);
    }//GEN-LAST:event_bookBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TenantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TenantPage(user).setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Icons/icon.jpg")));
    }

    private void displayPropertiesInfo() {
        
        holdTheDataOfProperties = control.importPropertyDataFromDB(user);
        DefaultTableModel model = (DefaultTableModel) tableViewProperties.getModel();
        model.getDataVector().removeAllElements();
        revalidate();
        Object[] row = new Object[6];

        for (int i = 0; i < holdTheDataOfProperties.size(); i++) {
            if (holdTheDataOfProperties.get(i).getActivation().equals("Active") && holdTheDataOfProperties.get(i).getBook().equals("Available")) {
                row[0] = holdTheDataOfProperties.get(i).getId();
                row[1] = holdTheDataOfProperties.get(i).getName();
                row[2] = holdTheDataOfProperties.get(i).getPrice();
                row[3] = holdTheDataOfProperties.get(i).getType();
                row[4] = holdTheDataOfProperties.get(i).getFurniture();
                row[5] = holdTheDataOfProperties.get(i).getFacility();
                model.addRow(row);
            }
        }
    }

    private Property getSelectedProperty(JTable t) {
        int index = t.getSelectedRow();
        
        TableModel model = t.getModel();
        int id = Integer.parseInt(model.getValueAt(index, 0).toString());

        for (int i = 0; i < holdTheDataOfProperties.size(); i++) {

            if (holdTheDataOfProperties.get(i).getId() == id) {
                putImage(holdTheDataOfProperties.get(i).getPhoto());
                fArea.setText(holdTheDataOfProperties.get(i).getFacility());
                return property = holdTheDataOfProperties.get(i);
            }
        }
        return new Property();
    }
    
    private void confirmBooking(Property p) {
        p.setBook("Booked");
        control.setBooking(p);
        displayPropertiesInfo();
        imageP.setIcon(null);
    }

    private void putImage(String path) {
        ImageIcon image = new ImageIcon(path);
        Image img = image.getImage();
        Image imgFit = img.getScaledInstance(imageP.getWidth(), imageP.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon fit = new ImageIcon(imgFit);
        imageP.setIcon(fit);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutUsjMenuItem;
    private javax.swing.JPanel barjPanel;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTabbedPane containrjPanel;
    private javax.swing.JMenuItem exitjMenu;
    private javax.swing.JTextArea fArea;
    private javax.swing.JMenu filejMenu;
    private javax.swing.JMenu helpjMenu;
    private javax.swing.JMenuItem helpjMenuItem;
    private javax.swing.JLabel imageP;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JButton loadDataFromDB;
    private javax.swing.JTable tableViewProperties;
    private javax.swing.JLabel userIcon;
    private javax.swing.JLabel userIdjLabel;
    private javax.swing.JLabel userNamejLabel;
    private javax.swing.JLabel userTypejLabel;
    private javax.swing.JButton viewPropertyBtn;
    private javax.swing.JMenuItem viewPropertyjMenuItem;
    private javax.swing.JPanel viewPropetyjPanel;
    // End of variables declaration//GEN-END:variables
}