package jogo.frontEnd;

import jogo.backEnd.BatalhaNaval;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
        painelCadastroGeral.setLocation(270, 250);
        BatalhaNaval.zereOsDados();
        setExtendedState(NORMAL);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastroGeral = new javax.swing.JPanel();
        painelCadastro = new javax.swing.JPanel();
        textoCadastro = new javax.swing.JLabel();
        textoJog1 = new javax.swing.JLabel();
        textoJog2 = new javax.swing.JLabel();
        campoNomeJogador1 = new javax.swing.JTextField();
        campoNomeJogador2 = new javax.swing.JTextField();
        botaoProntoJogador1 = new javax.swing.JButton();
        botaoProntoJogador2 = new javax.swing.JButton();
        prontoBatalha = new javax.swing.JButton();
        backgroundTelaCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 780));
        getContentPane().setLayout(null);

        painelCadastroGeral.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        painelCadastroGeral.setLayout(null);

        painelCadastro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        textoCadastro.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        textoCadastro.setText("CADASTRO DE JOGADORES");

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(textoCadastro)
                .addGap(31, 31, 31))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(textoCadastro)
                .addGap(21, 21, 21))
        );

        painelCadastroGeral.add(painelCadastro);
        painelCadastro.setBounds(0, -3, 475, 120);

        textoJog1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        textoJog1.setText("Jogador 1: ");
        painelCadastroGeral.add(textoJog1);
        textoJog1.setBounds(30, 140, 83, 29);

        textoJog2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        textoJog2.setText("Jogador 2: ");
        painelCadastroGeral.add(textoJog2);
        textoJog2.setBounds(20, 260, 89, 29);

        campoNomeJogador1.setText("NOME DO JOGADOR 1");
        painelCadastroGeral.add(campoNomeJogador1);
        campoNomeJogador1.setBounds(120, 140, 228, 35);

        campoNomeJogador2.setText("NOME DO JOGADOR 2");
        painelCadastroGeral.add(campoNomeJogador2);
        campoNomeJogador2.setBounds(120, 260, 228, 37);

        botaoProntoJogador1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        botaoProntoJogador1.setText("PRONTO");
        botaoProntoJogador1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoProntoJogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProntoJogador1ActionPerformed(evt);
            }
        });
        painelCadastroGeral.add(botaoProntoJogador1);
        botaoProntoJogador1.setBounds(360, 140, 97, 35);

        botaoProntoJogador2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        botaoProntoJogador2.setText("PRONTO");
        botaoProntoJogador2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoProntoJogador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProntoJogador2ActionPerformed(evt);
            }
        });
        painelCadastroGeral.add(botaoProntoJogador2);
        botaoProntoJogador2.setBounds(360, 260, 97, 35);

        prontoBatalha.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        prontoBatalha.setText("INICIAR BATALHA");
        prontoBatalha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        prontoBatalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prontoBatalhaActionPerformed(evt);
            }
        });
        painelCadastroGeral.add(prontoBatalha);
        prontoBatalha.setBounds(150, 330, 190, 60);

        getContentPane().add(painelCadastroGeral);
        painelCadastroGeral.setBounds(190, 148, 475, 410);

        backgroundTelaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo/frontEnd/images/logoJogoFinal.png"))); // NOI18N
        getContentPane().add(backgroundTelaCadastro);
        backgroundTelaCadastro.setBounds(0, 0, 1024, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atribuaNome(JTextField nome) {
        //Método para mudar o botão de pronto para ok e para desabilitar a entrada de nomes.
        if (nome.getText().equalsIgnoreCase(campoNomeJogador1.getText())) {
            BatalhaNaval.jogador1 = campoNomeJogador1.getText();
            botaoProntoJogador1.setText("OK!");
            botaoProntoJogador1.setEnabled(false);
            campoNomeJogador1.setEnabled(false);
        } else {
            BatalhaNaval.jogador2 = campoNomeJogador2.getText();
            botaoProntoJogador2.setText("OK!");
            botaoProntoJogador2.setEnabled(false);
            campoNomeJogador2.setEnabled(false);
        }
    }

    private void botaoProntoJogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProntoJogador1ActionPerformed
        if (!BatalhaNaval.valideNomes(campoNomeJogador1)) {
            JOptionPane.showMessageDialog(null, "Nome Inválido. O nome deve conter no máximo 10 caracteres e não podem ser iguais.");
        } else {
            atribuaNome(campoNomeJogador1);
        }
    }//GEN-LAST:event_botaoProntoJogador1ActionPerformed

    private void botaoProntoJogador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProntoJogador2ActionPerformed
        if (!BatalhaNaval.valideNomes(campoNomeJogador2)) {
            JOptionPane.showMessageDialog(null, "Nome Inválido. O nome deve conter no máximo 10 caracteres e não podem ser iguais.");
        } else {
            atribuaNome(campoNomeJogador2);
        }
    }//GEN-LAST:event_botaoProntoJogador2ActionPerformed

    private void prontoBatalhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prontoBatalhaActionPerformed
        if (BatalhaNaval.jogador1 == null || BatalhaNaval.jogador2 == null) {
            JOptionPane.showMessageDialog(null, "Os dois jogadores devem apresentar nomes válidos.");
        } else {
            BatalhaNaval.jogadorAtivo = BatalhaNaval.jogador1;
            TelaDeJogo tela = new TelaDeJogo();
            tela.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_prontoBatalhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundTelaCadastro;
    private javax.swing.JButton botaoProntoJogador1;
    private javax.swing.JButton botaoProntoJogador2;
    private javax.swing.JTextField campoNomeJogador1;
    private javax.swing.JTextField campoNomeJogador2;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPanel painelCadastroGeral;
    private javax.swing.JButton prontoBatalha;
    private javax.swing.JLabel textoCadastro;
    private javax.swing.JLabel textoJog1;
    private javax.swing.JLabel textoJog2;
    // End of variables declaration//GEN-END:variables
}
