drop database if exists mysql_practise;
create database mysql_practise;
use mysql_practise;
-- 题目19
create table location(
	location_id int(11) PRIMARY KEY, 
	province varchar(25), 
	city varchar(30), 
	zip varchar(12)
)engine InnoDB default charset=utf8;
-- *******************************************
-- 题目18
create table department(
	department_id int(11) PRIMARY KEY,
	department_name varchar(30),
	manager_id int(11),
	location_id int(11),
	constraint foreign key (location_id) references location(location_id)
)engine InnoDB default charset=utf8;
-- *******************************************
-- 题目1
create table employee(
	id int(11) PRIMARY KEY,
	first_name varchar(20) NOT NULL,
	last_name varchar(20) NOT NULL,
	email varchar(25) UNIQUE,
	phone_number varchar(20) UNIQUE,
	hire_date DATE,
	job_id varchar(10),
	salary int(11),
	commission_pct int(11),
	manager_id int(11),
	department_id int(11),
	constraint foreign key(department_id) references department(department_id)
)engine InnoDB default charset=utf8;
-- *********************************************
insert into location values(
	1,
	'四川',
	'成都',
	1
);
insert into location values(
	2,
	'上海',
	'上海',
	2
);
insert into location values(
	3,
	'北京',
	'北京',
	3
);
insert into location values(
	4,
	'重庆',
	'重庆',
	4
);
insert into department values(
	10,
	'技术部',
	10,
	1
);
insert into department values(
	20,
	'财务部',
	20,
	2
);
insert into department values(
	3,
	'销售部',
	3,
	3
);
insert into department values(
	4,
	'后勤部',
	4,
	4
);


insert into employee values(
	1,
	'前名',
	'后名',
	'my_email',
	'my_phone',
	'2018-7-1',
	'my_job',
	8888,
	1,
	1,
	10
);


insert into employee values(
	2,
	'兆伦',
	'季',
	'hellojzl@foxmail.com',
	'18351800130',
	'1997-3-26',
	'总经理',
	888888,
	20,
	20,
	20
);

insert into employee values(
	3,
	'holly',
	'shit',
	'damn@foxmail.com',
	'18181818181',
	'2018-7-1',
	'扫地王',
	2901,
	2,
	3,
	3
);

insert into employee values(
	4,
	'Ice',
	'Frost',
	'beau@foxmail.com',
	'191638474656',
	'2018-7-1',
	'秘书',
	2901,
	2,
	4,
	4
);

-- 题目2
select * from employee;

-- ********************************************
-- 题目3
select 
	id, 
	last_name,
	first_name, 
	job_id, 
	salary 
 from employee;
-- ********************************************
-- 题目4
select 
	id, 
	last_name,
	first_name, 
	job_id, 
	salary*12
 from employee;
-- ********************************************

-- 题目5
select * from employee where department_id=10;
-- ********************************************

-- 题目6
select * from employee where job_id='总经理';
-- ********************************************
-- 题目7
select * from employee where salary > 3400;
-- ********************************************
-- 题目8
select * from employee 
where 
salary > 2900 and 
salary < 3600;
-- ********************************************

-- 题目9
select * from employee 
where 
department_id='10'
or
department_id='20';
-- ********************************************

-- 题目11
select * from employee
where
job_id='总经理'
or
job_id='秘书';

-- *****************************************

-- 题目16
select * from employee order by salary desc;

-- *******************************************

-- 题目17
select id,last_name,first_name,salary
from employee
order by salary;
-- *******************************************



-- 题目20
select e.id,e.last_name,e.first_name,d.department_name
from employee e
left join
department d 
on
d.department_id=e.department_id
;
-- *******************************************
-- 题目21
select e.id,e.last_name,e.first_name,e.salary,d.department_name,l.city
from employee e 
left join 
department d 
on
d.department_id=e.department_id
left join
location l 
on
d.location_id = l.location_id
;
-- *******************************************

-- 题目22
select * from employee where 
salary > 4000 
and 
department_id=(select location_id 
	from location 
	where city = '成都'
	);
-- *******************************************
-- 题目23
select * from employee where
job_id='技术部'
and hire_date < '2010-1-1';
-- *******************************************
-- 题目24
select * from employee where department_id=(
	select department_id from department where
	location_id=(select location_id from location where city='北京')
) order by salary desc;

-- 题目25
select * from employee where department_id=(
	select department_id from department where
	location_id=(select location_id from location where city='上海')
) order by salary desc;








