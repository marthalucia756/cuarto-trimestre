-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 13-12-2023 a las 04:22:58
-- Versión del servidor: 8.0.30
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ubicacion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `id` bigint NOT NULL,
  `estado` bit(1) NOT NULL,
  `fecha_creacion` datetime(6) DEFAULT NULL,
  `fecha_eliminacion` datetime(6) DEFAULT NULL,
  `fecha_modificacion` datetime(6) DEFAULT NULL,
  `codigo` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `departamento_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`id`, `estado`, `fecha_creacion`, `fecha_eliminacion`, `fecha_modificacion`, `codigo`, `nombre`, `departamento_id`) VALUES
(1, b'1', '2023-12-12 11:39:22.629374', NULL, NULL, '1021', 'klk', 1),
(2, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'SYD', 'Sídney', 112),
(3, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'MEL', 'Melbourne', 113),
(4, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'BNE', 'Brisbane', 114),
(5, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'ADL', 'Adelaida', 115),
(6, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'PER', 'Perth', 116),
(7, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'HBA', 'Hobart', 117),
(8, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'CBR', 'Canberra', 118),
(9, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'MAD', 'Madrid', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `continente`
--

CREATE TABLE `continente` (
  `id` bigint NOT NULL,
  `estado` bit(1) NOT NULL,
  `fecha_creacion` datetime(6) DEFAULT NULL,
  `fecha_eliminacion` datetime(6) DEFAULT NULL,
  `fecha_modificacion` datetime(6) DEFAULT NULL,
  `codigo` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `continente`
--

INSERT INTO `continente` (`id`, `estado`, `fecha_creacion`, `fecha_eliminacion`, `fecha_modificacion`, `codigo`, `nombre`) VALUES
(1, b'1', '2023-12-12 11:25:50.941259', NULL, '2023-12-12 14:55:22.344593', '1021', 'America'),
(2, b'1', '2023-12-12 11:26:09.729426', NULL, '2023-12-12 13:49:13.454413', 'AF', 'Africa'),
(3, b'1', '2023-01-01 00:00:00.000000', NULL, NULL, 'AS', 'Asia'),
(4, b'1', '2023-01-01 00:00:00.000000', NULL, NULL, 'EU', 'Europe'),
(5, b'1', '2023-01-01 00:00:00.000000', NULL, NULL, 'OC', 'Oceania');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `id` bigint NOT NULL,
  `estado` bit(1) NOT NULL,
  `fecha_creacion` datetime(6) DEFAULT NULL,
  `fecha_eliminacion` datetime(6) DEFAULT NULL,
  `fecha_modificacion` datetime(6) DEFAULT NULL,
  `codigo` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `pais_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`id`, `estado`, `fecha_creacion`, `fecha_eliminacion`, `fecha_modificacion`, `codigo`, `nombre`, `pais_id`) VALUES
(1, b'1', '2023-12-12 11:38:23.127599', NULL, NULL, '1021', 'Madrid', 1),
(111, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'NSW', 'Nueva Gales del Sur', 1),
(112, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'VIC', 'Victoria', 1),
(113, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'QLD', 'Queensland', 1),
(114, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'SA', 'Australia Meridional', 1),
(115, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'WA', 'Australia Occidental', 1),
(116, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'TAS', 'Tasmania', 1),
(117, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'ACT', 'Territorio de la Capital de Australia', 1),
(118, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'NT', 'Territorio del Norte', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

CREATE TABLE `pais` (
  `id` bigint NOT NULL,
  `estado` bit(1) NOT NULL,
  `fecha_creacion` datetime(6) DEFAULT NULL,
  `fecha_eliminacion` datetime(6) DEFAULT NULL,
  `fecha_modificacion` datetime(6) DEFAULT NULL,
  `codigo` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `continente_id` bigint NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`id`, `estado`, `fecha_creacion`, `fecha_eliminacion`, `fecha_modificacion`, `codigo`, `nombre`, `continente_id`) VALUES
(1, b'1', '2023-12-12 11:27:08.696334', NULL, '2023-12-12 15:29:13.591970', '1021', 'Australia', 2),
(11, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'IN', 'India', 3),
(12, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'JP', 'Japón', 3),
(13, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'KR', 'Corea del Sur', 3),
(14, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'SG', 'Singapur', 3),
(16, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'FR', 'Francia', 4),
(17, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'DE', 'Alemania', 4),
(18, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'UK', 'Reino Unido', 4),
(19, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'IT', 'Italia', 4),
(20, b'1', '2023-01-01 00:00:00.000000', NULL, '2023-01-01 00:00:00.000000', 'ES', 'España', 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKev870hgt8a7wx5t21q4mnsu3k` (`departamento_id`);

--
-- Indices de la tabla `continente`
--
ALTER TABLE `continente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKs4ob59h57ccjv16ie2esul77h` (`pais_id`);

--
-- Indices de la tabla `pais`
--
ALTER TABLE `pais`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKtjwjvx81hbokej2gln4fmxq7f` (`continente_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `continente`
--
ALTER TABLE `continente`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `departamento`
--
ALTER TABLE `departamento`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=120;

--
-- AUTO_INCREMENT de la tabla `pais`
--
ALTER TABLE `pais`
  MODIFY `id` bigint NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD CONSTRAINT `FKev870hgt8a7wx5t21q4mnsu3k` FOREIGN KEY (`departamento_id`) REFERENCES `departamento` (`id`);

--
-- Filtros para la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD CONSTRAINT `FKs4ob59h57ccjv16ie2esul77h` FOREIGN KEY (`pais_id`) REFERENCES `pais` (`id`);

--
-- Filtros para la tabla `pais`
--
ALTER TABLE `pais`
  ADD CONSTRAINT `FKtjwjvx81hbokej2gln4fmxq7f` FOREIGN KEY (`continente_id`) REFERENCES `continente` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
