CREATE DATABASE CadastroClientes;

USE CadastroClientes;


CREATE TABLE Clientes (
    ID INT PRIMARY KEY,
    Nome VARCHAR(100),
    Email VARCHAR(100),
    Telefone VARCHAR(20)
);


INSERT INTO Clientes (ID, Nome, Email, Telefone)
VALUES (1, 'Maria Silva', 'maria@email.com', '11999999999');

INSERT INTO Clientes (ID, Nome, Email, Telefone)
VALUES (2, 'João Oliveira', 'joao@email.com', '21988888888');

INSERT INTO Clientes (ID, Nome, Email, Telefone)
VALUES (3, 'Ana Costa', 'ana@email.com', '11977777777');


SELECT * FROM Clientes;

SELECT * FROM Clientes
WHERE Nome = 'Maria Silva';


SELECT Telefone FROM Clientes
WHERE Nome = 'Maria Silva';


UPDATE Clientes
SET Telefone = '11966666666'
WHERE ID = 3;

DELETE FROM Clientes
WHERE ID = 2;


SELECT * FROM Clientes;