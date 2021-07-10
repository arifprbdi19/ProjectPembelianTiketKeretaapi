-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 09, 2021 at 06:40 PM
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
-- Database: `kereta`
--

-- --------------------------------------------------------

--
-- Table structure for table `penumpang`
--

CREATE TABLE `penumpang` (
  `NIK` int(11) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Telfon` varchar(12) NOT NULL,
  `asal` varchar(30) NOT NULL,
  `tujuan` varchar(30) NOT NULL,
  `kelas` varchar(30) NOT NULL,
  `tanggal` varchar(30) NOT NULL,
  `harga` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penumpang`
--

INSERT INTO `penumpang` (`NIK`, `Nama`, `Alamat`, `Telfon`, `asal`, `tujuan`, `kelas`, `tanggal`, `harga`) VALUES
(123190031, 'Friska Eka', 'kemang', '08119117628', 'Yogyakarta', 'Jakarta', 'Economi', '1 Januari 2020', '400000'),
(123190019, 'arip', 'medan', '08119117621', 'Yogyakarta', 'Jakarta', 'Economi', '1 januari', '400000'),
(123, 'frisaaaa', 'fvfdkv', '3456', 'Yogyakarta', 'Jakarta', 'Economy ', '4 Maret 2021', '400000');

-- --------------------------------------------------------

--
-- Table structure for table `perjalanan`
--

CREATE TABLE `perjalanan` (
  `asal` varchar(30) NOT NULL,
  `tujuan` varchar(30) NOT NULL,
  `kelas` varchar(30) NOT NULL,
  `harga` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `perjalanan`
--

INSERT INTO `perjalanan` (`asal`, `tujuan`, `kelas`, `harga`) VALUES
('Yogyakarta', 'Jakarta', 'Economi', '400000'),
('Yogyakarta', 'Bandung', 'Economi', '200000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
