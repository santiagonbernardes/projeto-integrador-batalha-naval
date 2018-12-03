package jogo.frontEnd;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
        setExtendedState(NORMAL);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoIniciar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        backgroundTelaInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1024, 768));
        setMaximumSize(new java.awt.Dimension(1024, 780));
        setMinimumSize(new java.awt.Dimension(1024, 780));
        getContentPane().setLayout(null);

        botaoIniciar.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        botaoIniciar.setText("INICIAR");
        botaoIniciar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoIniciar);
        botaoIniciar.setBounds(840, 560, 140, 60);

        botaoSair.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        botaoSair.setText("SAIR");
        botaoSair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair);
        botaoSair.setBounds(880, 640, 100, 40);

        backgroundTelaInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo/frontEnd/images/logoJogoFinal.png"))); // NOI18N
        backgroundTelaInicio.setAlignmentY(0.0F);
        getContentPane().add(backgroundTelaInicio);
        backgroundTelaInicio.setBounds(0, 0, 1024, 768);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarActionPerformed
        TelaCadastro cadastro = new TelaCadastro();
        cadastro.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoIniciarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundTelaInicio;
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JButton botaoSair;
    // End of variables declaration//GEN-END:variables
}
