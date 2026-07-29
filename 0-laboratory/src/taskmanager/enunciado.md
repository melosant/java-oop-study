É um sistema de gestão de tarefas onde cada tarefa, dependendo do tipo, calcula sua prioridade de forma diferente. A ideia central é a mesma da Opção A: uma lista de Tarefa (tipo abstrato) onde você itera e chama calcularPrioridade() sem saber qual subclasse é cada uma — o polimorfismo decide o comportamento certo sozinho.

- Classe abstrata **Tarefa**
  - Atributos comuns a toda tarefa:
    - `titulo` (String)
    - `descricao` (String)
    - `dataCriacao` (Date ou LocalDate)
    - `responsavel` (composição — uma classe Responsavel própria, com nome/email, não herdada)
    - `status` (enum StatusTarefa: PENDENTE, EM_ANDAMENTO, CONCLUIDA)
  - Método abstrato: 
    - `calcularPrioridade()` → retorna um número (ex: int, de 1 a 10) ou um enum de prioridade (ex: BAIXA, MEDIA, ALTA) — fica a seu critério, mas seja consistente entre as subclasses


- Subclasse **TarefaUrgente**
  - Regra de negócio: é urgente por natureza, não importa data nem contexto — sempre no nível máximo de prioridade.
  - Atributo específico: nenhum obrigatório.
  - Regra de cálculo: `calcularPrioridade()` sempre retorna o valor máximo (ex: 10, ou Prioridade.ALTA)
  - Particularidade no toString(): deixe claro que é urgente, talvez destacando visualmente (ex: prefixo "🔴 URGENTE" ou similar em texto)


- Subclasse **TarefaComPrazo**
  - Regra de negócio: quanto mais perto do prazo, maior a prioridade — isso é o análogo à regra de comissão do Vendedor, só que com datas em vez de dinheiro.
  - Atributos específicos: 
    - `dataPrazo` (Date/LocalDate)
  - Regra de cálculo: calcule a diferença de dias entre hoje e dataPrazo. Defina uma escala própria, por exemplo:
    - Prazo já vencido ou vence hoje → prioridade máxima
    - Prazo em até 3 dias → prioridade alta
    - Prazo em até 7 dias → prioridade média
    - Mais de 7 dias → prioridade baixa
  - Particularidade no toString(): mostre quantos dias faltam (ou se já venceu)


- Subclasse **TarefaRecorrente**
  - Regra de negócio: prioridade depende da frequência — algo que se repete todo dia tende a ser mais rotineiro/menos crítico que algo semanal, mas isso é uma decisão sua de design (pode inverter se preferir, contanto que seja consistente).
  - Atributos específicos: 
    - `frequencia` (pode ser um enum FrequenciaRecorrencia: DIARIA, SEMANAL, MENSAL)
  - Regra de cálculo: defina uma prioridade baseada na frequência (ex: DIARIA → baixa prioridade porque é rotina; MENSAL → prioridade mais alta porque é mais raro e fácil de esquecer)
  - Particularidade no toString(): mostre a frequência


- Classe QuadroDeTarefas (equivalente ao FolhaDePagamento)
  - Recebe uma List<Tarefa>
  - Ordena por prioridade (do maior pro menor) — aqui você vai usar o método polimórfico calcularPrioridade() sem saber o tipo concreto de cada tarefa
  - Imprime o quadro ordenado


- Bônus (opcional, já que você viu Streams no curso): um método que filtra tarefas por status usando stream().filter(...), tipo "mostrar só as tarefas PENDENTE".