SELECT author_id, author_lname ,author_fname ,author_address, author_city
,author_state FROM Authors;
SELECT issue_date,accession_number,member_id,due_date FROM Book_Issue;
SELECT title_id,author_id FROM Title_Author;
SELECT subject_id,subject_name FROM Subjects;
SELECT member_id,member_addressLine1,member_addressLine2,member_category FROM Members;
SELECT title_id,title_name,title_type,title_price,publisher_id FROM Titles;
SELECT publisher_id,publisher_name,publisher_city FROM Publishers;
SELECT accession_number,title_id,purchase_date,book_price,book_status FROM Books;
SELECT return_date,accession_nmber,member_id,issue_date FROM Book_Return;