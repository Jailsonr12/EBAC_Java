package main.java.br.com.ebac.client_service.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "clients")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private String email;

    private String document; // CPF/CNPJ, for example
}
