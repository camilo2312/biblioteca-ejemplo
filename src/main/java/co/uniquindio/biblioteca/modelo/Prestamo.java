package co.uniquindio.biblioteca.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Prestamo {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue
    private int codigo;
    private Date fechaCreacion;
    private Date fechaDevolucion;
}
