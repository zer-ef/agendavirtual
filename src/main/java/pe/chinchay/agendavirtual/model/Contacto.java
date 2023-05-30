package pe.chinchay.agendavirtual.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontacto")
    private Integer id;

    @NotBlank(message = "Este campo es Obligatorio")
    private String nombre;

    @PastOrPresent(message = "Este cambo no debe estar en futuro")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fechanac")
    private LocalDate fechaNacimiento;

    @Size(max = 15, message = "El valor debe tener 15 caracteres como maximo.")
    private String celular;

    @Email(message = "El formato no es de email.")
    private String email;

    @Column(name = "fechareg")
    private LocalDateTime fechaRegistro;

}
