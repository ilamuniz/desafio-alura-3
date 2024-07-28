# Desafio Alura n° 3

Desafio proposto pelo curso "Java: trabalhando com listas e coleções de dados", como parte da formação "Aprenda a programar em Java com Orientação a Objetos" da Alura.

O desafio consiste em projetar uma aplicação de compras. Primeiramente, a interface pergunta qual o limite do cartão de crédito e, em seguida, o usuário pode realizar compras até não desejar mais ou até o limite ser atingido.

Após digitar o limite e teclar "Enter", ele solicita uma descrição da compra. Digitamos o item comprado e, logo após, ele pergunta o valor da compra. Se estiver tudo certo, o retorno esperado é uma mensagem semelhante abaixo:

````
Compra realizada!

Digite 0 para sair ou 1 para continuar
````
Caso seja realizada uma compra que exceda o limite, o retorno deve ser como o exemplo abaixo:

````
Saldo insuficiente!

COMPRAS REALIZADAS:

sapato - 150.0

Saldo do cartão: 850.0

Process finished with exit code 0
````
Ao finalizar a compra com limite disponível, outra sugestão é que as **compras sejam exibidas por ordem de valor** e não na ordem lançada na lista. Assim, precisamos usar algum recurso de ordenação para realizar isso.

Ao digitar o número zero para sair, o retorno que obtemos deve ser mais ou menos como no exemplo abaixo:

````
COMPRAS REALIZADAS:

camisa - 15.0

calça - 30.0

sapato - 50.0

Saldo do cartão: 905.0
````
**Foi exibido na ordem de valor.**

## O que vamos fazer?
 - Criar uma aplicação para lançamento de compras com cartão de crédito
 - Menu para lançamento de compras
 - Exibição da lista de compras realizadas e ordenadas por valor

O menu é para realizar as compras, ou seja, essas compras deverão ser armazenadas em uma lista e depois essa lista deve ser **exibida e ordenada por valor**.