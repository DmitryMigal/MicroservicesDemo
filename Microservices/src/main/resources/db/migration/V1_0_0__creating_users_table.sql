CREATE TABLE users(
    id varchar(40) primary key not null ,
    name varchar(255) not null ,
    birth_day DATE not null ,
    created_at TIMESTAMP not null
);