/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummy

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-10-19 23:29:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `estimate`
-- ----------------------------
DROP TABLE IF EXISTS `estimate`;
CREATE TABLE `estimate` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `dish_id` int(10) NOT NULL,
  `point` smallint(6) NOT NULL DEFAULT '5',
  `comment` varchar(100) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_estimate_dish` (`dish_id`),
  KEY `fk_estimate_user` (`username`),
  CONSTRAINT `fk_estimate_dish` FOREIGN KEY (`dish_id`) REFERENCES `dish` (`dishID`) ON UPDATE CASCADE,
  CONSTRAINT `fk_estimate_user` FOREIGN KEY (`username`) REFERENCES `customer` (`username`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of estimate
-- ----------------------------
