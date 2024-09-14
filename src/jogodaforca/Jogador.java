package src.jogodaforca;

public class Jogador {
    private static Jogador jogador = new Jogador(5);

    public static Jogador getInstancia() {
        return jogador;
    }
    private int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    private Jogador(int vida)
    {
        setVida(vida);
    }
}


