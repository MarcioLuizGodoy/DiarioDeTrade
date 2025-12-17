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
 
**- - - -**

  **Instalar o Java 24**  
Link de Download da versão correta:  https://download.oracle.com/java/24/archive/jdk-24.0.2_windows-x64_bin.msi  


**Obs: É importante que o java 24 esteja bem configurado na variavel de ambiente/sistemasno sistema operacional de sua maquina!**  

**- - - -**

**Passos  importantes:**
-
**0 - imprescindível**
-


**Usando o terminal ou powershell, entrar com  usuario root no MySQL Command Line:**  
- mysql -uroot -p "sua senha root aqui sem aspas/ é a senha que você criou no momento  da instalação do mysql";

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
  Enter password: ' voce digita sua senha do novo usuario/ usuarioda aplicacao '  
  password: developer123@

**ou**  
      mysql -u developer -pdeveloper123@ 

**Apos entrar com o usuario da aplicação, rode o comando no script do banco de dados:**
  
        SOURCE dbCode.sql;

**Ao finalizar suas credenciais são:**  

**Seu usuario padrão: user**  
**Sua senha padrão: user**


**Agora, clique nesse link e baixe o artefato com extensão .jar:**  
-

**Esse é o path que leva a diretório dist-exe no repositório:https://github.com/MarcioLuizGodoy/DiarioDeTrade/tree/main/dist-exe**

**BOM USO DESTE ARTEFATO!**
-
