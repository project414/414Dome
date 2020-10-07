/*
Navicat MySQL Data Transfer

Source Server         : SC
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : sc

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2018-05-04 17:17:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `pic` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `regtime` datetime DEFAULT NULL,
  `loginnum` int(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `adminmenoy` float(10,0) DEFAULT NULL,
  `nian` varchar(255) DEFAULT NULL,
  `yue` varchar(255) DEFAULT NULL,
  `ri` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('9', null, '', null, '2017-04-19 16:11:44', '1234567', '123456', '2017-04-17 11:03:17', '0', '', '1234567', null, null, null, null);
INSERT INTO `user` VALUES ('10', 'f870fbaa-b7e3-42b0-badb-85c4b1684955.jpg', '赵勇', '男', '1996-02-16 00:00:00', '与可飞鱼', '12345678', '2017-04-17 13:38:55', '449', '17865323040', '1150787653@qq.com', null, '1996', '02', '16');
INSERT INTO `user` VALUES ('12', '72b4c2ee-2320-44c6-870b-30d12c526838.jpg', '', '保密', null, '12345678@qq.com', '12345678', '2017-04-26 08:15:57', '6', '', '12345678@qq.com', null, '', '', '');
INSERT INTO `user` VALUES ('13', null, null, null, null, '1150787654@qq.com', '12345678', '2017-06-07 12:02:35', '2', null, '1150787654@qq.com', null, null, null, null);
INSERT INTO `user` VALUES ('14', null, null, null, null, '11111111@qq.com', '123456', '2017-09-28 18:09:48', '0', null, '11111111@qq.com', null, null, null, null);
