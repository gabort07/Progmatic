package com.company.Feladatok.BankKolcson;

public class CreditStatus {

    private boolean isGarantied;
    private boolean needSuccessor;
    private boolean needCoverage;
    private double coverageAmount;
    private double monthlyFee;

    public CreditStatus() {
        this.isGarantied = false;
        this.needSuccessor = false;
        this.needCoverage = false;
        this.coverageAmount = 0;
        this.monthlyFee = 0;
    }

    public boolean isGarantied() {
        return isGarantied;
    }

    public void setGarantied(boolean garantied) {
        isGarantied = garantied;
    }

    public boolean NeedSuccesor() {
        return needSuccessor;
    }

    public void setNeedSuccesor(boolean needSuccessor) {
        this.needSuccessor = needSuccessor;
    }

    public boolean NeedCoverage() {
        return needCoverage;
    }

    public void setNeedCoverage(boolean needCoverage) {
        this.needCoverage = needCoverage;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public boolean isNeedSuccessor() {
        return needSuccessor;
    }

    public void setNeedSuccessor(boolean needSuccessor) {
        this.needSuccessor = needSuccessor;
    }

}
