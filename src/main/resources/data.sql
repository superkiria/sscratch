DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

insert into user(id, name) values(1, 'Jorden');
insert into user(id, name) values(2, 'Anish');
insert into user(id, name) values(3, 'Andrey');
insert into user(id, name) values(4, 'Fabiano');
insert into user(id, name) values(5, 'Alireza');
