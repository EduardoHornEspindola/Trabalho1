package com.mycompany.forca;


interface Raios {
    
    String getCor();
    int getForcaExtra();
    
    
    void usarRaio();
}


public class Forca {
    
    private int força;
    private int vida;
    private String genero;
    private String nome;

    
    public Forca(int forca, int vida, String genero, String nome) {
        this.força = forca;
        this.vida = vida;
        this.genero = genero;
        this.nome = nome;
    }

    
    public int getForca() {
        return força;
    }

    public void setForca(int forca) {
        this.força = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Força: " + força);
        System.out.println("Vida: " + vida);
    }
    
    
    public void atacar(Forca alvo) {
        System.out.println(this.nome + " está atacando " + alvo.getNome() + " com força de " + this.força + "!");
        int novaVida = alvo.getVida() - this.força; // Reduz a vida do alvo com base na força do atacante
        if (novaVida < 0) novaVida = 0; // Evita valores negativos
        alvo.setVida(novaVida);
        System.out.println(alvo.getNome() + " agora tem " + novaVida + " de vida.");
    }


     
    public static void main(String[] args) {
        
        MestreJedi mestreJedi = new MestreJedi(100, "Yoda");
        MestreSith mestreSith = new MestreSith(120, "Darth Plagueis");

        
        mestreJedi.exibirInfo();
        mestreSith.exibirInfo();

       
        mestreJedi.atacar(mestreSith);

        
        mestreSith.exibirInfo();
    }
}



