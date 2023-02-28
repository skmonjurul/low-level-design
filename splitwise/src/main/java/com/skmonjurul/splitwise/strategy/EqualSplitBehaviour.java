package com.skmonjurul.splitwise.strategy;

import com.skmonjurul.splitwise.product.split.Split;

import java.util.List;

public class EqualSplitBehaviour implements SplitBehaviour {
    @Override
    public void updateSplitAmount(List<Split> splitList, double amount) {
        //todo need to update the split amount in each split
        // we can go by using an Interface also where we will mention this method
        // updateSplitAmount whoever needs to update split amount they can just
        // implement this method as we dont need this method in UnequalExpenseFactory
        int totalSplits = splitList.size();
        double splitAmount = ((double) Math.round(amount * 100 / totalSplits)) / 100.0;
        for (Split split : splitList) {
            split.setAmount(splitAmount);
        }
        splitList.get(0).setAmount(splitAmount + (amount - splitAmount * totalSplits));
    }

    @Override
    public void validate() {

    }
}
