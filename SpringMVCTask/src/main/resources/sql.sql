create table notice(
    num int primary key auto_increment,
    id varchar(12),
    job  varchar(12),
    title varchar(20) not null,
    content varchar(200) not null,
    posted_date date,
    cnt int(255)
);

insert into notice(content,id,job,posted_date,cnt,title)
values('싸피 공지사항 1입니다','ssafy','관리자',current_date(), 0,"공지사항 1");

insert into notice(content,id,job,posted_date,cnt,title)
values('싸피 공지사항 2입니다','ssafy','관리자',current_date(), 0,"공지사항 2");

insert into notice(content,id,job,posted_date,cnt,title)
values('싸피 공지사항 3입니다','scott','관리자',current_date(), 0,"공지사항 3");

insert into notice(content,id,job,posted_date,cnt,title)
values('싸피 공지사항 4입니다','scott','관리자',current_date(), 0,"공지사항 4");

commit;

select * from notice;
