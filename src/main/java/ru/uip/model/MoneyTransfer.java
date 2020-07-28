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

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "moneyTransfer")
@XmlType(propOrder = {"fromAccountNumber", "toAccountNumber", "amount"})
@XmlAccessorType(XmlAccessType.FIELD)

@Getter
@EqualsAndHashCode
@ToString
final public class MoneyTransfer {
    @XmlElement
    @NotBlank
    private final String fromAccountNumber;

    @XmlElement
    @NotBlank
    private final String toAccountNumber;

    @XmlElement
    @DecimalMax("10000.0") @DecimalMin("0.0")
    @NotNull
    private final double amount;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public MoneyTransfer(@JsonProperty("fromAccountNumber") String fromAccountNumber,
                         @JsonProperty("toAccountNumber") String toAccountNumber,
                         @JsonProperty("amount") double amount) {
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
    }
}
