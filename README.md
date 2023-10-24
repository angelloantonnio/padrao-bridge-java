# Padrão Estrutural Bridge com [Angelo Antonio](https://github.com/angelloantonnio)

Este é um recurso de aprendizado que visa conceituar e aplicar na prática um dos padrões de projetos "GOF" (Gang of Four), conhecimento como Bridge. 

Neste README, forneceremos uma visão geral do conteúdo do projeto. Bom estudo! 📚🤓

## Sumário

1. [Conceito](#conceito)
2. [Problema a resolver](#problema-a-resolver)
3. [Solução](#solução)
4. [Arquitetura](#arquitetura)

## Conceito

O Padrão Bridge, ou "Bridge Pattern," é um padrão de projeto estrutural que tem como objetivo organizar e simplificar o código, tornando-o flexível e manutenível.

## Problema a resolver

O desafio surge quando é necessário criar múltiplas classes para diferentes elementos, resultando em um código complexo e fortemente acoplado. 

Isso significa que as partes do código estão profundamente interligadas, tornando as modificações e extensões difíceis de realizar sem afetar outras partes do sistema.

<div align="center"> 
 <img src="https://github.com/angelloantonnio/padrao-bridge-java/blob/main/img/Problema.png" width="500" />
</div>
<p></p>

Neste exemplo, a necessidade de criar múltiplas classes para representar diversos tipos de controles remotos e dispositivos leva ao crescimento exponencial do código à medida que mais dispositivos e tipos de controles são introduzidos. Isso requer a criação de uma nova classe para cada combinação de controle e dispositivo, resultando em complexidade.

## Solução

O Padrão Bridge resolve esse problema por meio da criação de uma "ponte" que desacopla as partes do código. 

Essa "ponte" permite que as abstrações e implementações evoluam independentemente, simplificando a adição de novos elementos ou funcionalidades sem afetar o restante do sistema.

<div align="center"> 
   <img src="https://github.com/angelloantonnio/padrao-bridge-java/blob/main/img/Solu%C3%A7%C3%A3o.png" width="500" /> 
</div>
<p></p>

Ao aplicar os conceitos propostos pelo padrão Bridge, cada classe pode evoluir e se adaptar de forma independente das outras, com uma "Ponte" que permite o funcionamento em conjunto mas sem estarem diretamente ligadas.

## Arquitetura

- Abstração (Classe Abstrata ou Interface): é a parte principal do padrão que representa uma classe abstrata ou uma interface.

- Implementação (Interface ou Classe Abstrata): ela representa as classes ou interfaces que definem as operações específicas. São essas implementações que realizam o trabalho real, mas os métodos específicos não são diretamente acessíveis a partir da abstração. 

- Ponte (Conexão): A ponte é o elemento essencial do padrão Bridge. Ela faz a conexão entre a abstração e a implementação. Ela é como uma referência a um objeto de implementação dentro da abstração. 

- Classes Concretas (Implementações Específicas): As classes concretas representam objetos reais que usam o padrão Bridge. Elas herdam da abstração e instanciam uma implementação específica. 

## Contribuição

Gostaríamos muito da sua contribuição para este projeto! Sinta-se à vontade para abrir problemas, enviar solicitações de recebimento e melhorar este recurso de aprendizado.

---

Espero que essa breve explicação sobre o Padrão Estrutural Bridge tenha esclarecido o seu conceito e aplicação. É importante lembrar que, se mal implementado, um padrão pode causar o efeito oposto ao desejado, tornando o código complexo e difícil de manter. Portanto, use com cuidado e moderação!

Obrigado por ter chegado até aqui! Aproveite o código 😄🚀
