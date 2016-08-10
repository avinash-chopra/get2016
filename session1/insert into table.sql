SET @publisher_id = '1',@publisher_name='New Moon Books',@publisher_city='Boston';

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values (@publisher_id,@publisher_name,@publisher_city);

SET @publisher_id = '2',@publisher_name='Binnet and Hardely',@publisher_city='Washington';

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values (@publisher_id,@publisher_name,@publisher_city);

SET @publisher_id = '3',@publisher_name='Algo Publishers',@publisher_city='Berkeley';

Insert Into Publishers (publisher_id,publisher_name,publisher_city)
Values (@publisher_id,@publisher_name,@publisher_city);