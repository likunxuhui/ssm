/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2016-07-07 13:29:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `price` double DEFAULT NULL,
  `date` datetime(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=390 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('352', '数据库1', '12.2', '2016-07-04 11:35:00.0000');
INSERT INTO `book` VALUES ('353', '数据库2', '12.6', '2016-07-04 11:35:00.0000');
INSERT INTO `book` VALUES ('354', '数据库1', '12.2', '2016-07-04 11:40:00.0000');
INSERT INTO `book` VALUES ('355', '数据库2', '12.6', '2016-07-04 11:40:00.0000');
INSERT INTO `book` VALUES ('356', '数据库1', '12.2', '2016-07-04 11:45:00.0000');
INSERT INTO `book` VALUES ('357', '数据库2', '12.6', '2016-07-04 11:45:00.0000');
INSERT INTO `book` VALUES ('358', '数据库1', '12.2', '2016-07-04 11:55:00.0000');
INSERT INTO `book` VALUES ('359', '数据库2', '12.6', '2016-07-04 11:55:00.0000');
INSERT INTO `book` VALUES ('360', '数据库1', '12.2', '2016-07-04 12:00:00.0000');
INSERT INTO `book` VALUES ('361', '数据库2', '12.6', '2016-07-04 12:00:00.0000');
INSERT INTO `book` VALUES ('362', '数据库1', '12.2', '2016-07-04 12:05:00.0000');
INSERT INTO `book` VALUES ('363', '数据库2', '12.6', '2016-07-04 12:05:00.0000');
INSERT INTO `book` VALUES ('364', '数据库1', '12.2', '2016-07-04 12:10:00.0000');
INSERT INTO `book` VALUES ('365', '数据库2', '12.6', '2016-07-04 12:10:00.0000');
INSERT INTO `book` VALUES ('366', '数据库1', '12.2', '2016-07-04 12:15:00.0000');
INSERT INTO `book` VALUES ('367', '数据库2', '12.6', '2016-07-04 12:15:00.0000');
INSERT INTO `book` VALUES ('368', '数据库1', '12.2', '2016-07-04 12:20:00.0000');
INSERT INTO `book` VALUES ('369', '数据库2', '12.6', '2016-07-04 12:20:00.0000');
INSERT INTO `book` VALUES ('370', '数据库1', '12.2', '2016-07-04 12:25:00.0000');
INSERT INTO `book` VALUES ('371', '数据库2', '12.6', '2016-07-04 12:25:00.0000');
INSERT INTO `book` VALUES ('372', '数据库1', '12.2', '2016-07-04 13:59:08.0000');
INSERT INTO `book` VALUES ('373', '数据库2', '12.6', '2016-07-04 13:59:14.0000');
INSERT INTO `book` VALUES ('374', '数据库1', '12.2', '2016-07-04 14:00:00.0000');
INSERT INTO `book` VALUES ('375', '数据库2', '12.6', '2016-07-04 14:00:00.0000');
INSERT INTO `book` VALUES ('376', '数据库1', '12.2', '2016-07-04 14:05:00.0000');
INSERT INTO `book` VALUES ('377', '数据库2', '12.6', '2016-07-04 14:05:00.0000');
INSERT INTO `book` VALUES ('378', '数据库1', '12.2', '2016-07-04 14:10:00.0000');
INSERT INTO `book` VALUES ('379', '数据库2', '12.6', '2016-07-04 14:10:00.0000');
INSERT INTO `book` VALUES ('380', '数据库1', '12.2', '2016-07-05 15:05:00.0000');
INSERT INTO `book` VALUES ('381', '数据库2', '12.6', '2016-07-05 15:05:00.0000');
INSERT INTO `book` VALUES ('382', '数据库1', '12.2', '2016-07-05 16:25:00.0000');
INSERT INTO `book` VALUES ('383', '数据库2', '12.6', '2016-07-05 16:25:00.0000');
INSERT INTO `book` VALUES ('384', '数据库1', '12.2', '2016-07-05 16:50:00.0000');
INSERT INTO `book` VALUES ('385', '数据库2', '12.6', '2016-07-05 16:50:00.0000');
INSERT INTO `book` VALUES ('386', '数据库1', '12.2', '2016-07-06 09:45:00.0000');
INSERT INTO `book` VALUES ('387', '数据库2', '12.6', '2016-07-06 09:45:00.0000');
INSERT INTO `book` VALUES ('388', '数据库1', '12.2', '2016-07-06 09:50:00.0000');
INSERT INTO `book` VALUES ('389', '数据库2', '12.6', '2016-07-06 09:50:00.0000');
