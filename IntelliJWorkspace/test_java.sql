/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : test_java

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2018-05-17 10:40:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_cd`
-- ----------------------------
DROP TABLE IF EXISTS `tb_cd`;
CREATE TABLE `tb_cd` (
  `Cd_id` int(11) NOT NULL,
  `Cd_name` varchar(255) NOT NULL,
  PRIMARY KEY  (`Cd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_cd
-- ----------------------------
INSERT INTO `tb_cd` VALUES ('1', 'Andy');
INSERT INTO `tb_cd` VALUES ('2', 'Bob');
INSERT INTO `tb_cd` VALUES ('3', 'Cindy');
INSERT INTO `tb_cd` VALUES ('4', 'Davie');

-- ----------------------------
-- Table structure for `tb_vt`
-- ----------------------------
DROP TABLE IF EXISTS `tb_vt`;
CREATE TABLE `tb_vt` (
  `Vt_name` varchar(255) NOT NULL,
  `Vt_pwd` varchar(255) NOT NULL,
  `Cd_id` int(11) default NULL,
  PRIMARY KEY  (`Vt_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_vt
-- ----------------------------
INSERT INTO `tb_vt` VALUES ('root', 'root', '0');
INSERT INTO `tb_vt` VALUES ('tt', 'tt', '0');
INSERT INTO `tb_vt` VALUES ('zhu', '123', '2');
