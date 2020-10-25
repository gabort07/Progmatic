package com.company.Feladatok.BankKolcson;

public class CreditCalculator {

    private final int vipMax = 50000000;
    private final int vipFastMoney = 3000000;
    private final int vipSuccessorBorder = 20000000;
    private final int normalMax = 20000000;
    private final int normalFastMoney = 500000;
    private final int normalSuccessorBorder = 3000000;
    private final double vipFee = 0.4;
    private final double normalFee = 0.5;

    public void considerRequest(CreditRequest request, CreditStatus status) {
        if (request.isVip()) {
            inspectVipRequest(request, status);
        } else if (!request.isVip()) {
            inspectNormalRequest(request, status);
        }
    }

    public void inspectVipRequest(CreditRequest request, CreditStatus status) {
        if (request.getCreditAmount() <= vipFastMoney) {
            status.setGarantied(true);
            status.setNeedSuccesor(false);
            status.setNeedCoverage(false);
            status.setCoverageAmount(0);
            status.setMonthlyFee(calculateVipFee(request));
        } else if (request.getCreditAmount() <= vipSuccessorBorder) {
            status.setGarantied(true);
            status.setNeedSuccesor(false);
            status.setNeedCoverage(true);
            status.setCoverageAmount(request.getCreditAmount() * 0.8);
            status.setMonthlyFee(calculateVipFee(request));
        } else if (request.getCreditAmount() <= vipMax) {
            status.setGarantied(true);
            status.setNeedSuccesor(true);
            status.setNeedCoverage(true);
            status.setCoverageAmount(request.getCreditAmount() * 0.7);
            status.setMonthlyFee(calculateVipFee(request));
        } else {
            status.setGarantied(false);
        }
    }

    public void inspectNormalRequest(CreditRequest request, CreditStatus status) {
        if (request.getCreditAmount() <= normalFastMoney) {
            status.setGarantied(true);
            status.setNeedSuccesor(false);
            status.setNeedCoverage(false);
            status.setCoverageAmount(0);
            status.setMonthlyFee(calculateNormalFee(request));
        } else if (request.getCreditAmount() <= normalSuccessorBorder) {
            status.setGarantied(true);
            status.setNeedSuccesor(false);
            status.setNeedCoverage(true);
            status.setCoverageAmount(request.getCreditAmount() * 0.8);
            status.setMonthlyFee(calculateVipFee(request));
        } else if (request.getCreditAmount() <= normalMax) {
            status.setGarantied(true);
            status.setNeedSuccesor(true);
            status.setNeedCoverage(true);
            status.setCoverageAmount(request.getCreditAmount() * 0.8);
            status.setMonthlyFee(calculateVipFee(request));
        } else {
            status.setGarantied(false);
        }
    }

    public double calculateVipFee(CreditRequest request) {
        double correctFee = vipFee + ((request.getPeriod() - 12) * 0.002);
        return (request.getCreditAmount() + (request.getCreditAmount() * correctFee)) / 12;
    }

    public double calculateNormalFee(CreditRequest request) {
        double correctFee = normalFee + ((request.getPeriod() - 12) * 0.003);
        return (request.getCreditAmount() + (request.getCreditAmount() * correctFee)) / 12;
    }


}
