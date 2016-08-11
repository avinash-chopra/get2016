CREATE DATABASE IF NOT EXISTS library;

USE library;

CREATE TABLE IF NOT EXISTS Authors(
	
	author_id CHAR(36) NOT NULL,
	author_lname VARCHAR(100) NOT NULL,
	author_fname VARCHAR(100) NOT NULL,
	author_address VARCHAR(500) NOT NULL,
	author_city VARCHAR(100) NOT NULL,
	author_state VARCHAR(100) NOT NULL,
	PRIMARY KEY (author_id)

);

CREATE TABLE IF NOT EXISTS Publishers(
	
	publisher_id CHAR(36) NOT NULL,
	publisher_name VARCHAR(100) NOT NULL,
	publisher_city VARCHAR(100) NOT NULL,
	PRIMARY KEY (publisher_id)
	
);

CREATE TABLE IF NOT EXISTS Subjects(
	
	subject_id CHAR(36) NOT NULL,
	subject_name VARCHAR(100) NOT NULL,
	PRIMARY KEY (subject_id)

);

CREATE TABLE IF NOT EXISTS Titles(
	
	title_id CHAR(36) NOT NULL,
	title_name VARCHAR(300) NOT NULL,
	title_type VARCHAR(100) NOT NULL,
	title_price DECIMAL(5,3) NOT NULL,
	publisher_id CHAR(36) NOT NULL,
	PRIMARY KEY (title_id),
	FOREIGN KEY fk_publisher (publisher_id) REFERENCES Publishers (publisher_id)
	ON DELETE CASCADE
	ON UPDATE CASCADE
	
);
CREATE TABLE IF NOT EXISTS Title_Author(
	
	title_id CHAR(36) NOT NULL,
	author_id CHAR(36) NOT NULL,
	FOREIGN KEY fk_title (title_id) REFERENCES Titles (title_id)
	ON DELETE CASCADE
	ON UPDATE CASCADE,
	
	FOREIGN KEY fk_author (author_id) REFERENCES Authors (author_id)
	ON DELETE CASCADE
	ON UPDATE CASCADE,
	
	PRIMARY KEY (title_id,author_id)

);

CREATE TABLE IF NOT EXISTS Books(
	
	accession_number VARCHAR(100) NOT NULL,
	title_id CHAR(36) NOT NULL,
	purchase_date DATE NOT NULL,
	book_price DECIMAL(5,3) NOT NULL,
	book_status VARCHAR(50) NOT NULL,
	PRIMARY KEY (accession_number),
	FOREIGN KEY fk_title (title_id) REFERENCES Titles (title_id)
	ON DELETE CASCADE
	ON UPDATE CASCADE

);

CREATE TABLE IF NOT EXISTS Members(
	
	member_id CHAR(36) NOT NULL,
	member_name VARCHAR(100) NOT NULL,
	member_addressLine1 VARCHAR(500) NOT NULL,
	member_addressLine2 VARCHAR(500) NOT NULL,
	member_category VARCHAR(100) NOT NULL,
	PRIMARY KEY (member_id)
	
);

CREATE TABLE IF NOT EXISTS Book_Issue(
	
	issue_date DATE NOT NULL,
	accession_number VARCHAR(100) NOT NULL,
	member_id CHAR(36) NOT NULL,
	due_date DATE NOT NULL,
	FOREIGN KEY fk_book (accession_number) REFERENCES Books (accession_number) 
	ON DELETE CASCADE
	ON UPDATE CASCADE,
	FOREIGN KEY fk_member (member_id) REFERENCES Members (member_id) 
	ON DELETE CASCADE
	ON UPDATE CASCADE,
	PRIMARY KEY (issue_date,accession_number,member_id)
	
);

CREATE TABLE IF NOT EXISTS Book_Return(
	
	return_date DATE NOT NULL,
	accession_number VARCHAR(100) NOT NULL,
	member_id CHAR(36) NOT NULL,
	issue_date DATE NOT NULL,
	FOREIGN KEY fk_book (accession_number) REFERENCES Books (accession_number) 
	ON DELETE CASCADE
	ON UPDATE CASCADE,
	FOREIGN KEY fk_member (member_id) REFERENCES Members (member_id) 
	ON DELETE CASCADE
	ON UPDATE CASCADE,
	PRIMARY KEY (return_date,accession_number,member_id)
	
);