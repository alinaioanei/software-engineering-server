package io.alin.aioanei.sE.server.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@NoArgsConstructor
@Data
public abstract class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;
}
