/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummysystem

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-09-06 19:13:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `shop`
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `shopname` varchar(15) NOT NULL DEFAULT '',
  `address` varchar(30) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `qq` varchar(12) DEFAULT NULL,
  `introduction` varchar(50) DEFAULT NULL,
  `logo` longblob NOT NULL,
  `point` int(10) NOT NULL DEFAULT '0' COMMENT '商家的信誉，以分数形式出现',
  `delivery_range` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`shopname`),
  UNIQUE KEY `index_shopname` (`shopname`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop
-- ----------------------------
