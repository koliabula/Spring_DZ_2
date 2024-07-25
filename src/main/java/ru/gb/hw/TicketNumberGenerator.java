package ru.gb.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketNumberGenerator {
//    Класс TicketNumberGenerator - бин (синглтон), у которого есть метод createNewNumber()
//     Метод createNewNumber возвращает строки вида "Ticket #X", где X - UUID (UUID.randomUUID().toString())
//    Пример:
//    * TicketNumberGenerator generator = context.getBean(TicketNumberGenerator.class);
//   * System.out.println(generator.createNewNumber()); // "Ticket #b0b3a25d-2135-4b18-9dec-08d494b96b06"
//   * System.out.println(generator.createNewNumber()); // "Ticket #379c5673-50c3-4daf-a53f-a396a3d34535"
//   * System.out.println(generator.createNewNumber()); // "Ticket #b4cc4e55-69b2-4c49-867f-09735fea292a"
    private int idTicket;

//    @Autowired
//    public TicketNumberGenerator() {
//        this.idTicket = idTicket;
//    }

    public String createNewNumber(){
        return "Ticket: " + ++idTicket;
    }

}
