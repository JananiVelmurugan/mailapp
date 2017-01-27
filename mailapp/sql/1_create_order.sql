CREATE DATABASE mail_db;
DROP TABLE orders;
CREATE TABLE orders
(
id INT,
item VARCHAR(20),
quantity INT
);
insert into orders(id,item,quantity)
values(1,'idli',3);