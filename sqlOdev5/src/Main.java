/*
1) Select title,length from film
   where title LIKE '%n'
   order by length DESC
   limit 5;


2) select title, length from film
   where title like '%n'
   order by length
   offset 5
   limit 5;

3) select last_name,store_id from customer
   where store_id = 1
   order by last_name DESC
   limit 4 ;
 */