# Exercício 3 — Reserva de Sala

## Objetivo
O horário usa inputType time. O responsável, sala e horário aparecem no Logcat e na tela.

## IDs obrigatórios
- Campos: `etxtNome`, `etxtSala`, `etxtHorario`
- Botão: `btn_Reservar` — texto **Reservar**
- Resultado: `txtResultado`

## Logcat
Ao tocar no botão, os dados digitados são mostrados no terminal/Logcat usando `System.out.println`.

## Resultado na tela
Exemplo:
`Lab 3 reservado para Prof. Marcos às 19:00`

## Como explicar ao professor
O código localiza os componentes com `findViewById`, pega os valores com `getText().toString()`, executa a lógica do exercício, imprime no Logcat e usa `txtResultado.setText(...)` para mostrar o resultado na tela.
