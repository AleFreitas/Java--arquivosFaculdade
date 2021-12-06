package Exercicio1Array;
/*Crie uma classe aluno com os atributos ( nome, matricula, e-mail). 
 * No metodo principal será criado um ArrayList Turma que conterá os alunos dessa turma. 
 * Cadastre 10 alunos nessa lista e depois imprima a lista ordenada fazendo uso do método foreach */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		ArrayList<Aluno> turma = new ArrayList<Aluno>();
		Scanner entrada = new Scanner(System.in);
		int continuar = 0,matricula;
		String nome,email;
		Aluno aluno;
		
		do {
			entrada.nextLine();
			System.out.println("Informe o nome do aluno: ");
			nome = entrada.nextLine();
			System.out.println("Informe o email do aluno: ");
			email = entrada.nextLine();
			System.out.println("Informe a matricula do aluno: ");
			matricula = entrada.nextInt();
			aluno = new Aluno(nome,matricula,email);
			turma.add(aluno);
			System.out.println("Deseja continuar cadastrando aluno? 1-Sim/0-Não");
			continuar = entrada.nextInt();
		} while(continuar==1);
		
		for( Aluno turminha : turma) {
			System.out.println("-----------------\nAluno: "+turminha.getNome()+"\n"+turminha.getMatricula()+
			"\n" + turminha.getEmail());
		}
		

	}

}
