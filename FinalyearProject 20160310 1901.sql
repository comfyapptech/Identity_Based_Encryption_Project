-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.77-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema ibeorcc
--

CREATE DATABASE IF NOT EXISTS ibeorcc;
USE ibeorcc;

--
-- Definition of table `csp`
--

DROP TABLE IF EXISTS `csp`;
CREATE TABLE `csp` (
  `user_name` varchar(40) default NULL,
  `password` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `csp`
--

/*!40000 ALTER TABLE `csp` DISABLE KEYS */;
INSERT INTO `csp` (`user_name`,`password`) VALUES 
 ('csp@gmail.com','csp');
/*!40000 ALTER TABLE `csp` ENABLE KEYS */;


--
-- Definition of table `csp_files_table`
--

DROP TABLE IF EXISTS `csp_files_table`;
CREATE TABLE `csp_files_table` (
  `filename` varchar(50) default NULL,
  `email` varchar(50) default NULL,
  `public_key` varchar(2000) default NULL,
  `private_key` varchar(1000) default NULL,
  `uploaded_on` date default NULL,
  `Encrypted_data` varchar(5000) default NULL,
  `original_data` varchar(5000) default NULL,
  `size` varchar(4) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `csp_files_table`
--

/*!40000 ALTER TABLE `csp_files_table` DISABLE KEYS */;
INSERT INTO `csp_files_table` (`filename`,`email`,`public_key`,`private_key`,`uploaded_on`,`Encrypted_data`,`original_data`,`size`) VALUES 
 ('Hello.txt','user@gmail.com','Sun RSA public key, 1024 bits\n  modulus: 94095885115678120884778990802844226169562196085144259768536858012784892251952135249918046694000392865280262345848945079801013370611525857248126545350006495150158890037479738562450454232710790695409922226123108619153213233554243419028695577527932153178908212576203976053503606384466548411067213254537302434023\n  public exponent: 65537','sun.security.rsa.RSAPrivateCrtKeyImpl@15c913','2016-08-17','[B@366da6b4','Hello this is just for testing purpose.','39'),
 ('Hello.txt','ashish@gmail.com','Sun RSA public key, 1024 bits\n  modulus: 94095885115678120884778990802844226169562196085144259768536858012784892251952135249918046694000392865280262345848945079801013370611525857248126545350006495150158890037479738562450454232710790695409922226123108619153213233554243419028695577527932153178908212576203976053503606384466548411067213254537302434023\n  public exponent: 65537','sun.security.rsa.RSAPrivateCrtKeyImpl@15c913','1994-01-01','[B@3719c7ad','Hello this is just for testing purpose.','39'),
 ('Ok.txt','xyz@gmail.com','Sun RSA public key, 1024 bits\n  modulus: 94095885115678120884778990802844226169562196085144259768536858012784892251952135249918046694000392865280262345848945079801013370611525857248126545350006495150158890037479738562450454232710790695409922226123108619153213233554243419028695577527932153178908212576203976053503606384466548411067213254537302434023\n  public exponent: 65537','sun.security.rsa.RSAPrivateCrtKeyImpl@15c913','2016-09-03','[B@7a598c26','Ok here is some data!!!','23'),
 ('Ok.txt','abc@gmail.com','Sun RSA public key, 1024 bits\n  modulus: 94095885115678120884778990802844226169562196085144259768536858012784892251952135249918046694000392865280262345848945079801013370611525857248126545350006495150158890037479738562450454232710790695409922226123108619153213233554243419028695577527932153178908212576203976053503606384466548411067213254537302434023\n  public exponent: 65537','sun.security.rsa.RSAPrivateCrtKeyImpl@15c913','2016-09-03','[B@3f9acf2c','Ok here is some data!!!','23');
/*!40000 ALTER TABLE `csp_files_table` ENABLE KEYS */;


--
-- Definition of table `pkg`
--

DROP TABLE IF EXISTS `pkg`;
CREATE TABLE `pkg` (
  `user_name` varchar(40) default NULL,
  `password` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pkg`
--

/*!40000 ALTER TABLE `pkg` DISABLE KEYS */;
INSERT INTO `pkg` (`user_name`,`password`) VALUES 
 ('prabhu@gmail.com','prabhu'),
 ('pkg@gmail.com','pkg');
/*!40000 ALTER TABLE `pkg` ENABLE KEYS */;


--
-- Definition of table `revoked_list_table`
--

DROP TABLE IF EXISTS `revoked_list_table`;
CREATE TABLE `revoked_list_table` (
  `name` varchar(50) default NULL,
  `email` varchar(50) default NULL,
  `password` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `revoked_list_table`
--

/*!40000 ALTER TABLE `revoked_list_table` DISABLE KEYS */;
INSERT INTO `revoked_list_table` (`name`,`email`,`password`) VALUES 
 ('Aman','aman@gmail.com','aman');
/*!40000 ALTER TABLE `revoked_list_table` ENABLE KEYS */;


--
-- Definition of table `time_list_table`
--

DROP TABLE IF EXISTS `time_list_table`;
CREATE TABLE `time_list_table` (
  `name` varchar(50) default NULL,
  `email` varchar(50) default NULL,
  `password` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `time_list_table`
--

/*!40000 ALTER TABLE `time_list_table` DISABLE KEYS */;
INSERT INTO `time_list_table` (`name`,`email`,`password`) VALUES 
 ('user','user@gmail.com','user'),
 ('prabhaunath','prabhunath@gmail.com','prabhunath'),
 ('Ashish','ashish@gmail.com','ashish'),
 ('xyz','xyz@gmail.com','xyz'),
 ('abc','abc@gmail.com','abc');
/*!40000 ALTER TABLE `time_list_table` ENABLE KEYS */;


--
-- Definition of table `userfile`
--

DROP TABLE IF EXISTS `userfile`;
CREATE TABLE `userfile` (
  `email` varchar(50) default NULL,
  `file_name` varchar(100) default NULL,
  `size` varchar(4) default NULL,
  `file_data` varchar(5000) default NULL,
  `upload_date` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userfile`
--

/*!40000 ALTER TABLE `userfile` DISABLE KEYS */;
INSERT INTO `userfile` (`email`,`file_name`,`size`,`file_data`,`upload_date`) VALUES 
 ('user@gmail.com','Hello.txt','39','Hello this is just for testing purpose.','2016-08-17'),
 ('ashish@gmail.com','Hello.txt','39','Hello this is just for testing purpose.','1994-01-01'),
 ('ashish@gmail.com','Hello.txt','39','Hello this is just for testing purpose.','2016-09-03'),
 ('xyz@gmail.com','Ok.txt','23','Ok here is some data!!!','2016-09-03'),
 ('abc@gmail.com','Ok.txt','23','Ok here is some data!!!','2016-09-03');
/*!40000 ALTER TABLE `userfile` ENABLE KEYS */;


--
-- Definition of table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `name` varchar(50) default NULL,
  `email` varchar(50) default NULL,
  `password` varchar(50) default NULL,
  `contact` varchar(12) default NULL,
  `location` varchar(100) default NULL,
  `status` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`name`,`email`,`password`,`contact`,`location`,`status`) VALUES 
 ('user','user@gmail.com','user','1234567890','Chennai','True'),
 ('prabhaunath','prabhunath@gmail.com','prabhunath','987654321','Chennai','True'),
 ('Aman','aman@gmail.com','aman','1234567890','Chennai','False'),
 ('Ashish','ashish@gmail.com','ashish','1234567890','Chennai','True'),
 ('xyz','xyz@gmail.com','xyz','1234567890','Chennai','True'),
 ('abc','abc@gmail.com','abc','1234567890','Chennai','True');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
