/*Qu: 1*/

SELECT COUNT(*) AS Number_Of_Books_Purchased , s.subject_name , s.subject_id FROM Subjects s
INNER JOIN Titles t ON t.subject_id = s.subject_id
INNER JOIN Books b ON b.title_id = t.title_id 
GROUP BY s.subject_name;

/*Qu: 2*/

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


/*Qu: 3*/
SELECT b.accession_number ,  t.title_id , t.title_name , b.book_price 
FROM Books b 
LEFT JOIN Titles t ON t.title_id = b.title_id 
HAVING b.book_price > (SELECT MIN(book_price) FROM Books); 

