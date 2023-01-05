create database goverment;

use goverment;

create table sample (id varchar(20), pw varchar(20));

insert into sample values('kim','1234');
insert into sample values('lee','1111');

create table board(seq int primary key,
title varchar(100) not null,
content varchar(800) not null,
nickname varchar(20),
regdate datetime,
visited int default 0
);
drop table board;
select * from board;

insert into board values(1, '공지사항1','공지사항1에 대한 내용','admin',sysdate(),0);
insert into board values(2, '공지사항2','공지사항2에 대한 내용','admin',sysdate(),0);