/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummysystem

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-09-06 19:13:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `order_info`
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `orderinfo_id` int(20) NOT NULL AUTO_INCREMENT,
  `order_id` int(10) NOT NULL,
  `dish_id` int(10) NOT NULL,
  `account` int(2) DEFAULT NULL,
  PRIMARY KEY (`orderinfo_id`),
  KEY `fk_orderinfo_dish` (`dish_id`),
  KEY `fk_orderinfo_order` (`order_id`),
  CONSTRAINT `fk_orderinfo_dish` FOREIGN KEY (`dish_id`) REFERENCES `dish` (`dishID`) ON UPDATE CASCADE,
  CONSTRAINT `fk_orderinfo_order` FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_info
-- ----------------------------
