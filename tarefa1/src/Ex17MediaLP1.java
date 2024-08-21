/* 17. Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno:
- Fórmula para cálculo de média de LP1.
(P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)_0.4)-5.9))_(API*0.5)+X+(SUB*0.2) 
X = pontos extras que vão até no máximo 1.0 */ 

public class Ex17MediaLP1 {
    public float E1;
    public float E2;
    public float P1;
    public float API;
    public float X;
    public float SUB;

    public Ex17MediaLP1(float E1, float E2, float P1, float API, float X, float SUB) {
        this.E1 = E1;
        this.E2 = E2;
        this.P1 = P1;
        this.API = API;
        this.X = (X > 1.0f) ? 1.0f : X; 
        this.SUB = SUB;
    }

    public float calcularMedia() {
        float notaBase = P1 * 0.6f + ((E1 + E2) / 2) * 0.4f;
        float bonus = (notaBase > 5.9f) ? (notaBase - 5.9f) / (notaBase - 5.9f) * API * 0.5f : 0.0f;

        float media = (notaBase * 0.5f) + bonus + X + (SUB * 0.2f);

        if (media > 10.0f) {
            return 10.0f;
        } else if (media < 0.0f) {
            return 0.0f;
        }

        return media;
    }

    public static void main(String[] args) {
        Ex17MediaLP1 m = new Ex17MediaLP1(7.0f, 8.0f, 2.0f, 10.0f, 0.3f, 10.0f);  
        
        System.out.printf("Sua média de LP1 é: %.2f%n", m.calcularMedia());  
    }
}

