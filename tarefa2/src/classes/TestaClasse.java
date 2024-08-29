package classes;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cachorro c = new Cachorro("Bolt", "Fox paulistinha", "Marrom, branco e preto");

        int op;

        do {
            System.out.println("╔════════════════════════════════════════════════════╗");
            System.out.println("║              MENU DE OPÇÕES DE TESTES              ║");
            System.out.println("║ 1. Brincar com o cachorro                          ║");
            System.out.println("║ 2. Verificar se o cachorro está dormindo           ║");
            System.out.println("║ 0. Encerrar testes                                 ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    c.brincar();
                    break;
                case 2:
                    c.dormir();
                    break;
                case 0:
                    System.out.println("Encerrando testes...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (op != 0);
        sc.close();
    }
}
