create database if not exists alunos;
use alunos;
create table if not exists alunos(
  id_aluno int primary key auto_increment,
  nome varchar(100) not null,
  nota decimal(3,1) not null,
  ra int not null
  );
describe alunos;
use sakila;
show tables;
show databases;

alter table aluno add column naturalidade varchar(100) not null;
alter table aluno add column nacionalidade varchar(100) not null default "Brasileiro" after naturalidade;
alter table aluno drop column nacionalidade;
alter table aluno modify column ra bigint;
alter table aluno change column ra ra_aluno bigint;
alter table aluno rename to alunos;
alter table alunos rename to aluno;
drop table aluno;

insert int aluno (nome, ra_aluno, nota, naturalidade)
values ("Amanda", 4747474747, 21.1, "OZ");
describe aluno;
select * from alunos;

insert into aluno (nome, ra_aluno, nota, naturalidade) values ("Carlos", 4343434343, 76.5, "Capão Redondo");
describe aluno;
insert into aluno (nome, ra_aluno, nota, naturalidade) values ("Beatriz", 431432421, 34.5, "Vila Medeiros");
insert into aluno (nome, ra_aluno, nota, naturalidade) values ("Karla", 12343445354, 56.8, "Vila Guilherme");
insert into aluno (nome, ra_aluno, nota, naturalidade) values ("Guilherme", 654324235, 98.7, "Vila Sabrina");
insert into aluno (nome, ra_aluno, nota, naturalidade) values ("Felipe", 34546464564, 69.6, "São José dos Camps");
select * from aluno;

update aluno set nome = "Matheus Belchior" where id_aluno = '6';
select * from aluno;
delete from aluno where id_aluno = '2';
select * from aluno order by name asc;
select * from aluno where nota > '69.6';

create table if not exists professor(
  id_professor int auto_increment primary key,
  nome_professor varchar(30) not null,
  UF_professor char (2) not null,
  telefone_professor bigint not null,
  altura_professor decimal (3,2),
  id_aluno int,
  constraint fk_AlunoProfessor foreign key (id_aluno) references aluno (id_aluno)
  );

show tables;

insert into professor (nome_professor, UF_professor, telefone_professor, altura_professor, id_aluno)
values ("Danilo", "MG", 119090909090, 1.78, 1);
select * from professor;

insert into professor (nome_professor, UF_professor, telefone_professor, altura_professor, id_aluno)
values ("Carlos Noriega", "SP", 119717432783, 1.60, 3);

select professor.nome_professor, aluno.nome from professor inner join aluno on aluno.id_aluno = professor.id_aluno;
