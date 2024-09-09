package classes;

public class Calculadora {
    private int numerador;
    private int denominador;

    public Calculadora(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.denominador = denominador;
    }

    public Calculadora somar(Calculadora outra) {
        int num = this.numerador * outra.getDenominador() + outra.getNumerador() * this.denominador;
        int den = this.denominador * outra.getDenominador();
        return new Calculadora(num, den);
    }

    public Calculadora subtrair(Calculadora outra) {
        int num = this.numerador * outra.getDenominador() - outra.getNumerador() * this.denominador;
        int den = this.denominador * outra.getDenominador();
        return new Calculadora(num, den);
    }

    public Calculadora multiplicar(Calculadora outra) {
        int num = this.numerador * outra.getNumerador();
        int den = this.denominador * outra.getDenominador();
        return new Calculadora(num, den);
    }

    public Calculadora dividir(Calculadora outra) {
        if (outra.getNumerador() == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        int num = this.numerador * outra.getDenominador();
        int den = this.denominador * outra.getNumerador();
        return new Calculadora(num, den);
    }

    public int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplicar() {
        int divisor = mdc(numerador, denominador);
        numerador /= divisor;
        denominador /= divisor;

        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Calculadora f1 = new Calculadora(2, 5);
        Calculadora f2 = new Calculadora(3, 7);

        Calculadora resultadoSoma = f1.somar(f2);
        System.out.println("Soma: " + resultadoSoma);

        Calculadora f3 = new Calculadora(4, 3);
        Calculadora f4 = new Calculadora(2, 7);
        Calculadora resultadoSubtracao = f3.subtrair(f4);
        System.out.println("Subtração: " + resultadoSubtracao);

        Calculadora f5 = new Calculadora(2, 3);
        Calculadora f6 = new Calculadora(5, 4);
        Calculadora resultadoMultiplicacao = f5.multiplicar(f6);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);

        Calculadora f7 = new Calculadora(5, 2);
        Calculadora f8 = new Calculadora(4, 3);
        Calculadora resultadoDivisao = f7.dividir(f8);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}
