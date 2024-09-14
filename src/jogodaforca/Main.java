package src.jogodaforca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letra = "";
        System.out.println("Digite a palavra para ser descoberta pelo seu adversário: ");
        String palavra = scanner.nextLine();
        Facade.iniciar(palavra);
        for(int i=0;i<30;i++) //intankavelmente o Java nao possui um metodo para limpar  o console. Provavelmente devido a sua natureza de maquina virtual. Entao printo esse monte de asterisco para o jogador2 não ver a resposta
        {
            System.out.println("**********************************");
        }
        while(!letra.equals("1"))
        {
            System.out.println("\nJOGO DA FORCA");
            System.out.println("Pressione 1 para parar");
            System.out.println(Facade.mostrarPalavra());
            System.out.println("Escolha uma letra: ");

            letra = scanner.nextLine();
            if (!letra.equals("1"))
            {
                if(letra.length()==1)
                {
                    Facade.checar(letra);
                    if(ConteudoMisterioso.getInstancia().getPalavra().equals(ConteudoMostrado.getInstancia().getPalavra()))
                    {
                        System.out.println("\nParabéns! Você acertou a palavra: "+ConteudoMostrado.getInstancia().getPalavra());
                        break;
                    }
                    else if(Jogador.getInstancia().getVida()==0)
                    {
                        System.out.println("\nVocê perdeu todas as vidas! A palavra era: "+ConteudoMisterioso.getInstancia().getPalavra());
                        break;
                    }
                }
                else
                {
                    System.out.println("Tem que chutar uma letra por vez!");
                }
            }


        }

    }
}