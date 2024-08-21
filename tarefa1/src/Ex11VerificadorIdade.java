// 11. Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).


public class Ex11VerificadorIdade {
    public int anoAtual;
    public int anoNascimento;

    public Ex11VerificadorIdade(int anoAtual, int anoNascimento){
        this.anoAtual = anoAtual;
        this.anoNascimento = anoNascimento;
    }

    public String verificarIdade() {
        if(anoAtual - anoNascimento >= 16){
            return "Você poderá votar.";
        } else {
            return "Você não poderá votar.";
        }
    }

    public static void main(String[] args) {
        Ex11VerificadorIdade i = new Ex11VerificadorIdade(2024, 2010);
        
        System.out.println(i.verificarIdade());
    }
}
