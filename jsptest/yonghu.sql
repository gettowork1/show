/*
Navicat MySQL Data Transfer

Source Server         : reraewf
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : gouwuche

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2019-12-04 12:08:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for yonghu
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu` (
  `name` varchar(255) NOT NULL,
  `mima` varchar(255) NOT NULL,
  `dizhi` varchar(255) NOT NULL,
  `dianhua` varchar(255) NOT NULL,
  `youxiang` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES ('qwer', '123456', 'grdsgr', 'ewgtewr', 'wetgewtg');
INSERT INTO `yonghu` VALUES ('qwer', '123456', 'asfasf', 'faewf', 'fsaddsaf');
INSERT INTO `yonghu` VALUES ('qwer', '123456', 'reqewrf', 'qerwer', 'qewrqewr');
