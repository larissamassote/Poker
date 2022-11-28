import java.lang.Math;
public class Baralho {
    //atributos
    Carta[] cartas = new Carta[52];

    public Baralho(){
        int nipe=0;
        int nomeIndice=2;

        for(int n=0; n<52; n++) {
            cartas[n] = new Carta();
            cartas[n].setNome(nomeIndice + "");
            switch (nipe) {
                case 0:
                    this.cartas[n].setNipe("♣");
                    break;
                case 1:
                    this.cartas[n].setNipe("♦");
                    break;
                case 2:
                    this.cartas[n].setNipe("♠");
                    break;
                case 3:
                    this.cartas[n].setNipe("♥");
                    break;
            }
            nipe++;
            nomeIndice++;
            if (nipe > 3) {
                nipe = 0;
            }
            if(nomeIndice>10){
                nomeIndice=2;
            }
        }
        System.out.println("Baralho criado.");
    }
    public Carta darCartas() {
        int randomNum;
        int j = randomNum = (int) (Math.random() * 51);
        //System.out.println("numero aleatorio gerado: "+j);
        Carta escolhida = null;
        if (this.cartas[j] != null) {
            escolhida = this.cartas[j];
            this.cartas[j] = null;
        } else {
            darCartas();
        }
        return escolhida;
    }
    public void imprimirCartasNaMesa(){
        Carta[] cartasMesa = new Carta[5];

        for(int i=0; i<5; i++){
            cartasMesa[i]=darCartas();
            System.out.println(cartasMesa[i].nome+" "+cartasMesa[i].nipe);
        }
    }
}