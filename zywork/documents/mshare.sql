-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: mshare
-- ------------------------------------------------------
-- Server version	5.7.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `t_bank_card`
--

DROP TABLE IF EXISTS `t_bank_card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_bank_card` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `bank_name` varchar(45) NOT NULL COMMENT '银行',
  `card_no` varchar(45) NOT NULL COMMENT '银行卡号',
  `real_name` varchar(45) NOT NULL COMMENT '真实姓名',
  `phone` varchar(11) NOT NULL COMMENT '手机号',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户编号',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_bank_card`
--


--
-- Table structure for table `t_basic_setting`
--

DROP TABLE IF EXISTS `t_basic_setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_basic_setting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `fee_percent` double NOT NULL COMMENT '手续费比例',
  `money_percent` double NOT NULL COMMENT '金额转换比例',
  `score_percent` double NOT NULL COMMENT '积分转换比例',
  `slider_img1` varchar(500) DEFAULT NULL COMMENT '轮播图1',
  `slider_img2` varchar(500) DEFAULT NULL COMMENT '轮播图2',
  `slider_img3` varchar(500) DEFAULT NULL COMMENT '轮播图3',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_basic_setting`
--

INSERT INTO `t_basic_setting` VALUES (1,20,80,20,'',NULL,NULL,'2018-05-09 09:17:24',NULL);

--
-- Table structure for table `t_bonus_accounts`
--

DROP TABLE IF EXISTS `t_bonus_accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_bonus_accounts` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `uid` bigint(20) NOT NULL COMMENT '用户编号',
  `bonus_name` varchar(30) NOT NULL COMMENT '奖励名称',
  `total` bigint(20) NOT NULL COMMENT '奖励额',
  `updated_date` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_bonus_accounts`
--


--
-- Table structure for table `t_level_setting`
--

DROP TABLE IF EXISTS `t_level_setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_level_setting` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(45) NOT NULL COMMENT '等级名称',
  `min_money` bigint(20) NOT NULL COMMENT '最小金额',
  `max_money` bigint(20) NOT NULL COMMENT '最大金额',
  `trans_percent` double NOT NULL COMMENT '转换比例',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_level_setting`
--


--
-- Table structure for table `t_module`
--

DROP TABLE IF EXISTS `t_module`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_module` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `title` varchar(50) NOT NULL COMMENT '标题',
  `description` varchar(200) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_active` tinyint(4) DEFAULT '0' COMMENT '是否激活',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_module`
--


--
-- Table structure for table `t_order`
--

DROP TABLE IF EXISTS `t_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `order_no` varchar(100) NOT NULL COMMENT '订单编号',
  `total` bigint(20) NOT NULL COMMENT '订单总额',
  `type` int(11) DEFAULT NULL COMMENT '订单类型',
  `sell_id` bigint(20) DEFAULT NULL COMMENT '卖出人编号',
  `buy_id` bigint(20) DEFAULT NULL COMMENT '买入人编号',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `status` int(11) DEFAULT NULL COMMENT '订单状态',
  `sell_confirm_time` datetime DEFAULT NULL COMMENT '卖出确认时间',
  `buy_confirm_time` datetime DEFAULT NULL COMMENT '买入确认时间',
  `deal_time` datetime DEFAULT NULL COMMENT '成交时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_order`
--

INSERT INTO `t_order` VALUES (34,'1526532460696',100,NULL,100000,100001,'2018-05-17 12:47:18',NULL,1,'2018-05-17 12:55:10','2018-05-17 12:55:10',NULL),(35,'1526533069900',100,NULL,100000,100001,'2018-05-17 12:57:31',NULL,1,'2018-05-17 12:59:32','2018-05-17 12:59:32',NULL),(36,'1526533587759',100,NULL,100000,NULL,'2018-05-17 13:05:39',NULL,0,NULL,NULL,NULL),(37,'1526533789529',100,NULL,NULL,100000,'2018-05-17 13:09:06',NULL,4,NULL,NULL,NULL);

--
-- Table structure for table `t_permission`
--

DROP TABLE IF EXISTS `t_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `title` varchar(50) NOT NULL COMMENT '标题',
  `permission` varchar(100) NOT NULL COMMENT '权限字符串',
  `description` varchar(200) DEFAULT NULL COMMENT '描述',
  `module_id` bigint(20) NOT NULL COMMENT '所属模块',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_active` tinyint(4) DEFAULT '0' COMMENT '是否激活',
  PRIMARY KEY (`id`),
  KEY `fk_permission_module_id` (`module_id`),
  CONSTRAINT `fk_permission_module_id` FOREIGN KEY (`module_id`) REFERENCES `t_module` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_permission`
--


--
-- Table structure for table `t_role`
--

DROP TABLE IF EXISTS `t_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `title` varchar(50) NOT NULL COMMENT '标题',
  `description` varchar(200) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_active` tinyint(4) DEFAULT '0' COMMENT '是否激活',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_role`
