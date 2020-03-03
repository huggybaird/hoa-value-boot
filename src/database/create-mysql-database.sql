CREATE TABLE `hoa_config` (
  `name` varchar(255) NOT NULL,
  `value` mediumtext,
  `timeUpdated` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `hoa_details` (
  `hoaId` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `propertyType` varchar(255) DEFAULT NULL,
  `propertyTypeDesc` varchar(255) DEFAULT NULL,
  `yearBuilt` int(11) DEFAULT NULL,
  `unitCount` int(11) DEFAULT NULL,
  `sqFtPerUnit` double NOT NULL,
  `floorCount` int(11) DEFAULT NULL,
  `address1` varchar(255) DEFAULT NULL,
  `address2` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `zip` varchar(255) DEFAULT NULL,
  `hoaWebsiteUrl` varchar(255) DEFAULT NULL,
  `timeUpdated` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`hoaId`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

CREATE TABLE `hoa_property_redfin` (
  `property_key` bigint(20) NOT NULL,
  `address1` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `zip` varchar(255) DEFAULT NULL,
  `hoa_fee_month` double NOT NULL,
  `sq_ft` int(11) DEFAULT NULL,
  `year_built` int(11) DEFAULT NULL,
  `property_type` varchar(255) DEFAULT NULL,
  `baths` double NOT NULL,
  `beds` int(11) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `lot_size_sq_ft` varchar(255) DEFAULT NULL,
  `dollars_per_sq_ft` double NOT NULL,
  `favorite` varchar(255) DEFAULT NULL,
  `interested` varchar(255) DEFAULT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL,
  `listed_days_on_market` int(11) NOT NULL,
  `listed_for_sale_price` int(11) NOT NULL,
  `listed_for_sale_source` varchar(255) DEFAULT NULL,
  `listed_for_sale_status` varchar(255) DEFAULT NULL,
  `listedmlsnumber` varchar(255) DEFAULT NULL,
  `next_open_house_end_time` varchar(255) DEFAULT NULL,
  `next_open_house_start_date` varchar(255) DEFAULT NULL,
  `recent_sale_date` varchar(255) DEFAULT NULL,
  `sale_type` varchar(255) DEFAULT NULL,
  `redfin_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`property_key`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `hoa_state` (
  `state_code` text,
  `state` text,
  `census` int(11) DEFAULT NULL,
  `estimates_base` int(11) DEFAULT NULL,
  `population_2010` int(11) DEFAULT NULL,
  `population_2011` int(11) DEFAULT NULL,
  `population_2012` int(11) DEFAULT NULL,
  `population_2013` int(11) DEFAULT NULL,
  `population_2014` int(11) DEFAULT NULL,
  `population_2015` int(11) DEFAULT NULL,
  `population_2016` int(11) DEFAULT NULL,
  `population_2017` int(11) DEFAULT NULL,
  `population_2018` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `hoa_user` (
  `userId` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `timeUpdated` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`userId`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

CREATE TABLE `hoa_user_config` (
  `userId` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `value` mediumtext,
  `timeUpdated` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`userId`,`name`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
'