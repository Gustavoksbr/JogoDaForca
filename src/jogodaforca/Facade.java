package src.jogodaforca;

import java.util.ArrayList;

public class Facade {
    public static ArrayList<String> letrasErradas = new ArrayList<>();
    public static void iniciar(String palavra){
        ConteudoMisterioso.getInstancia().setPalavra(palavra);
        int tamanho = palavra.length();
        ConteudoMostrado.getInstancia().resetar(tamanho);
    }
    public static String mostrarPalavra()
    {
        return Jogador.getInstancia().getVida() + "Vidas\nLetras Erradas: "+letrasErradas+"\nPalavra:" + ConteudoMostrado.getInstancia().getPalavra();

    }
    public static void checar(String letra)
   {
       ArrayList<Integer> lista = ConteudoMisterioso.getInstancia().validar(letra);
        if( !lista.isEmpty())
        {
            ConteudoMostrado.getInstancia().mudar(letra,lista);
        }
        else {
        Jogador.getInstancia().setVida(Jogador.getInstancia().getVida()-1);
        letrasErradas.add(letra);
        }
    }
}
