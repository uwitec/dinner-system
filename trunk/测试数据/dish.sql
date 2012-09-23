/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummy

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-09-23 20:09:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dish`
-- ----------------------------
DROP TABLE IF EXISTS `dish`;
CREATE TABLE `dish` (
  `dishID` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) NOT NULL,
  `point` int(11) unsigned zerofill DEFAULT '00000000000',
  `price` float NOT NULL,
  `shopname` varchar(15) NOT NULL,
  `introduction` varchar(100) DEFAULT NULL,
  `category` varchar(10) DEFAULT NULL,
  `tag` varchar(10) DEFAULT NULL,
  `upload_time` date DEFAULT NULL,
  `picOne` varchar(100) NOT NULL,
  PRIMARY KEY (`dishID`),
  KEY `fk_dish_shop` (`shopname`),
  CONSTRAINT `fk_dish_shop` FOREIGN KEY (`shopname`) REFERENCES `shop` (`shopname`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dish
-- ----------------------------
INSERT INTO `dish` VALUES ('7', '白饭', '00000000000', '9.3', '测试点1', '呵呵', null, null, null, 'picture/test/001.jpg');
INSERT INTO `dish` VALUES ('8', '青菜', '00000000000', '7.3', '乱写点', '呵呵', null, null, null, 'picture/test/005.jpg');
INSERT INTO `dish` VALUES ('9', '烧鹅', '00000000000', '3.4', '测试点1', null, null, null, null, 'picture/test/002.jpg');
INSERT INTO `dish` VALUES ('10', '水果', '00000000000', '3.2', '测试点4', null, null, null, null, 'picture/test/003.jpg');
