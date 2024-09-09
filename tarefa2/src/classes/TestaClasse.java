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
        Heroi heroi = new Heroi("Capitão Pátria", "força, laser nos olhos, vôo.", 1000);
        Inseto inseto = new Inseto("Flik", "Formiga", "Lilás");
        Ninja ninja = new Ninja("Itachi Uchiha", "Konoha", "Amaterasu");
        Pato pato = new Pato("Chip", "Roxo", "Óculos escuros");
        Pessoa pessoa = new Pessoa("Rafaella", "Feminino", 25);

        int op;

        do {
            System.out.println("╔═════════════════════════════════════════════════════════╗");
            System.out.println("║                      MENU DE TESTES                     ║");
            System.out.println("║ 1.  Brincar com o cachorro                              ║");
            System.out.println("║ 2.  Verificar se o cachorro está dormindo               ║");
            System.out.println("║ 3.  Ligar carro                                         ║");
            System.out.println("║ 4.  Acelerar o carro                                    ║");
            System.out.println("║ 5.  Tirar foto                                          ║");
            System.out.println("║ 6.  Abrir Instagram                                     ║");
            System.out.println("║ 7.  O que o gato derrubou no chão?                      ║");
            System.out.println("║ 8.  Verificar se o gato está dormindo                   ║");
            System.out.println("║ 9.  Verificar o nome e respiração do Hashira            ║");
            System.out.println("║ 10. Defesas de um Hashira                               ║");
            System.out.println("║ 11. Ataque do Heroi                                     ║");
            System.out.println("║ 12. Treino do Heroi                                     ║");
            System.out.println("║ 13. Vôo do Inseto                                       ║");
            System.out.println("║ 14. Verifique se o inseto está andando                  ║");
            System.out.println("║ 15. Ninja se esconde                                    ║");
            System.out.println("║ 16. Ninja lança shurikens                               ║");
            System.out.println("║ 17. Faça o pato nadar                                   ║");
            System.out.println("║ 18. Faça o pato correr                                  ║");
            System.out.println("║ 19. Faça a pessoa se alimentar                          ║");
            System.out.println("║ 20. Faça a pessoa estudar                               ║");
            System.out.println("║ 0.  Encerrar testes                                     ║");
            System.out.println("╚═════════════════════════════════════════════════════════╝");
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
                case 11:
                    heroi.atacar();
                    break;
                case 12:
                    heroi.treinar();
                    break;
                case 13:
                    inseto.voar();
                    break;
                case 14:
                    inseto.andar();
                    break;
                case 15:
                    ninja.esconder();
                    break;
                case 16:
                    ninja.jogarShuriken();
                    break;
                case 17:
                    pato.nadar();
                    break;
                case 18:
                    pato.correr();
                    break;
                case 19:
                    pessoa.comer();
                    break;
                case 20:
                    pessoa.estudar();
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
