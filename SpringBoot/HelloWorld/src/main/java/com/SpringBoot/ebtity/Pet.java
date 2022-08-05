package com.SpringBoot.ebtity;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
public class Pet {
    private String name;
    private Double weight;
}
