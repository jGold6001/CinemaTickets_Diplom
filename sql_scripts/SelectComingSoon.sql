SELECT id, name, date_finish, date_issue, description
	FROM MOVIES 
    WHERE DATE_ISSUE > NOW()