# Exercício 7 — Recuperar Senha

## Objetivo
Os dois e-mails são comparados com email.equals(confirmacao). Se forem diferentes, mostra Os e-mails não conferem!.

## IDs obrigatórios
- Campos: `etxtEmail`, `etxtConfirmarEmail`
- Botão: `btn_Recuperar` — texto **Enviar link**
- Resultado: `txtResultado`

## Logcat
Ao tocar no botão, os dados digitados são mostrados no terminal/Logcat usando `System.out.println`.

## Resultado na tela
Exemplo:
`Link enviado para bia@email.com`

## Como explicar ao professor
O código localiza os componentes com `findViewById`, pega os valores com `getText().toString()`, executa a lógica do exercício, imprime no Logcat e usa `txtResultado.setText(...)` para mostrar o resultado na tela.
