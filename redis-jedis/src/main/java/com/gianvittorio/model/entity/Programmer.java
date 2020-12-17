package com.gianvittorio.model.entity;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Programmer implements Serializable {
    private int id;

    private String company;

    private String name;
}
