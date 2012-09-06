/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummysystem

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-09-06 19:13:00
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
  `point` smallint(6) NOT NULL DEFAULT '5' COMMENT '给每种食物评价分数',
  `comment` longblob,
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
