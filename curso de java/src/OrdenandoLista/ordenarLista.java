package OrdenandoLista;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ordenarLista {

	public static void main(String[] args) {
		ArrayList<String> aulas = new ArrayList<>();
		String aula1 = "xique";
		String aula2 = "ação";
		String aula3 = "bruh";
		String aula4 = "yulpa";
		String aula5 = "poi";
		String aula6 = "wellington";
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		aulas.add(aula5);
		aulas.add(aula6);
		//ORDENANDO A LISTA
		Collections.sort(aulas);
		System.out.println(aulas);
		

	}

}
