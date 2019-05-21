/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : ewsdb

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2019-05-21 17:25:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_user`
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) NOT NULL,
  `upwd` varchar(50) NOT NULL,
  `email` varchar(30) NOT NULL,
  `role` varchar(20) DEFAULT NULL,
  `registerTime` date DEFAULT NULL,
  `lastLoginTime` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES ('1', 'anna', 'e10adc3949ba59abbe56e057f20f883e', '111@qq.com', 'yonghu', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES ('2', 'anna', 'e10adc3949ba59abbe56e057f20f883e', '111@qq.com', 'yonghu', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES ('3', 'anna', 'e10adc3949ba59abbe56e057f20f883e', '111@qq.com', 'yonghu', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES ('4', 'anna', 'e10adc3949ba59abbe56e057f20f883e', '111@qq.com', 'yonghu', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES ('5', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '111@qq.com', 'admin', '2019-05-21', '2019-05-21');
INSERT INTO `tb_user` VALUES ('6', 'zander', 'e10adc3949ba59abbe56e057f20f883e', '111@qq.com', 'employee', '2019-05-21', '2019-05-21');
