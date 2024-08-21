// 5. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

public class Ex5SalarioFinal {
    public int carrosVendidos; 
    public float valorVendas;
    public float salarioFixo;
    public float comissao;

    public Ex5SalarioFinal(int carrosVendidos, float valorVendas, float salarioFixo, float comissao) {
        this.carrosVendidos = carrosVendidos;
        this.valorVendas = valorVendas;
        this.salarioFixo = salarioFixo;
        this.comissao = comissao;
    }

    public float calcularSalarioFinal() {
        return salarioFixo + (carrosVendidos * comissao) + (valorVendas * 0.05f);
    }

    public static void main(String[] args) {
        Ex5SalarioFinal sf = new Ex5SalarioFinal(10, 50000, 5000, 500);

       System.out.println("O salário final será de: "+sf.calcularSalarioFinal());
    }
}
