// 4. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

public class Ex4CustoCarro {
    public float custoFabrica;
    public float distribuidor;
    public float impostos;

    public Ex4CustoCarro(float custoFabrica, float distribuidor, float impostos) {
        this.custoFabrica = custoFabrica;
        this.distribuidor = distribuidor;
        this.impostos = impostos;
    }

    public float calcularCustoFinal() {
        float valorDistribuidor = custoFabrica * (distribuidor / 100);
        float valorImpostos = custoFabrica * (impostos / 100);
        return custoFabrica + valorDistribuidor + valorImpostos;
    }

    public static void main(String[] args) {
        float custoFabrica = 30000.0f; 
        Ex4CustoCarro carro = new Ex4CustoCarro(custoFabrica, 28.0f, 45.0f);
        float custoFinal = carro.calcularCustoFinal();
        System.out.println("O custo final ao consumidor é: " + custoFinal);
    }
}
