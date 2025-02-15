/*
MySQL Data Transfer
Source Host: localhost
Source Database: proj20
Target Host: localhost
Target Database: proj20
Date: 18-Nov-20 5:17:39 PM
*/

create database proj20;

use proj20;


SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for attacker
-- ----------------------------
DROP TABLE IF EXISTS `attacker`;
CREATE TABLE `attacker` (
  `name` text,
  `node` text,
  `maldata` text,
  `dt` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for cluster1
-- ----------------------------
DROP TABLE IF EXISTS `cluster1`;
CREATE TABLE `cluster1` (
  `node` text,
  `fname` text,
  `energy` text,
  `mac` text,
  `attacked` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for cluster2
-- ----------------------------
DROP TABLE IF EXISTS `cluster2`;
CREATE TABLE `cluster2` (
  `node` text,
  `fname` text,
  `energy` text,
  `mac` text,
  `attacked` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for cluster3
-- ----------------------------
DROP TABLE IF EXISTS `cluster3`;
CREATE TABLE `cluster3` (
  `node` text,
  `fname` text,
  `energy` text,
  `mac` text,
  `attacked` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for ids
-- ----------------------------
DROP TABLE IF EXISTS `ids`;
CREATE TABLE `ids` (
  `node` text,
  `maliciousdata` text,
  `dt` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for results
-- ----------------------------
DROP TABLE IF EXISTS `results`;
CREATE TABLE `results` (
  `fname` text,
  `tdelay` text,
  `tpt` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for router
-- ----------------------------
DROP TABLE IF EXISTS `router`;
CREATE TABLE `router` (
  `fname` text,
  `mac` text,
  `dest` text,
  `dt` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `attacker` VALUES ('Attacker', 'Node3', 'asdfasdfadsfdasfdsa', '18/11/2020');
INSERT INTO `attacker` VALUES ('Attacker', 'Node3', 'asdfadsf5436sdgsdfg', '18/11/2020');
INSERT INTO `cluster1` VALUES ('Node1', 'Encryption.java', '70000', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster1` VALUES ('Node2', 'Encryption.java', '87803', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster1` VALUES ('Node3', 'Encryption.java', '98009', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster1` VALUES ('Node4', 'Encryption.java', '76433', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster1` VALUES ('Node5', 'Encryption.java', '72838', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster1` VALUES ('Node6', 'Encryption.java', '87070', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster2` VALUES ('Node7', 'Encryption.java', '62271', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster2` VALUES ('Node8', 'Encryption.java', '93162', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster2` VALUES ('Node9', 'Encryption.java', '99194', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster2` VALUES ('Node10', 'Encryption.java', '84091', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster2` VALUES ('Node11', 'Encryption.java', '76928', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster2` VALUES ('Node12', 'Encryption.java', '69292', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster3` VALUES ('Node13', 'Encryption.java', '68545', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster3` VALUES ('Node14', 'Encryption.java', '53625', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster3` VALUES ('Node15', 'Encryption.java', '59052', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster3` VALUES ('Node16', 'Encryption.java', '91672', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster3` VALUES ('Node17', 'Encryption.java', '89362', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `cluster3` VALUES ('Node18', 'Encryption.java', '79312', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'No');
INSERT INTO `ids` VALUES ('Node3', '1c178bd1b552ccea311550845d7e6a6fe5c50023', '18/11/2020');
INSERT INTO `ids` VALUES ('Node3', '-46c4eaa6f349f7f2ec2a325336074a5beab3ed6c', '18/11/2020');
INSERT INTO `router` VALUES ('Dbcon.java', '1c178bd1b552ccea311550845d7e6a6fe5c50023', 'A', '11/18/20 3:30 PM');
INSERT INTO `router` VALUES ('Dbcon.java', '1c178bd1b552ccea311550845d7e6a6fe5c50023', 'B', '11/18/20 3:54 PM');
INSERT INTO `router` VALUES ('ECurve.java', '-46c4eaa6f349f7f2ec2a325336074a5beab3ed6c', 'A', '11/18/20 5:07 PM');
INSERT INTO `router` VALUES ('ECurve.java', '-46c4eaa6f349f7f2ec2a325336074a5beab3ed6c', 'B', '11/18/20 5:09 PM');
INSERT INTO `router` VALUES ('Encryption.java', '2dfa007563e9dab8786c0fe24a4df2012c1b5234', 'C', '11/18/20 5:13 PM');
