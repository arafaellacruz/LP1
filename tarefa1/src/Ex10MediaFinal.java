// 10. Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

public class Ex10MediaFinal {
    public float nota1;
    public float nota2;

    public Ex10MediaFinal(float nota1, float nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String calcularMedia() {
        if ((nota1 + nota2) / 2 >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    public static void main(String[] args) {
        Ex10MediaFinal m = new Ex10MediaFinal(2, 5);
        System.out.println(m.calcularMedia());
    }
}
