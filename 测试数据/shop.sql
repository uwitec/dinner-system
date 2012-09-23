/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummy

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-09-23 20:10:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `shop`
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `shopname` varchar(15) NOT NULL DEFAULT '',
  `address` varchar(50) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `qq` varchar(12) DEFAULT NULL,
  `introduction` varchar(100) DEFAULT NULL,
  `logo` varchar(100) DEFAULT NULL,
  `point` int(10) NOT NULL DEFAULT '0',
  `delivery_range` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`shopname`),
  UNIQUE KEY `index_shopname` (`shopname`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop
-- ----------------------------
INSERT INTO `shop` VALUES ('bucuo', 'scau', '0204543543', '3423423', '呵呵', 'picture/test/003.jpg', '0', 'scau');
INSERT INTO `shop` VALUES ('不知道', 'scau', '0204543543', '3423423', '呵呵', 'picture/test/005.jpg', '0', 'scau');
INSERT INTO `shop` VALUES ('乱写点', 'scau', '0204543543', '3423423', '呵呵', 'picture/test/002.jpg', '0', 'scau');
INSERT INTO `shop` VALUES ('呵呵', '华农', '0204543543', '3423423', '呵呵', 'picture/test/001.jpg', '0', 'scau');
INSERT INTO `shop` VALUES ('小米', 'scau', '0204543543', '3423423', '呵呵', 'picture/test/004.jpg', '0', 'scau');
INSERT INTO `shop` VALUES ('测点2', 'scau', '0204543543', '3423423', '呵呵', 'picture/test/002.jpg', '0', 'scau');
INSERT INTO `shop` VALUES ('测试点1', 'scau', '0204543543', '3423423', '呵呵', 'picture/test/001.jpg', '0', 'scau');
INSERT INTO `shop` VALUES ('测试点4', 'scau', '0204543543', '3423423', '呵呵', 'picture/test/001.jpg', '0', 'scau');
