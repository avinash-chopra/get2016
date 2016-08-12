/*Qu: Modify the SELECT command written  to
 display results in ascending order of issue date and within issue date in ascending order of member's name.*/

/* use database library */
USE Library;


SELECT b.issue_date , b.accession_number , b.member_id , m.member_name , 
IFNULL(return_date,'Book Not Returned') as Return_Date  
FROM book_return b
LEFT JOIN Members m
ON b.member_id = m.member_id
ORDER BY issue_date DESC ,member_name DESC;