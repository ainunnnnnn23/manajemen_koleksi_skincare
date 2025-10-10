-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 08, 2025 at 03:17 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `koleksiskincare`
--

-- --------------------------------------------------------

--
-- Table structure for table `produk_skincare`
--

CREATE TABLE `produk_skincare` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `kategori` varchar(50) NOT NULL,
  `brand` varchar(50) NOT NULL,
  `manfaat` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `produk_skincare`
--

INSERT INTO `produk_skincare` (`id`, `nama`, `kategori`, `brand`, `manfaat`) VALUES
(1, 'Hydra Glow Serum', 'Serum', 'Luminous', 'Melembabkan dan mencerahkan wajah'),
(2, 'Pure Cleanser', 'Cleanser', 'NatureSkin', 'Membersihkan pori-pori dan mencegah jerawat'),
(3, 'UV Protect Cream', 'Sunscreen', 'SunCare', 'Melindungi kulit dari sinar UV'),
(4, 'Gokujyun', 'Cleanser', 'Hada Labo', 'Untuk membersihkan wajah'),
(5, '', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `produk_skincare`
--
ALTER TABLE `produk_skincare`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `produk_skincare`
--
ALTER TABLE `produk_skincare`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
