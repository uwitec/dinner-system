
-- ----------------------------
-- Table structure for `customer` 用户表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `username` varchar(15) NOT NULL DEFAULT '',
  `password` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  `gender` varchar(2) NOT NULL,
  `credits` int(10) unsigned zerofill NOT NULL DEFAULT '0000000000',
  `register_date` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`username`,`email`),
  KEY `index_customer` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------




-- ----------------------------
-- Table structure for `collect_dish` 收藏食物表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `collect_dish`;
CREATE TABLE `collect_dish` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `dishid` int(10) NOT NULL,
  `collect_time` date NOT NULL,
  `tag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_collect_customer2` (`username`),
  KEY `fk_collect_dish` (`dishid`),
  CONSTRAINT `fk_collect_customer2` FOREIGN KEY (`username`) REFERENCES `customer` (`username`) ON UPDATE CASCADE,
  CONSTRAINT `fk_collect_dish` FOREIGN KEY (`dishid`) REFERENCES `dish` (`dishID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect_dish
-- ----------------------------



-- ----------------------------
-- Table structure for `collect_shop`收藏店铺表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `collect_shop`;
CREATE TABLE `collect_shop` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `shopname` varchar(15) NOT NULL,
  `collect_time` date NOT NULL,
  `tag` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_collect_customer` (`username`),
  KEY `fk_collect_shop` (`shopname`),
  CONSTRAINT `fk_collect_customer` FOREIGN KEY (`username`) REFERENCES `customer` (`username`) ON UPDATE CASCADE,
  CONSTRAINT `fk_collect_shop` FOREIGN KEY (`shopname`) REFERENCES `shop` (`shopname`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect_shop
-- ----------------------------



-- ----------------------------
-- Table structure for `customer_info` 用户信息表，包括地址电话等
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `customer_info`;
CREATE TABLE `customer_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `telephone` varchar(15) NOT NULL,
  `address` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_01` (`username`),
  CONSTRAINT `FK_01` FOREIGN KEY (`username`) REFERENCES `customer` (`username`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_info
-- ----------------------------



-- ----------------------------
-- Table structure for `estimate` 评价表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `estimate`;
CREATE TABLE `estimate` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `dish_id` int(10) NOT NULL,
  `point` smallint(6) NOT NULL DEFAULT '5' COMMENT '给每种食物评价分数',
  `comment` longblob,
  `date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_estimate_dish` (`dish_id`),
  KEY `fk_estimate_user` (`username`),
  CONSTRAINT `fk_estimate_dish` FOREIGN KEY (`dish_id`) REFERENCES `dish` (`dishID`) ON UPDATE CASCADE,
  CONSTRAINT `fk_estimate_user` FOREIGN KEY (`username`) REFERENCES `customer` (`username`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of estimate
-- ----------------------------



-- ----------------------------
-- Table structure for `gift_exchange` 兑换礼品表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `gift_exchange`;
CREATE TABLE `gift_exchange` (
  `id` int(10) NOT NULL,
  `username` varchar(15) NOT NULL,
  `gift_id` int(10) NOT NULL,
  `date` date DEFAULT NULL COMMENT '礼品换购时间',
  PRIMARY KEY (`id`),
  KEY `fk_gift` (`gift_id`),
  KEY `fk_gift_customer` (`username`),
  CONSTRAINT `fk_gift` FOREIGN KEY (`gift_id`) REFERENCES `gift` (`id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_gift_customer` FOREIGN KEY (`username`) REFERENCES `customer` (`username`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gift_exchange
-- ----------------------------



-- ----------------------------
-- Table structure for `dish` 食物表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
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



-- ----------------------------
-- Table structure for `gift` 礼品表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `gift`;
CREATE TABLE `gift` (
  `id` int(10) NOT NULL DEFAULT '0',
  `gift_name` varchar(20) NOT NULL,
  `grade` int(5) NOT NULL COMMENT '换购该礼品所需分数',
  `account` int(5) NOT NULL COMMENT '该礼品的数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gift
-- ----------------------------


SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `order_info` 订单信息表
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



-- ----------------------------
-- Table structure for `hot_food` 促销食物表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `hot_food`;
CREATE TABLE `hot_food` (
  `id` int(10) NOT NULL,
  `dish_id` int(10) NOT NULL,
  `shop_id` varchar(15) NOT NULL,
  `current_price` float NOT NULL,
  `account` int(5) NOT NULL,
  `valid_date` date DEFAULT NULL COMMENT '促销时间',
  PRIMARY KEY (`id`),
  KEY `fk_hotfood_dish` (`dish_id`),
  KEY `fk_hotfood_shop` (`shop_id`),
  CONSTRAINT `fk_hotfood_dish` FOREIGN KEY (`dish_id`) REFERENCES `dish` (`dishID`) ON UPDATE CASCADE,
  CONSTRAINT `fk_hotfood_shop` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shopname`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hot_food
-- ----------------------------



-- ----------------------------
-- Table structure for `shop_worker` 店铺工作人员表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
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



-- ----------------------------
-- Table structure for `shop` 店铺表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
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



-- ----------------------------
-- Table structure for `order` 订单表
-- ----------------------------
SET FOREIGN_KEY_CHECKS=0;
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



