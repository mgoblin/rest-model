package ru.uip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "jsonAccount")
@XmlType(propOrder = {"accountNumber", "accountName", "accountBalance", "accountStatus"})
@XmlAccessorType(XmlAccessType.FIELD)

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class JsonAccount {

    @XmlElement
    @NotBlank
    private String accountNumber;

    @XmlElement
    @NotBlank
    private String accountName;

    @XmlElement
    @DecimalMax("10000.0") @DecimalMin("0.0")
    @NotNull
    private double accountBalance;

    @XmlElement
    @NotNull
    private EnumAccountStatus accountStatus;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public JsonAccount(
            @JsonProperty("accountNumber") String accountNumber,
            @JsonProperty("accountName")String accountName,
            @JsonProperty("accountBalance") double accountBalance,
            @JsonProperty("accountStatus") EnumAccountStatus accountStatus) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        this.accountStatus = accountStatus;
    }
}
