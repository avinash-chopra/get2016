SET FOREIGN_KEY_CHECKS = 0;

DROP table members;

SET FOREIGN_KEY_CHECKS = 1;


CREATE TABLE IF NOT EXISTS Members(
	
	member_id CHAR(36) NOT NULL,
	member_name VARCHAR(100) NOT NULL,
	member_addressLine1 VARCHAR(500) NOT NULL,
	member_addressLine2 VARCHAR(500) NOT NULL,
	member_category VARCHAR(100) NOT NULL,
	PRIMARY KEY (member_id)
	
);


SET FOREIGN_KEY_CHECKS = 0;

ALTER TABLE Book_Issue ADD CONSTRAINT FOREIGN KEY fk_member (member_id) REFERENCES Members (member_id);

ALTER TABLE Book_Return ADD CONSTRAINT FOREIGN KEY fk_member (member_id) REFERENCES Members (member_id);

SET FOREIGN_KEY_CHECKS = 1;