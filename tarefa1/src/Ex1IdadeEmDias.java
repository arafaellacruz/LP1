/* 1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */

// Classe Idade de uma pessoa
public class Ex1IdadeEmDias {
    public int anos;
    public int meses;
    public int dias;

    // Atribuindo valores aos atributos da classe Idade
    public Ex1IdadeEmDias(int anos, int meses, int dias){
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    // Método para calcular idade em dias
    public int converterIdade() {
        return(dias + (meses * 30) + (anos * 365));
    }

    // Classe principal
    public static void main(String[] args) {
        Ex1IdadeEmDias i = new Ex1IdadeEmDias(25, 3, 8);
        
        System.out.println("Sua idade é: "+i.converterIdade());
    }
}