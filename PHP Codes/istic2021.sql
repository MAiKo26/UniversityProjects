-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 16 nov. 2020 à 13:33
-- Version du serveur :  10.1.31-MariaDB
-- Version de PHP :  7.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `istic`
--

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

CREATE TABLE `classe` (
  `id_classe` varchar(8) NOT NULL,
  `nom_classe` varchar(50) NOT NULL,
  `salle_classe` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `classe`
--

INSERT INTO `classe` (`id_classe`, `nom_classe`, `salle_classe`) VALUES
('lfsia', 'License Fondamentale Sciences de l’Informatique A', '1'),
('lfsib', 'License Fondamentale Sciences de l’Informatique B', '2'),
('lfsic', 'License Fondamentale Sciences de l’Informatique C', '3'),
('lfsid', 'License Fondamentale Sciences de l’Informatique D', '4');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `CIN_et` varchar(8) NOT NULL,
  `PRENOM_et` varchar(50) NOT NULL,
  `NOM_et` varchar(50) NOT NULL,
  `MAIL_et` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`CIN_et`, `PRENOM_et`, `NOM_et`, `MAIL_et`) VALUES
('01234567', 'Ali', 'Ben Mohamed', 'Ali.bmohamed@gmail.com'),
('07654321', 'Foulen', 'Ben Foulen', 'Foulen.bfoulen@gmail.com'),
('12345607', 'Hamadi', 'Hmed', 'Hmed.hamadi@yahoo.fr'),
('12345678', 'faiza', 'ff', 'f@gmail.com'),
('73321100', 'Hlima', 'Hamadi', 'Hlima.hamadi@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `etudiant_classe`
--

CREATE TABLE `etudiant_classe` (
  `CIN_et` varchar(8) NOT NULL,
  `id_classe` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `etudiant_classe`
--

INSERT INTO `etudiant_classe` (`CIN_et`, `id_classe`) VALUES
('12345678', 'lfsia');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`id_classe`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`CIN_et`);

--
-- Index pour la table `etudiant_classe`
--
ALTER TABLE `etudiant_classe`
  ADD PRIMARY KEY (`CIN_et`,`id_classe`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
