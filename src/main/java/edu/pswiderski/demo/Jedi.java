package edu.pswiderski.demo;

import java.time.LocalDate;

public record Jedi(
        String name,
        String height,
        LocalDate birthDate
) {
}
