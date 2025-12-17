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


**Entrar com  usuario root no MySQL Command Line ou por cmd ou PowerShell:**  
- mysql -uroot -p "sua senha root aqui sem aspas";

**Criar  Usuario da aplicação no MySQL:** 
 

**Executar esses Codigos Sql para que o usuario seja correto e compativel com o db.properties:**  

    - CREATE USER 'developer'@'localhost' IDENTIFIED BY 'developer123@';  
    - GRANT ALL PRIVILEGES ON *.* TO 'developer'@'localhost'; 
    - FLUSH PRIVILEGES;  

**1- criação do banco e tabelas**
-

**Criar tabelas e inserir usuario padrão via terminal e script sql com comando SOURCE:**
- Abra o terminal na pasta que está o arquivo sql !!
- Executar o seguinte comando no arquivo que contem o script de criação do banco:  
  
    mysql -u developer -p diariodetrade < dbCode.sql
  

**2-criação do banco e tabelas**
-
**Ou recorrer a execução do script viaMySQL Workbench e rodar as Queries:**

CREATE DATABASE DiarioDeTrade;

USE DiarioDeTrade;

CREATE TABLE Usuarios (
    nome VARCHAR(200),
    senha VARCHAR(200)
);
CREATE TABLE Operacoes (
    id INT AUTO_INCREMENT PRIMARY KEY,  
    tipo_ativo VARCHAR(200) NOT NULL,  
    ativo VARCHAR(200) NOT NULL,  
    preco_entrada BIGINT NOT NULL,  
    preco_saida BIGINT NOT NULL,  
    quantidade_contratos INT NOT NULL,  
    tipo_operacao VARCHAR(200) NOT NULL,  
    tipo_posicao VARCHAR(100) NOT NULL,  
    status_operacao VARCHAR(150) NOT NULL,  
    imagem LONGBLOB,  
    data_hora DATETIME DEFAULT CURRENT_TIMESTAMP,  
    descricao TEXT,  
    evento_tecnico_base VARCHAR (100)  
);  
INSERT INTO Usuarios (nome, senha) VALUES ('user','user');  
-- INSERT INTO Usuarios (nome, senha) VALUES ('seu usuario', 'sua senha');

