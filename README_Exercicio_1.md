# Exercício 1 — Pedido de Lanche

## Objetivo
O botão lê os três campos, imprime cada valor no Logcat com System.out.println e monta o pedido no txtResultado.

## IDs obrigatórios
- Campos: `etxtLanche`, `etxtBebida`, `etxtObservacao`
- Botão: `btn_Pedir` — texto **Fazer pedido**
- Resultado: `txtResultado`

## Logcat
Ao tocar no botão, os dados digitados são mostrados no terminal/Logcat usando `System.out.println`.

## Resultado na tela
Exemplo:
`Pedido: X-Salada + Suco de laranja (sem tomate)`

## Como explicar ao professor
O código localiza os componentes com `findViewById`, pega os valores com `getText().toString()`, executa a lógica do exercício, imprime no Logcat e usa `txtResultado.setText(...)` para mostrar o resultado na tela.
