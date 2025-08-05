-- Criar o banco de dados
CREATE DATABASE DiarioDeTrade;

-- Usar o banco criado
USE DiarioDeTrade;

-- Criar a tabela Usuario
CREATE TABLE Usuarios (
    nome VARCHAR(50),
    senha VARCHAR(50)
);
CREATE TABLE Operacoes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    ativo VARCHAR(50) NOT NULL,
    preco_entrada DOUBLE NOT NULL,
    preco_saida DOUBLE NOT NULL,
    quantidade_contratos INT NOT NULL,
    tipo_operacao VARCHAR(20) NOT NULL,
    tipo_posicao VARCHAR(10) NOT NULL,
    status_operacao VARCHAR(15) NOT NULL,
    imagem_grafico LONGBLOB,
    data_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


-- Inserir um usuário
INSERT INTO Usuarios (nome, senha) VALUES ('godoy', 'godoy');


