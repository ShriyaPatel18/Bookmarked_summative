/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package my.summative_project;

/**
 *
 * @author Richelle
 */
public class RecsPage extends javax.swing.JFrame {

    /**
     * Creates new form RecsPage
     */
    public RecsPage() {
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

        greenRecsPane = new javax.swing.JPanel();
        recsMainPanel = new javax.swing.JPanel();
        mysteryButton1 = new javax.swing.JButton();
        fantasyButton1 = new javax.swing.JButton();
        comicsButton1 = new javax.swing.JButton();
        nonFictionButton1 = new javax.swing.JButton();
        horrorButton1 = new javax.swing.JButton();
        romanceButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        greenRecsPane.setBackground(new java.awt.Color(217, 234, 211));
        greenRecsPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout greenRecsPaneLayout = new javax.swing.GroupLayout(greenRecsPane);
        greenRecsPane.setLayout(greenRecsPaneLayout);
        greenRecsPaneLayout.setHorizontalGroup(
            greenRecsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        greenRecsPaneLayout.setVerticalGroup(
            greenRecsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        recsMainPanel.setBackground(new java.awt.Color(249, 240, 230));
        recsMainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recommendations", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        mysteryButton1.setBackground(new java.awt.Color(183, 227, 200));
        mysteryButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        mysteryButton1.setText("Mystery");

        fantasyButton1.setBackground(new java.awt.Color(217, 234, 211));
        fantasyButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        fantasyButton1.setText("Fantasy");

        comicsButton1.setBackground(new java.awt.Color(183, 227, 200));
        comicsButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        comicsButton1.setText("Comics");

        nonFictionButton1.setBackground(new java.awt.Color(217, 234, 211));
        nonFictionButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        nonFictionButton1.setText("Non-fiction");

        horrorButton1.setBackground(new java.awt.Color(183, 227, 200));
        horrorButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        horrorButton1.setText("Horror");

        romanceButton1.setBackground(new java.awt.Color(217, 234, 211));
        romanceButton1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        romanceButton1.setText("Romance");

        jTextArea1.setBackground(new java.awt.Color(249, 240, 230));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("book \nbook");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout recsMainPanelLayout = new javax.swing.GroupLayout(recsMainPanel);
        recsMainPanel.setLayout(recsMainPanelLayout);
        recsMainPanelLayout.setHorizontalGroup(
            recsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recsMainPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(recsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(romanceButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horrorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mysteryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fantasyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comicsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nonFictionButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        recsMainPanelLayout.setVerticalGroup(
            recsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recsMainPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(recsMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recsMainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recsMainPanelLayout.createSequentialGroup()
                        .addComponent(horrorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(romanceButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mysteryButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fantasyButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comicsButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nonFictionButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(recsMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(greenRecsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recsMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(greenRecsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(RecsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comicsButton1;
    private javax.swing.JButton fantasyButton1;
    private javax.swing.JPanel greenRecsPane;
    private javax.swing.JButton horrorButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton mysteryButton1;
    private javax.swing.JButton nonFictionButton1;
    private javax.swing.JPanel recsMainPanel;
    private javax.swing.JButton romanceButton1;
    // End of variables declaration//GEN-END:variables
}
