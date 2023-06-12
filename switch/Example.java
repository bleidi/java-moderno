import java.time.LocalDate;

import static java.time.DayOfWeek.*;

/**
 * 
 * 
 */
public class Example {

    public static void main(String[] args) {
        var diaDaSemana = LocalDate.now().plusDays(2L).getDayOfWeek();

        var result = switch (diaDaSemana) {
            case  MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY: yield "Estou na escola 🏫";
            case SATURDAY, SUNDAY: yield "Solto pipa 🪁 && Jogo bola ⚽";
            default: yield "💔";
         };

         System.out.println(result);
    }

    public static void antigo() {
        var diaDaSemana = LocalDate.now().getDayOfWeek();

        String result;
        switch (diaDaSemana) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                result = "Estou na escola 🏫";
                break;
            case SATURDAY:
            case SUNDAY:
                result = "Solto pipa 🪁 && Jogo bola ⚽";
                break;
            default:
                result = "💔";
                break;
        }

        System.out.println(result);
    }
    
}
