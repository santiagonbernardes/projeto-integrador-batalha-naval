package jogo.backEnd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BatalhaNaval {

    //Declaração de variáveis
    public static char[][] tabuleiro;//Mapa do jogo
    public static String vencedor;//Armazena o vencedor da partida e serve como indicador do termino do jogo.
    public static String jogador1;//Armazena o nome do jogador 1
    public static String jogador2;//Armazena o nome do jogador 2
    public static String jogadorAtivo;//Armazena o nome do jogador cujo turno está ativo
    public static int turno;//Armazena o turno atual
    public static List<Integer> placarJogador1;//Armazena os pontos turno a turno do jogador 1
    public static List<Integer> placarJogador2;//Armazena os pontos turno a turno do jogador 2
    public static int totalPontosJogador1;//Armazena o total de pontos marcados pelo jogador 1
    public static int totalPontosJogador2;//Armazena o total de pontos marcados pelo jogador 2
    
    //Métodos
    
    //1 - Métodos para a criação do mapa
    
    /*
    Os métodos a seguir verificam em que orientação o barco será colocado.
    O primeiro passo de cada método é verificar se, com base na posição inicial gerada aleatoriamente,
    o barco não extrapola o tamanho da matriz.
    O segundo passo é verificar se as posições onde queremos colocar nosso barco não está ocupada por
    outra embarcação.
    */
    private static boolean vaParaBaixo(int linhaInicial, int colunaInicial, int tamanhoDoBarco) {
        if (linhaInicial + tamanhoDoBarco > tabuleiro.length) {//Verifica se não extrapola o tamanho da matriz
            return false;
        }
        for (int i = linhaInicial; i < linhaInicial + tamanhoDoBarco; i++) {//Percorre a matriz
            //O tipo char é inicializado com 0.
            if (tabuleiro[i][colunaInicial] != 0) {//Verifica se já não temos um barco nas posições.
                return false;
            }
        }
        return true;
    }

    private static boolean vaParaCima(int linhaInicial, int colunaInicial, int tamanhoDoBarco) {
        if (linhaInicial - tamanhoDoBarco <= 0) {
            return false;
        }
        for (int i = linhaInicial; i > linhaInicial - tamanhoDoBarco; i--) {
            if (tabuleiro[i][colunaInicial] != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean vaParaDireita(int linhaInicial, int colunaInicial, int tamanhoDoBarco) {
        if (colunaInicial + tamanhoDoBarco > tabuleiro[0].length) {
            return false;
        }
        for (int i = colunaInicial; i < colunaInicial + tamanhoDoBarco; i++) {
            if (tabuleiro[linhaInicial][i] != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean vaParaEsquerda(int linhaInicial, int colunaInicial, int tamanhoDoBarco) {
        if (colunaInicial - tamanhoDoBarco <= 0) {
            return false;
        }
        for (int i = colunaInicial; i > colunaInicial - tamanhoDoBarco; i--) {
            if (tabuleiro[linhaInicial][i] != 0) {
                return false;
            }
        }
        return true;
    }
    
    
    /*
    O método a seguir permite a criação de barcos para o mapa. Fizemos de forma que o mesmo método possa atender
    uma eventual mudança dos requisitos. Para se criar um barco basta informar seu tamanho e sua representação.
    */
    private static void coloqueBarco(char representacaoDoBarco, int tamanhoDoBarco) {
        Random random = new Random();//Tipo que permite gerar números aleatórios
        boolean barcoColocado = false;//Controla se o barco já foi escrito na matriz
        List<Integer> direcoes = new ArrayList<>(Arrays.asList(1, 2, 3, 4));//Lista auxiliar para aleatoriedade da orientação

        while (!barcoColocado) {
            int linhaInicial = random.nextInt(tabuleiro.length);
            int colunaInicial = random.nextInt(tabuleiro[0].length);
            //linhaInicial e colunaInicial forma a posição inicial do barco no mapa.
            boolean direcaoValida = false;//Controla se foi encontrada uma orientação válida para o barco
            int direcao = 0;//Como existem 4 orientações possível, esta variável será incrementada até 4 na pior das hipóteses
            Collections.shuffle(direcoes);//Embaralha a lista direções, para que os métodos de orientação sejam chamados aleatoriamente

            while (!direcaoValida) {
                switch (direcoes.get(direcao)) {
                    case 1:
                        if (vaParaBaixo(linhaInicial, colunaInicial, tamanhoDoBarco)) {
                            for (int i = linhaInicial; i < linhaInicial + tamanhoDoBarco; i++) {
                                tabuleiro[i][colunaInicial] = representacaoDoBarco;
                            }
                            barcoColocado = true;
                        }
                        break;
                    case 2:
                        if (vaParaCima(linhaInicial, colunaInicial, tamanhoDoBarco)) {
                            for (int i = linhaInicial; i > linhaInicial - tamanhoDoBarco; i--) {
                                tabuleiro[i][colunaInicial] = representacaoDoBarco;
                            }
                            barcoColocado = true;
                        }
                        break;
                    case 3:
                        if (vaParaDireita(linhaInicial, colunaInicial, tamanhoDoBarco)) {
                            for (int i = colunaInicial; i < colunaInicial + tamanhoDoBarco; i++) {
                                tabuleiro[linhaInicial][i] = representacaoDoBarco;
                            }
                            barcoColocado = true;
                        }
                        break;
                    case 4:
                        if (vaParaEsquerda(linhaInicial, colunaInicial, tamanhoDoBarco)) {
                            for (int i = colunaInicial; i > colunaInicial - tamanhoDoBarco; i--) {
                                tabuleiro[linhaInicial][i] = representacaoDoBarco;
                            }
                            barcoColocado = true;
                        }
                        break;
                }
                direcao++;
                if (barcoColocado || direcao == direcoes.size()) {
                    direcaoValida = true;
                }

            }
        }
    }
    
    /*
    O método a seguir chama o método coloqueBarco conforme o número e representação dos barcos nos requisitos.
    */

    public static void preenchaTabuleiro() {
        coloqueBarco('P', 5);//1 Porta Aviões de 5 posições

        for (int i = 1; i <= 2; i++) {//2 Navios de 4 posições
            coloqueBarco('N', 4);
        }
        for (int i = 1; i <= 3; i++) {
            coloqueBarco('C', 3);
        }

        for (int i = 1; i <= 4; i++) {
            coloqueBarco('D', 2);
        }

        for (int i = 1; i <= 5; i++) {
            coloqueBarco('S', 1);
        }

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == 0) {
                    tabuleiro[i][j] = 'A';
                }
            }
        }
    }   
    
    //2 - Mecânicas das partidas
    
    //Método para iniciar as variáveis do sistema e permitir um novo jogo.
    public static void zereOsDados() {
        tabuleiro = new char[10][10];
        turno = 1;
        placarJogador1 = new ArrayList<>();
        placarJogador2 = new ArrayList<>();
        totalPontosJogador1 = 0;
        totalPontosJogador2 = 0;
        if (vencedor == null) {
            jogador1 = null;
            jogador2 = null;
        } else {
            vencedor = null;
        }
    }
    
    //Método que define o valor da variável jogadorAtivo
    private static void definaJogadorAtivo() {
        if (jogadorAtivo.equals(null) || jogadorAtivo.equalsIgnoreCase(jogador2)) {
            jogadorAtivo = jogador1;
        } else {
            jogadorAtivo = jogador2;
        }
    }
    
    //Método que sabe a pontuação de cada barco. Caso algum novo tipo de barco seja adicionado
    //este método deve ser alterado.
    private static int peguePonto(char representacaoDoBarco) {
        int ponto = 0;

        switch (representacaoDoBarco) {
            case 'P':
                ponto = 5;
                break;
            case 'N':
                ponto = 4;
                break;
            case 'C':
                ponto = 3;
                break;
            case 'D':
                ponto = 2;
                break;
            case 'S':
                ponto = 1;
                break;
        }
        return ponto;
    }
    
    //Com este método é possível saber o máximo de pontos que será possível marcar na partida.
    //O total de ponos servirá como gatilho para o fim do jogo.
    private static int calculeTotalPontosTabuleiro() {
        int total = 0;
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                total += peguePonto(tabuleiro[i][j]);
            }

        }
        return total;
    }
    
    //Adiciona a pontuação de cada jogador à lista, de acordo com o jogador ativo
    private static void marquePonto(int ponto) {
        if (jogadorAtivo.equalsIgnoreCase(jogador1)) {
            placarJogador1.add(ponto);
        } else {
            placarJogador2.add(ponto);
        }
    }
    
    //Calcula a taxa de acerto, criterio de desempate, ao percorrer a lista.
    public static double calculeTaxaDeAcerto(String jogador) {
        double taxa;
        int acerto = 0;
        if (jogador.equalsIgnoreCase(jogador1)) {
            for (Integer ponto : placarJogador1) {
                if (ponto != 0) {
                    acerto++;
                }
            }
            taxa = acerto * 100 / placarJogador1.size();
        } else {
            for (Integer ponto : placarJogador2) {
                if (ponto != 0) {
                    acerto++;
                }
            }
            taxa = acerto * 100 / placarJogador2.size();
        }
        return taxa;
    }

    //Retorna o total de pontos marcados pelo jogador ativo, de acordo com sua lista.
    private static void atualizePontosJogador() {
        int total = 0;
        if (jogadorAtivo.equalsIgnoreCase(jogador1)) {
            for (Integer ponto : placarJogador1) {
                total += ponto;
            }
            totalPontosJogador1 = total;
        } else {
            for (Integer ponto : placarJogador2) {
                total += ponto;
            }
            totalPontosJogador2 = total;
        }
    }
    
    //Verifica, com base nas condições de vitória e desempate, quem é o vencedor da partida.
    public static String definaVencedor() {
        if (totalPontosJogador1 > totalPontosJogador2) {
            return jogador1;
        } else if (totalPontosJogador2 > totalPontosJogador1) {
            return jogador2;
        } else if (calculeTaxaDeAcerto(jogador1) > calculeTaxaDeAcerto(jogador2)) {
            return jogador1;
        } else if (calculeTaxaDeAcerto(jogador2) > calculeTaxaDeAcerto(jogador1)) {
            return jogador2;
        } else {
            return "Empate";
        }
    }
    
    //Método que agrega toda a mecânica de uma jogada, chamado os métodos criados acima.
    public static void facaJogada(int linha, int coluna) {
        marquePonto(peguePonto(tabuleiro[linha][coluna]));
        atualizePontosJogador();

        if (turno > 1 && turno % 10 == 0 && jogadorAtivo.equalsIgnoreCase(jogador2) && turno != 50) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar a partida?", "Warship Battle", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                vencedor = definaVencedor();
            }
        }

        if (jogadorAtivo.equals(jogador2)) {
            turno++;
        }

        if (totalPontosJogador1 + totalPontosJogador2 == calculeTotalPontosTabuleiro()) {
            vencedor = definaVencedor();
            if (jogadorAtivo.equalsIgnoreCase(jogador1)) {
                placarJogador2.add(0);
            }
        }

        definaJogadorAtivo();
    }
    
    //Método de validação dos nomes e easter egg
    public static boolean valideNomes(JTextField nome) {
        if (!nome.getText().matches("^\\p{L}{1,10}$") || nome.getText().equalsIgnoreCase(jogador1) || nome.getText().equalsIgnoreCase(jogador2)) {
            return false;
        }//Brincadeira com os professores na validação
        else if(nome.getText().equalsIgnoreCase("Elisabete") || nome.getText().equalsIgnoreCase("Bete") || nome.getText().equalsIgnoreCase("Beth")){
            JOptionPane.showMessageDialog(null, "+10 pra esse grupo!");
        } else if(nome.getText().equalsIgnoreCase("Ujeverson")){
            JOptionPane.showMessageDialog(null, "Nome inválido!");
            JOptionPane.showMessageDialog(null, "Brinks =D");
        }
        return true;
    }
    
    //Método usado no front-end para verificar o back-end
    public static String pegueRepresentacaDoBarco(int linha, int coluna) {
        return Character.toString(tabuleiro[linha][coluna]);
    }

    //Método auxiliar na geração da tabela de pontuação ao fim da partida
    public static List<String> pegueTurnosJogados() {
        List<String> turnosJogados = new ArrayList<>();

        for (int i = 1; i <= placarJogador1.size(); i++) {
            turnosJogados.add("T" + i);
        }

        return turnosJogados;
    }
}
