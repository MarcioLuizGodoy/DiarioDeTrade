-- Criar o banco de dados
CREATE DATABASE DiarioDeTrade;

-- Usar o banco criado
USE DiarioDeTrade;

-- Criar a tabela Usuario
CREATE TABLE Usuarios (
    nome VARCHAR(200),
    senha VARCHAR(200)
);
CREATE TABLE Operacoes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo_ativo VARCHAR(200) NOT NULL,
    ativo VARCHAR(200) NOT NULL,
    preco_entrada DOUBLE NOT NULL,
    preco_saida DOUBLE NOT NULL,
    quantidade_contratos INT NOT NULL,
    tipo_operacao VARCHAR(200) NOT NULL,
    tipo_posicao VARCHAR(100) NOT NULL,
    status_operacao VARCHAR(150) NOT NULL,
    imagem LONGBLOB,
    data_hora TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    descricao TEXT,
    evento_tecnico_base VARCHAR (100)
);


-- Inserir um usuário
INSERT INTO Usuarios (nome, senha) VALUES ('godoy', 'godoy');


