package com.skmonjurul.splitwise.strategy;

import com.skmonjurul.splitwise.product.split.Split;

import java.util.List;

public class UnEqualSplitBehaviour implements SplitBehaviour {
    @Override
    public void updateSplitAmount(List<Split> splitList, double amount) {
        // do nothing
        // no need to update as already updated
    }

    @Override
    public void validate() {

    }
}
