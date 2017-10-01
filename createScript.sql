CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE users(
id			uuid PRIMARY KEY,
login		varchar(200),
password    uuid
)

CREATE TABLE languages(
id			uuid PRIMARY KEY,
language_name	 varchar(100)
)

CREATE TABLE users_languages_link(
user_id uuid REFERENCES users(id) ON DELETE CASCADE,
language_id uuid REFERENCES languages(id) ON DELETE CASCADE,
knowledge_level varchar(50),
PRIMARY KEY (user_id, language_id)
)

insert into users (select uuid_generate_v4(), 'testLogin', md5('password')::uuid)

begin
	insert into languages(select uuid_generate_v4(), 'English')
	insert into languages(select uuid_generate_v4(), 'French')
	insert into languages(select uuid_generate_v4(), 'German')
end;

select id from users where login = 'testLogin'
select id from languages where language_name = 'English'

insert into users_languages_link(user_id,language_id, knowledge_level)
with
	user_id as (
	select id from users where login = 'testLogin'),
	language_id as(
	select id from languages where language_name = 'English' 
	)
	select user_id.id ,language_id.id , 'native'
	from user_id,language_id




ALTER TABLE users ADD PRIMARY KEY (id);
md5('password')::uuid