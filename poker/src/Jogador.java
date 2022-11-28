public class Jogador{
    //Atributos
    int numeroDoJogador;
    int valorDaAposta=0;
    int numeroDeFichas;
    private boolean temCarta;
    Carta[] cartaJogador = new Carta[2];


    //métodos
    public Jogador(){
        //System.out.println("Novo jogador criado.");
    }
    public void setNumeroDoJogador(int numero){
        this.numeroDoJogador = numero;
        //System.out.println("código do jogador gerado");
    }
    public void setNumeroDeFichas(int numero){
        this.numeroDeFichas = numero;
        //System.out.println("fichas iniciais entregues.");
    }
    public void setTemCarta(boolean temCarta){
        this.temCarta = temCarta;
    }
    public void imprimeCartaJogador(int i){
        System.out.println("jogador 0"+(i+1));
        System.out.println(cartaJogador[0].nome+" "+cartaJogador[0].nipe);
        System.out.println(cartaJogador[1].nome+" "+cartaJogador[1].nipe);
    }
    public void setValorDaAposta(int valorDaAposta){
        this.valorDaAposta=valorDaAposta;
        System.out.println("O jogador apostou "+this.valorDaAposta+".");
    }
    public int getValorDaAposta(){
        return this.valorDaAposta;
    }
    public Carta[] getCartaJogador(){
        return cartaJogador;
    }

}
