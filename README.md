# Game Boy Calculator
> Projeto de aplicação desenvolvido no curso Hefestos para o módulo de android.

> Application project developed in the Hefestos course for the android module.


O Game Boy Calculator é uma aplicação que tem como objetivo a execução de operações simples desenvolvida em Kotlin para avaliação da disciplina de Android, numa interface que nos lembra na aparencia de um game boy antigo.

Game Boy Calculator is an application that aims to perform simple operations developed in Kotlin to assess Android discipline, in an interface that reminds us of the appearance of an old game boy.

![](app\libs\img\Introdução.PNG)

## Instalação

Por ser um projeto que não utiliza as ferramentas mais complexas, é somente necessária a instalação do Android Studio com a linguagem Kotlin nos pacotes.

As it is a project that does not use the most complex tools, it is only necessary to install Android Studio with the Kotlin language in the packages.

## Exemplo de uso

A aplicação foi dividida em telas, a primeira exibe os numeros inseridos pelo teclado e logo abaixo o resultado dessas mesmas operações.

The application was divided into screens, the first displays the numbers entered by the keyboard and below the result of these same operations.
![](app\libs\img\Display.PNG)

No teclado, ficam dois tipos de símbolos, os vermelhos são para realizar as operações matemáticas (+, -, *, /), para agrupar os números entre parenteses ( '(', ')') , e para limpar a tela de insersão de numeros(CE).

On the keyboard, there are two types of symbols, the red ones are for performing mathematical operations (+, -, *, /), for grouping numbers in parentheses ('(', ')'), and for cleaning the insertion screen of numbers (EC).

Por fim, os símbolos com a cor cinza são os números a serem inseridos para serem calculados, a única exceção é o botão "back" que apaga somente o ultimo numero ou simbolo inserido.

Finally, the symbols with the gray color are the numbers to be inserted to be calculated, the only exception is the "back" button that deletes only the last number or symbol entered.
![](app\libs\img\teclado.PNG)


## Configuração para Desenvolvimento

A maior parte dos códigos do projeto fica no arquivo "MainActivity.kt", onde ficam as funções que verificam se os numeros podem ser calculados e executa as funções necessárias para isso.

Most of the project codes are in the file "MainActivity.kt", where are the functions that check if the numbers can be calculated and perform the necessary functions for that.

Já a parte gráfica foi dividida em 3 partes, as cores usadas no projeto estão no arquivo "colors.xml", os estilos usados na aplicação, a aplicação das cores, o tema do aplicativo encontra-se em "styles.xml" e por último, a aplicação foi desenhada em "activity_main.xml" onde aplicamos os estilos e as cores para que a parte visual do projeto seja exibida.

The graphic part was divided into 3 parts, the colors used in the project are in the file "colors.xml", the styles used in the application, the application of colors, the theme of the application can be found in "styles.xml" and by finally, the application was designed in "activity_main.xml" where we apply the styles and colors so that the visual part of the project is displayed.

## Histórico de lançamentos

* 0.0.1
    * Primeira interação do site

## DEV

Yago Marialva Bentes – ymb.hef2@uea.edu.br


[https://hefesto.uea.edu.br:8443/gitlab/yagomarialva](https://hefesto.uea.edu.br:8443/gitlab/yagomarialva)

