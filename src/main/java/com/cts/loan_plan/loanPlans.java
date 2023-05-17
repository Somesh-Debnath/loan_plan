package com.cts.loan_plan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class loanPlans {
    //map entity class to database table
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int PlanId;
    private String PlanName;
    private int LoanTypeId;
    private int PrincipalAmount;
    private int Tenure;
    private int InterestRate;
    private int EMI;
    private int InterestAmount;
    private int TotalPayable;
    
    public int getPlanId() {
        return PlanId;
    }
    public void setPlanId(int planId) {
        PlanId = planId;
    }
    public String getPlanName() {
        return PlanName;
    }
    public void setPlanName(String planName) {
        PlanName = planName;
    }
    public int getLoanTypeId() {
        return LoanTypeId;
    }
    public void setLoanTypeId(int loanTypeId) {
        LoanTypeId = loanTypeId;
    }
    public int getPrincipalAmount() {
        return PrincipalAmount;
    }
    public void setPrincipalAmount(int principalAmount) {
        PrincipalAmount = principalAmount;
    }
    public int getTenure() {
        return Tenure;
    }
    public void setTenure(int tenure) {
        Tenure = tenure;
    }
    public int getInterestRate() {
        return InterestRate;
    }
    public void setInterestRate(int interestRate) {
        InterestRate = interestRate;
    }
    public int getEMI() {
        return EMI;
    }
    public void setEMI(int eMI) {
        EMI = eMI;
    }
    public int getInterestAmount() {
        return InterestAmount;
    }
    public void setInterestAmount(int interestAmount) {
        InterestAmount = interestAmount;
    }
    public int getTotalPayable() {
        return TotalPayable;
    }
    public void setTotalPayable(int totalPayable) {
        TotalPayable = totalPayable;
    }
    public int getPlanValidity() {
        return PlanValidity;
    }
    public void setPlanValidity(int planValidity) {
        PlanValidity = planValidity;
    }
    public int getPlanAddedOn() {
        return PlanAddedOn;
    }
    public void setPlanAddedOn(int planAddedOn) {
        PlanAddedOn = planAddedOn;
    }
    private int PlanValidity;
    private int PlanAddedOn;

