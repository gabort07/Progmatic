package com.company.Feladatok.BankKolcson;

public class CreditRequest {
    private String appplicant;
    private boolean isVip;
    private int creditAmount;
    private int period;
    CreditStatus status;

    public CreditRequest(String name, boolean isVip, int creditAmount, int period) {
        this.appplicant = name;
        this.isVip = isVip;
        this.creditAmount = creditAmount;
        this.period = period;
        this.status = new CreditStatus();
    }

    public boolean isVip() {
        return isVip;
    }

    public int getCreditAmount() {
        return creditAmount;
    }

    public int getPeriod() {
        return period;
    }

    public String getAppplicant() {
        return appplicant;
    }

}
