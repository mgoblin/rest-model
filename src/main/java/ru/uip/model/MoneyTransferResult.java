package ru.uip.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@EqualsAndHashCode
@ToString
final public class MoneyTransferResult {
    @NotNull
    private final JsonAccount from;

    @NotNull
    private final JsonAccount to;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public MoneyTransferResult(
            @JsonProperty("from") JsonAccount from,
            @JsonProperty("to") JsonAccount to) {
        this.from = from;
        this.to = to;
    }
}
