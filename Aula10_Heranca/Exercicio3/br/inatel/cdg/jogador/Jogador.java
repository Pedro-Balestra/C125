package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigos.Inimigo;

public class Jogador{

    private String nome;
    private double vida;


    public Jogador(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(Inimigo inimigo){
        inimigo.tomarDano();
        System.out.println("Jogador atacou o inimigo "+ inimigo.getNome());
    }


}