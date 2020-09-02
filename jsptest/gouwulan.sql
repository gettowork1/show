/*
Navicat MySQL Data Transfer

Source Server         : reraewf
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : gouwuche

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2019-12-04 12:08:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for gouwulan
-- ----------------------------
DROP TABLE IF EXISTS `gouwulan`;
CREATE TABLE `gouwulan` (
  ` id` varchar(255) NOT NULL,
  `pingpai` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL,
  `benshu` varchar(255) NOT NULL,
  PRIMARY KEY (` id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of gouwulan
-- ----------------------------
INSERT INTO `gouwulan` VALUES ('1', '攀升', '4299', '1');
INSERT INTO `gouwulan` VALUES ('2', '京天', '5796', '1');
INSERT INTO `gouwulan` VALUES ('3', '宁美国度', '4699', '1');
INSERT INTO `gouwulan` VALUES ('4', '名龙堂', '5199', '1');
INSERT INTO `gouwulan` VALUES ('5', '胡子', '4688', '1');
