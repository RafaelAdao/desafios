# Desafios

<!-- @import "[TOC]" {cmd="toc" depthFrom=1 depthTo=6 orderedList=false} -->

<!-- code_chunk_output -->

* [Desafios](#desafios)
	* [Informações](#informações)
	* [Problema 0 (Exemplo)](#problema-0-exemplo)
	* [Problema 1](#problema-1)
	* [Problema 2](#problema-2)
    * [Problema 3](#problema-3)
    * [Problema 4](#problema-4)

<!-- /code_chunk_output -->

## Informações
Cada problema listado neste documento pode ser resolvido utilizando o projeto base `euler`. Para tal, você deve criar uma classe que siga as seguintes regras:
- Deve estar dentro do pacote `euler.problems.here`
- Implementar a interface [euler.problems.Problem](src/main/java/euler/problems/Problem.java)
- Deve ter um construtor sem parametros

A solução de cada problema deve ser implementada no método `solve`.

A entrada de dados vem de um arquivo seguindo a estrutura:
```bash
euler
└── src
    └── main
        └── resources
            └── problemas
                └── <NOME_CLASSE>
                    └── <NOME_TESTE>
                        ├── in.txt
                        └── out.txt
```

Exemplo:
- Entrada: `euler\src\main\resources\problemas\P000\T01\in.txt`
- Saída: `euler\src\main\resources\problemas\P000\T01\out.txt`

O método `solve` recebe como argumento `List<String>` que é o conteudo do arquivo `in.txt` do teste sendo executado atualmente. Cada item da lista representa uma linha no arquivo.

O resultado do método `solve` será comparado ao conteúdo do arquivo `out.txt` do teste sendo executado.

## Problema 0 (Exemplo)
Na classe [euler.problems.p000.P000](src/main/java/euler/problems/base/p000/P000.java) implemente o método `solve` para que o mesmo faça o somatório dos números recebidos como argumento.

Exemplo de entrada (in.txt):
```
1
2
3
```

Saída esperada (out.txt):
```
6
```

## Problema 1
Encontre a soma dos números naturais multiplos de 3 e 5.

Exemplo de entrada (in.txt):
```
0
1
2
3
4
5
```

Saída esperada (out.txt):
```
8
```

Adaptação de [Project Euler #1](https://projecteuler.net/problem=1)

## Problema 2

Produzir a [sequência de Fibonacci](https://pt.wikipedia.org/wiki/Sequência_de_Fibonacci), na forma de uma lista separada por vírgula. Exemplo:
```
0, 1, 1, 2, 3, 5, ...
```

**Nome da classe:** `P002.java`

**Entrada:**
Cada linha representa o número de elementos a ser produzido na lista. Exemplo:
```
1
2
3
4
5
```

**Saída:**
Com base no exemplo de entrada, a saída esperada é:
```
0
0, 1
0, 1, 1
0, 1, 1, 2
0, 1, 1, 2, 3
```

<details>
  <summary><b>Dicas:</b></summary>
   <ul>
        <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#iterate-T-java.util.function.UnaryOperator-" style="font-family: monospace">Stream.iterate</a></li>
        <li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html#joining-java.lang.CharSequence-" style="font-family: monospace">Collectors.joining</a></li>
   <ul>
</details>

Inspirado em [Project Euler #2](https://projecteuler.net/problem=2)

## Problema 3  

Implementar um replace de String (aka String.replace).    

**Entrada:**  
Cada linha terá a String base e a String a ser substituída. Exemplo:  
```
abcbabacbbakda|a
nbabbacbacabba|ba
abcdfeghijklmn|
```

**Saída:**  
Com base no exemplo de entrada, a saída esperada é:
```
bcbbcbbkd
nbccab
abcdfeghijklmn
```

**Dica**
String.charAt

## Problema 4

Implementar uma máquina para sacar dinheiro (incluindo centavos).  
O objetivo é otimizar a máquina para retornar a menor quantidade de notas/moedas possíveis de acordo com a sua grandeza. Para facilitar foi disponibilizada a Enum Dinheiro com os valores.  

**Entrada:**  
Quantida de dinheiro que será sacado.
```
23.56
```

**Saída:**  
O retorno deve estar no formato QUANTIDADE_UNIDADE=VALOR_UNIDADE e o valor da unidade com um zero à direita e dois à esquerda quando necessário.
```
1=20.00,1=2.00,1=1.00,1=0.50,1=0.05,1=0.01
```