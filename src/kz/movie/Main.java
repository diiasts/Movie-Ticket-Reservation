package kz.movie; // Папканың аты осылай болуы керек

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// Мұнда біз Spring-ке базаны автоматты түрде қоспа дедік (exclude),
// өйткені сенде өз бетіңше жазылған DbConnection.java бар.
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Main {
    public static void main(String[] args) {
        // Бағдарламаны іске қосу
        SpringApplication.run(Main.class, args);

        System.out.println("\n=======================================");
        System.out.println("СЕРВЕР СӘТТІ ІСКЕ ҚОСЫЛДЫ!");
        System.out.println("Мәліметтерді мына жерден қараңыз:");
        System.out.println("http://localhost:8080/api/films");
        System.out.println("=======================================");
    }
}