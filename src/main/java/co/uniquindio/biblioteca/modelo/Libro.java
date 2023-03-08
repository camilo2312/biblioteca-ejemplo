package co.uniquindio.biblioteca.modelo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Libro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String isbn;
    @Column(length = 100, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int unidades;
    @Column(nullable = false)
    private int anio;
    @Enumerated(EnumType.STRING)
    private Genero genero;
}
