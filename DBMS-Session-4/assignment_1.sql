/*Qu 1:  Write a SELECT command to display name of those members
who belong to the category as to which member
“Jon Snow” belongs.
*/

SELECT member_name FROM members WHERE member_category = (SELECT member_category FROM members WHERE member_name='Jon Snow');

/*Qu 2:
Write a SELECT command to display information on the books
that have not been returned till date. The information should
include book issue date, title, member name and due date.
*/

SELECT bi.issue_date , bi.due_date , t.title_name , m.member_name FROM Book_Issue bi
INNER JOIN Members m ON m.member_id = bi.member_id
INNER JOIN Books b ON b.accession_number = bi.accession_number
INNER JOIN Titles t ON t.title_id = b.title_id
WHERE bi.due_date > '2016-08-17';

/*Qu 3:
 Write a SELECT command to display information on the books
that have been returned after their due dates. The information
should include book issue date, title, member name and due
date.
*/

SELECT bi.issue_date , bi.due_date , t.title_name , m.member_name , br.return_date FROM Book_Issue bi
INNER JOIN Members m ON m.member_id = bi.member_id
INNER JOIN Book_Return br ON br.member_id = bi.member_id
INNER JOIN Books b ON b.accession_number = bi.accession_number
INNER JOIN Titles t ON t.title_id = b.title_id
WHERE br.return_date > bi.due_date;

/*QU: 4:
Write a SELECT command to display information of those books
whose price is equal to the most expensive book purchase so far.
*/

SELECT b.accession_number , b.title_id , t.title_name , t.title_type,  b.purchase_date , b.book_price , b.book_status FROM Books b
INNER JOIN Titles t ON t.title_id = b.title_id
WHERE book_price = (SELECT MAX(book_price) FROM Books );

/*Qu: 5
 Write a SELECT command to display the second maximum price
of a book.
*/
SELECT book_price FROM books WHERE book_price = (SELECT DISTINCT(book_price) FROM Books GROUP BY book_price LIMIT 1,1)
