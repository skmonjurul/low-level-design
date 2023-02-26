package com.skmonjurul.splitwise.strategy;

import com.skmonjurul.splitwise.product.split.Split;

import java.util.List;

public abstract class Expense {
    protected SplitBehaviour splitBehaviour;

    public void updateSplitAmount(List<Split> splitList, double amount) {
        splitBehaviour.updateSplitAmount(splitList, amount);
    }
    public void validate() {
        splitBehaviour.validate();
    }
}
