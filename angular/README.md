
# Desafios

<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->

<!-- code_chunk_output -->

* [Desafios](#desafios)
	* [Informações](#informações)
	* [Problema 0](#problema-0)
	* [Problema 1](#problema-1)


<!-- /code_chunk_output -->

## Informações
Os problemas criados aqui tem base o framework angular.
Cada problema listado neste documento não tem relação com o problema anterior resolvido, porém, a dificuldade será incremental e os assuntos abordados seguirão uma sequência pré-definida. 


## Problema 0
[Crie um projeto base](https://angular.io/guide/quickstart) do angular 2:
- Altere a variável "**app**" para que receba o valor: "Problem P000".
- Crie uma nova variável chamada "**framework**" e alimente com o valor: "angular 2", posteriormente exiba-a na tela logo abaixo da primeira variável.

Saída esperada: angular\problems\p000\p000.solved.png

## Problema 1
Bom, já criamos nosso primeiro projeto Angular 2, agora, vamos voltar um pouco, estudar e entender o [typescript](https://www.typescriptlang.org/#download-links "typescript"). Sem o entendimento do que o typescript pode nos prover, podemos ter dificuldade de resolver problemas futuros. Os próximos desafios vou focar no entendimento da base do typescript, e logo, voltamos ao Angular 2.

-  Instale o typescript
- Crie um diretório e um arquivo chamado "app.ts" dentro do respectivo diretório.
- Insira o seguinte código no arquivo "app.ts"

function ola(nome: string) {
    console.log("Olá " + nome)
}

ola(*Seu nome aqui*);

- Abra o terminal e acesse o diretório
- Digite "tsc app.ts" (pode fazer sem o ".ts")
	Nesse momento o typescript irá gerar um arquivo .js convertido.

- Execute "node app.js"

O que isso nos ensina?
Typescripe é um superconjunto desenvolvido pela Microsoft que provê tipagem e alguns outros recursos não implementados pelo JavaScript, como por exemplo: Classes, interfaces, etc.

Desafio:
Crie um arquivo .ts com um método de somar. Esta função recebe 2 parâmetros do tipo inteiro. Escreva uma chamada a essa função com valores fixos.  No terminal, execute o arquivo e confira o resultado.
- Se tiver dúvidas sobre os tipos, pode ler [esse artigo](https://goo.gl/ndnkHD "esse artigo") que explica com detalhes e exemplos.
- Utilize arrow function para criar o método de soma.

Resultado: 
Confira o resultado esperado em 'p001\p001.solved.jpg'