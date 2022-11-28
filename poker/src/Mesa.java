import java.util.Scanner;

public class Mesa {
    int numeroDeJogadores;
    int valorAtualAposta=0;

    public Mesa(){

    }
    public void setValorAtualAposta(int aposta){
        this.valorAtualAposta = aposta;
    }
    public int getValorAtualAposta(){
        return this.valorAtualAposta;
    }
    public void setNumeroDeJogadores(int i){
        if(i==1){
            this.numeroDeJogadores--;
        }
    }
    public void quemGanhou(){
        Jogador[] jogadores = new Jogador[this.numeroDeJogadores];
        Carta[] cartasGanhador = new Carta[2];
        System.out.println("quem ganhou?");
        for(int i=0; i< this.numeroDeJogadores; i++){
            System.out.println("teste1");
            System.out.println((i+1)+" - Jogador 0"+(i+1));
        }
        System.out.println("teste2");
        Scanner ler = new Scanner(System.in);
        int ganhador = ler.nextInt();

        cartasGanhador= jogadores[ganhador-1].getCartaJogador();
        System.out.println("Resultado");
        System.out.println(cartasGanhador[0].nome+" "+cartasGanhador[0].nipe);
        System.out.println(cartasGanhador[1].nome+" "+cartasGanhador[1].nipe);

    }
}
