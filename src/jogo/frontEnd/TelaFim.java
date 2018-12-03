package jogo.frontEnd;

import jogo.backEnd.BatalhaNaval;

public class TelaFim extends javax.swing.JFrame {

    public TelaFim() {
        initComponents();
        nomeVencedor.setText(BatalhaNaval.vencedor);
        painelVencedor.setLayout(null);
        nomeVencedor.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        nomeJog2.setText(BatalhaNaval.jogador2);
        nomeJog1.setText(BatalhaNaval.jogador1);
        setExtendedState(NORMAL);
        setResizable(false);
        nomeJog1Fim.setText(BatalhaNaval.jogador1);
        nomeJog2Fim.setText(BatalhaNaval.jogador2);
        pontoTotaljog1.setText(Integer.toString(BatalhaNaval.totalPontosJogador1));
        pontoTotalJog2.setText(Integer.toString(BatalhaNaval.totalPontosJogador2));
        taxaAcertoJog1.setText(Double.toString(BatalhaNaval.calculeTaxaDeAcerto(BatalhaNaval.jogador1)));
        taxaAcertoJog2.setText(Double.toString(BatalhaNaval.calculeTaxaDeAcerto(BatalhaNaval.jogador2)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelVencedor = new javax.swing.JPanel();
        nomeVencedor = new javax.swing.JLabel();
        botaoJogadorDiferentes = new javax.swing.JButton();
        botaoJogarNovamente = new javax.swing.JButton();
        botaoQuit = new javax.swing.JButton();
        barraRolagemTabela = new javax.swing.JScrollPane();
        tabelaPontos = new javax.swing.JTable();
        nomeJog2 = new javax.swing.JLabel();
        nomeJog1 = new javax.swing.JLabel();
        painelTabelaTotal = new javax.swing.JPanel();
        nomeJog1Fim = new javax.swing.JLabel();
        nomeJog2Fim = new javax.swing.JLabel();
        textoTotalPontos = new javax.swing.JLabel();
        textoTaxaAcerto = new javax.swing.JLabel();
        pontoTotaljog1 = new javax.swing.JLabel();
        taxaAcertoJog1 = new javax.swing.JLabel();
        pontoTotalJog2 = new javax.swing.JLabel();
        taxaAcertoJog2 = new javax.swing.JLabel();
        backgroundTelaFim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 780));
        getContentPane().setLayout(null);

        painelVencedor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "VENCEDOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24))); // NOI18N
        painelVencedor.setLayout(null);

        nomeVencedor.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        nomeVencedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeVencedor.setText("VENCEDOR");
        painelVencedor.add(nomeVencedor);
        nomeVencedor.setBounds(83, 42, 374, 44);

        getContentPane().add(painelVencedor);
        painelVencedor.setBounds(240, 60, 540, 120);

        botaoJogadorDiferentes.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        botaoJogadorDiferentes.setText("TROCAR JOGADORES");
        botaoJogadorDiferentes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoJogadorDiferentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJogadorDiferentesActionPerformed(evt);
            }
        });
        getContentPane().add(botaoJogadorDiferentes);
        botaoJogadorDiferentes.setBounds(800, 540, 180, 50);

        botaoJogarNovamente.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        botaoJogarNovamente.setText("RECOMEÇAR");
        botaoJogarNovamente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        botaoJogarNovamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJogarNovamenteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoJogarNovamente);
        botaoJogarNovamente.setBounds(850, 600, 130, 50);

        botaoQuit.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        botaoQuit.setText("SAIR");
        botaoQuit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoQuitActionPerformed(evt);
            }
        });
        getContentPane().add(botaoQuit);
        botaoQuit.setBounds(900, 660, 80, 40);

        barraRolagemTabela.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        barraRolagemTabela.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        barraRolagemTabela.setMaximumSize(new java.awt.Dimension(700, 700));
        barraRolagemTabela.setPreferredSize(new java.awt.Dimension(0, 0));

        tabelaPontos.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        tabelaPontos.setModel(new Tabela(BatalhaNaval.pegueTurnosJogados(), BatalhaNaval.placarJogador1, BatalhaNaval.placarJogador2));
        tabelaPontos.setAlignmentX(0.0F);
        tabelaPontos.setAlignmentY(0.0F);
        tabelaPontos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabelaPontos.setCellSelectionEnabled(true);
        tabelaPontos.setRowHeight(30);
        barraRolagemTabela.setViewportView(tabelaPontos);

        getContentPane().add(barraRolagemTabela);
        barraRolagemTabela.setBounds(180, 270, 750, 110);

        nomeJog2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        nomeJog2.setForeground(new java.awt.Color(255, 255, 255));
        nomeJog2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeJog2.setText("jLabel2");
        nomeJog2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(nomeJog2);
        nomeJog2.setBounds(30, 330, 120, 30);

        nomeJog1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        nomeJog1.setForeground(new java.awt.Color(255, 255, 255));
        nomeJog1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeJog1.setText("jLabel2");
        nomeJog1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nomeJog1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(nomeJog1);
        nomeJog1.setBounds(30, 290, 120, 30);

        painelTabelaTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        painelTabelaTotal.setLayout(null);

        nomeJog1Fim.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        nomeJog1Fim.setText("Jogador1");
        painelTabelaTotal.add(nomeJog1Fim);
        nomeJog1Fim.setBounds(15, 77, 160, 29);

        nomeJog2Fim.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        nomeJog2Fim.setText("Jogador2");
        painelTabelaTotal.add(nomeJog2Fim);
        nomeJog2Fim.setBounds(15, 124, 170, 29);

        textoTotalPontos.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        textoTotalPontos.setText("Pontuação Total");
        painelTabelaTotal.add(textoTotalPontos);
        textoTotalPontos.setBounds(180, 20, 120, 29);

        textoTaxaAcerto.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        textoTaxaAcerto.setText("Taxa de acertos (%)");
        painelTabelaTotal.add(textoTaxaAcerto);
        textoTaxaAcerto.setBounds(370, 20, 159, 29);

        pontoTotaljog1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        pontoTotaljog1.setText("jLabel1");
        painelTabelaTotal.add(pontoTotaljog1);
        pontoTotaljog1.setBounds(230, 80, 47, 29);

        taxaAcertoJog1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        taxaAcertoJog1.setText("jLabel1");
        painelTabelaTotal.add(taxaAcertoJog1);
        taxaAcertoJog1.setBounds(430, 80, 47, 29);

        pontoTotalJog2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        pontoTotalJog2.setText("jLabel1");
        painelTabelaTotal.add(pontoTotalJog2);
        pontoTotalJog2.setBounds(230, 120, 47, 29);

        taxaAcertoJog2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        taxaAcertoJog2.setText("jLabel1");
        painelTabelaTotal.add(taxaAcertoJog2);
        taxaAcertoJog2.setBounds(430, 120, 47, 29);

        getContentPane().add(painelTabelaTotal);
        painelTabelaTotal.setBounds(120, 490, 560, 170);

        backgroundTelaFim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo/frontEnd/images/telaJogoFinal.png"))); // NOI18N
        backgroundTelaFim.setText("jLabel1");
        backgroundTelaFim.setMaximumSize(new java.awt.Dimension(1024, 768));
        backgroundTelaFim.setMinimumSize(new java.awt.Dimension(1024, 768));
        backgroundTelaFim.setPreferredSize(new java.awt.Dimension(0, 0));
        getContentPane().add(backgroundTelaFim);
        backgroundTelaFim.setBounds(0, 0, 1024, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoQuitActionPerformed
        dispose();
    }//GEN-LAST:event_botaoQuitActionPerformed

    private void botaoJogadorDiferentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJogadorDiferentesActionPerformed
        BatalhaNaval.vencedor = null;
        TelaCadastro tela = new TelaCadastro();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoJogadorDiferentesActionPerformed

    private void botaoJogarNovamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJogarNovamenteActionPerformed
        BatalhaNaval.zereOsDados();
        TelaDeJogo telaDeJogo = new TelaDeJogo();
        dispose();
        telaDeJogo.setVisible(true);
    }//GEN-LAST:event_botaoJogarNovamenteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundTelaFim;
    private javax.swing.JScrollPane barraRolagemTabela;
    private javax.swing.JButton botaoJogadorDiferentes;
    private javax.swing.JButton botaoJogarNovamente;
    private javax.swing.JButton botaoQuit;
    private javax.swing.JLabel nomeJog1;
    private javax.swing.JLabel nomeJog1Fim;
    private javax.swing.JLabel nomeJog2;
    private javax.swing.JLabel nomeJog2Fim;
    private javax.swing.JLabel nomeVencedor;
    private javax.swing.JPanel painelTabelaTotal;
    private javax.swing.JPanel painelVencedor;
    private javax.swing.JLabel pontoTotalJog2;
    private javax.swing.JLabel pontoTotaljog1;
    private javax.swing.JTable tabelaPontos;
    private javax.swing.JLabel taxaAcertoJog1;
    private javax.swing.JLabel taxaAcertoJog2;
    private javax.swing.JLabel textoTaxaAcerto;
    private javax.swing.JLabel textoTotalPontos;
    // End of variables declaration//GEN-END:variables
}
