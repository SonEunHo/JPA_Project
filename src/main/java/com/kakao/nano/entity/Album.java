package com.kakao.nano.entity;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue(value = "A")
public class Album extends Item{
    private String artist;
    private String etc;
}
