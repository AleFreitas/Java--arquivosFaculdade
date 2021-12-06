package ArrayListTest;
import java.util.List;
import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		ArrayList<String> aulas = new ArrayList<>();
		String aula1 = "ação da aula 1";
		String aula2 = "ação da aula 2";
		String aula3 = "ação da aula 3";
		String aula4 = "ação da aula 4";
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		//Mostra os valores de todas as aulas
		System.out.println(aulas);
		//Remove aula1 do Array
		aulas.remove(0);
		System.out.println(aulas);
		aulas.add(aula1);
		//Remove aula3 do Array
		aulas.remove(1);
		System.out.println(aulas); 
		

	}

}
