/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummysystem

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-09-06 19:11:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `collect_dish`
-- ----------------------------
DROP TABLE IF EXISTS `collect_dish`;
CREATE TABLE `collect_dish` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `dishid` int(10) NOT NULL,
  `collect_time` date NOT NULL,
  `tag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_collect_customer2` (`username`),
  KEY `fk_collect_dish` (`dishid`),
  CONSTRAINT `fk_collect_customer2` FOREIGN KEY (`username`) REFERENCES `customer` (`username`) ON UPDATE CASCADE,
  CONSTRAINT `fk_collect_dish` FOREIGN KEY (`dishid`) REFERENCES `dish` (`dishID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect_dish
-- ----------------------------
