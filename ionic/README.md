
# Desafios

* [Desafios](#desafios)
	* [Informações](#informações)
	* [Problema 0](#problema-0)
	* [Problema 1](#problema-1)
    
## Informações
Os problemas criados aqui tem base o framework Ionic.

## Problema 0
Criar um projeto conforme a documentação: https://ionicframework.com/docs/intro/installation/. Durante a criação, não é necessário habilitar a integração com Cordova e com o Ionic Pro SDK.
* Would you like to integrate your new app with Cordova to target native iOS and Android? No
* Install the free Ionic Pro SDK and connect your app? No

Criar a propriedade ```titulo``` e preencher com 'Desafios Ionic' na classe ```HomePage```.

No componente ```<ion-title>``` da página ```Home```, alterar para utilizar a propriedade ```titulo```.

Criar duas propriedades: ```cabecalho``` e ```conteudo```, preenchê-las respectivamente com: 
* Problema P000
* O Ionic é um framework baseado em Angular e Cordova, contando com uma gama de plugins e funcionalidades nativas para criar e compilar uma aplicação mobile ou uma Progressive Web App.

Criar um Card dentro do componente ```<ion-content>```
* https://ionicframework.com/docs/components/#cards

Utilizar as propriedades criadas, ```cabecalho``` e ```conteudo```, para preencher o Card

Saída esperada: ionic\problems\p000\saidaP000.PNG

## Problema 1

Criar um projeto mobile com o Ionic Framework. O título da página deve ser alterado para "Mobile - Ionic - P001". Todas as plataformas suportadas pelo Ionic devem ser listadas. Destacar as plataformas compatíveis com a Plataforma atual em que o aplicativo estiver rodando.

Orientações:
* Criar um projeto conforme a documentação: https://ionicframework.com/docs/intro/installation/. Durante a criação, habilitar a integração com Cordova e não utilizar o Ionic Pro SDK.
  * Would you like to integrate your new app with Cordova to target native iOS and Android? Yes
  * Install the free Ionic Pro SDK and connect your app? No
* Seguir a documentação de acordo com o ambiente estiver utilizando: https://ionicframework.com/docs/intro/deploying/
* Rodar o projeto no dispositivo conforme a plataforma:
  * ionic cordova run android --device
  * ionic cordova run ios --device
* Obter informações da plataforma: API Platform https://ionicframework.com/docs/api/platform/Platform
* Lista de plataformas: ionic\problems\p001\platforms_ionic.txt
* Saídas exemplo: ionic\problems\p001\saidas\
* CSS exemplo: ionic\problems\p001\style.css
