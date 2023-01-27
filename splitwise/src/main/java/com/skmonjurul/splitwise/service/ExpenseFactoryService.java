package com.skmonjurul.splitwise.service;

import com.skmonjurul.splitwise.factory.expense.EqualExpenseFactory;
import com.skmonjurul.splitwise.factory.expense.ExpenseFactory;
import com.skmonjurul.splitwise.factory.expense.PercentageExpenseFactory;
import com.skmonjurul.splitwise.factory.expense.UnequalExpenseFactory;
import com.skmonjurul.splitwise.model.SplitType;

public class ExpenseFactoryService {
    private ExpenseFactory expenseFactory;

    public ExpenseFactory createExpenseFactory(SplitType splitType) {
        switch (splitType) {
            case EQUAL:
                expenseFactory = new EqualExpenseFactory();
                break;
            case UNEQUALLY:
                expenseFactory = new UnequalExpenseFactory();
                break;
            case PERCENTAGE:
                expenseFactory = new PercentageExpenseFactory();
                break;
            default:
                expenseFactory = null;
                break;
        }

        return expenseFactory;
    }
}
