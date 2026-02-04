package kz.movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/films")
public class FilmController {

    // Біздің базамен жұмыс істейтін репозиторийіміз
    private final FilmRepository filmRepository = new FilmRepository();

    @GetMapping
    public List<Film> getAllFilms() {
        // Базадан барлық фильмдерді алып, тізім ретінде қайтарамыз
        // Spring оны автоматты түрде JSON қылып береді
        return filmRepository.getAllFilms();
    }
}
