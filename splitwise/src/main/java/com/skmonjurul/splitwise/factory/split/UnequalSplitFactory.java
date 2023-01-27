package com.skmonjurul.splitwise.factory.split;

import com.skmonjurul.splitwise.factory.split.SplitFactory;
import com.skmonjurul.splitwise.model.User;
import com.skmonjurul.splitwise.product.split.Split;
import com.skmonjurul.splitwise.product.split.UnequalSplit;

public class UnequalSplitFactory extends SplitFactory {

    @Override
    protected Split createSplit(User user) {
        return new UnequalSplit(user);
    }
}
