package ru.uip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class JsonAccountNumber {

    @NotBlank
    private String accountNumber;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public JsonAccountNumber(@JsonProperty("accountNumber") String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
