
/*Qu: 1*/
SELECT member_category , COUNT(*)  FROM Members
GROUP BY member_category;

/*Qu: 2*/
SELECT bi.accession_number , b.title_id , t.title_name , t.title_type , t.title_price FROM Book_issue bi
INNER JOIN Books b ON b.accession_number = bi.accession_number
INNER JOIN Titles t ON t.title_id = b.title_id
GROUP BY bi.accession_number
HAVING COUNT(bi.accession_number) > 2;

/*Qu: 3*/
SELECT b.accession_number , b.title_id ,  b.purchase_date , b.book_price ,  bi.issue_date , m.member_id , m.member_category FROM Book_issue bi 
INNER JOIN Books b ON bi.accession_number = b.accession_number 
INNER JOIN Members m ON m.member_id = bi.member_id
HAVING m.member_category <> 'F';


/*Qu: 4*/
SELECT a.author_id , a.author_lname , a.author_fname , a.author_address , a.author_city , a.author_state FROM Authors a
INNER JOIN Title_Author ta ON ta.author_id = a.author_id
INNER JOIN Books b ON b.title_id = ta.title_id;