/*
Navicat MySQL Data Transfer

Source Server         : reraewf
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : gouwuche

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2019-12-04 12:08:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dingdan
-- ----------------------------
DROP TABLE IF EXISTS `dingdan`;
CREATE TABLE `dingdan` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `totalprice` int(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `ip` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of dingdan
-- ----------------------------
