/*
 * SCPT 2019
 Sistema de Controle de Portas do Trem
 */

package br.com.SCPT;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int menu = 0;
		Trem cptm = new Trem();
		Scanner sc = new Scanner(System.in);
		Main recursao = new Main();

		while (true) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("SISTEMA DE CONTROLE DE PORTAS DO TREM");
			System.out.println("1-Andar");
			System.out.println("2-Parar");
			System.out.println("3-Abrir portas");
			System.out.println("4-Fechar portas");
			System.out.println("5-Status das portas");
			System.out.println("6-Lotacao");
			menu = sc.nextInt();

			if (menu == 1) {
				cptm.andar();
			} else if (menu == 2) {
				cptm.parar();
			} else if (menu == 3) {
				cptm.abrirPortas(cptm.getPortas());
			} else if (menu == 4) {
				cptm.fecharPortas(cptm.getPortas());
			} else if (menu == 5) {
				cptm.statusPortas(cptm.getPortas());
			} else if (menu == 6) {
				cptm.lotar();
			} else {
				System.err.println("Digite uma das opcoes do menu!");
			}
		}
	}
}
