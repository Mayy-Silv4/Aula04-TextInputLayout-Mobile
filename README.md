# 📝 Lista de Exercícios — Android Java

Entrega completa da atividade individual com os **7 exercícios, na ordem solicitada**.

## O que foi seguido exatamente

- Java no Android Studio.
- 7 exercícios separados.
- Campos com os IDs pedidos.
- Todos os campos possuem `hint`.
- Componentes ligados ao Java com `findViewById`.
- Todos os botões imprimem os dados no Logcat usando `System.out.println`.
- Exercícios 4 a 7 possuem `if` e as regras específicas.
- Todos os exercícios mostram resultado também em `TextView` com id `txtResultado`.
- Exercício 4 usa `textEmailAddress`, `textPassword` e `app:endIconMode="password_toggle"`.
- Exercício 5 usa `Integer.parseInt`.
- Exercício 6 usa `numberDecimal` e `Double.parseDouble`.
- Exercício 7 usa `email.equals(confirmacao)`.
- Tela inicial reúne os 7 exercícios.
- A pasta `PREVIAS_TELAS` contém uma visualização de cada tela.
- Há um README individual para cada exercício.

## Pastas importantes

`app/src/main/java/` → código Java.

`app/src/main/res/layout/` → telas XML.

`PREVIAS_TELAS/` → imagens de visualização das 7 telas.

`README_Exercicio_1.md` até `README_Exercicio_7.md` → explicação individual.

## Como executar

Abra a pasta `ListaExerciciosAndroid` no Android Studio, aguarde a sincronização do Gradle e execute em um emulador ou celular Android.

Depois de clicar em qualquer botão, abra o **Logcat** para visualizar os `System.out.println`.

## Exemplos de teste

1. Lanche: X-Salada | Bebida: Suco de laranja | Observação: sem tomate.
2. Pet: Thor | Cão | 4.
3. Sala: Prof. Marcos | Lab 3 | 19:00.
4. Login: ana@email.com | senha com 8 caracteres; teste também senha com menos de 6.
5. Evento: Carlos Souza | carlos@email.com | 17; teste também idade fora de 14–99.
6. Produto: Caderno | 12.50 | 30; teste também preço 0.
7. Recuperação: bia@email.com nas duas caixas; teste também e-mails diferentes.

## Checklist

- [x] Tela com componentes e IDs pedidos.
- [x] Hint nos campos.
- [x] `findViewById`.
- [x] `System.out.println` no Logcat.
- [x] Regras extras dos exercícios 4–7.
- [x] `txtResultado` com `setText`.
- [x] README geral.
- [x] README individual de cada exercício.
- [x] Prévia visual das 7 telas.
