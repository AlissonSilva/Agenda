-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 05/04/2012 às 09h13min
-- Versão do Servidor: 5.5.16
-- Versão do PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `agenda`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `agenda`
--

CREATE TABLE IF NOT EXISTS `agenda` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(225) DEFAULT NULL,
  `email` varchar(300) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `celular` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Extraindo dados da tabela `agenda`
--

INSERT INTO `agenda` (`id`, `nome`, `email`, `telefone`, `celular`) VALUES
(6, '', '', '', ''),
(7, 'Teste Teste', 'teste@teste', '(62) 2222-2222', '(62) 3333-3333'),
(10, 'xmen', 'xmen@xmen', '(32) 1321-3213', '(23) 1232-1321'),
(12, 'SimT teste', 'sim@teste', '(13) 2135-4643', '(12) 2135-6541'),
(13, 'Alisson da Silva Almeida Oliveira', 'alisson_sao@hotmail.com', '(62) 1232-1111', '(62) 1234-5678'),
(14, 'Alisson da Silva', 'alisson@alisson.com', '', ''),
(15, 'tste', 'teset2te@teste', '', '');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(150) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `usuario`, `senha`) VALUES
(1, 'admin', 'admin');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
