SELECT id, name, date_issue, date_finish, description
	FROM MOVIES 
    WHERE '2017-10-20' >= date_issue  AND '2017-10-20' < date_finish