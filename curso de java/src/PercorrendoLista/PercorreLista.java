package PercorrendoLista;
import java.util.List;
import java.util.ArrayList;
public class PercorreLista {

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
		//PERCORRENDO A LISTA
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
			
		}
		//METODO 2
		System.out.println("metodo 2");
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("aula : " + aulas.get(i));
		}
	}

}
