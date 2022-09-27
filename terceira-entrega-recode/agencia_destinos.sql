CREATE DATABASE  IF NOT EXISTS `agencia` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `agencia`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: agencia
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `destinos`
--

DROP TABLE IF EXISTS `destinos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `destinos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `estado` char(40) DEFAULT NULL,
  `cidade` char(40) DEFAULT NULL,
  `ida` date DEFAULT NULL,
  `volta` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `destinos`
--

LOCK TABLES `destinos` WRITE;
/*!40000 ALTER TABLE `destinos` DISABLE KEYS */;
INSERT INTO `destinos` VALUES (1,'Rio de Janeiro','Aguia','2002-08-20','2002-10-25'),(2,NULL,NULL,NULL,NULL),(3,NULL,NULL,NULL,NULL),(4,NULL,NULL,NULL,NULL),(5,'Rio de Janeiro','Rio','2000-02-08','2000-02-10'),(6,'Rio de Janeiro','Rio','2022-09-12','2022-09-30'),(7,'Rio de Janeiro','Rio','2000-02-08','2000-02-10'),(8,'Rio de Janeiro','Rio','2000-02-08','2000-02-10'),(9,'Rio','Aguia','2022-08-23','2022-10-25'),(10,'Rio de Janeiro','Rio','2000-02-08','2000-02-10'),(11,'Rio de Janeiro','Rio','2000-08-20','2000-08-25'),(12,'Rio de Janeiro','Rio','2000-02-08','2000-02-10'),(13,NULL,NULL,NULL,NULL),(14,NULL,NULL,NULL,NULL),(15,NULL,NULL,NULL,NULL),(16,NULL,NULL,NULL,NULL),(17,NULL,NULL,NULL,NULL),(18,NULL,NULL,NULL,NULL),(19,'Rio de Janeiro','Rio','2000-10-02','2000-10-30');
/*!40000 ALTER TABLE `destinos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-26 23:08:45
