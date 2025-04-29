Projeto com Selenium – Extração de Dados e Geração de JSON

Este projeto tem como objetivo praticar e explorar o uso do Selenium com Java, aplicando conceitos de automação de navegação e manipulação de dados.

Utilizei a API do Rick and Morty como fonte de dados, realizando a extração de informações diretamente pela interface web da API e convertendo-as em uma lista JSON formatada.

🔍 O que o projeto faz
Acessa a primeira página da API do Rick and Morty via navegador (usando Selenium).

Captura o JSON bruto exibido na página.

Faz o parse do conteúdo e extrai:

Nome dos personagens

Status (vivo, morto, desconhecido)

Converte os dados extraídos em uma estrutura JSON legível com o uso da biblioteca Gson.

🛠 Tecnologias utilizadas
Java

Selenium WebDriver

ChromeDriver

Gson (Google JSON library)

💡 Objetivo
O projeto tem fins educativos, com o propósito de entender melhor como:

Automatizar acesso a páginas usando Selenium

Manipular e extrair dados estruturados

Trabalhar com JSON em Java

Criar aplicações simples com propósito claro

📌 Observações
Este projeto extrai apenas os dados da primeira página da API.

É necessário ter o chromedriver.exe compatível com sua versão do Chrome e incluí-lo no diretório raiz do projeto.