# Projeto Modelando o iPhone com UML 

Este projeto modela e implementa um componente iPhone com as funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

O projeto faz parte do bootcamp GFT - Desenvolvimento Java com IA da plataforma DIO. Consistia em duas tarefas criar o diagrama UML e implementar as classes e interfaces em Java.

## Diagrama UML

```mermaid
classDiagram
    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet

    class ReprodutorMusical{
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
    }
    class AparelhoTelefonico{
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorInternet{
      +exibirPagina(String url)
      +atualizarPagina()
      +adicionarNovaAba()
    }
    class Iphone{
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
      +exibirPagina(String url)
      +atualizarPagina()
      +adicionarNovaAba()
    }

