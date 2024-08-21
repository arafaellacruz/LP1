// 2. Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

public class Ex2Eleitores {
    public double eleitores;
    public double brancos;
    public double nulos;
    public double validos;

    public Ex2Eleitores(double eleitores, double brancos, double nulos, double validos) {
        this.eleitores = eleitores;
        this.brancos = brancos;
        this.nulos = nulos;
        this.validos = validos;
    }
    // Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
    public double calcularBrancos() {
        return ((brancos / eleitores) * 100);
    }

    public double calcularNulos() {
        return ((nulos / eleitores) * 100);
    }

    public double calcularValidos() {
        return ((validos / eleitores) * 100);
    }

    public static void main(String[] args) {
        Ex2Eleitores e = new Ex2Eleitores(1000, 350, 250, 400);

        System.out.println("Votos brancos: " + e.calcularBrancos()+"%");
        System.out.println("Votos nulos: " + e.calcularNulos()+"%");
        System.out.println("Votos validos: " + e.calcularValidos()+"%");
    }
}
