// 15. A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).


public class Ex15SalarioTotal {
    public float horasTrabalhadas;
    public float salarioHora;

    public Ex15SalarioTotal(float horasTrabalhadas, float salarioHora){
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }
    
    public float calcularSalarioTotal() {
        if(horasTrabalhadas > 160){
            return (160 * salarioHora) + ((horasTrabalhadas - 160) * (salarioHora * 1.5f));
        } else {
            return horasTrabalhadas * salarioHora;
        }
    }

    public static void main(String[] args) {
        Ex15SalarioTotal s = new Ex15SalarioTotal(180, 10);
        
        System.out.println("O salário total do funcionário é: R$"+s.calcularSalarioTotal());
    }
}
