/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummy

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-10-19 23:29:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `hot_food`
-- ----------------------------
DROP TABLE IF EXISTS `hot_food`;
CREATE TABLE `hot_food` (
  `id` int(10) NOT NULL,
  `dish_id` int(10) NOT NULL,
  `shop_id` varchar(15) NOT NULL,
  `current_price` float NOT NULL,
  `account` int(5) NOT NULL,
  `valid_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_hotfood_dish` (`dish_id`),
  KEY `fk_hotfood_shop` (`shop_id`),
  CONSTRAINT `fk_hotfood_dish` FOREIGN KEY (`dish_id`) REFERENCES `dish` (`dishID`) ON UPDATE CASCADE,
  CONSTRAINT `fk_hotfood_shop` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shopname`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hot_food
-- ----------------------------
