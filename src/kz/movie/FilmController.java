package kz.movie;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/films")
public class FilmController {

    private final FilmRepository filmRepository = new FilmRepository();

    @GetMapping
    public List<Film> getFilms() {
        return filmRepository.getAllFilms();
    }

    @PostMapping
    public String add(@RequestBody Film film) {
        filmRepository.addFilm(film);
        return "The film added!";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable int id, @RequestBody UpdatePriceRequest request) {
        filmRepository.updatePrice(id, request.getPrice());
        return "ID " + id + " Price updated!";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        filmRepository.deleteFilm(id);
        return "ID " + id + " film deleted!";
    }
}
