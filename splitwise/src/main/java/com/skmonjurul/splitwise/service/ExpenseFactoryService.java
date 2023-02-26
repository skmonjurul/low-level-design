package com.skmonjurul.splitwise.service;

import com.skmonjurul.splitwise.factory.expense.EqualExpenseFactory;
import com.skmonjurul.splitwise.factory.expense.ExpenseFactory;
import com.skmonjurul.splitwise.factory.expense.PercentageExpenseFactory;
import com.skmonjurul.splitwise.factory.expense.UnequalExpenseFactory;
import com.skmonjurul.splitwise.model.SplitType;
import com.skmonjurul.splitwise.strategy.EqualSplitBehaviour;
import com.skmonjurul.splitwise.strategy.PercentageEqualSplitBehaviour;
import com.skmonjurul.splitwise.strategy.UnEqualSplitBehaviour;

public class ExpenseFactoryService {
    private ExpenseFactory expenseFactory;

    public ExpenseFactory createExpenseFactory(SplitType splitType) {
        switch (splitType) {
            case EQUAL:
                expenseFactory = new EqualExpenseFactory(new EqualSplitBehaviour());
                break;
            case UNEQUALLY:
                expenseFactory = new UnequalExpenseFactory(new UnEqualSplitBehaviour());
                break;
            case PERCENTAGE:
                expenseFactory = new PercentageExpenseFactory(new PercentageEqualSplitBehaviour());
                break;
            default:
                expenseFactory = null;
                break;
        }

        return expenseFactory;
    }
}
