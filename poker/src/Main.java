import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Mesa novaMesa = new Mesa();
        Baralho novoBaralho = new Baralho();

        System.out.println("Quantos jogadores estão na mesa? ");
        Scanner ler = new Scanner(System.in);
        int numeroDeJogadores = ler.nextInt();
        System.out.println("mesa com " + numeroDeJogadores + " jogadores criada.");


        System.out.println("Qual o numero de fichas incial para cada jogador?");
        int valorInicial = ler.nextInt();
        Jogador[] jogadores = new Jogador[numeroDeJogadores];

        int valorAposta = 0;

        for (int i = 0; i < numeroDeJogadores; i++) {
            jogadores[i] = new Jogador();
            jogadores[i].setNumeroDoJogador(i);
            jogadores[i].setNumeroDeFichas(valorInicial);
            jogadores[i].cartaJogador[0] = novoBaralho.darCartas();
            jogadores[i].cartaJogador[1] = novoBaralho.darCartas();
            jogadores[i].setTemCarta(true);
            jogadores[i].imprimeCartaJogador(i);
        }
        System.out.println();
        System.out.println("======= Apostas ======");
        //Apostas

        for (int i = 0; i < numeroDeJogadores; i++) {
            //System.out.println("Jogador "+(i+1));
            String aposta = new String();
            if ((jogadores[i].getValorDaAposta()) == (novaMesa.getValorAtualAposta())) {
                System.out.println("Jogador " + (i + 1) + ": Você deseja apostar algum valor?");
                aposta = ler.next();
                if (aposta.equals("Sim")) {
                    System.out.println("Digite o valor da aposta: ");
                    valorAposta = ler.nextInt();
                    jogadores[i].setValorDaAposta(valorAposta);
                    novaMesa.setValorAtualAposta(valorAposta);
                } else if (aposta.equals("Não")) {
                    System.out.println("Jogador " + (i + 1) + " não aumentou a aposta");
                }
            }else if (jogadores[i].getValorDaAposta() > novaMesa.getValorAtualAposta()) {
                novaMesa.setValorAtualAposta(valorAposta);
                System.out.println("Você deseja aumentar o valor apostado de " + jogadores[i].getValorDaAposta() + "?");
                aposta = ler.next();
                if (aposta.equals("Sim")) {
                    System.out.println("Digite o valor da aposta: ");
                    valorAposta = ler.nextInt();
                    jogadores[i].setValorDaAposta(valorAposta);
                    novaMesa.setValorAtualAposta(valorAposta);
                } else if (aposta.equals("Não")) {
                    System.out.println("Jogador " + (i + 1) + " não aumentou a aposta");
                }
            } else if ((jogadores[i].getValorDaAposta()) < (novaMesa.getValorAtualAposta())) {
                System.out.println("Jogador " + (i + 1) + ": quer cobrir o valor da aposta de " + novaMesa.getValorAtualAposta() + " fichas?");
                aposta = ler.next();
                if (aposta.equals("Sim")) {
                    System.out.println("Digite o valor da aposta: ");
                    valorAposta = ler.nextInt();
                    jogadores[i].setValorDaAposta(valorAposta);
                } else if (aposta.equals("Não")) {
                    jogadores[i].setTemCarta(false);
                    novaMesa.setNumeroDeJogadores(1);
                    System.out.println("O Jogador " + (i + 1) + "abandonou a mesa;");
                }
            }


        }
        novoBaralho.imprimirCartasNaMesa();
        novaMesa.quemGanhou();
    }
}
        //até 10 jogadores;
        //validar se tem menos que 2;
        //imprimir: jogador 1: cartas;
        //imprimir: jogador 2: cartas; ....
        //perguntar pro primeiro jogador: apostar, mesa, abandonar;
        //Segundo jogador pde apostar e volta pro primeiro se ele quer apostar o msm tanto...

        //quando todos tiverem apostado a msm quantidade, virar 5 cartas;
        //Quem ganhou o jogo?

        //Tal jogador que ganhou -> imprimir


        /*for(int i=0; i<numeroDeJogadores; i++){
            System.out.println("Você deseja abandonar, a mão ou apostar?");
            String escolhaJogador = ler.next();
            if(escolhaJogador. equals("abandonar")){
                abandonar();
                System.out.println("Jogador "+i+" abandonou a rodada");
            }else if (escolhaJogador. equals("apostar")){
                System.out.println("A aposta do jogador "+1+" é: "+apostar()+);
            }

        }*/

