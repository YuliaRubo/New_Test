create table users(
userId int  primary key auto_increment,
username varchar(30) NOT NULL,
created_at timestamp
);

create table chat(
chatId int  primary key auto_increment,
namechat varchar(30) NOT NULL,
created_at timestamp
);

create table chat_user(
userId int,
chatId int,
primary key(userId, chatId),
foreign key (userId) references users(id),
foreign key (chatId) references chat(id)
);

create table message(
id int auto_increment primary key,
text varchar(255) NOT NULL,
created_at timestamp,
user_id int,
chat_id int,
foreign key (user_id) references users(id),
foreign key (chat_id) references chat(id)
)