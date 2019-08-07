package br.com.SCPT;

import java.util.Random;

public class Trem {
	private boolean[] portas = new boolean[8];
	private boolean andando;
	
	public boolean[] getPortas() {
		return portas;
	}

	public void setPortas(boolean[] portas) {
		this.portas = portas;
	}
	
	public boolean getAndando() {
		return andando;
	}

	public void setAndando(boolean andando) {
		this.andando = andando;
	}
	
	boolean andar() {
		if(verificarPortas(portas)) {
			System.out.println("LOG: Trem andando . . .");
			andando = true;
		}else {
			System.err.println("ERRO: Porta aberta");
			andando = false;
		}
		return andando;
	}

	boolean parar() {
		System.out.println("LOG: Trem parado.");
		andando = false;
		return andando;
	}
	
	void abrirPortas(boolean[] portas) {
		if(andando) {
			System.err.println("ERRO: Trem esta andando!");
		}else {
			for(int i=0; i<this.portas.length; i++) {
				this.portas[i] = true;
			}
			System.out.println("LOG: Portas do trem abertas!");	
		}
		
	}
	
	void fecharPortas(boolean[] portas){
		for(int i=0; i<this.portas.length; i++) {
			this.portas[i] = false;
		}
		System.out.println("LOG: Portas do trem fechadas!");
	}
	
	boolean verificarPortas(boolean[] portas) {
		int controle = 0;
		for(int i=0; i<this.portas.length; i++) {
			if(this.portas[i] == false) { 
				controle++;
			}
		}
		if(controle == this.portas.length) {
			return true;
		}else {
			return false;
		}
	}
	
	void statusPortas(boolean[] portas){
		for(int i=0; i<this.portas.length; i++) {
			System.out.print("Porta numero "+(i+1));
			if(this.portas[i] == false) { 
				System.out.println(" [FECHADA]"); 
			}else {
				System.out.println(" [ABERTA]"); 
			}
		}
		if(andando) {
			System.out.println("Trem esta andando");
		}else {
			System.out.println("Trem esta parado");
		}
	}
	
	void lotar() {
		if(!andando) {
			Random abrirPortas = new Random();
			int numeroAleatorio = abrirPortas.nextInt(portas.length);
			portas[numeroAleatorio] = true;
			//System.out.println("Porta numero "+(numeroAleatorio+1)+" [ABERTA]");
		}	
	}
}
