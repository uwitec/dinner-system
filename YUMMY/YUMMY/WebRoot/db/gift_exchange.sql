/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummy

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-10-19 23:29:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `gift_exchange`
-- ----------------------------
DROP TABLE IF EXISTS `gift_exchange`;
CREATE TABLE `gift_exchange` (
  `id` int(10) NOT NULL,
  `username` varchar(15) NOT NULL,
  `gift_id` int(10) NOT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_gift` (`gift_id`),
  KEY `fk_gift_customer` (`username`),
  CONSTRAINT `fk_gift` FOREIGN KEY (`gift_id`) REFERENCES `gift` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_gift_customer` FOREIGN KEY (`username`) REFERENCES `customer` (`username`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gift_exchange
-- ----------------------------
