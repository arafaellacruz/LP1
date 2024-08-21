// 12. Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

public class Ex12MaiorNumero {
    public int numero1;
    public int numero2;

    public Ex12MaiorNumero(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int verificarMaiorNumero() {
        if(numero1 > numero2){
            return numero1;
        } else {
            return numero2;
        }
    }

    public static void main(String[] args) {
        Ex12MaiorNumero n = new Ex12MaiorNumero(455, 50);
        
        System.out.println("O maior número é: "+n.verificarMaiorNumero());
    }
}
