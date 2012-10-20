/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummy

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-10-19 23:28:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `username` varchar(15) NOT NULL DEFAULT '',
  `password` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  `gender` varchar(2) NOT NULL,
  `credits` int(10) unsigned zerofill NOT NULL DEFAULT '0000000000',
  `register_date` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `index_customer` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('jiahuiwen', '123456', '', '女', '0000000000', '2012-10-19');
INSERT INTO `customer` VALUES ('root', 'root', '471905995@qq.com', '男', '0000000000', null);
