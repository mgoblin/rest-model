package ru.uip.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@EqualsAndHashCode
@ToString
final public class MoneyTransfer {
    @NotBlank
    private final String fromAccountNumber;

    @NotBlank
    private final String toAccountNumber;

    @DecimalMax("10000.0") @DecimalMin("0.0")
    @NotNull
    private final double ammount;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public MoneyTransfer(@JsonProperty("fromAccountNumber") String fromAccountNumber,
                         @JsonProperty("toAccountNumber") String toAccountNumber,
                         @JsonProperty("ammount") double ammount) {
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.ammount = ammount;
    }
}
