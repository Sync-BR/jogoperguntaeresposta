
package com.mycompany.jogo;

import java.util.Scanner;

import com.mycompany.jogo.Pontuacao;
import com.mycompany.jogo.Vida;

public class Partidas {

Partidas(){
    
    
}
        
    public static void questao1(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Vida vida = new Vida();
        Pontuacao pontuacao = new Pontuacao();
        String Pergunta = "Qual é a capital da França?";
        String a,b,c;
        a = "Berlim";
        b = "Paris";
        c = "Londres";
        boolean Proximaetapa = false;
        String gabarito1 = "b";
 
        while(Proximaetapa == false){

            System.out.println(Pergunta);
            System.out.println("(A)" +a);          
            System.out.println("(B)" +b);          
            System.out.println("(C)" +c);          
            System.out.print("Qual a Resposta: ");
            String resp = entrada.nextLine(); 
                if(resp.equalsIgnoreCase(gabarito1)){
                       //Painel do usuario
                    Proximaetapa = true;
                    pontuacao.subirnivel(1);
                    System.out.println("Pontos acumulado:  " +pontuacao.getPontuacao());
                    System.out.println("Vida: " +vida.getLife());
                    Partidas.questao2(args);
                    break;
                   
                } else {
                 int pts = 1;
                   System.out.println("Você perdeu : " +pts+ " de vida");
                   vida.PerderPontos(pts);
                   System.out.println("Pontos acumulado:  " +pontuacao.getPontuacao());
                   System.out.println("Vida: " +vida.getLife());
                   Proximaetapa = false;
                   
                }   
                
        }   
       
   }
    
      public static void questao2(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Vida vida = new Vida();
        Pontuacao pontuacao = new Pontuacao();
        Painelusuario painel = new Painelusuario();
        String Pergunta = " Qual é o maior planeta do nosso sistema solar?";
        String a,b,c;
        a = "Terra";
        b = "Vênus";
        c = "Júpiter";
        boolean Proximaetapa = false;
        String gabarito1 = "c";
        while(Proximaetapa == false){

            System.out.println(Pergunta);
            System.out.println("(A)" +a);          
            System.out.println("(B)" +b);          
            System.out.println("(C)" +c);          
            System.out.print("Qual a Resposta: ");
            String resp = entrada.nextLine(); 
                 if(resp.equalsIgnoreCase(gabarito1)){
                       //Painel do usuario
                    Proximaetapa = true;
                    pontuacao.subirnivel(1);
                    System.out.println("Pontos acumulado:  " +pontuacao.getPontuacao());
                    System.out.println("Vida: " +vida.getLife());
                    
                    break;
                   
                } else {
                 int pts = 1;
                   System.out.println("Você perdeu : " +pts+ " Pontos");
                   vida.PerderPontos(pts);
                   Proximaetapa = false;
                   
                   
                }   
       break;
        } 
    }      
    
        

    } 
     

