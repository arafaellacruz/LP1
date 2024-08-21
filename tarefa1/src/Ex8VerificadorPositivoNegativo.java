// 8. Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

public class Ex8VerificadorPositivoNegativo {
    public int numero;

    public Ex8VerificadorPositivoNegativo(int numero){
        this.numero = numero;
    }

    public String verificarNumero() {
        if(numero >= 0){
            return "O número é positivo";
        } else {
            return "O número é negativo";
        }
    }

    public static void main(String[] args) {
        Ex8VerificadorPositivoNegativo n = new Ex8VerificadorPositivoNegativo(45);
        
        System.out.println(n.verificarNumero());
    }
}
