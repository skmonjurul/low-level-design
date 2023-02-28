package com.skmonjurul.splitwise.strategy;

import com.skmonjurul.splitwise.product.split.PercentageSplit;
import com.skmonjurul.splitwise.product.split.Split;

import java.util.List;

public class PercentageEqualSplitBehaviour implements SplitBehaviour{

    @Override
    public void updateSplitAmount(List<Split> splitList, double amount) {
        for(Split split : splitList) {
            PercentageSplit percentSplit = (PercentageSplit) split;
            split.setAmount((amount * percentSplit.getPercentage()) / 100.0);
        }
    }

    @Override
    public void validate() {

    }
}
