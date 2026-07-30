# Exercício 4 — Revisão Integrada: Sistema de Reservas

Esse é maior, integra tudo que você já estudou até agora (herança, polimorfismo, composição, enum, encapsulamento, exceções). Pense nele como o "exame" da seção de exceções.

**Enunciado:** Sistema de reserva de recursos (pode ser salas de reunião, veículos de frota, ou equipamentos — escolha o domínio que preferir).

- Classe abstrata `Recurso` com atributos comuns (`nome`, `disponivel` — boolean) e método abstrato `calcularCustoReserva(int horas)`.
- Pelo menos 2 subclasses com regras de custo diferentes (ex: `SalaReuniao` cobra por hora fixa; `Veiculo` cobra por hora + uma taxa de km rodado).
- Enum `StatusReserva` (`PENDENTE`, `CONFIRMADA`, `CANCELADA`).
- Classe `Reserva` (composição: tem um `Recurso`, uma data, um `StatusReserva`).
- Classe `GestorReservas`: mantém uma lista de reservas, com métodos como `criarReserva(...)`, `cancelarReserva(...)`, `listarPorStatus(...)`.
- Regras que devem lançar exceções customizadas:
  - Não é possível reservar um `Recurso` que já está indisponível (`disponivel` == false).
  - Não é possível cancelar uma reserva que já está `CANCELADA`.
  - Não é possível criar reserva com horas <= 0.

**Checklist de autoavaliação ao terminar (marque mentalmente ou em comentário):**
[] `GestorReservas` só orquestra — a lógica de negócio de cada tipo de recurso está nas próprias subclasses (SRP)
[] Nenhum atributo tem getter/setter "por costume" sem necessidade real
[] Nenhuma coleção interna (tipo a lista de reservas) vaza referência direta pra fora
[] As exceções customizadas têm nomes que comunicam claramente o problema, sem depender de ler a mensagem