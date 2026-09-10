# Exercício 1 — Loja Online (Exceção Checked + Regra de Negócio Encadeada)
## Enunciado: Implemente um sistema simples de pedido de compra.

- Classe `Produto`: `nome` (String), `preco` (Double), `estoque` (Integer).
- Classe `Pedido`: contém uma lista de itens (`Map<Produto, Integer>` ou uma classe `ItemPedido` própria — sua escolha) e um método `adicionarItem(Produto produto, int quantidade)`.
- Regras de negócio (todas devem lançar uma exceção checked customizada `PedidoException`):
  - Não é possível adicionar um item com quantidade ≤ 0.
  - Não é possível adicionar mais itens do que o estoque disponível do produto.
  - Não é possível finalizar um pedido vazio (sem itens).
- Método `finalizarPedido()`: calcula e retorna o valor total do pedido (soma de `preco * quantidade` de cada item), e reduz o estoque de cada produto envolvido.

**Exemplos esperados de comportamento:**

```Produto: Teclado, preço 250.00, estoque 5
Adicionar 3 unidades → OK
Adicionar mais 3 unidades → Erro: "Estoque insuficiente"
Finalizar pedido → Total: $750.00, estoque do Teclado agora é 2
```

Ponto de atenção proposital: pense sobre quando a exceção de estoque deveria ser lançada — no momento de `adicionarItem()` (validação antecipada) ou só em `finalizarPedido()` (validação tardia)? Justifique sua escolha pra você mesmo — não existe resposta única certa, mas a decisão deve ser consciente.