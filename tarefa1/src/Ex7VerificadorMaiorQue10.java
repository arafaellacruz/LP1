// 7. Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!

public class Ex7VerificadorMaiorQue10 {
    public int numero;

    public Ex7VerificadorMaiorQue10(int numero) {
        this.numero = numero;
    }

    public void verificarMaiorQue10() {
        if(numero > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }

    public static void main(String[] args) {
        Ex7VerificadorMaiorQue10 v = new Ex7VerificadorMaiorQue10(456);
        v.verificarMaiorQue10();
    }
}
