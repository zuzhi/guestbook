create table guestbook
(id integer primary key autoincrement,
 name varchar(30),
 message varchar(200),
 timestamp timestamp default current_timestamp);
