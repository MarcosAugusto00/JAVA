package exercicio;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("20/07/2024", fmt01);
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04.format(fmt01));
		System.out.println(d01.format(fmt01));
		System.out.println(d02.format(fmt02));
		System.out.println(fmt03.format(d03));
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		System.out.println(r1);
		LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println(fmt03.format(r2));
		System.out.println(d04.getDayOfMonth());
		LocalDate semanaPassada = d04.minusDays(7);
		LocalDate proximaSemana = d04.plusDays(7);
		System.out.println("Semana passada: " + semanaPassada);
		System.out.println("Proxima semana: " + proximaSemana);
		Instant semanaPassada1 = d03.minus(7, ChronoUnit.DAYS);
		Instant proximaSemana1 = d03.plus(7, ChronoUnit.DAYS);
		System.out.println("Semana passada: " + semanaPassada1);
		System.out.println("Proxima semana: " + proximaSemana1);
		Duration t1 = Duration.between(semanaPassada1, proximaSemana1);
		System.out.println(t1.toDays());
		Duration t2 = Duration.between(semanaPassada.atTime(0, 0), d01.atTime(0, 0));
		System.out.println(t2.toDays());
		Duration t3 = Duration.between(semanaPassada.atStartOfDay(), d01.atStartOfDay());
		System.out.println(t3.toDays());
	}

}
