/*
Navicat MySQL Data Transfer

Source Server         : wedww
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : gouwuche

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2019-12-17 16:30:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for gouwu
-- ----------------------------
DROP TABLE IF EXISTS `gouwu`;
CREATE TABLE `gouwu` (
  `id` varchar(255) NOT NULL,
  `pinpai` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL,
  `benshu` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of gouwu
-- ----------------------------
INSERT INTO `gouwu` VALUES ('4', '名龙堂', '5199', '1');
INSERT INTO `gouwu` VALUES ('4', '名龙堂', '5199', '1');
INSERT INTO `gouwu` VALUES ('4', '名龙堂', '5199', '1');
INSERT INTO `gouwu` VALUES ('1', '攀升', '4299', '1');
INSERT INTO `gouwu` VALUES ('1', '攀升', '4299', '1');
INSERT INTO `gouwu` VALUES ('1', '攀升', '4299', '1');
