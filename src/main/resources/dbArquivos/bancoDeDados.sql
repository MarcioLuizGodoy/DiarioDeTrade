-- Criar o banco de dados
CREATE DATABASE DiarioDeTrade;

-- Usar o banco criado
USE DiarioDeTrade;

-- Criar a tabela Usuario
CREATE TABLE Usuarios (
    nome VARCHAR(50),
    senha VARCHAR(50)
);

-- Inserir um usuário
INSERT INTO Usuarios (nome, senha) VALUES ('godoy', 'godoy');
