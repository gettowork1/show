/*
Navicat MySQL Data Transfer

Source Server         : reraewf
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : gouwuche

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2019-12-04 12:08:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for zhuji
-- ----------------------------
DROP TABLE IF EXISTS `zhuji`;
CREATE TABLE `zhuji` (
  `pingpai` varchar(255) NOT NULL,
  `cpu` varchar(255) NOT NULL,
  `xianka` varchar(255) NOT NULL,
  `neicun` varchar(255) NOT NULL,
  `guangqu` varchar(255) NOT NULL,
  `price` int(255) NOT NULL,
  `id` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of zhuji
-- ----------------------------
INSERT INTO `zhuji` VALUES ('攀升', 'i7 9700', 'GTX 1660', '16G', '无，需自配', '4299', '1');
INSERT INTO `zhuji` VALUES ('京天', 'i7 9700F', 'RTX 2060', '16G', '需自配', '5796', '2');
INSERT INTO `zhuji` VALUES ('宁美国度', 'i7 9700', 'GTX 1660TI', '16G', '配备光驱', '4699', '3');
INSERT INTO `zhuji` VALUES ('名龙堂', 'i7 9700F', 'RTX 2060', '6G', '无，需自配', '5199', '4');
