package com.mycompany.jogo;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Partidas partidas = new Partidas();
        Pontuacao pontuacao = new Pontuacao();
        Vida vida = new Vida();               
              Partidas.questao1(args);
       

       
    
    }
    

}
class painel extends Jogo{
      public static void Paineladmin(String[] args) {
      Pontuacao pontuacao = new Pontuacao();
      Vida vida = new Vida();
       int id = 5;
       Scanner entrada = new Scanner(System.in);
        System.out.println("(1) Adicionar pontos.");
        System.out.println("(2) Remover Vida.");
        System.out.println("(0) Encerrar teste.");
            while( id != 0){
               id = entrada.nextInt();
               int pontos = 1;
               switch(id){
                   case 1:
                       pontuacao.subirnivel(pontos);
                       System.out.println("Pontuação: " +pontuacao.getPontuacao());
                       break;
                   case 2:
                        vida.PerderPontos(pontos);
                        System.out.println("Vida: " +vida.getLife());
                        break;
                   
                   default:
                    break;
                       
               }
               
            }   
    }
}
