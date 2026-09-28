# Exercício 5 — Inscrição em Evento

## Objetivo
A idade é convertida com Integer.parseInt e validada com if: deve estar entre 14 e 99.

## IDs obrigatórios
- Campos: `etxtNome`, `etxtEmail`, `etxtIdade`
- Botão: `btn_Inscrever` — texto **Inscrever**
- Resultado: `txtResultado`

## Logcat
Ao tocar no botão, os dados digitados são mostrados no terminal/Logcat usando `System.out.println`.

## Resultado na tela
Exemplo:
`Carlos Souza, sua inscrição foi confirmada!`

## Como explicar ao professor
O código localiza os componentes com `findViewById`, pega os valores com `getText().toString()`, executa a lógica do exercício, imprime no Logcat e usa `txtResultado.setText(...)` para mostrar o resultado na tela.
