SELECT id, name, date_issue, date_finish, description
	FROM public.movies
    WHERE date_issue <= NOW() AND  (date_issue + INTERVAL '15' DAY) > NOW();