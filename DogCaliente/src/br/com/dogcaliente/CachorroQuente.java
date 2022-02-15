package br.com.dogcaliente;


    import java.text.DecimalFormat;
    import java.util.InputMismatchException;
    import java.util.Scanner;

public class CachorroQuente {

/*
CODIGO	ESPECIFICAÇÃO	PREÇO
1		Cachorro Quente	R$ 4,00
2		X-Salada		R$ 4,50
3		X-Bacon			R$ 5,00
4		Torrada simples	R$ 2,00
5		Refrigerante	R$ 1,50
*/

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.00");

            int quantidade;
            int escolha;

            double preco , total = 0.0;

            do {
                System.out.println("-------------------------\n");
                System.out.println("          MENU           \n");
                System.out.println("-------------------------\n");
                System.out.println("""
                        CODIGO\tESPECIFICAÇÃO\tPREÇO
                        1\t\tCachorro Quente\tR$ 4,00
                        2\t\tX-Salada\t\tR$ 4,50
                        3\t\tX-Bacon\t\t\tR$ 5,00
                        4\t\tTorrada simples\tR$ 2,00
                        5\t\tRefrigerante\tR$ 1,50
                        0\t\t Sair\t""");
                System.out.println("\nEscolha uma opção : ");

                escolha =entrada.nextInt();

                if(escolha >= 1 && escolha <= 5) {
                    System.out.println("ESCOLHA A QUANTIDADE: ");
                    quantidade = entrada.nextInt();
                    if (escolha == 1) {
                        preco = 4.0;
                    } else if (escolha == 2) {
                        preco = 4.5;
                    } else if (escolha == 3) {
                        preco = 5.0;
                    } else if (escolha == 4) {
                        preco = 2.0;
                    } else {
                        preco = 1.5;
                    }
                    total = total + (quantidade * preco);
                }
                if(escolha!=0){
                    System.out.println("Deseja fazer outro pedido ? 1- Sim 0- Sair");
                    escolha = entrada.nextInt();
                }

            }while(escolha != 0);

            System.out.println("Total: R$ " + df.format(total));

        }
    }
