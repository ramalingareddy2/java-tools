use `vogodbtest`;
CREATE TABLE `staff` (
  `staff_no` int NOT NULL,
  `full_nm` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `experience` int DEFAULT NULL,
  `mobile_nbr` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`staff_no`));
