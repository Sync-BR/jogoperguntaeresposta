
package com.mycompany.jogo;


/**
 *  Área reservadar para criar o menu de pontuação e vida
 * 
 */
 class Painelusuario {
Painelusuario(){
    
}
    
    public static void Painel() {
     Vida vida = new Vida();
     Pontuacao pontuacao = new Pontuacao();
     System.out.println("-----------------------------------------------------------------------------------");
     System.out.println("Nome: "+pontuacao.getNome());
     System.out.println("Pontuação: "+pontuacao.getPontuacao());
     System.out.println("Vida: " +vida.getLife());
     System.out.println("-----------------------------------------------------------------------------------"); 
       return  ;
    }
    
    public void reiniciarpainel(){
        Painel();
        return;
        
    }
    
   
    public static void linha(String[] args) {
     System.out.println("-----------------------------------------------------------------------------------");  
    }
}
