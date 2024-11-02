
package com.mycompany.forca;

/**
 *
 * @author Eduar
 */
public class MestreSith extends Sith implements Raios {

    
    public MestreSith(int vida, String nome) {
        
        super(120, vida, nome);
    }

    
    @Override
    public String getCor() {
        return "Vermelho";
    }

    
    @Override
    public int getForcaExtra() {
        return 70; // Força extra para o Mestre Sith
    }

    
    @Override
    public void usarRaio() {
        System.out.println(getNome() + " usou raios de cor " + getCor() + " com força extra de " + getForcaExtra() + "!");
    }
}
