# Exercício 4 — Tela de Login

## Objetivo
A senha usa textPassword e password_toggle. Com menos de 6 caracteres, aparece a mensagem de senha curta; com 6 ou mais, o login é realizado.

## IDs obrigatórios
- Campos: `etxtEmail`, `etxtSenha`
- Botão: `btn_Entrar` — texto **Entrar**
- Resultado: `txtResultado`

## Logcat
Ao tocar no botão, os dados digitados são mostrados no terminal/Logcat usando `System.out.println`.

## Resultado na tela
Exemplo:
`Bem-vindo(a), ana@email.com!`

## Como explicar ao professor
O código localiza os componentes com `findViewById`, pega os valores com `getText().toString()`, executa a lógica do exercício, imprime no Logcat e usa `txtResultado.setText(...)` para mostrar o resultado na tela.
