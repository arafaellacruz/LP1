// 6. Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

public class Ex6ConversaoTemperatura {
    public float fahrenheit;

    public Ex6ConversaoTemperatura(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public float converterParaCelsius() {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Ex6ConversaoTemperatura ct = new Ex6ConversaoTemperatura(212.0f);
        System.out.println("O valor em Celsius é: "+ct.converterParaCelsius());
    }
}
