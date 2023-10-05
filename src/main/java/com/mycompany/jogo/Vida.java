
package com.mycompany.jogo;

import com.sun.source.tree.BreakTree;


public class Vida {
Vida(){
    
}
    private int life = 10;
    
        public Vida(int life){
            this.life = life;
        }
        
        public int getLife(){
            return life;
        }
        public void setLife(int hp){
            this.life = life  - hp;
        }
        
    public void PerderPontos(int hp){
        if(life > 0){
            setLife(hp);
            
        } else if(life <= 0){
            System.out.println("Você não tem vida suficientes pra continuar.");
            System.exit(life);
        }
        
    }
        
}
