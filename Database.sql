create database wsearch;

use wsearch;

create table images(
id int(11) NOT NULL auto_increment,

url text,
domain text,
title text,
description text,
uses text,
images longblob,

count int(11) default NULL,

binaryimage longtext,

imagepath text,
PRIMARY KEY  (id)
);


create table backup(
id int(11)NOT NULL auto_increment,

url text,
domain text,
title text,
description text,
uses text,
PRIMARY KEY  (id)
);


create table temp(
id int(11),

url text,
domain text,
title text,
description text,
uses text,
count int(11) default NULL,

imagepath text,
uname text,
 keyword text 
);



 select id,url,domain,title,description,count,imagepath from images;


CREATE TABLE admin (
	username VARCHAR(50),
	password VARCHAR(50)
) ;

insert into admin values ('admin','admin');


CREATE TABLE user (
	uid INT NOT NULL auto_increment,
	uname VARCHAR(60),
	password VARCHAR(60),
	email VARCHAR(60),
	mobile VARCHAR(60),
	location VARCHAR(60),
	dob VARCHAR(60),
	address VARCHAR(100),
	gender VARCHAR(60),
	pincode VARCHAR(60),
	sk1 VARCHAR(60),
	sk2 VARCHAR(60),
	PRIMARY KEY (uid)
) ;

 create table search(
 
 uname text,
field text,
 keyword text,
 dt text);

create table search1(
 
 uname text,
 keyword text,
 dt text,
gdp text,
gil text);

create table Attackers(
aname text,
title text,
id int(11));


used for mobility
voice, data, text and many more