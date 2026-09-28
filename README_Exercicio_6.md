# Exercício 6 — Cadastro de Produto

## Objetivo
O preço usa numberDecimal e Double.parseDouble. Se for maior que zero, calcula preço × quantidade.

## IDs obrigatórios
- Campos: `etxtProduto`, `etxtPreco`, `etxtQuantidade`
- Botão: `btn_Cadastrar` — texto **Cadastrar produto**
- Resultado: `txtResultado`

## Logcat
Ao tocar no botão, os dados digitados são mostrados no terminal/Logcat usando `System.out.println`.

## Resultado na tela
Exemplo:
`Caderno cadastrado! Valor em estoque: R$ 375.0`

## Como explicar ao professor
O código localiza os componentes com `findViewById`, pega os valores com `getText().toString()`, executa a lógica do exercício, imprime no Logcat e usa `txtResultado.setText(...)` para mostrar o resultado na tela.
