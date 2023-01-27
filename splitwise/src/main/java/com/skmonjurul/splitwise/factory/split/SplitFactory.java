package com.skmonjurul.splitwise.factory.split;

import com.skmonjurul.splitwise.model.User;
import com.skmonjurul.splitwise.product.split.Split;

public abstract class SplitFactory {

    private Split split;

    public Split getSplit(User user) {
        split = createSplit(user);
        return split;
    }

    protected abstract Split createSplit(User user);
}
