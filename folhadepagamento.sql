-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 25-Abr-2025 às 01:45
-- Versão do servidor: 5.7.25
-- versão do PHP: 7.1.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `folhadepagamento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `vt` tinyint(1) DEFAULT NULL,
  `salbruto` double DEFAULT NULL,
  `dep14` int(11) DEFAULT NULL,
  `depir` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `funcionario`
--

INSERT INTO `funcionario` (`id`, `nome`, `vt`, `salbruto`, `dep14`, `depir`) VALUES
(6, 'Israel', 1, 2000, 9, 17),
(7, 'Israel vlastuin', 1, 2000, 2, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `imposto`
--

CREATE TABLE `imposto` (
  `id` int(11) NOT NULL,
  `tinns1` double DEFAULT NULL,
  `alinss1` double DEFAULT NULL,
  `tinss2` double DEFAULT NULL,
  `alinss2` double DEFAULT NULL,
  `tinss3` double DEFAULT NULL,
  `alinss3` double DEFAULT NULL,
  `tinss4` double DEFAULT NULL,
  `alinss4` double DEFAULT NULL,
  `tsf` double DEFAULT NULL,
  `vsf` double DEFAULT NULL,
  `tirrf1` double DEFAULT NULL,
  `alirrf2` double DEFAULT NULL,
  `dirrf2` double DEFAULT NULL,
  `tirrf2` double DEFAULT NULL,
  `tirrf3` double DEFAULT NULL,
  `alirrf3` double DEFAULT NULL,
  `dirrf3` double DEFAULT NULL,
  `tirrf4` double DEFAULT NULL,
  `alirrf4` double DEFAULT NULL,
  `dirrf4` double DEFAULT NULL,
  `alirrf5` double DEFAULT NULL,
  `dirrf5` double DEFAULT NULL,
  `deppdep` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `imposto`
--

INSERT INTO `imposto` (`id`, `tinns1`, `alinss1`, `tinss2`, `alinss2`, `tinss3`, `alinss3`, `tinss4`, `alinss4`, `tsf`, `vsf`, `tirrf1`, `alirrf2`, `dirrf2`, `tirrf2`, `tirrf3`, `alirrf3`, `dirrf3`, `tirrf4`, `alirrf4`, `dirrf4`, `alirrf5`, `dirrf5`, `deppdep`) VALUES
(12, 1518, 7.5, 2793.88, 9, 4190.83, 12, 8157.41, 14, 1906.04, 65, 2259.2, 7.5, 169.44, 2826.65, 3751.05, 15, 381.44, 4464.68, 22.5, 662.77, 27.5, 896, 189.59);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `imposto`
--
ALTER TABLE `imposto`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `imposto`
--
ALTER TABLE `imposto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
