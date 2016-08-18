
/*Qu 1:
 Create a View which can be used to display member name and
all issue details of the member using a simple SELECT command.
 */

CREATE VIEW MemberBookIssue
AS

SELECT m.member_id , m.member_name , bi.issue_date , bi.accession_number , bi.due_date FROM Members m
INNER JOIN Book_Issue bi ON bi.member_id = m.member_id;

SELECT member_id , member_name , issue_date , accession_number , due_date FROM MemberBookIssue;


/* Qu 2:
 Create a View which contains three columns, member name,
member id and full description of category, i.e., Faculty, Students
and Others instead of F,S and O.
*/

CREATE VIEW MemberCategoryDiscription
AS

SELECT member_id , member_name , member_addressLine1 , member_addressLine2 ,
CASE 
	WHEN member_category = 'O' THEN 'Other'
	WHEN member_category = 'S' THEN 'Student'
	WHEN member_category = 'F' THEN 'Faculty'
END AS member_category
FROM Members;

SELECT member_id , member_name , member_addressLine1 , member_addressLine2 , member_category FROM MemberCategoryDiscription; 


/* Qu 3:
 Create a View which contains the information – subject name,
title, member name, category, issue date, due date and return
date. If the books have not been returned, NULL should be
displayed instead of return date.
*/

CREATE OR REPLACE VIEW MemberBookReturnDescription
AS

SELECT s.subject_name , t.title_name , m.member_id , m.member_name , m.member_category , bi.issue_date , bi.due_date , br.return_date FROM Members m
INNER JOIN Book_Issue bi ON bi.member_id = m.member_id
INNER JOIN Book_Return br ON br.member_id = m.member_id
INNER JOIN Books b ON b.accession_number = bi.accession_number
INNER JOIN Titles t ON t.title_id = b.title_id
INNER JOIN Subjects s ON s.subject_id = t.subject_id;

SELECT * FROM MemberBookReturnDescription;
