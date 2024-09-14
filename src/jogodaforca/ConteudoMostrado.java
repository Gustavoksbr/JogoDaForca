package src.jogodaforca;

import java.util.ArrayList;

public class ConteudoMostrado extends Conteudo{
    private static ConteudoMostrado conteudo = new ConteudoMostrado();

    public static ConteudoMostrado getInstancia(){
        return conteudo;
    }

    public void resetar(int tamanho)
    {
        char[] conteudoInicial = new char[tamanho];
        for(int i = 0; i<tamanho;i++ )
        {
            conteudoInicial[i]='_';
        }
        System.out.println(conteudoInicial);
        this.setPalavra(new String(conteudoInicial));
    }

    public void mudar(String letraString, ArrayList<Integer> lista) {
        char[] conteudoAtual = getPalavra().toCharArray();
        char[] letra = letraString.toCharArray();
        for(int i=0;i<lista.size();i++)
        {
            int posicao = lista.get(i);
            conteudoAtual[posicao]=letra[0];
        }
        this.setPalavra(new String(conteudoAtual));
    }
}


