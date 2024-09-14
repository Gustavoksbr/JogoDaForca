package src.jogodaforca.testes;

import src.jogodaforca.Jogador;

class Jogadorteste
{
    public static void main(String[] args)
    {
        System.out.println(Jogador.getInstancia().getVida());
        int vida = Jogador.getInstancia().getVida()-1;
        Jogador.getInstancia().setVida(vida);
        System.out.println(Jogador.getInstancia().getVida());
    }
}