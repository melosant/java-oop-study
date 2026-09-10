### Sistema de Folha de Pagamento
#### 28.07.2026 -> Exercício integrador criado pelo Claude.

##### Requisitos mínimos:

- Classe abstrata Funcionario com atributos comuns (nome, cpf, data de admissão) e método abstrato calcularSalario()


- Pelo menos 3 subclasses com regras de cálculo diferentes
  - **Gerente:** O gerente possui uma remuneração estável, composta por um salário base mais um adicional de cargo de confiança (bônus).
    - Atributos Específicos: 
      - Salário Base (valor fixo) e Bônus Mensal (valor fixo).
    - Regra de Cálculo: O salário final é simplesmente a soma do Salário Base com o Bônus Mensal.
    - Particularidade para o toString(): Pode exibir, além dos dados comuns, qual é o valor do bônus atrelado à sua posição.
  - **Vendedor:** O vendedor tem um modelo de remuneração variável, dependendo do seu desempenho mensal em vendas.
    - Atributos Específicos: 
      - Salário Base (geralmente um valor menor)
      - Total de Vendas no Mês (em dinheiro) 
      - Taxa de Comissão (uma porcentagem, ex: 5%).
    - Regra de Cálculo: O salário final é o Salário Base somado ao valor da comissão. A comissão é calculada multiplicando o Total de Vendas no Mês pela Taxa de Comissão.
    - Particularidade para o toString(): Deve destacar o volume de vendas daquele mês e o percentual de comissão.

  - **Estagiário:** O estagiário segue regras diferentes regidas por lei, não recebendo salário tradicional, mas sim uma bolsa-auxílio, e possuindo um teto rígido de jornada.
    - Atributos Específicos: 
      - Valor da Bolsa (valor fixo mensal) 
      - Horas Trabalhadas no Mês.
    - Regra de Cálculo: O pagamento final é o Valor da Bolsa integral, mas com uma trava de validação: o sistema deve checar se as Horas Trabalhadas no Mês ultrapassam o limite legal (por exemplo, 120 horas mensais, o que equivale a 6h/dia).
    - Regra de Negócio Extra: Se as horas ultrapassarem o limite, o cálculo de pagamento não gera hora extra (pois não é permitido para estágio). O sistema apenas paga a bolsa normal e pode registrar um "alerta" de violação de carga horária.
    - Particularidade para o toString(): Ideal para mostrar a carga horária atual registrada e se o limite de horas foi atingido.


- Um enum Departamento (RH, TI, Vendas, etc.) como atributo de Funcionario


- Composição: Funcionario tem um Endereco (classe própria, não herdada)


- Uma classe FolhaDePagamento que recebe List<Funcionario>, itera e soma o total a pagar — sem saber qual subclasse é cada um (isso testa se o polimorfismo está correto)


- Bônus: sobrescrever toString() em cada subclasse pra imprimir informações específicas 