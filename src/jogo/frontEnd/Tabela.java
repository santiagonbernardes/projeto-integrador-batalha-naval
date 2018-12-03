package jogo.frontEnd;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Tabela extends AbstractTableModel {

    List<String> turnosJogados;
    List<Integer> pontosJogador1;
    List<Integer> pontosJogador2;

    public Tabela(List<String> turnosJogados, List<Integer> pontosJogador1, List<Integer> pontosJogador2) {
        this.turnosJogados = turnosJogados;
        this.pontosJogador1 = pontosJogador1;
        this.pontosJogador2 = pontosJogador2;
    }

    @Override
    public int getRowCount() {
        return 2;
    }

    @Override
    public int getColumnCount() {
        return turnosJogados.size();
    }

    @Override
    public String getColumnName(int column) {
        return turnosJogados.get(column);
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (linha) {
            case 0:
                return pontosJogador1.get(coluna);
            case 1:
                return pontosJogador2.get(coluna);
        }
        return null;
    }
}
