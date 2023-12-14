-- Create Schema (Database)
CREATE DATABASE IF NOT EXISTS spindeldb;
USE spindeldb;

-- Rest of your table creation scripts
CREATE TABLE member (
                        member_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        email VARCHAR(255) NOT NULL UNIQUE,
                        password VARCHAR(255) NOT NULL,
                        user_created DATETIME DEFAULT CURRENT_TIMESTAMP,
                        last_login DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                        first_name VARCHAR(255),
                        last_name VARCHAR(255),
                        address VARCHAR(255),
                        city VARCHAR(255)
) ENGINE=InnoDB;

-- ... (rest of your table creation scripts)
CREATE TABLE book (
                        book_id INT AUTO_INCREMENT PRIMARY KEY,
                        title VARCHAR(255) NOT NULL,
                        author VARCHAR(255) NOT NULL,
                        isbn VARCHAR(255),
                        description VARCHAR(255),
                        genre VARCHAR(255),
                        publisher VARCHAR(255),
                        publish_date DATE,
                        language VARCHAR(255),
                        pages INT,
                        copies INT,
                        available INT,
                        book_created DATETIME DEFAULT CURRENT_TIMESTAMP,
                        book_updated DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB;



-- Foreign key constraints

-- ... (rest of your foreign key constraints)
