﻿CREATE TABLE `book` (
  `id` INT(10) AUTO_INCREMENT PRIMARY KEY,
  `author` longtext,
  `lauch_date` datetime(6),
  `price` decimal(65,2) NOT NULL,
  `title` longtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
