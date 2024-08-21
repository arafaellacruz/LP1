# Tarefa 1 - JAVA

Criar programas para os exercícios abaixo, juntamente com teste de mesa para cada um. <br>
**Entrega**: 22/08/2024 - *Teams*

1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
   
    | Dias | Meses | Anos |         `converterIdade()`            | Saída |
    |------|-------|------|---------------------------------------|-------|
    | 8    | 3     | 25   | `8 + (3 * 30) + (25 * 365)`           | 9223  |

2. Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

      | Eleitores | Brancos | Nulos | Válidos |  `calcularBrancos()` |  `calcularNulos()` |  `calcularValidos()` | Saídas                     |
      |-----------|---------|-------|---------|-----------------------------|---------------------------|-----------------------------|----------------------------|
      | 1000      | 350     | 250   | 400     | `(350 / 1000) * 100`        | `(250 / 1000) * 100`       | `(400 / 1000) * 100`        | Brancos: 35.0%<br>Nulos: 25.0%<br>Válidos: 40.0% |


3. Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.

      | Salário Inicial | Percentual de Reajuste |  `calcularNovoSalario()`           | Saída  |
      |-----------------|-------------------------|-------------------------------------------|--------------------|
      | 1000            | 15%                     | `1000 + (1000 * 0.15f)`             | R$ 1150.00         |


4. O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

   | Custo de Fábrica | Percentual Distribuidor | Percentual Impostos |  `calcularCustoFinal()`                                             | Saída Custo Final |
   |------------------|--------------------------|----------------------|---------------------------------------------------------------------------|-------------------|
   | 30000.0          | 28%                      | 45%                  | `valorDistribuidor = 30000 * (28 / 100)` = 8400.0 -> `valorImpostos = 30000 * (45 / 100)` = 13500.0 -> `custoFinal = 30000 + 8400 + 13500` = 51900.0                          | 51900.0           |


5. Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

   | Carros Vendidos | Valor Vendas | Salário Fixo | Comissão por Carro |              `calcularSalarioFinal()`                | Saída Salário Final |
   |-----------------|--------------|--------------|--------------------|-----------------------------------------------------------------------------|---------------------|
   | 10              | 50000        | 5000         | 500                | `5000 + (10 * 500) + (50000 * 0.05)` = 5000 + 5000 + 2500                   | 12500.0             |


6. Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

   | Fahrenheit | Cálculo `converterParaCelsius()`            | Saída Celsius |
   |------------|---------------------------------------------|---------------|
   | 212.0      | `(212 - 32) * 5/9` = `180 * 5/9` = 100.0   | 100.0         |

7. Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!

   | Número | Cálculo `verificarMaiorQue10()` | Saída               |
   |--------|---------------------------------|---------------------|
   | 456    | `456 > 10`                       | "É MAIOR QUE 10!"   |

8. Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

   | Número | Cálculo `verificarNumero()`    | Saída                |
   |--------|--------------------------------|----------------------|
   | 45     | `45 >= 0`                      | "O número é positivo" |

9. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

   | Quantidade de Maçãs | Cálculo `calcularCustoTotal()`           | Saída Custo Total |
   |---------------------|------------------------------------------|--------------------|
   | 15                  | `15 * 1.00`                             | R$ 15.00          |


10. Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

   | Nota 1 | Nota 2 | Cálculo `calcularMedia()`              | Saída    |
   |--------|--------|----------------------------------------|----------|
   | 2      | 5      | `(2 + 5) / 2 < 6`                      | "Reprovado" |

11. Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).


12. Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.


13. Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.


14. Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.


15. A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).


16. Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.


17. Programa que leia as notas e calcule a média de LP1 deste semestre, referente a um determinado aluno:
- Fórmula para cálculo de média de LP1.
  (P1*0.6+((E1+E2)/2)*0.4)*0.5+(max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)_0.4)-5.9))_(API*0.5)+X+(SUB*0.2)

  
