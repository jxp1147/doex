CREATE DATABASE IF NOT EXISTS doex;
USE doex;

CREATE TABLE IF NOT EXISTS user_type (
    id INT AUTO_INCREMENT PRIMARY KEY,
    type_name VARCHAR(50) NOT NULL UNIQUE,
    type_value int NOT NULL UNIQUE);

CREATE TABLE IF NOT EXISTS industries (
    id INT AUTO_INCREMENT PRIMARY KEY,
    industry_name VARCHAR(50) NOT NULL UNIQUE);

CREATE TABLE IF NOT EXISTS jobs (
    id INT AUTO_INCREMENT PRIMARY KEY,
    job_name VARCHAR(50) NOT NULL UNIQUE,
    industry_name VARCHAR(50),
    FOREIGN KEY (industry_name) REFERENCES industries(industry_name));

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(50) NOT NULL,
    user_type_id INT NOT NULL DEFAULT 3,
    FOREIGN KEY (user_type_id) REFERENCES user_type(id),
    industry_id int,
    FOREIGN KEY (industry_id) REFERENCES industries(id),
    job_id int,
    FOREIGN KEY (job_id) REFERENCES jobs(id),
    question_num INT default 0,
    create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `avatar` text,
    `signature` text
    );

create table if not exists achieves (
   id INT AUTO_INCREMENT PRIMARY KEY,
   achieve_name VARCHAR(50) NOT NULL
);

create table if not exists user_achieve (
    user_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id),
    achieve_id INT NOT NULL,
    FOREIGN KEY (achieve_id) REFERENCES achieves(id)
);

create table if not exists exercises (
    id INT AUTO_INCREMENT PRIMARY KEY,
    industry_id INT not null,
    FOREIGN KEY (industry_id) REFERENCES industries(id),
    job_id INT NOT NULL,
    FOREIGN KEY (job_id) REFERENCES jobs(id),
    exercise_content longtext,
    exercise_answer longtext,
    owner_id INT NOT NULL,
    FOREIGN KEY (owner_id) REFERENCES users(id)
);

create table if not exists histories (
    user_id INT NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id),
    exercise_id INT NOT NULL,
    FOREIGN KEY (exercise_id) REFERENCES exercises(id)
);

create table if not exists collections (
     user_id INT NOT NULL,
     FOREIGN KEY (user_id) REFERENCES users(id),
     exercise_id INT NOT NULL,
      FOREIGN KEY (exercise_id) REFERENCES exercises(id)
);