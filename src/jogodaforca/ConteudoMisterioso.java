package src.jogodaforca;

import java.util.ArrayList;

public class ConteudoMisterioso extends Conteudo{
    private static ConteudoMisterioso conteudo = new ConteudoMisterioso();

    public static ConteudoMisterioso getInstancia() {
        return conteudo;
    }


    public ArrayList<Integer> validar(String letraString) {

        ArrayList<Integer> listaPosicoes = new ArrayList<>();
        char[] letra = letraString.toCharArray();

        for(int i=0;i<this.getPalavra().length();i++)
        {
            if(this.getPalavra().charAt(i) == letra[0])
            {
                listaPosicoes.add(i);
            }
        }
        return listaPosicoes;
    }
}

