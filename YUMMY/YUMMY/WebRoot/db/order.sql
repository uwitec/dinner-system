/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummy

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-10-19 23:29:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int(10) NOT NULL AUTO_INCREMENT,
  `order_time` datetime NOT NULL,
  `status` int(1) NOT NULL,
  `user_info` int(10) NOT NULL,
  `total_price` float DEFAULT NULL,
  `message` varchar(50) DEFAULT NULL,
  `grade` int(11) NOT NULL,
  `shopname` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `fk_order_customer` (`user_info`),
  KEY `fk_order_shopname` (`shopname`),
  CONSTRAINT `fk_order_customer` FOREIGN KEY (`user_info`) REFERENCES `customer_info` (`id`),
  CONSTRAINT `fk_order_shopname` FOREIGN KEY (`shopname`) REFERENCES `shop` (`shopname`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
