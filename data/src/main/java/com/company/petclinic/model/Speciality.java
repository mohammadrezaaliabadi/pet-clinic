package com.company.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "specialties")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Speciality extends BaseEntity {
    @Column(name ="description" )
    private String description;
}
