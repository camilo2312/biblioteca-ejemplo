package co.uniquindio.biblioteca.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Ciudad {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue
    private int codigo;
    private String nombre;
}
