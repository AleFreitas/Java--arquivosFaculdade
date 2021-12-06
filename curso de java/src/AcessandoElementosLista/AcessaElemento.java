package AcessandoElementosLista;

import java.util.ArrayList;
import java.util.List;
public class AcessaElemento {

	public static void main(String[] args) {
		ArrayList<String> aulas = new ArrayList<>();
		String aula1 = "ação da aula 1";
		String aula2 = "skrrr";
		String aula3 = "pingola";
		String aula4 = "bruh";
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		//Acessando elementos especificos na lista -> aula1
		String aulaQueEuQuero = aulas.get(0);
		System.out.println("A aula que eu quero é: " + aulaQueEuQuero);

	}

}
