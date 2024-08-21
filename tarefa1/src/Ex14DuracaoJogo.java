// 14. Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.


public class Ex14DuracaoJogo {
    public int inicio;
    public int fim;

    public Ex14DuracaoJogo(int inicio, int fim){
        this.inicio = inicio;
        this.fim = fim;
    }

    public int calcularDuracaoJogo() {
        if(inicio < fim){
            return fim - inicio;
        } else {
            return 24 - inicio + fim;
        }
    }

    public static void main(String[] args) {
        Ex14DuracaoJogo j = new Ex14DuracaoJogo(22, 3);
        
        System.out.println("A duração do jogo foi de "+j.calcularDuracaoJogo()+" horas.");
    }
}
