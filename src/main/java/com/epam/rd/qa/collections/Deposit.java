package com.epam.rd.qa.collections;

import java.math.BigDecimal;

public abstract class Deposit implements Comparable<Deposit>{

    protected final BigDecimal amount;
    protected final int period;

    public Deposit (BigDecimal depositAmount, int depositPeriod) {
        if(depositPeriod<=0 || depositAmount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException();
        }
        this.amount = depositAmount;
        this.period = depositPeriod;
    }

    public BigDecimal getAmount() { return amount; }

    public int getPeriod() { return period; }

    abstract BigDecimal income();

    @Override
    public int compareTo(Deposit other) {

        return this.amount.compareTo (other.getAmount());

    }

    public BigDecimal totalIncome() {
        return getAmount().add(income());
    }


}
