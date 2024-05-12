CREATE DATABASE  IF NOT EXISTS `vuelos` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;
USE `vuelos`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: vuelos
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `banner` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vuelo`
--

DROP TABLE IF EXISTS `vuelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vuelo` (
  `id` bigint(20) NOT NULL,
  `destino` varchar(255) DEFAULT NULL,
  `fecha_hora_llegada` datetime(6) DEFAULT NULL,
  `fecha_hora_salida` datetime(6) DEFAULT NULL,
  `frecuencia` varchar(255) DEFAULT NULL,
  `origen` varchar(255) DEFAULT NULL,
  `precio_en_pesos` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vuelo`
--

LOCK TABLES `vuelo` WRITE;
/*!40000 ALTER TABLE `vuelo` DISABLE KEYS */;
INSERT INTO `vuelo` VALUES (2,'El Cairo','2023-03-01 23:30:00.000000','2023-01-01 14:30:00.000000','Diaria','Buenos Aires',1900000),(3,'Up Town','2024-07-25 19:00:00.000000','2024-07-25 07:00:00.000000','anual','London',600000),(4,'Porto Seguro','2023-01-05 16:30:00.000000','2023-01-04 14:30:00.000000','Mensual','Buenos Aires',1567800),(7,'Santiago','2023-01-05 16:35:00.000000','2023-01-08 16:30:00.000000','diario','buenos as',3456789),(8,'polinesia','2023-02-05 16:30:00.000000','2023-02-05 19:30:00.000000','mensual','cordoba',987650000),(9,'rio de janeiro','2023-02-07 16:30:00.000000','2023-02-08 16:30:00.000000','diario','caseros',120000),(12,'Florianopolis','2024-01-07 17:30:00.000000','2024-01-06 10:30:00.000000','Diaria','Tierra del Fuego',2350000),(13,'Florianopolis','2024-03-07 17:30:00.000000','2024-03-06 10:30:00.000000','quincenal','Foz do Iguazu',780000),(14,'Buenos Aires','2024-04-07 17:30:00.000000','2024-04-06 10:30:00.000000','mensual','Cordoba',500000),(15,'Santiago','2024-05-07 17:30:00.000000','2024-05-06 10:30:00.000000','semanal','Mendoza',300000),(16,'Montevideo','2024-06-07 17:30:00.000000','2024-06-06 10:30:00.000000','diario','Buenos Aires',200000),(18,'Cape Town','2024-07-25 19:00:00.000000','2024-07-25 07:00:00.000000','anual','London',600000);
/*!40000 ALTER TABLE `vuelo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-12 11:24:08
