package com.skmonjurul.splitwise.service;

import com.skmonjurul.splitwise.factory.split.EqualSplitFactory;
import com.skmonjurul.splitwise.factory.split.PercentageSplitFactory;
import com.skmonjurul.splitwise.factory.split.SplitFactory;
import com.skmonjurul.splitwise.factory.split.UnequalSplitFactory;
import com.skmonjurul.splitwise.model.SplitType;

public class SplitFactoryService {

    public static SplitFactory createSplitFactory(SplitType splitType) {
        switch (splitType) {
            case EQUAL:
                return new EqualSplitFactory();
            case UNEQUALLY:
                return new UnequalSplitFactory();
            case PERCENTAGE:
                return new PercentageSplitFactory();
            default:
                return null;
        }
    }
}
