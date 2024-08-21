// 16. Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.

public class Ex16BalancoGastos {
    public double janeiro;
    public double fevereiro;
    public double marco;

    public Ex16BalancoGastos(double janeiro, double fevereiro, double marco){
        this.janeiro = janeiro;
        this.fevereiro = fevereiro;
        this.marco = marco;
    }

    public double calcularDespesaTotal() {
        return janeiro + fevereiro + marco;
    }

    public double calcularMediaMensal() {
        return (calcularDespesaTotal() / 3);
    }

    public static void main(String[] args) {
        Ex16BalancoGastos g = new Ex16BalancoGastos(15000, 23000, 17000);

        System.out.println("A despesa total no trimestre foi de R$"+g.calcularDespesaTotal());

        System.out.printf("A média mensal de gastos foi de R$ %.2f ", g.calcularMediaMensal());
    }
    
}
