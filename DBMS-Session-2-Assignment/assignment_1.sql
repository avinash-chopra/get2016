/* use database library */
USE Library;

/*Qu: Write a select command to display all the columns of members table*/

SELECT member_id ,  member_name , member_addressLine1 , member_addressLine2 , member_category FROM Members;

/* Qu: Write a select command to display member name , member id , and category columns*/

SELECT member_id ,  member_name , member_category FROM Members;

/*Qu: Write a select command to display member name , member id , and category where category is F*/

SELECT member_id ,  member_name , member_category FROM Members WHERE member_category='F';

/*Qu: Write a select command to display various categories of members*/

SELECT member_category FROM Members;

/*Qu: Write a select command to display member name and category in descending order of member name*/

SELECT member_name , member_category FROM Members ORDER BY member_name DESC;

/*Qu: Write a select command to display titles and their publishers*/
SELECT title_name ,  publisher_id FROM titles;

/*Qu:  Write a select command to display the number of members present in each category*/
SELECT member_category, COUNT(member_id) as Total
FROM members
GROUP BY member_category;

/*Qu: write a select command to display name of members who belong to the same category as Keshav Sharma*/
SELECT m.member_name FROM Members m
INNER JOIN Members e
ON e.member_name = 'Keshav Sharma' AND m.member_category=e.member_category ;

/*Qu: write a select command to display information on all the books issued*/
SELECT issue_date , accession_number , member_id ,
IFNULL(return_date,'Book Not Returned') as Return_Date  
FROM book_return;
