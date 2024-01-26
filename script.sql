CREATE SCHEMA netology;

CREATE TABLE netology.PERSONS
(
    id             serial,
    name           varchar NOT NULL,
    surname        varchar NOT NULL,
    age            int     NOT NULL,
    phone_number   varchar NOT NULL,
    city_of_living varchar NOT NULL,
    PRIMARY KEY (name, surname, age)
);

insert into netology.PERSONS(name, surname, age, phone_number, city_of_living)
values ('Иван', 'Иванов', 18, '79333333333', 'Moscow');
insert into netology.PERSONS(name, surname, age, phone_number, city_of_living)
values ('Петр', 'Петров', 21, '79244444444', 'МСК');
insert into netology.PERSONS(name, surname, age, phone_number, city_of_living)
values ('Павел', 'Петросян', 18, '7963333333', 'Казань');
insert into netology.PERSONS(name, surname, age, phone_number, city_of_living)
values ('Михаил', 'Михаилов', 82, '79273333333', 'Иркутск');
insert into netology.PERSONS(name, surname, age, phone_number, city_of_living)
values ('Федор', 'Михайлов', 16, '79283333333', 'Хабаровск');