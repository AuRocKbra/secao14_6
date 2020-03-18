package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de funcionarios?");
		int qtdFuncionario = sc.nextInt();
		List <Funcionario> funcionarios = new ArrayList<>();
		for(int aux=0;aux<qtdFuncionario;aux++) {
			sc.nextLine();
			System.out.print("Digite 1 para funcionario direto?");
			if(sc.nextInt()==1) {
				sc.nextLine();
				System.out.print("Nome:");
				String nome = sc.nextLine();
				
			}
		}
	}

}
