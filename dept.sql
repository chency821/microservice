/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : micro01

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 04/06/2020 18:10:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `db_source` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '数据来源',
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1013 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, '技术部', DATABASE ( ));
INSERT INTO `dept` VALUES (2, '人事部', DATABASE ( ));
INSERT INTO `dept` VALUES (3, '财务部', DATABASE ( ));
INSERT INTO `dept` VALUES (4, '开发部', DATABASE ( ));

SET FOREIGN_KEY_CHECKS = 1;
