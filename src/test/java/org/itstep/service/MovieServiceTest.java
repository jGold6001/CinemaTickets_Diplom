package org.itstep.service;

import static org.junit.Assert.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.itstep.App;
import org.itstep.dao.pojo.Movie;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class MovieServiceTest {

	@Autowired
	private MovieService movieService;
	
	private List<Movie> movies;
	private Movie movie;
	
	@Before
	public void setData() {
		Date dateCurrent = new Date(System.currentTimeMillis());
		LocalDate issue_1 = dateCurrent.toLocalDate().minusDays(15);
		LocalDate finish_1 = issue_1.plusMonths(1);
		LocalDate issue_2 = dateCurrent.toLocalDate().plusDays(1);
		LocalDate finish_2 = issue_2.plusMonths(1);
		LocalDate issue_3 = dateCurrent.toLocalDate().minusDays(5);
		LocalDate finish_3 = issue_3.plusMonths(1);
		
		movies = Arrays.asList(
				new Movie("Бегущий по лезвию 2049", "ТРИЛЛЕР, ФАНТАСТИКА", 
						"Сиквел шедевра 1982 года «Бегущий по лезвию бритвы», который под отеческим присмотром Ридли Скотта снимет отличный режиссер Дени Вильнев. Сюжет развернется спустя несколько лет",
						2017, 163, "18+", "США, Канада, Великобритания", "Дени Вильнев", 
						"Райан Гослинг, Харрисон Форд, Джаред Лето, Дейв Баутиста", 
						"https://youtu.be/dreF80r7F14", Date.valueOf(issue_1), Date.valueOf(finish_1) ),
				new Movie("My Little Pony в кино", "МУЛЬТФИЛЬМ, ПРИКЛЮЧЕНИЕ, КОМЕДИЯ, МУЗЫКАЛЬНЫЙ", 
						"Шестерка любимых героев — Эпплджек, Сумеречная Искорка, Флаттершай, Пинки Пай, Рарити и Радуга Дэш — теперь на большом экране! Король Шторм хочет лишить пони магии и захватывает Кантерлот. Под угрозой будущее всей Эквестрии! Чтобы остановить злодея, пони покидают родные края и отправляются в путешествие, полное чудес и опасностей. Им предстоит покорить волшебные горы, погрузиться в подводные миры и даже оказаться на летучем пиратском корабле!",
						 2017, 99, "6+", "США, Канада", "Джейсон Тиссен", null, 
						 "https://youtu.be/uVORfWM1_9E", Date.valueOf(issue_2), Date.valueOf(finish_2)),
				new Movie("Салют-7", "ДРАМА",
						"1985 год, Советская космическая станция «Салют-7», находящаяся на орбите в беспилотном режиме, неожиданно перестает отвечать на сигналы, посылаемые из центра управления полетом. Падение станции, являющейся гордостью советской науки и космонавтики, может обернуться не только потерей имиджа страны, но и трагедией с человеческими жертвами. Чтобы узнать причины аварии и предотвратить катастрофу, необходимо отправить на орбиту людей. Однако никто никогда не стыковался в космосе с неуправляемым объектом. Полет к станции «Салют-7» до сих пор считается с технической точки зрения самым сложным в истории мировой космонавтики.",
						2017, 111, "12+", "Россия", "Клим Шипенко", 
						"Владимир Вдовиченков, Павел Деревянко, Мария Миронова, Оксана Фандера",
						"https://youtu.be/XY8eYVXJO8g", Date.valueOf(issue_3), Date.valueOf(finish_3))
				);
		movie = movies.get(0);
	}
	
	@Test
	public void testCreateOrUpdate() {
//		Movie movieInDb = movieService.createOrUpdate(movie);
//		assertEquals(movie.getId(), movieInDb.getId());
	}
//
//	
//	@Test
//	public void testGetOne() {
//		Movie movieInDb = movieService.getOne(movie.getName());
//		assertEquals(movie.getName(), movieInDb.getName());
//		movieService.delete(movieInDb.getId());
//	}
//	
//
//	@Test
//	public void testGetAll() {
//		for (Movie item : movies) {
//			movieService.createOrUpdate(item);
//		}
//		List<Movie> listInDb = movieService.getAll();
//		assertEquals(movies.size(), listInDb.size());
//	}
//
//	@Test
//	public void testFindAllPremiere() {
//		
//	}

}
