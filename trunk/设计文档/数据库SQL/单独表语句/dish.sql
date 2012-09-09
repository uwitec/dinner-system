/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummysystem

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-09-09 22:41:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dish`
-- ----------------------------
DROP TABLE IF EXISTS `dish`;
CREATE TABLE `dish` (
  `dishID` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) NOT NULL,
  `point` int(11) DEFAULT NULL COMMENT '每种食物评价后都可以得到一定分数',
  `price` float NOT NULL,
  `shopname` varchar(15) NOT NULL,
  `introduction` varchar(50) DEFAULT NULL,
  `category` varchar(10) DEFAULT NULL COMMENT '食物的分类',
  `tag` varchar(10) DEFAULT NULL COMMENT '自定义的标签',
  `upload_time` date DEFAULT NULL COMMENT '上传时间',
  `picOne` longblob,
  `picTwo` longblob,
  `picThree` longblob,
  PRIMARY KEY (`dishID`),
  KEY `fk_dish_shop` (`shopname`),
  CONSTRAINT `fk_dish_shop` FOREIGN KEY (`shopname`) REFERENCES `shop` (`shopname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dish
-- ----------------------------
