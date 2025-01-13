-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 16, 2023 at 07:35 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_bdu_sas`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance_form`
--

CREATE TABLE `attendance_form` (
  `af_id` int(10) UNSIGNED NOT NULL,
  `af_name` text DEFAULT NULL,
  `af_created_date` timestamp NOT NULL DEFAULT current_timestamp(),
  `c_id` int(11) DEFAULT NULL,
  `submit` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendance_form`
--

INSERT INTO `attendance_form` (`af_id`, `af_name`, `af_created_date`, `c_id`, `submit`) VALUES
(1, 'Attendance of Class 01', '2023-02-26 02:08:16', 22, 0),
(4, 'Attendance of Class 02', '2023-03-01 14:40:41', 22, 0);

-- --------------------------------------------------------

--
-- Table structure for table `course_list`
--

CREATE TABLE `course_list` (
  `c_id` int(10) UNSIGNED NOT NULL,
  `course_name` varchar(50) DEFAULT NULL,
  `course_code` varchar(10) DEFAULT NULL,
  `department` varchar(15) DEFAULT NULL,
  `program` varchar(15) DEFAULT NULL,
  `session` varchar(10) DEFAULT NULL,
  `t_id` int(11) DEFAULT NULL,
  `course_id` varchar(10) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `course_list`
--

INSERT INTO `course_list` (`c_id`, `course_name`, `course_code`, `department`, `program`, `session`, `t_id`, `course_id`, `create_time`) VALUES
(2, 'Software Enginering', 'ICT 4356', 'ICT', 'IOT', '2019-20', 2, '234ase', '2023-02-22 14:55:25'),
(3, 'Signal Processing', 'ICT 4357', 'ICT', 'IOT', '2018-19', 2, 'A3D3ew', '2023-02-22 14:55:25'),
(13, 'System Engineering', 'ICT 4211', 'ICT', 'IOT', '2019-20', 2, 'f4VPtM', '2023-02-23 12:48:02'),
(22, 'Industrial IOT', 'ICT 4345', 'ICT', 'IOT', '2019-20', 2, '50iHsr', '2023-02-23 17:09:01'),
(34, 'Wireless Communication Network', 'ICT 4233', 'ICT', 'IOT', '2019-20', 5, '7Od1d2', '2023-03-03 04:06:27');

-- --------------------------------------------------------

--
-- Table structure for table `stu_foreach_attendance_form`
--

CREATE TABLE `stu_foreach_attendance_form` (
  `sfaf_id` int(10) UNSIGNED NOT NULL,
  `af_id` int(10) UNSIGNED NOT NULL,
  `stu_id` int(11) DEFAULT NULL,
  `status` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stu_foreach_attendance_form`
--

INSERT INTO `stu_foreach_attendance_form` (`sfaf_id`, `af_id`, `stu_id`, `status`) VALUES
(1, 1, 1801042, 1),
(2, 1, 1901050, 1),
(3, 1, 1801016, 1),
(4, 1, 1801028, 1),
(5, 1, 1801029, 1),
(6, 1, 1801034, 1),
(7, 1, 1801040, 1),
(8, 1, 1901001, 1),
(9, 1, 1901002, 1),
(10, 1, 1901003, 0),
(11, 1, 1901004, 1),
(12, 1, 1901005, 1),
(13, 1, 1901006, 0),
(14, 1, 1901007, 0),
(15, 1, 1901008, 1),
(16, 1, 1901009, 1),
(17, 1, 1901010, 1),
(18, 1, 1901011, 0),
(19, 1, 1901012, 0),
(20, 1, 1901013, 0),
(21, 1, 1901014, 0),
(22, 1, 1901015, 0),
(23, 1, 1901016, 0),
(24, 1, 1901017, 0),
(25, 1, 1901018, 0),
(26, 1, 1901019, 0),
(27, 1, 1901020, 0),
(28, 1, 1901021, 0),
(29, 1, 1901022, 0),
(30, 1, 1901023, 0),
(31, 1, 1901024, 0),
(32, 1, 1901025, 0),
(33, 1, 1901026, 0),
(34, 1, 1901027, 0),
(35, 1, 1901028, 0),
(36, 1, 1901029, 0),
(37, 1, 1901030, 0),
(38, 1, 1901031, 0),
(39, 1, 1901032, 0),
(40, 1, 1901033, 0),
(41, 1, 1901034, 0),
(42, 1, 1901035, 0),
(43, 1, 1901036, 0),
(44, 1, 1901037, 0),
(45, 1, 1901038, 0),
(46, 1, 1901039, 0),
(47, 1, 1901040, 0),
(48, 1, 1901041, 0),
(49, 1, 1901042, 0),
(50, 1, 1901043, 0),
(51, 1, 1901044, 0),
(52, 1, 1901045, 0),
(53, 1, 1901046, 0),
(54, 1, 1901047, 0),
(55, 1, 1901048, 0),
(56, 1, 1901049, 0),
(57, 4, 1901050, 1),
(58, 4, 1801042, 2),
(59, 4, 1801016, 1),
(60, 4, 1801028, 1),
(61, 4, 1801029, 1),
(62, 4, 1801034, 1),
(63, 4, 1801040, 2),
(64, 4, 1901001, 0),
(65, 4, 1901002, 0),
(66, 4, 1901003, 0),
(67, 4, 1901004, 1),
(68, 4, 1901005, 1),
(69, 4, 1901006, 1),
(70, 4, 1901007, 1),
(71, 4, 1901008, 1),
(72, 4, 1901009, 1),
(73, 4, 1901010, 1),
(74, 4, 1901011, 1),
(75, 4, 1901012, 1),
(76, 4, 1901013, 1),
(77, 4, 1901014, 1),
(78, 4, 1901015, 1),
(79, 4, 1901016, 1),
(80, 4, 1901017, 1),
(81, 4, 1901018, 1),
(82, 4, 1901019, 1),
(83, 4, 1901020, 1),
(84, 4, 1901021, 1),
(85, 4, 1901022, 1),
(86, 4, 1901023, 1),
(87, 4, 1901024, 1),
(88, 4, 1901025, 1),
(89, 4, 1901026, 1),
(90, 4, 1901027, 1),
(91, 4, 1901028, 1),
(92, 4, 1901029, 1),
(93, 4, 1901030, 1),
(94, 4, 1901031, 1),
(95, 4, 1901032, 1),
(96, 4, 1901033, 1),
(97, 4, 1901034, 1),
(98, 4, 1901035, 1),
(99, 4, 1901036, 1),
(100, 4, 1901037, 1),
(101, 4, 1901038, 1),
(102, 4, 1901039, 1),
(103, 4, 1901040, 1),
(104, 4, 1901041, 1),
(105, 4, 1901042, 1),
(106, 4, 1901043, 1),
(107, 4, 1901044, 1),
(108, 4, 1901045, 1),
(109, 4, 1901046, 1),
(110, 4, 1901047, 1),
(111, 4, 1901048, 1),
(112, 4, 1901049, 1);

-- --------------------------------------------------------

--
-- Table structure for table `stu_foreach_class`
--

CREATE TABLE `stu_foreach_class` (
  `sfc_id` int(10) UNSIGNED NOT NULL,
  `stu_id` int(11) DEFAULT NULL,
  `c_id` int(11) DEFAULT NULL,
  `sfc_timestamp` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stu_foreach_class`
--

INSERT INTO `stu_foreach_class` (`sfc_id`, `stu_id`, `c_id`, `sfc_timestamp`) VALUES
(2, 1801042, 2, '2023-02-23 06:51:38'),
(4, 1901050, 2, '2023-02-23 17:42:11'),
(8, 1901050, 22, '2023-02-23 18:01:46'),
(14, 1901050, 13, '2023-02-23 18:19:16'),
(15, 1901050, 1, '2023-02-25 08:44:21'),
(16, 1801042, 22, '2023-02-26 02:49:31'),
(17, 1801016, 22, '2023-03-01 02:39:52'),
(18, 1801028, 22, '2023-03-01 02:39:52'),
(19, 1801029, 22, '2023-03-01 02:39:52'),
(20, 1801034, 22, '2023-03-01 02:39:52'),
(21, 1801040, 22, '2023-03-01 02:39:52'),
(22, 1901001, 22, '2023-03-01 02:39:52'),
(23, 1901002, 22, '2023-03-01 02:39:52'),
(24, 1901003, 22, '2023-03-01 02:39:52'),
(25, 1901004, 22, '2023-03-01 02:39:52'),
(26, 1901005, 22, '2023-03-01 02:39:52'),
(27, 1901006, 22, '2023-03-01 02:39:52'),
(28, 1901007, 22, '2023-03-01 02:39:52'),
(29, 1901008, 22, '2023-03-01 02:39:52'),
(30, 1901009, 22, '2023-03-01 02:39:52'),
(31, 1901010, 22, '2023-03-01 02:39:52'),
(32, 1901011, 22, '2023-03-01 02:39:52'),
(33, 1901012, 22, '2023-03-01 02:39:52'),
(34, 1901013, 22, '2023-03-01 02:39:52'),
(35, 1901014, 22, '2023-03-01 02:39:52'),
(36, 1901015, 22, '2023-03-01 02:39:52'),
(37, 1901016, 22, '2023-03-01 02:39:52'),
(38, 1901017, 22, '2023-03-01 02:39:52'),
(39, 1901018, 22, '2023-03-01 02:39:52'),
(40, 1901019, 22, '2023-03-01 02:39:52'),
(41, 1901020, 22, '2023-03-01 02:39:52'),
(42, 1901021, 22, '2023-03-01 02:39:52'),
(43, 1901022, 22, '2023-03-01 02:39:52'),
(44, 1901023, 22, '2023-03-01 02:39:52'),
(45, 1901024, 22, '2023-03-01 02:39:52'),
(46, 1901025, 22, '2023-03-01 02:39:52'),
(47, 1901026, 22, '2023-03-01 02:39:52'),
(48, 1901027, 22, '2023-03-01 02:39:52'),
(49, 1901028, 22, '2023-03-01 02:39:52'),
(50, 1901029, 22, '2023-03-01 02:39:52'),
(51, 1901030, 22, '2023-03-01 02:39:52'),
(52, 1901031, 22, '2023-03-01 02:39:52'),
(53, 1901032, 22, '2023-03-01 02:39:52'),
(54, 1901033, 22, '2023-03-01 02:39:52'),
(55, 1901034, 22, '2023-03-01 02:39:52'),
(56, 1901035, 22, '2023-03-01 02:39:52'),
(57, 1901036, 22, '2023-03-01 02:39:52'),
(58, 1901037, 22, '2023-03-01 02:39:52'),
(59, 1901038, 22, '2023-03-01 02:39:52'),
(60, 1901039, 22, '2023-03-01 02:39:52'),
(61, 1901040, 22, '2023-03-01 02:39:52'),
(62, 1901041, 22, '2023-03-01 02:39:52'),
(63, 1901042, 22, '2023-03-01 02:39:52'),
(64, 1901043, 22, '2023-03-01 02:39:52'),
(65, 1901044, 22, '2023-03-01 02:39:52'),
(66, 1901045, 22, '2023-03-01 02:39:52'),
(67, 1901046, 22, '2023-03-01 02:39:52'),
(68, 1901047, 22, '2023-03-01 02:39:52'),
(69, 1901048, 22, '2023-03-01 02:39:52'),
(70, 1901049, 22, '2023-03-01 02:39:52'),
(71, 1901050, 28, '2023-03-01 02:50:24'),
(72, 1901050, 3, '2023-03-01 04:25:52'),
(74, 1801042, 36, '2023-03-07 02:34:42'),
(76, 1801042, 39, '2023-03-07 06:15:54');

-- --------------------------------------------------------

--
-- Table structure for table `stu_info`
--

CREATE TABLE `stu_info` (
  `stu_id` int(11) NOT NULL,
  `stu_name` varchar(30) DEFAULT NULL,
  `stu_gender` varchar(10) DEFAULT NULL,
  `stu_blood_group` varchar(10) DEFAULT NULL,
  `stu_mobile_no` varchar(15) DEFAULT NULL,
  `stu_session` varchar(15) DEFAULT NULL,
  `stu_department` varchar(30) DEFAULT NULL,
  `stu_program` varchar(30) DEFAULT NULL,
  `stu_email` text DEFAULT NULL,
  `stu_password` text DEFAULT NULL,
  `stu_entry_time` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stu_info`
--

INSERT INTO `stu_info` (`stu_id`, `stu_name`, `stu_gender`, `stu_blood_group`, `stu_mobile_no`, `stu_session`, `stu_department`, `stu_program`, `stu_email`, `stu_password`, `stu_entry_time`) VALUES
(1801016, 'Saurav Joarder', 'Male', 'A+', '01969070524', '2018-19', 'ICT', 'IOT', '1801016@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1801028, 'Pallab Kumar', 'Male', 'A+', '01969070524', '2018-19', 'ICT', 'IOT', '1801028@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1801029, 'Md. Mehedi Hasan', 'Male', 'A+', '01969070524', '2018-19', 'ICT', 'IOT', '1801029@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1801034, 'Md. Abdus Sabur', 'Male', 'A+', '01969070524', '2018-19', 'ICT', 'IOT', '1801034@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1801040, 'Md. Rowshan Kabir Akash', 'Male', 'A+', '01969070524', '2018-19', 'ICT', 'IOT', '1801040@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1801042, 'Sumon Ahemed', 'Male', 'A+', '01708550919', '2018-19', 'ICT', 'IOT', '1801042@iot.bdu.ac.bd', '123', '2023-02-22 09:16:30'),
(1901001, 'Md. Al-Amin Islam', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901001@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901002, 'Sadat Hasnat Sabbir', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901002@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901003, 'Shakil Ahmed', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901003@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901004, 'D. M. Khalid Mahmud', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901004@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901005, 'Md. Ragib Shahariar Khan', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901005@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901006, 'Mst. Arifa Azmary', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901006@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901007, 'Afjal Hossain', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901007@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901008, 'Md. Mumtahin Ahmed Shoshe', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901008@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901009, 'Md. Tanvir Hasan', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901009@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901010, 'Mst. Nishat Jahan', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901010@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901011, 'Tousif Mahmud Emon', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901011@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901012, 'Md. Muntasire Mahamud', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901012@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901013, 'Sharika Khan', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901013@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901014, 'Md. Masbahul Hassan', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901014@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901015, 'Nishat Anzum', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901015@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901016, 'Md. Mosfiqur Rahman', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901016@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901017, 'Anima Zaman Proma', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901017@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901018, 'Sieadatun Naher Kanon Sarker', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901018@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901019, 'Md. Mehedi Zaman Khan', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901019@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901020, 'Md. Al Morsaline', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901020@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901021, 'Marshia Muntaka', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901021@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901022, 'Md. Shaheed-A-Arafat Shoikot', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901022@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901023, 'Md. Shakil Mia', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901023@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901024, 'Md. Mostafizur Rahaman', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901024@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901025, 'Mohaimenul Islam Mahin', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901025@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901026, 'Mahbuba Tabassum', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901026@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901027, 'Md. Al-Amin', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901027@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901028, 'Ummay Haney', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901028@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901029, 'Jul Jalal Al-Mamur Sayor', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901029@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901030, 'Nishat Tasnim Shishir', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901030@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901031, 'Mehedi Hasan Emon', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901031@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901032, 'Shamsuz Zoha', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901032@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901033, 'Md. Nur-E Ferdaus', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901033@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901034, 'Bicrom Adhikari Utsa', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901034@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901035, 'Sifat Ara Meem', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901035@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901036, 'Md. Shahriar Hossain Apu', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901036@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901037, 'Most. Sabrina Akter', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901037@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901038, 'Md. Arifuzzaman Ripon', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901038@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901039, 'Most. Sadia Hossain Meem', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901039@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901040, 'Nusrat Jahan Akhi', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901040@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901041, 'Fahim Shahriar Prottoy', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901041@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901042, 'Mahdi Hasan Piar', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901042@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901043, 'Tasnima Hamid', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901043@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901044, 'Shabit Mahmud', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901044@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901045, 'Ariya Binte Tareq', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901045@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901046, 'Kamrul Hasan Sagar', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901046@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901047, 'Md. Mahmudul Hasan', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901047@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901048, 'Mahjabin Ashka', 'Female', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901048@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901049, 'T.M. Mehrab Hasan', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901049@iot.bdu.ac.bd', '123', '2023-03-01 02:34:22'),
(1901050, 'Bitta Boibhob Barmon', 'Male', 'A+', '01969070524', '2019-20', 'ICT', 'IOT', '1901050@iot.bdu.ac.bd', '123', '2023-02-22 09:16:30');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_info`
--

CREATE TABLE `teacher_info` (
  `t_id` int(11) NOT NULL,
  `t_name` text DEFAULT NULL,
  `t_gender` varchar(10) DEFAULT NULL,
  `t_blood_group` varchar(10) DEFAULT NULL,
  `t_mobile_no` varchar(15) DEFAULT NULL,
  `t_department` varchar(30) DEFAULT NULL,
  `t_designation` varchar(30) DEFAULT NULL,
  `t_email` text DEFAULT NULL,
  `t_password` text DEFAULT NULL,
  `t_entry_date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher_info`
--

INSERT INTO `teacher_info` (`t_id`, `t_name`, `t_gender`, `t_blood_group`, `t_mobile_no`, `t_department`, `t_designation`, `t_email`, `t_password`, `t_entry_date`) VALUES
(2, 'Farzana Akter', 'Female', 'AB+', '01778393988', 'ICT', 'Lecturer', 'farzana@ict.bdu.ac.bd', '123', '2023-02-22 13:47:04'),
(5, 'Md Habibur Rahman', 'Male', 'A+', '01969070524', 'ICT', 'Lecturer', 'habibur@ict.bdu.ac.bd', '123', '2023-03-03 04:05:33');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendance_form`
--
ALTER TABLE `attendance_form`
  ADD PRIMARY KEY (`af_id`);

--
-- Indexes for table `course_list`
--
ALTER TABLE `course_list`
  ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `stu_foreach_attendance_form`
--
ALTER TABLE `stu_foreach_attendance_form`
  ADD PRIMARY KEY (`sfaf_id`);

--
-- Indexes for table `stu_foreach_class`
--
ALTER TABLE `stu_foreach_class`
  ADD PRIMARY KEY (`sfc_id`);

--
-- Indexes for table `stu_info`
--
ALTER TABLE `stu_info`
  ADD PRIMARY KEY (`stu_id`);

--
-- Indexes for table `teacher_info`
--
ALTER TABLE `teacher_info`
  ADD PRIMARY KEY (`t_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendance_form`
--
ALTER TABLE `attendance_form`
  MODIFY `af_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `course_list`
--
ALTER TABLE `course_list`
  MODIFY `c_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT for table `stu_foreach_attendance_form`
--
ALTER TABLE `stu_foreach_attendance_form`
  MODIFY `sfaf_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=561;

--
-- AUTO_INCREMENT for table `stu_foreach_class`
--
ALTER TABLE `stu_foreach_class`
  MODIFY `sfc_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=77;

--
-- AUTO_INCREMENT for table `stu_info`
--
ALTER TABLE `stu_info`
  MODIFY `stu_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1901061;

--
-- AUTO_INCREMENT for table `teacher_info`
--
ALTER TABLE `teacher_info`
  MODIFY `t_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
