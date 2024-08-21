// 13. Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

public class Ex13OrdemCrescente {
    public int numero1;
    public int numero2;

    public Ex13OrdemCrescente(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void verificarOrdemCrescente() {
        if(numero1 < numero2){
            System.out.println("Os números em ordem crescente são: "+numero1+" e "+numero2);
        } else {
            System.out.println("Os números em ordem crescente são: "+numero2+" e "+numero1);
        }
    }

    public static void main(String[] args) {
        Ex13OrdemCrescente n = new Ex13OrdemCrescente(789, 123);
        
        n.verificarOrdemCrescente();
    }
}
