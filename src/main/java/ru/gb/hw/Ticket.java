package ru.gb.hw;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Ticket {
//    * 2. Создать класс Ticket (не бин!!!) с полями:
//    * 2.1. String number - номер тикета
//   * 2.2. LocalDateTime createdAt - дата создания
//   * 2.3. ... (любые другие поля)

    private String number;
    private LocalDateTime createdAt;
    private int window;

    public Ticket(String number, LocalDateTime createdAt) {
        this.number = number;
        this.createdAt = createdAt;
        this.window = ThreadLocalRandom.current().nextInt(1, 11);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number='" + number + '\'' +
                ", createdAt=" + createdAt +
                ", window='" + window + '\'' +
                '}';
    }
}
