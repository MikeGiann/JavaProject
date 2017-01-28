/*
MySQL Data Transfer
Source Host: localhost
Source Database: test
Target Host: localhost
Target Database: test
Date: 29/12/2016 1:45:32 μμ
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for storage
-- ----------------------------
DROP TABLE IF EXISTS `storage`;
CREATE TABLE `storage` (
  `product` varchar(255) NOT NULL,
  `stock` int(11) DEFAULT NULL,
  `barcode` bigint(12) NOT NULL,
  PRIMARY KEY (`product`,`barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `storage` VALUES ('arduino uno', '40', '392701209289');
INSERT INTO `storage` VALUES ('capacitors', '60', '251953728037');
INSERT INTO `storage` VALUES ('raspberry pi', '25', '849230412094');
INSERT INTO `storage` VALUES ('resistors', '65', '932081812916');
