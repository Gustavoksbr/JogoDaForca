package src.jogodaforca.testes;
import src.jogodaforca.*;

public class ConteudoMisteriosoTeste
{
    public static void main(String[] args)
    {
        System.out.println("teste");
        ConteudoMisterioso.getInstancia().setPalavra("teste");
        System.out.println(ConteudoMisterioso.getInstancia().getPalavra());
        System.out.println(ConteudoMisterioso.getInstancia().validar("e"));
    }
}
