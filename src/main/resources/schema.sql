create table users(
userId int  primary key auto_increment,
username varchar(30) NOT NULL,
created_at timestamp DEFAULT CURRENT_TIMESTAMP
);

create table chat(
chatId int  primary key auto_increment,
name_chat varchar(30) NOT NULL,
created_at timestamp DEFAULT CURRENT_TIMESTAMP
);

create table chat_user(
userId int,
chatId int,
primary key(userId, chatId),
foreign key (userId) references users(userId),
foreign key (chatId) references chat(chatId)
);

create table message(
id int auto_increment primary key,
text varchar(255) NOT NULL,
created_at timestamp,
user_id int,
chat_id int,
foreign key (user_id) references users(userId),
foreign key (chat_id) references chat(chatId)
)