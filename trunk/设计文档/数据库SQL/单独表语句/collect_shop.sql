/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummysystem

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-09-06 19:12:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `collect_shop`
-- ----------------------------
DROP TABLE IF EXISTS `collect_shop`;
CREATE TABLE `collect_shop` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `shopname` varchar(15) NOT NULL,
  `collect_time` date NOT NULL,
  `tag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_collect_customer` (`username`),
  KEY `fk_collect_shop` (`shopname`),
  CONSTRAINT `fk_collect_customer` FOREIGN KEY (`username`) REFERENCES `customer` (`username`) ON UPDATE CASCADE,
  CONSTRAINT `fk_collect_shop` FOREIGN KEY (`shopname`) REFERENCES `shop` (`shopname`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect_shop
-- ----------------------------
