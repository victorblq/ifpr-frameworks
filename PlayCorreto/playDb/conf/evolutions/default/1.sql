# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table pessoa (
  id                        bigint auto_increment not null,
  nome                      varchar(255),
  constraint pk_pessoa primary key (id))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists pessoa;

SET REFERENTIAL_INTEGRITY TRUE;

