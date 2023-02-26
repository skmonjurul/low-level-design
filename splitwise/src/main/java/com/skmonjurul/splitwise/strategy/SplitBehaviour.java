package com.skmonjurul.splitwise.strategy;

import com.skmonjurul.splitwise.product.split.Split;

import java.util.List;

public interface SplitBehaviour {
    void updateSplitAmount(List<Split> splitList, double amount);
    void validate();
}
