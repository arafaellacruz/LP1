// 3. Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.

public class Ex3Salario {
    public float salario;

    public Ex3Salario(float salario) {
        this.salario = salario;
    }

    public float calcularNovoSalario() {
        return salario + (salario * 0.15f);
    }

    public static void main(String[] args) {
        Ex3Salario s = new Ex3Salario(1000);

        System.out.println("O salário inicial era de: R$ "+s.salario);
        System.out.println("O salário novo é: R$ "+s.calcularNovoSalario());

    }
}
