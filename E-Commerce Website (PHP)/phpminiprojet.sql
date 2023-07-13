-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2020 at 06:01 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `phpminiprojet`
--

-- --------------------------------------------------------

--
-- Table structure for table `commande`
--

CREATE TABLE `commande` (
  `CIN_user` varchar(8) NOT NULL,
  `ID_prod` varchar(8) NOT NULL,
  `Date_commande` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `commande`
--

INSERT INTO `commande` (`CIN_user`, `ID_prod`, `Date_commande`) VALUES
('0001', '01', '0000-00-00'),
('0001', '02', '2020-12-12');

-- --------------------------------------------------------

--
-- Table structure for table `produit`
--

CREATE TABLE `produit` (
  `ID_prod` varchar(8) NOT NULL,
  `Désignation` varchar(50) NOT NULL,
  `Prix` bigint(255) NOT NULL,
  `Quantité` int(255) NOT NULL,
  `Catégorie` varchar(50) DEFAULT NULL,
  `Marque` varchar(50) DEFAULT NULL,
  `Fournisseur` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produit`
--

INSERT INTO `produit` (`ID_prod`, `Désignation`, `Prix`, `Quantité`, `Catégorie`, `Marque`, `Fournisseur`) VALUES
('01', 'PC Samsung', 2000, 18, 'OrdiPc', 'Samsung', 'Wiki'),
('02', 'Ordinateur Fix', 20, 100, 'OrdiPc', 'PC Chinois', 'Chnia'),
('03', 'Ordinateur ', 420, 4100, 'OrdiPc', 'PC Amérique', 'Amérique'),
('04', 'Ordinateur', 200, 500, 'OrdiPc', 'Asus', 'Asus'),
('05', 'PC Portable', 2020, 5050, 'OrdiPc', 'Asus', 'Asus'),
('06', 'Ordinateur', 200, 500, 'OrdiPc', 'Hp', 'Hp'),
('07', 'Ordinateur', 2000, 5000, 'OrdiPc', 'Hp', 'Hp'),
('08', 'PC Portable', 2000, 1000, 'OrdiPc', 'Hp', 'HLTV'),
('100', 'Casque', 200, 500, 'AccPre', 'Samsung', 'x1'),
('106', 'Souris & Tapis', 0, 0, 'AccPre', 'Samsung', 'Samsung'),
('52', 'Telephone', 200, 500, 'TelTab', 'Samsung', 'Samsung'),
('58', 'Tablette', 2000, 5000, 'TelTab', 'Samsung', 'Samsung');

-- --------------------------------------------------------

--
-- Table structure for table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `CIN_user` varchar(100) NOT NULL,
  `Login` varchar(100) NOT NULL,
  `Mot_Pass` varchar(100) NOT NULL,
  `Nom` varchar(100) NOT NULL,
  `Prénom` varchar(100) NOT NULL,
  `Téléphone` varchar(100) NOT NULL,
  `Sexe` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Adresse` varchar(100) NOT NULL,
  `Ville` varchar(100) NOT NULL,
  `Code_Postal` varchar(100) NOT NULL,
  `Commentaire` varchar(500) NOT NULL,
  `Role` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `utilisateur`
--

INSERT INTO `utilisateur` (`CIN_user`, `Login`, `Mot_Pass`, `Nom`, `Prénom`, `Téléphone`, `Sexe`, `Email`, `Adresse`, `Ville`, `Code_Postal`, `Commentaire`, `Role`) VALUES
('0000', 'admin', 'admin', 'admin', 'admin', '0000', 'Homme', 'admin@maiko.com', 'tunisie', 'tunis', '0000', '', 'Admin'),
('0001', 'client', 'client', 'client', 'client', '0001', 'Femme', 'client@maiko.com', 'Tunisie', 'Tunis', '0000', '', 'Client');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `commande`
--
ALTER TABLE `commande`
  ADD PRIMARY KEY (`CIN_user`,`ID_prod`),
  ADD KEY `ID_prod` (`ID_prod`);

--
-- Indexes for table `produit`
--
ALTER TABLE `produit`
  ADD PRIMARY KEY (`ID_prod`);

--
-- Indexes for table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`CIN_user`),
  ADD UNIQUE KEY `Login` (`Login`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `commande`
--
ALTER TABLE `commande`
  ADD CONSTRAINT `commande_ibfk_2` FOREIGN KEY (`CIN_user`) REFERENCES `utilisateur` (`CIN_user`),
  ADD CONSTRAINT `commande_ibfk_3` FOREIGN KEY (`ID_prod`) REFERENCES `produit` (`ID_prod`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
