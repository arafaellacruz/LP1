package classes;

public class TestaCalculadora {
    public static void main(String[] args) {

        System.out.println("Resultados da Calculadora: ");
        Calculadora f1 = new Calculadora(2, 5);
        Calculadora f2 = new Calculadora(3, 7);

        Calculadora resultadoFinal1 = f1.somar(f2);
        System.out.println("Cálculo 1: " + resultadoFinal1);

        Calculadora f3 = new Calculadora(4, 3);
        Calculadora f4 = new Calculadora(2, 7);
        Calculadora resultadoFinal2 = f3.subtrair(f4);
        System.out.println("Cálculo 2: " + resultadoFinal2);

        Calculadora f5 = new Calculadora(4, 3);
        Calculadora f6 = new Calculadora(2, 5);
        Calculadora f7 = new Calculadora(3, 2);
        Calculadora resultadoParcial3 = f5.somar(f6);
        Calculadora resultadoFinal3 = f7.somar(resultadoParcial3);
        System.out.println("Cálculo 3: " + resultadoFinal3);

        Calculadora f8 = new Calculadora(10, 3);
        Calculadora f9 = new Calculadora(4, 3);
        Calculadora resultadoFinal4 = f8.subtrair(f9);
        System.out.println("Cálculo 4: " + resultadoFinal4);

        Calculadora f10 = new Calculadora(2, 1);
        Calculadora f11 = new Calculadora(1, 3);
        Calculadora f12 = new Calculadora(5, 4);
        Calculadora resultadoParcial5 = f11.subtrair(f12);
        Calculadora resultadoFinal5 = f10.somar(resultadoParcial5);
        System.out.println("Cálculo 5: " + resultadoFinal5);

        Calculadora f13 = new Calculadora(5, 2);
        Calculadora f14 = new Calculadora(4, 3);
        Calculadora f15 = new Calculadora(2, 5);

        Calculadora resultadoParcial6 = f14.subtrair(f15);
        Calculadora resultadoFinal6 = f13.multiplicar(resultadoParcial6);
        System.out.println("Cálculo 6: " + resultadoFinal6);

        Calculadora f16 = new Calculadora(5, 1);
        Calculadora f17 = new Calculadora(2, 7);
        Calculadora resultadoFinal7 = f16.somar(f17);
        System.out.println("Cálculo 7: " + resultadoFinal7);

        Calculadora f18 = new Calculadora(5, 3);
        Calculadora f19 = new Calculadora(7, 4);
        Calculadora resultadoFinal8 = f18.multiplicar(f19);
        System.out.println("Cálculo 8: " + resultadoFinal8);

    }
}
