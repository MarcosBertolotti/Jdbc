create database personsDB;

    use personsDB;

    create table persons(
        id_person int auto_increment,
        first_name varchar(50) not null,
        last_name varchar(50) not null,
        age int not null,
        dni bigint not null unique,
        primary key (id_person)
    );

     insert into persons (first_name,last_name,age,dni) values
		('Marcos','Bertolotti',21,40951430),
        ('German','Gianotti',99,99999999);
     
     select * from persons;