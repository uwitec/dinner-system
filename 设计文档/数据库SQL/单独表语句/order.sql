/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummysystem

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-09-06 19:13:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int(10) NOT NULL AUTO_INCREMENT,
  `order_time` datetime NOT NULL,
  `status` int(1) NOT NULL COMMENT '订单的状态',
  `user_info` int(10) NOT NULL COMMENT '通过这里找到名字，地址，电话.',
  `total_price` float DEFAULT NULL,
  `message` varchar(50) DEFAULT NULL,
  `grade` int(11) NOT NULL,
  PRIMARY KEY (`order_id`),
  KEY `fk_order_customer` (`user_info`),
  CONSTRAINT `fk_order_customer` FOREIGN KEY (`user_info`) REFERENCES `customer_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
