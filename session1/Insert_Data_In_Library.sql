INSERT INTO Authors (author_id,author_lname,author_fname,author_address,author_city,author_state)
Values ('172-32-1176','White','Johnson','10932 Bigge Road','Menlo Park','CA');

INSERT INTO Authors (author_id,author_lname,author_fname,author_address,author_city,author_state)
Values ('172-32-1177','Green','Marjorie','309 63rd Street','Oakland','CA');

INSERT INTO Authors (author_id,author_lname,author_fname,author_address,author_city,author_state)
Values ('172-32-1178','Carson','Cheryl','589 Darwin Lane','Berkeley','CA');



Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values ('1','New Moon Books','Boston');

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values ('2','Binnet and Hardely','Washington');

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values ('3','AlgoData Publishers','Berkeley');



INSERT INTO Titles (title_id,title_name,title_type,title_price,publisher_id)
Values ('BU1232','The Busy Executive Database Guide','business','19.99','1');

INSERT INTO Titles (title_id,title_name,title_type,title_price,publisher_id)
Values ('BU2075','You can combat computer stress','business','56.99','2');

INSERT INTO Titles (title_id,title_name,title_type,title_price,publisher_id)
Values ('PS2091','Is Anger the Enemy?','psychology','10.95','3');


INSERT INTO Members (member_id,member_name,member_addressLine1,member_addressLine2,member_category)
Values ('354-6749-857','Vaibhav','Ganjward','Chandrapur','M');

INSERT INTO Members (member_id,member_name,member_addressLine1,member_addressLine2,member_category)
Values ('354-6749-858','Cheryl','EPIP,Sitapura','Jaipur','F');


INSERT INTO Subjects (subject_id,subject_name)
Values ('475-464-24','Computer Science');

INSERT INTO Subjects (subject_id,subject_name)
Values ('475-464-25','Psychology');


INSERT INTO Books (accession_number,title_id,purchase_date,book_price,book_status)
Values ('23','BU1232','2001-03-02','45.56','Available');

INSERT INTO Books (accession_number,title_id,purchase_date,book_price,book_status)
Values ('24','PS2091','2004-03-02','48.56','Not Available');

INSERT INTO Books (accession_number,title_id,purchase_date,book_price,book_status)
Values ('25','BU2075','2006-03-02','35.56','Available');


INSERT INTO title_author (title_id,author_id)
Values ('BU1232','172-32-1177');

INSERT INTO title_author (title_id,author_id)
Values ('BU2075','172-32-1178');


INSERT INTO Book_Issue(issue_date,accession_number,member_id,due_date)
Values('2016-08-06','24','354-6749-858','2016-08-21');


INSERT INTO Book_Return(return_date,accession_number,member_id,issue_date)
Values('2016-08-25','25','354-6749-857','2016-08-2');
