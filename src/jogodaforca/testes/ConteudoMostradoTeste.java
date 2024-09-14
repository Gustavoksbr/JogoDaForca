package src.jogodaforca.testes;

import src.jogodaforca.ConteudoMostrado;

import java.util.ArrayList;
import java.util.Arrays;

class ConteudoMostradoTeste
{
    public static void main(String[] args)
    {
        ConteudoMostrado.getInstancia().resetar(5);
        System.out.println("teste");
        System.out.println(ConteudoMostrado.getInstancia().getPalavra());
        System.out.println("testee");
        ConteudoMostrado.getInstancia().mudar("a", new ArrayList<>(Arrays.asList(2,3,4)));
        System.out.println(ConteudoMostrado.getInstancia().getPalavra());

    }
}