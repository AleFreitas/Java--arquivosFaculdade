package principal;

import java.util.Scanner;

public class testaTela{
  public testaTela(){
    
  }
  public void test1(){
    int lis,lur;
    String lus;
    criaTela ct = new criaTela();
    Scanner scan = new Scanner(System.in);
    //INICIO TESTE DE TELA
    lis = 110;
    System.out.println("teste de tela?");
    lus = scan.nextLine();
    if(lus.equals("1")){
      while(lis != 7){
        System.out.println("1->Login | 2->Cadastro | 3->atualizar | 4-> jogar | 5-> credito | 6-> telaJogoINICIO | 7-> encerra teste");
        lis = scan.nextInt();
        switch (lis){
          case 1:
            ct.login();
          break;
          case 2:
            ct.cadastro();
          break;
          case 3:
            ct.atualizar();
          break;
          case 4:
            ct.jogar();
          break;
          case 5:
            ct.credito();
          break;
          case 7:
        	ct.telaJogo();
          break;
        }
      }
    }
  }
}

