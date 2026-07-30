# Exercício 2 — Validador de Cadastro (Exceção Unchecked + Múltiplas Validações)

### Foco: diferenciar quando usar exceção checked vs unchecked.

**Enunciado:** Crie uma classe Usuario com `nome`, `email`, `idade`. No construtor, valide:
- `nome` não pode ser nulo ou vazio
- `email` deve conter @ (validação simples, não precisa regex completo)
- `idade` deve ser ≥ 18

Para esse exercício, use uma exceção unchecked (`extends RuntimeException`) chamada `ValidacaoException`, ao invés de checked como no Exercício 1.

Pergunta pra responder em comentário no código (não é retórica, quero sua resposta real): Por que faz mais sentido usar unchecked aqui, e checked no Exercício 1? Pense em termos de: o chamador pode razoavelmente se recuperar desse erro e continuar o fluxo, ou é um erro de "uso incorreto da API" que deveria ser corrigido no código, não tratado em runtime?