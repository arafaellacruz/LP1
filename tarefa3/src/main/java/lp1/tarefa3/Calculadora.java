package lp1.tarefa3;

public class Calculadora {
    private int numerador;
    private int denominador;

    public Calculadora(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
        simplificar();
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.denominador = denominador;
        simplificar();
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

    public void simplificar() {
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
}
