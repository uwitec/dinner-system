/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummysystem

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-09-06 19:13:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `shop_worker`
-- ----------------------------
DROP TABLE IF EXISTS `shop_worker`;
CREATE TABLE `shop_worker` (
  `username` varchar(15) NOT NULL DEFAULT '',
  `password` varchar(15) NOT NULL,
  `shopname` varchar(15) NOT NULL,
  `email` varchar(20) NOT NULL,
  `register_date` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `fk_worker_shop` (`shopname`),
  CONSTRAINT `fk_worker_shop` FOREIGN KEY (`shopname`) REFERENCES `shop` (`shopname`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop_worker
-- ----------------------------
