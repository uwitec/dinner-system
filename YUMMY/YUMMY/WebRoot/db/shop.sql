/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : yummy

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2012-10-19 23:29:31
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
  `point` int(10) DEFAULT '0',
  `delivery_range` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`shopname`),
  UNIQUE KEY `index_shopname` (`shopname`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop
-- ----------------------------
INSERT INTO `shop` VALUES ('hello', 'rtr', 'tet', null, 'et', 'et', '0', 'et');
INSERT INTO `shop` VALUES ('味自贡土家菜馆', '外双楠龙华北路', '5828694534', null, '朋友聚餐 家庭聚会', 'picture/shop/3.png', '12', '龙华北路');
INSERT INTO `shop` VALUES ('小尖椒家宴馆', '江区梓潼正街45号附1号', '028-86617788', null, '他家口碑“一直不错”。做的都是“家常菜”，虽说“没啥大特色”，可随便点哪道“都不失败”', 'picture/shop/5.png', '23', '蜀汉路');
INSERT INTO `shop` VALUES ('红悦名食馆', '青羊区金泽路26号', '13386278632', null, '情侣约会 朋友聚聚', 'picture/shop/2.png', '65', '金泽路');
INSERT INTO `shop` VALUES ('红杏酒家', '蜀汉路289号', '028-87526846', null, '“中档”酒楼的代表。川菜品种虽“丰富”，却总也离不了“老三样”：红杏鸡、鳝段粉丝、豆汤饭。', 'picture/shop/4.png', '6', '蜀汉路');
INSERT INTO `shop` VALUES ('绝城芋儿鸡.兔-光华店', '光华街105号光华馨地门口', '02881708850', null, '味道很好的芋儿烧鸡和烧兔，晚上还有烧烤买，适合朋友聚会、宵夜。', 'picture/shop/6.png', '12', '西南财大边上');
INSERT INTO `shop` VALUES ('西航金燕餐厅华农店', '双流国际机场东大门外300米（川航大楼侧）', '020-2885861447', null, '每天饭点去机场的人都喜欢到这里就餐。餐的味道好，上菜速度快', 'picture/shop/7.png', '57', '机场周围');
INSERT INTO `shop` VALUES ('龙沁园火锅', '成都市金牛区蜀光路3号（格兰威尔酒店一楼）', '13333333333', null, '大撒旦撒啊飒飒的爱上爱上阿萨德爱', 'picture/shop/1.png', '42', '金牛区蜀光路');
