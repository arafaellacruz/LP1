package classes;

import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cachorro cachorro = new Cachorro("Bolt", "Fox paulistinha", "Marrom, branco e preto");
        Carro carro = new Carro("HRV", "Honda", "Vinho");
        Celular celular = new Celular("Iphone 15 PRO MAX", "Apple", "Azul");
        Gato gato = new Gato("Meia-noite", "Siamês", 2);
        Hashira hashira = new Hashira("Kyōjurō Rengoku", "Respiração das Chamas", "Preta, vermelha e prateada");

        int op;

        do {
            System.out.println("╔════════════════════════════════════════════════════╗");
            System.out.println("║                    MENU DE TESTES                  ║");
            System.out.println("║ 1. Brincar com o cachorro                          ║");
            System.out.println("║ 2. Verificar se o cachorro está dormindo           ║");
            System.out.println("║ 3. Ligar carro                                     ║");
            System.out.println("║ 4. Acelerar o carro                                ║");
            System.out.println("║ 5. Tirar foto                                      ║");
            System.out.println("║ 6. Abrir Instagram                                 ║");
            System.out.println("║ 7. O que o gato derrubou no chão?                  ║");
            System.out.println("║ 8. Verificar se o gato está dormindo               ║");
            System.out.println("║ 9. Verificar o nome e respiração do Hashira        ║");
            System.out.println("║ 10. Verificar status do Hashira                    ║");
            System.out.println("║ 0. Encerrar testes                                 ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
            System.out.print("Escolha uma opção: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    cachorro.brincar();
                    break;
                case 2:
                    cachorro.dormir();
                    break;
                case 3:
                    carro.ligar();
                    break;
                case 4:
                    carro.acelerar();
                    break;
                case 5:
                    celular.tirarFoto();
                    break;
                case 6:
                    celular.acessarInstagram();
                    break;
                case 7:
                    gato.derrubarCoisas();
                    break;
                case 8:
                    gato.dormir();
                    break;
                case 9:
                    hashira.atacar();
                    break;
                case 10:
                    hashira.defender();
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
