package io.alin.aioanei.sE.server.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sE_users")
@NoArgsConstructor
@Data
public class User extends Base{

    @Column
    @NotNull
    private String username;

    @Column(length = 65)
    @NotNull
    @Size(min = 4, max = 10, message = "Size must be between 4 and 10 characters")
    private String password;

    @Column
    @NotNull
    private String email;
}
