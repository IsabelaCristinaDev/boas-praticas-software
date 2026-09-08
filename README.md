# boas-praticas-software

Atividade prática de Manutenção e Configuração de Software — SENAI FATESG.
Refatoração de um sistema simples aplicando boas práticas de nomenclatura,
modularização, código auto comentado e controle de versão com Git.

## O que foi feito

- Código original: variáveis com nomes pouco descritivos (n, a, b, c) e toda
  a lógica concentrada no método main.
- Código refatorado: nomes descritivos, lógica dividida em métodos com
  responsabilidade única e padronização geral.
- Fluxo de trabalho: branch separada para as melhorias, Pull Request e merge
  para a main.

## Questão final

**1. Qual era o principal problema do código original?**

Nomes de variáveis pouco descritivos (n, a, b, c) e toda a lógica concentrada
no método main, sem separação de responsabilidades.

**2. Quais melhorias você realizou?**

Renomeei as variáveis para nomes que expressam seu significado, dividi a
lógica em três métodos (calcularMedia, verificarAprovacao, apresentarResultado),
extraí a constante MEDIA_MINIMA no lugar do valor fixo 6, e padronizei a
indentação e organização do código.

**3. Como a modularização facilitou a organização do código?**

Cada método passou a ter uma única responsabilidade, deixando o fluxo do
main mais fácil de ler e permitindo alterar cada parte (cálculo, verificação,
exibição) sem afetar as demais.

**4. Como o Git ajudou a controlar as alterações realizadas no sistema?**

Permitiu registrar o código original antes de qualquer mudança, isolar as
melhorias em uma branch separada sem arriscar a versão estável da main, e
documentar cada etapa por meio dos commits e do Pull Request.
