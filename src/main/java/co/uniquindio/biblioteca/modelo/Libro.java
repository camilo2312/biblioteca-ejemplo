package co.uniquindio.biblioteca.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Libro {

    @Id
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    private String isbn;
    private String nombre;
    private int unidades;
    private int anio;
    @Enumerated(EnumType.STRING)
    private Genero genero;
}
