package main;

public class Fase {
	public static void carregar() {
		System.out.println("Carregando...");
		Mago mago = new Mago();
		mago.mover(10, 1);
		System.out.println("O mago se moveu");
		Guerreiro guerreiro = new Guerreiro();
		guerreiro.mover(3, 4);
		System.out.println("O Guerreiro se Moveu");
	
	}


}
