package principal;

import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class testeBlack{
  public testeBlack(){}
    public void jogo(){
        Random randomcarta = new Random();
        Scanner scanf = new Scanner(System.in);
        int valorcarta, c1 = 0, c2 = 3, c3 = 0, somad = 0, somaj = 0, resultd, resultj;
        String palavra;
        //primeira linha y 0, começa x 0
        int cartas[][] = {{1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
        {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52}};
        Integer cartasselecionadas[] = new Integer[20];
        List<Integer> numero = Arrays.asList(cartasselecionadas);
        //cartas iniciais
        while(true){
            valorcarta = (randomcarta.nextInt(53));
            if(numero.contains(valorcarta)){
            }
            else{
                cartasselecionadas[c1] = valorcarta;
                c1++;
            }
            if(c1 == 4){
                break;
            }
        }
        somad = (cartas[0][cartasselecionadas[0]] + cartas[0][cartasselecionadas[1]]);
        if(somad == 21){
            System.out.println("Blackjack Dealer");
        }
        //mostrando as cartas
        System.out.println("A carta do dealer é " + cartas[0][cartasselecionadas[0]]);
        System.out.println("A suas cartas são " + cartas[0][cartasselecionadas[3]] + " e " + cartas[0][cartasselecionadas[2]]);
        //possibilidade de compra ou de não comprar jogador
        while(true){
            System.out.println("\nSe quiser comprar mais carta digite 'Hit' e se não quiser mais comprar digite 'Stand'");
            palavra = scanf.nextLine();
            if((palavra.intern() != "Hit") && (palavra.intern() != "Stand")){
                while(true){
                    System.out.println("A palavra escrita não correponde as certas. Escreva novamente");
                    palavra = scanf.nextLine();
                    if(palavra.intern() == "Hit" || palavra.intern() == "Stand"){
                        break;
                    }
                }
            }
            if(palavra.intern() == "Hit"){
                while(true){
                    valorcarta = (randomcarta.nextInt(53));
                    if(numero.contains(valorcarta)){
                    }
                    else{
                        cartasselecionadas[c1] = valorcarta;
                        c1++;
                        c2 = c1 - 1;
                        break;
                    }
                }
                System.out.print("As suas cartas agoram são ");
                while(c2 > 1){
                    System.out.print(cartas[0][cartasselecionadas[c2]] + ", ");
                    c2--;
                }
                c2 = c1 - 1;
            }
            if(palavra.intern() == "Stand"){
                somaj = 0;
                while(c2 > 1){
                    somaj = somaj + cartas[0][cartasselecionadas[c2]];
                    c2--;
                }
                c2 = c1 - 1;
                break;
            }
            while(c2 > 1){
                somaj = somaj + cartas[0][cartasselecionadas[c2]];
                c2--;
            }
            c2 = c1 - 1;
            if(somaj > 21){
                System.out.println("Você perdeu");
                break;
            }
        }
        //possibilidade de compra dealer
        while(somad <= 17){
            valorcarta = (randomcarta.nextInt(53));
            if(numero.contains(valorcarta)){
            }
            else{
                cartasselecionadas[c1] = valorcarta;
                c1++;
                c3 = c1 - 1;
            }
            somad = somad + cartas[0][cartasselecionadas[c3]];
        }
        //ver quem ganhou
        resultd = 21 - somad;
        resultj = 21 - somaj;
        if(resultd > resultj && resultd >= 0 && resultj >= 0){
            System.out.println("O jogador GANHOU");
        }
        if(resultd < resultj && resultd >= 0 && resultj >= 0){
            System.out.println("O dealer GANHOU");
        }
        if(resultd == resultj && resultd >= 0 && resultj >= 0){
            System.out.println("O dealer e o jogador EMPATARAM");
        }
        if(resultd < 0){
          System.out.println("O jogador GANHOU");  
        }
    }
}