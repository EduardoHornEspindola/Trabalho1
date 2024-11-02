
package com.mycompany.forca;

/**
 *
 * @author Eduar
 */
public class MestreJedi extends Jedi implements Raios {

    
    public MestreJedi(int vida, String nome) {
        
        super(100, vida, nome);
    }

    
    @Override
    public String getCor() {
        return "Azul";
    }

    
    @Override
    public int getForcaExtra() {
        return 50; // Força extra para o Mestre Jedi
    }

    
    @Override
    public void usarRaio() {
        System.out.println(getNome() + " usou raios de cor " + getCor() + " com força extra de " + getForcaExtra() + "!");
    }
}
