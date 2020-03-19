package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceirizado;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de funcionarios?");
		int qtdFuncionario = sc.nextInt();
		List <Funcionario> funcionarios = new ArrayList<>();
		for(int aux=0;aux<qtdFuncionario;aux++) {
			sc.nextLine();
			System.out.print("Funcionario terceirizado (s/n)?");
			String opcao = sc.nextLine();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.println("Horas trabalhadas:");
			Integer horasTrabalhadas = sc.nextInt();
			System.out.println("Valor da hora:");
			Double valorDaHora = sc.nextDouble();
			switch(opcao.toLowerCase()) {
				case "s":
					System.out.print("Despesas adicionais:");
					Double despesasAdicional = sc.nextDouble();
					Terceirizado tercerizado = new Terceirizado(nome, horasTrabalhadas, valorDaHora, despesasAdicional);
					funcionarios.add(tercerizado);
					break;
				default:
					Funcionario funcionario = new Funcionario(nome, horasTrabalhadas, valorDaHora);
					funcionarios.add(funcionario);
					break;
			}
		}
		System.out.println("\nDados dos funcionarios:");
		for(Funcionario f:funcionarios) {
			System.out.println("Nome:"+f.getNomeFuncionario());
			System.out.println("Valor a ser pago: R$"+String.format("%.2f",f.valorAPagar()));
			System.out.println("");
		}
		sc.close();
	}

}