--

INSERT INTO `t_role` VALUES (1,'admin','admin','2018-05-13 11:16:46',NULL,0);

--
-- Table structure for table `t_role_permission`
--

DROP TABLE IF EXISTS `t_role_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_role_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `role_id` bigint(20) NOT NULL COMMENT '角色编号',
  `permission_id` bigint(20) NOT NULL COMMENT '权限编号',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `is_active` tinyint(4) DEFAULT '0' COMMENT '是否激活',
  PRIMARY KEY (`id`),
  KEY `fk_role_permission_rold_id` (`role_id`),
  KEY `fk_role_permission_per_id` (`permission_id`),
  CONSTRAINT `fk_role_permission_per_id` FOREIGN KEY (`permission_id`) REFERENCES `t_permission` (`id`),
  CONSTRAINT `fk_role_permission_rold_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_role_permission`
--


--
-- Table structure for table `t_suggest`
--

DROP TABLE IF EXISTS `t_suggest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_suggest` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户编号',
  `suggest` varchar(500) DEFAULT NULL COMMENT '投诉建议',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_suggest`
--


--
-- Table structure for table `t_trans`
--

DROP TABLE IF EXISTS `t_trans`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_trans` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `trans_from` bigint(20) NOT NULL COMMENT '转出人编号',
  `trans_to` bigint(20) NOT NULL COMMENT '转入人编号',
  `total` bigint(20) NOT NULL COMMENT '金额',
  `trans_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '转入时间',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` varchar(45) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_trans`
--

INSERT INTO `t_trans` VALUES (23,100000,100001,100,'2018-05-17 12:45:04','2018-05-17 12:45:04',NULL);

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `account_name` varchar(20) DEFAULT NULL COMMENT '账户名',
  `password` varchar(50) NOT NULL COMMENT '登录密码',
  `pay_password` varchar(50) DEFAULT NULL COMMENT '支付密码',
  `salt` varchar(200) DEFAULT NULL COMMENT '加密盐值',
  `nickname` varchar(20) DEFAULT NULL COMMENT '昵称',
  `headicon` varchar(500) DEFAULT NULL COMMENT '头像地址',
  `total` bigint(20) DEFAULT '0' COMMENT '余额',
  `score` bigint(20) DEFAULT '0' COMMENT '积分',
  `level` char(1) DEFAULT NULL COMMENT '信用等级',
  `identity` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `real_name` varchar(10) DEFAULT NULL COMMENT '真实姓名',
  `gender` tinyint(4) DEFAULT '0' COMMENT '性别',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `from_id` bigint(20) DEFAULT NULL COMMENT '推荐人编号',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `is_active` tinyint(4) DEFAULT '0' COMMENT '是否激活',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100005 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

INSERT INTO `t_user` VALUES (100000,NULL,'13888888888',NULL,'4QrcOUm6Wau+VuBX8g+IPg==','4QrcOUm6Wau+VuBX8g+IPg==',NULL,'Test',NULL,4800,2548,'A','10',NULL,NULL,NULL,NULL,NULL,'2017-12-11 19:13:08',NULL,0),(100001,NULL,'18888888888',NULL,'4QrcOUm6Wau+VuBX8g+IPg==',NULL,NULL,'测试',NULL,2180,210,NULL,NULL,NULL,0,NULL,NULL,100000,'2018-05-09 09:11:17',NULL,0),(100002,NULL,'13666666666',NULL,'4QrcOUm6Wau+VuBX8g+IPg==',NULL,NULL,'小米',NULL,8,2,NULL,NULL,NULL,0,NULL,NULL,100000,'2018-05-09 12:50:21',NULL,0),(100003,NULL,'15555555555',NULL,'4QrcOUm6Wau+VuBX8g+IPg==',NULL,NULL,'AA',NULL,0,0,NULL,NULL,NULL,0,NULL,NULL,100000,'2018-05-10 20:57:38',NULL,0),(100004,NULL,'18888889999',NULL,'4QrcOUm6Wau+VuBX8g+IPg==',NULL,NULL,NULL,NULL,0,0,NULL,NULL,NULL,0,NULL,NULL,NULL,'2018-05-17 14:27:56',NULL,0);

--
-- Table structure for table `t_user_role`
--

DROP TABLE IF EXISTS `t_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `user_id` bigint(20) NOT NULL COMMENT '用户编号',
  `role_id` bigint(20) NOT NULL COMMENT '角色编号',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `is_active` tinyint(4) DEFAULT '0' COMMENT '是否激活',
  PRIMARY KEY (`id`),
  KEY `fk_user_role_user_id` (`user_id`),
  KEY `fk_user_role_rold_id` (`role_id`),
  CONSTRAINT `fk_user_role_rold_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`id`),
  CONSTRAINT `fk_user_role_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user_role`
--

INSERT INTO `t_user_role` VALUES (2,100000,1,'2018-05-13 11:17:35',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-17 15:48:23
