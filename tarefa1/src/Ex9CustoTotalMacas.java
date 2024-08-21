// 9. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

public class Ex9CustoTotalMacas {
    public int quantidadeMacas;

    public Ex9CustoTotalMacas(int quantidadeMacas){
        this.quantidadeMacas = quantidadeMacas;
    }

    public double calcularCustoTotal() {
        if(quantidadeMacas < 12){
            return quantidadeMacas * 1.30;
        } else {
            return quantidadeMacas * 1.00;
        }
    }

    public static void main(String[] args) {
        Ex9CustoTotalMacas m = new Ex9CustoTotalMacas(15);
        
        System.out.println("O custo total da compra é: R$"+m.calcularCustoTotal());
    }    
}
