package ru.uip.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "enumAccountStatus")
@XmlEnum
public enum  EnumAccountStatus {
    ACTIVE("active"),
    INACTIVE("inactive");

    private String name;

    EnumAccountStatus(String name) {
        this.name = name;
    }
}
