/*
Navicat MySQL Data Transfer

Source Server         : reraewf
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : gouwuche

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2019-12-04 12:07:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `name` varchar(255) NOT NULL,
  `mima` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('huangpeng', '123456');
