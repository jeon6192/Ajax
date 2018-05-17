drop table member;

create table member(
	id					varchar2(15),
	password		varchar2(10),
	name			varchar2(15),
	age				Number,
	gender			varchar2(5),
	email				varchar2(30),
	primary key(id)
);

select * from member;