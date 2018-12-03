package jogo.frontEnd;

import jogo.backEnd.BatalhaNaval;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class TelaDeJogo extends javax.swing.JFrame implements ActionListener {

    JButton[][] botoes = new JButton[BatalhaNaval.tabuleiro.length][BatalhaNaval.tabuleiro[0].length];//ele puxa o tamanho do tabuleiro, então se mudar o tabuleiro muda aqui também
    JPanel molduraMapa = new JPanel();

    public TelaDeJogo() {
        configuraMoldura();
        gereBotoes();
        initComponents();
        setTelaJogadorAtivo();
        BatalhaNaval.preenchaTabuleiro();
        setExtendedState(NORMAL);
        setResizable(false);
    }

    public void configuraTela() {
        this.setLayout(null);
        this.setSize(50, 50);
        this.setLocation(50, 50);
        configuraMoldura();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void configuraMoldura() {
        molduraMapa.setLayout(new GridLayout(BatalhaNaval.tabuleiro.length, BatalhaNaval.tabuleiro[0].length));
        molduraMapa.setBackground(Color.gray);
        molduraMapa.setSize(400, 400);
        molduraMapa.setLocation(170, 300);
        this.add(molduraMapa);
    }

    public void gereBotoes() {
        for (int i = 0; i < BatalhaNaval.tabuleiro.length; i++) {
            for (int j = 0; j < BatalhaNaval.tabuleiro[i].length; j++) {
                botoes[i][j] = new JButton();
                botoes[i][j].setFont(new Font("Dialog", Font.PLAIN, 8));
                botoes[i][j].setText(i + "," + j);
                botoes[i][j].setActionCommand(i + "," + j);
                botoes[i][j].addActionListener(this);
                molduraMapa.add(botoes[i][j]);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent botaoPressionado) {
        String[] fields = botaoPressionado.getActionCommand().split(",");
        int linha = Integer.parseInt(fields[0]);
        int coluna = Integer.parseInt(fields[1]);

        botoes[linha][coluna].setFont(new Font("Dialog", Font.PLAIN, 14));
        botoes[linha][coluna].setText(BatalhaNaval.pegueRepresentacaDoBarco(linha, coluna));
        if (BatalhaNaval.pegueRepresentacaDoBarco(linha, coluna).equalsIgnoreCase("A")) {
            botoes[linha][coluna].setBackground(Color.BLUE);
        } else {
            botoes[linha][coluna].setBackground(Color.RED);
        }
        BatalhaNaval.facaJogada(linha, coluna);
        botoes[linha][coluna].removeActionListener(this);
        pontuacaoJogador1.setText(Integer.toString(BatalhaNaval.totalPontosJogador1));
        pontuacaoJogador2.setText(Integer.toString(BatalhaNaval.totalPontosJogador2));
        if (BatalhaNaval.vencedor != null) {
            JOptionPane.showConfirmDialog(null, "A Batalha terminou! Calculando estatísticas.", "Warship Battle", JOptionPane.CLOSED_OPTION);
            TelaFim tela = new TelaFim();
            tela.setVisible(true);
            dispose();
        }
        turnoAtual.setText(Integer.toString(BatalhaNaval.turno));

        setTelaJogadorAtivo();
    }

    public void setTelaJogadorAtivo() {
        Border linhaAtivo = BorderFactory.createLineBorder(Color.GREEN, 10);
        TitledBorder bordaAtivo = BorderFactory.createTitledBorder(linhaAtivo, "Jogador ativo");

        Border linhaInativo = BorderFactory.createLineBorder(Color.RED, 2);
        TitledBorder bordaInativo = BorderFactory.createTitledBorder(linhaInativo, "Aguarde seu turno");

        if (BatalhaNaval.jogadorAtivo.equals(BatalhaNaval.jogador1)) {
            quadroJog1.setBorder(bordaAtivo);
            quadroJog2.setBorder(bordaInativo);
        } else {
            quadroJog2.setBorder(bordaAtivo);
            quadroJog1.setBorder(bordaInativo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTurnoGeral = new javax.swing.JPanel();
        painelTextoTurno = new javax.swing.JPanel();
        mostraTurnos = new javax.swing.JLabel();
        painelNumTurno = new javax.swing.JPanel();
        turnoAtual = new javax.swing.JLabel();
        quadroJog2 = new javax.swing.JPanel();
        nomeJogador2 = new javax.swing.JLabel();
        pontosJog2 = new javax.swing.JPanel();
        pontuacaoJogador2 = new javax.swing.JLabel();
        quadroJog1 = new javax.swing.JPanel();
        nomeJogador1 = new javax.swing.JLabel();
        pontosJog1 = new javax.swing.JPanel();
        pontuacaoJogador1 = new javax.swing.JLabel();
        tabelaPontos = new javax.swing.JLabel();
        backgroundTelaJogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 780));
        getContentPane().setLayout(null);

        painelTurnoGeral.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));

        mostraTurnos.setFont(new java.awt.Font("Agency FB", 1, 56)); // NOI18N
        mostraTurnos.setText("TURNO");

        javax.swing.GroupLayout painelTextoTurnoLayout = new javax.swing.GroupLayout(painelTextoTurno);
        painelTextoTurno.setLayout(painelTextoTurnoLayout);
        painelTextoTurnoLayout.setHorizontalGroup(
            painelTextoTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTextoTurnoLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(mostraTurnos)
                .addContainerGap())
        );
        painelTextoTurnoLayout.setVerticalGroup(
            painelTextoTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTextoTurnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mostraTurnos)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelNumTurnoLayout = new javax.swing.GroupLayout(painelNumTurno);
        painelNumTurno.setLayout(painelNumTurnoLayout);
        painelNumTurnoLayout.setHorizontalGroup(
            painelNumTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelNumTurnoLayout.setVerticalGroup(
            painelNumTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        turnoAtual.setFont(new java.awt.Font("Agency FB", 1, 56)); // NOI18N
        turnoAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        turnoAtual.setText(Integer.toString(BatalhaNaval.turno));
        this.repaint();

        javax.swing.GroupLayout painelTurnoGeralLayout = new javax.swing.GroupLayout(painelTurnoGeral);
        painelTurnoGeral.setLayout(painelTurnoGeralLayout);
        painelTurnoGeralLayout.setHorizontalGroup(
            painelTurnoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTurnoGeralLayout.createSequentialGroup()
                .addComponent(painelTextoTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(turnoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelNumTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(129, 129, 129))
        );
        painelTurnoGeralLayout.setVerticalGroup(
            painelTurnoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTurnoGeralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(painelTurnoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painelNumTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelTextoTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(painelTurnoGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(turnoAtual)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(painelTurnoGeral);
        painelTurnoGeral.setBounds(360, 70, 310, 100);

        quadroJog2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Jogador2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14))); // NOI18N

        nomeJogador2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        nomeJogador2.setText(BatalhaNaval.jogador2);

        pontosJog2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Pontos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        pontuacaoJogador2.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        pontuacaoJogador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pontuacaoJogador2.setText(Integer.toString(BatalhaNaval.totalPontosJogador2));

        javax.swing.GroupLayout pontosJog2Layout = new javax.swing.GroupLayout(pontosJog2);
        pontosJog2.setLayout(pontosJog2Layout);
        pontosJog2Layout.setHorizontalGroup(
            pontosJog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pontosJog2Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(pontuacaoJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        pontosJog2Layout.setVerticalGroup(
            pontosJog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pontuacaoJogador2)
        );

        javax.swing.GroupLayout quadroJog2Layout = new javax.swing.GroupLayout(quadroJog2);
        quadroJog2.setLayout(quadroJog2Layout);
        quadroJog2Layout.setHorizontalGroup(
            quadroJog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroJog2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nomeJogador2)
                .addGap(29, 29, 29)
                .addComponent(pontosJog2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        quadroJog2Layout.setVerticalGroup(
            quadroJog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroJog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeJogador2)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(quadroJog2Layout.createSequentialGroup()
                .addComponent(pontosJog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(quadroJog2);
        quadroJog2.setBounds(580, 180, 350, 100);

        quadroJog1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Jogador1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14))); // NOI18N

        nomeJogador1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        nomeJogador1.setText(BatalhaNaval.jogador1);

        pontosJog1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Pontos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        pontuacaoJogador1.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        pontuacaoJogador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pontuacaoJogador1.setText(Integer.toString(BatalhaNaval.totalPontosJogador1));

        javax.swing.GroupLayout pontosJog1Layout = new javax.swing.GroupLayout(pontosJog1);
        pontosJog1.setLayout(pontosJog1Layout);
        pontosJog1Layout.setHorizontalGroup(
            pontosJog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pontosJog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pontuacaoJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        pontosJog1Layout.setVerticalGroup(
            pontosJog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pontosJog1Layout.createSequentialGroup()
                .addComponent(pontuacaoJogador1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout quadroJog1Layout = new javax.swing.GroupLayout(quadroJog1);
        quadroJog1.setLayout(quadroJog1Layout);
        quadroJog1Layout.setHorizontalGroup(
            quadroJog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroJog1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(nomeJogador1)
                .addGap(29, 29, 29)
                .addComponent(pontosJog1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        quadroJog1Layout.setVerticalGroup(
            quadroJog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroJog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeJogador1)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(quadroJog1Layout.createSequentialGroup()
                .addComponent(pontosJog1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(quadroJog1);
        quadroJog1.setBounds(150, 180, 350, 100);

        tabelaPontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo/frontEnd/images/tabelaPontosFinal.png"))); // NOI18N
        getContentPane().add(tabelaPontos);
        tabelaPontos.setBounds(630, 320, 290, 360);

        backgroundTelaJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogo/frontEnd/images/telaJogoFinal.png"))); // NOI18N
        backgroundTelaJogo.setAlignmentY(0.0F);
        getContentPane().add(backgroundTelaJogo);
        backgroundTelaJogo.setBounds(0, 0, 1024, 768);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundTelaJogo;
    private javax.swing.JLabel mostraTurnos;
    private javax.swing.JLabel nomeJogador1;
    private javax.swing.JLabel nomeJogador2;
    private javax.swing.JPanel painelNumTurno;
    private javax.swing.JPanel painelTextoTurno;
    private javax.swing.JPanel painelTurnoGeral;
    private javax.swing.JPanel pontosJog1;
    private javax.swing.JPanel pontosJog2;
    private javax.swing.JLabel pontuacaoJogador1;
    private javax.swing.JLabel pontuacaoJogador2;
    private javax.swing.JPanel quadroJog1;
    private javax.swing.JPanel quadroJog2;
    private javax.swing.JLabel tabelaPontos;
    private javax.swing.JLabel turnoAtual;
    // End of variables declaration//GEN-END:variables

}
