/*Qu 1:*/

SELECT m.member_name , m.member_id , t.title_name , b.accession_number , bi.issue_date , bi.due_date , FLOOR(DATEDIFF (due_date , issue_date ) / 24 )AS Duration_In_Months
FROM Book_Issue bi 
INNER JOIN Members m 
ON bi.member_id = m.member_id
INNER JOIN Books b
ON bi.accession_number = b.accession_number
INNER JOIN Titles t
ON b.title_id = t.title_id
WHERE ( DATEDIFF (due_date , issue_date) / 24 > 2 )
ORDER BY member_name , title_name; 

/*Qu 2:*/
SELECT member_name , LENGTH(member_name) AS Maximum_Length 
FROM Members 
HAVING LENGTH(member_name) = MAX(LENGTH(member_name));	

/*Qu 3:*/
SELECT COUNT(issue_date) AS Books_Issued FROM book_issue;