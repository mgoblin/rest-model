package ru.uip.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="accounts")
@XmlType(propOrder = {"accounts"})
@XmlAccessorType(XmlAccessType.FIELD)
public class JsonAccountList {
    @XmlElement(name="account")
    private List<JsonAccount> accounts;

    public JsonAccountList(List<JsonAccount> accounts) {
        this.accounts = accounts;
    }

    public JsonAccountList() {
    }

    public List<JsonAccount> getAccounts() {
        return accounts;
    }
}
