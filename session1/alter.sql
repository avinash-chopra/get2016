ALTER TABLE Book_Issue ALTER issue_date SET DEFAULT '2016-08-10';

DESCRIBE Book_Issue; 

ALTER TABLE Book_Issue ALTER due_date SET DEFAULT '2016-08-30';

DESCRIBE Book_Issue;