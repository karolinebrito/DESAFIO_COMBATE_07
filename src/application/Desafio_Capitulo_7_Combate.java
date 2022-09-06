package application;

import java.util.Scanner;

import entities.Champion;

public class Desafio_Capitulo_7_Combate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Champion champion1, champion2;

		System.out.println("Digite os dados do primeiro campeão");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		champion1= new Champion(name, life, attack, armor);
		sc.nextLine();
		System.out.println();
		System.out.println("Digite os dados do segundo campeão");
		System.out.print("Nome: ");
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		champion2= new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turns = sc.nextInt();
		
		//System.out.println();
		//System.out.println(champion1.getLife());
		//System.out.println(champion2.getAttack());
		//System.out.println(champion1.getArmor());
		
		for (int i=0; i<turns; i++) {
			System.out.println();
			System.out.println("Resultado do turno " + (i+1) + ": ");
			champion1.takeDamage(champion1.getLife(), champion2.getAttack(), champion1.getArmor());
			System.out.println(champion1.status());
			champion2.takeDamage(champion2.getLife(), champion1.getAttack(), champion2.getArmor());
			System.out.println(champion2.status());
			if ((champion1.getLife() == 0) || (champion2.getLife() == 0)) {
				break;
			}
			else {
				
			}
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();

	}

}
