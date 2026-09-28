# Exercício 2 — Cadastro de Pet

## Objetivo
A idade usa inputType number. Os dados são impressos no Logcat e o resultado é mostrado no txtResultado.

## IDs obrigatórios
- Campos: `etxtNomePet`, `etxtEspecie`, `etxtIdadePet`
- Botão: `btn_CadastrarPet` — texto **Cadastrar pet**
- Resultado: `txtResultado`

## Logcat
Ao tocar no botão, os dados digitados são mostrados no terminal/Logcat usando `System.out.println`.

## Resultado na tela
Exemplo:
`Thor (Cão), 4 anos, cadastrado com sucesso!`

## Como explicar ao professor
O código localiza os componentes com `findViewById`, pega os valores com `getText().toString()`, executa a lógica do exercício, imprime no Logcat e usa `txtResultado.setText(...)` para mostrar o resultado na tela.
