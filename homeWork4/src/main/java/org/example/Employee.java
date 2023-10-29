package org.example;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private int cardId;
    private long phone;
    private String name;
    private int expLevel;

    public Employee(long phone, String name, int expLevel) {
        this.phone = phone;
        this.name = name;
        this.expLevel = expLevel;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpLevel() {
        return expLevel;
    }

    public void setExpLevel(int expLevel) {
        this.expLevel = expLevel;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "cardId=" + cardId +
                ", phone=" + phone +
                ", name='" + name + '\'' +
                ", expLevel=" + expLevel +
                '}';
    }
}
