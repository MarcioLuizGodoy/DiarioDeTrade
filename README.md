**DiarioDeTrade**  
-  
**Descrição:**  
-
Trabalho realizado para a disciplina de Programação Orientada a Objetos. Este projeto visa implementar uma versão do tão citado Diário referenciado na literatura Trader por grandes escritores como Martin J. Pring e Alexander Elder.

**Funcionalidades essênciais :**  
-
- Adicionar Operações
- Buscar Operações
- Editar Operações
- Excluir Operações

**Funcionalidades extras:**  
-
- Evolução de Capital
- Resultado por tipo de ativo
- Resultado por ativo
- Resultado por tipo de posição
- Resultado por tipo de operação
- Gerar Relatórios em PDF
- Executar Script de backup do banco de dados

**Como instalar este artefato:**  
-

  **IMPORTANTE: Se você esta instalando pelo github, antes de seguir qualquer passo, baixe o arquivo sql e o artefato com extensao .jar ou execute ' git clone padrão '. Assim você vai poder executar todas as etapas! Se você recebeu o arquivo .zip ignore e siga os outros passos abaixo.   https://github.com/MarcioLuizGodoy/DiarioDeTrade/tree/main/dist-exe**
  -
  
  


**Instalar o MySQL Community Server 8.4.7 LTS**   
    Link de Download da versão correta:
        https://dev.mysql.com/downloads/mysql/8.4.html


 **Obs: Verifique a necessidade do mysql esteja configurado na variavel de ambiente/sistemas no sistema operacional de sua maquina!**  

( path )  
 C:\Program Files\MySQL\MySQL Server 8.4\bin  

 **Verifique se a instalação já fez isso por você completamente ou parcialmente, se tiver feito completamente não altere.**

 
**- - - -**

  **Instalar o Java 24**  
Link de Download da versão correta:  https://download.oracle.com/java/24/archive/jdk-24.0.2_windows-x64_bin.msi  


**Obs: É importante que o java 24 esteja bem configurado na variavel de ambiente/sistemasno sistema operacional de sua maquina!**   
  
( variável path )  
C:\Program Files\Common Files\Oracle\Java\javapath  

( variável de sistema )  
JAVA_HOME     C:\Program Files\Java\jdk-24  

**Verifique se a instalação já fez isso por você completamente ou parcialmente, se tiver feito completamente não altere.**

**- - - -**

**Passos  importantes:**
-
**0 - imprescindível**
-


**Usando o terminal ou powershell, entrar com  usuario root no MySQL Command Line:**  
- mysql -uroot -p "sua senha root aqui sem aspas/ é a senha que você criou no momento  da instalação do mysql";  


- Se você encontrar dificuldades de reconhecimento de comandos do mysql no seu terminal, ajuste as variaveis de ambiente( Path), passando o caminho da pasta bin. Fazendo isso o SO ira reconhecer os comandos executados.  

**Criar  Usuario da aplicação no MySQL:** 
 

**Executar esses Codigos Sql para que o usuario seja correto e compativel com o db.properties:**  

     CREATE USER 'developer'@'localhost' IDENTIFIED BY 'developer123@';  
     GRANT ALL PRIVILEGES ON *.* TO 'developer'@'localhost'; 
     FLUSH PRIVILEGES;  

**1- criação do banco e tabelas**
-

**Criar tabelas e inserir usuario padrão via terminal e script sql com comando SOURCE:**
-
**Abra o terminal/powershell na pasta que está o arquivo sql e  Executar o seguinte comando no terminal pra entrar no mysql Command Line:** 
  
  mysql -udeveloper -p    

  Depois disso, o terminal vai mostrar:  
  Enter password: ' voce digita sua senha do novo usuario/ usuario da aplicacao '  
  password: developer123@

**ou**  
      mysql -u developer -pdeveloper123@ 

**Apos entrar no MYSQL com o usuario da aplicação, rode o comando no script do banco de dados:**

- Execute esse comando no mesmo diretório em que esta o arquivo sql. Seu mysql precisa estar aberto e logado com usuario da aplicação justamente no diretorio onde esta esse arquivo. Assegurando-se disso, execute: 
  
        SOURCE dbCode.sql;

- O mysql vai retornar status de querys executados com sucesso: Query OK.
- Agora digite:  use diariodetrade;  
  
**Ao finalizar suas credenciais são:**  

**Seu usuario padrão: user**  
**Sua senha padrão: user**


**Agora, clique nesse link e baixe o artefato com extensão .jar caso nao tenha baixado ainda:**  
-

**Esse é o path que leva a diretório dist-exe no repositório:https://github.com/MarcioLuizGodoy/DiarioDeTrade/tree/main/dist-exe**

- Se você já tiver baixado, ignore! Apenas execute aaplicação e teste as funcionalidades.

**BOM USO DESTE ARTEFATO!**
-
