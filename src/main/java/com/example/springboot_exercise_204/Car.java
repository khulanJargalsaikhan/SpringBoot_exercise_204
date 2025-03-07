package com.example.springboot_exercise_204;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
    @NotNull
    @Size(min = 1, message = "Enter car name")
    private String name;
    @NotNull
    @Size(min = 1, message = "Enter car type")
    private String type;
    @NotNull
    @Size(min = 1, message = "Enter car description")
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
