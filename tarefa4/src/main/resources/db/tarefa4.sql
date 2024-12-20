CREATE DATABASE IF NOT EXISTS tarefa4;

USE tarefa4;

DROP USER IF EXISTS 'user'@'localhost';
CREATE USER 'user'@'localhost' IDENTIFIED BY '1234';
GRANT INSERT, SELECT, UPDATE, DELETE ON tarefa4.* TO 'user'@'localhost';

CREATE TABLE cachorro (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    raca VARCHAR(80) NOT NULL,
    cor VARCHAR(80) NOT NULL
);

CREATE TABLE carro (
	id INT AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(80) NOT NULL,
    marca VARCHAR(80) NOT NULL,
    cor VARCHAR(80) NOT NULL
);

CREATE TABLE celular (
	id INT AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(80) NOT NULL,
    marca VARCHAR(80) NOT NULL,
    cor VARCHAR(80) NOT NULL
);

CREATE TABLE gato (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    raca VARCHAR(80) NOT NULL,
    idade INT NOT NULL
);

CREATE TABLE hashira (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    respiracao VARCHAR(80) NOT NULL,
    corEspada VARCHAR(80) NOT NULL
);

CREATE TABLE heroi (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    poder VARCHAR(80) NOT NULL,
    pontosDeVida INT NOT NULL
);

CREATE TABLE inseto (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    especie VARCHAR(80) NOT NULL,
    cor VARCHAR(80) NOT NULL
);

CREATE TABLE ninja (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    aldeia VARCHAR(80) NOT NULL,
    jutsu VARCHAR(80) NOT NULL
);

CREATE TABLE pato (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    cor VARCHAR(80) NOT NULL,
    acessorio VARCHAR(80) NOT NULL
);

CREATE TABLE pessoa (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    genero ENUM('Feminino', 'Masculino', 'Outro') NOT NULL,
    idade INT NOT NULL
);
