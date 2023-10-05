
package com.mycompany.jogo;

class Pontuacao {
 Pontuacao(){
     
 }   
 
    private String nome = "SYNC";
    private int pontuacao = 1;
    
        public Pontuacao(String nome,int pontuacao){
            this.pontuacao = pontuacao;
            this.nome = nome;
        }
        
            //Parametro de retorno
            public String getNome(){
                return nome;
            }
            public int getPontuacao(){
                return pontuacao;
            }
            //Parametro de envio
            public void setNome(String nome){
                this.nome = nome;
            }
            public void setPontuacao(int pontos){
                this.pontuacao = pontos + pontuacao ;
            }
            
    //Parametro de pontuação
      void subirnivel(int pontos){
        setPontuacao(pontuacao + pontos);
        
     
    }
            
            
}
