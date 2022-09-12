# Relatório - Atividade 2

## Introdução

Tendo em vista o objetivo da atividade de explorar os conceitos de Tipos Abstratos de Dados,
desde a etapa inicial do desenvolvimento, o projeto foi é focado na elaboração de um tipo 
abtrato de dados que compreendesse bem os requisitos apresentados. Além disso, para que fosse
possível visualizar o trabalho realizado, e para que o mesmo fosse testado, junto à classe implementada
está uma lógica que permita realizar diversas operações utilizando uma lista de multiplas instâncias
da classe que foi chamada 'TContaBancaria'.

## Desenvolvimento

Dessa forma, no arquivo referente a classe que é o centro desse trabalho (TContaBancaria.java), 
criamos os atributos que foram solicitados: nome, CPF, número da agência, número da conta, e o saldo. Todos eles foram implementados privados.
Os campos de nome e CPF foram implementados com o tipo String, pois apesar do CPF conter apenas números, pode começar com 0,
o que nos impede de utilizar o tipo int nesse caso, pois o algarismo seria ignorado. Já os campos de número da conta e agência
são sequenciais do tipo inteiro definidos pelo programa, a agencia como um valor fixo (como um banco online, de agência unica) 
e o número da conta de forma randômica. 
    
A classe contém métodos simples, e todos publicos, permitindo seu uso no arquivo principal do projeto (App.java). É nesse arquivo principal, contido pela função main  e alguns outros métodos auxiliares, que a mágica acontece, pois é nele que se criam as instâncias e é nesse arquivo que está implementado um menu de navegação,          para se executar as variadas operações da forma como o usuário preferir. Sendo assim, a classe fica com os métodos responsáveis por realizar saques e depósitos, que apenas alteram o valor do saldo, recebendo como parâmetro o valor a ser movimentado. Além disso, implementamos o construtor, um método que imprime o saldo disponível, além de um método toString que imprime as informações principais da conta.

Outra coisa a se pensar é o fluxo que o usuário percorrerá dentro do programa. Desenvolvemos a aplicação pensando no seguinte fluxo: o usuário começa criando uma conta, cuja o número e a agência são definidos pelo programa, depois passa a ter acesso ao menu completo. Nessa etapa, ele pode sacar ou depositar valores da conta criada, além de poder criar uma nova conta. Caso o usuário opte por criar pelo menos mais uma conta, ele podera, então, realizar todas as operações disponíveis, isso inclui as já citadas, além de poder navegar entre as contas que já estão criadas e poder transferir valores para outras contas. Tais ações envolvendo mais de uma instância da classe TContaBancaria foram implementadas no arquivo principal por envolverem a lista implementada também no arquivo principal, responsável por armazenar as contas já criadas.

Conforme solicitado, as contas criadas são todas armazenadas em uma lista, que vai alocando memória conforme a necessidade do usuário.

Portanto, através do trabalho desenvolvido, é possível ver a aplicação prática de diversos conceitos atrelados aos TAD's, além da alocação de memória e outros conceitos mais básicos de programação.
