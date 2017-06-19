drop schema resume;
create schema resume;
use resume;

drop table applicant;
drop table education;
drop table experience;
drop table skills;

-- Main Tables:
create table applicant (Email varchar(50) not null primary key, FirstName varchar(50), LastName varchar(50));
-- (here we populate Applicants running the provided and modified SQL script, Applicant.sql)
create table education (EducId int not null auto_increment primary key, Education varchar(100), Email varchar(50) not null);
-- (here we populate Education with education Education.sql)
create table experience (ExpeId int not null auto_increment primary key, Experience varchar(100), Email varchar(50) not null);
-- (here we populate Experience with Experience.sql)
create table skills (SkilId int not null auto_increment primary key, Skill varchar(100), Email varchar(50) not null);
-- (here we populate Skills with Skills.sql)

-- Alter Tables:
/**alter table education ADD ApplId int;
alter table experience ADD ApplId int;
alter table skills ADD ApplId int;*/

-- Relational Tables:
/**
create table appedu (ApplId int, EducId int, Education varchar(100));
create table appexp (ApplId int, ExpeId int, Experience varchar(100));
create table appski (ApplId int, SkilId int, Skill varchar(100));*/

/**Drop table appedu;
Drop table appexp;
Drop table appski;*/
