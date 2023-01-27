package com.skmonjurul.splitwise.service;

import com.skmonjurul.splitwise.model.Balance;
import com.skmonjurul.splitwise.model.User;
import com.skmonjurul.splitwise.product.expense.Expense;
import com.skmonjurul.splitwise.product.split.Split;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BalanceService {

    private UserService userService;

    public BalanceService() {
        userService = new UserService();
    }

    public void updateBalance(Expense expense) {
        User paidBy = expense.getPaidBy();
        Map<String, Double> paidByUserBalanceSheet = paidBy.getBalanceSheet();
        Balance paidByUserBalance = paidBy.getBalance();

        for (Split split : expense.getSplitList()) {
            User paidTo = split.getUser();
            String paidToUserId = paidTo.getId();
            if (paidToUserId.equals(paidBy.getId())) continue;

            updateBalanceSheetOfPaidByUser(paidByUserBalanceSheet, paidByUserBalance, paidToUserId, split.getAmount());
            updateBalanceSheetOfPaidToUser(paidTo.getBalanceSheet(), paidTo.getBalance(), paidBy.getId(), split.getAmount());
        }
    }

    private void updateBalanceSheetOfPaidToUser(Map<String, Double> paidToUserBalanceSheet,
                                                       Balance paidToUserBalance,
                                                       String paidByUserId,
                                                       double amount) {
        paidToUserBalance.setOwe(paidToUserBalance.getOwe() + amount);

        if (!paidToUserBalanceSheet.containsKey(paidByUserId)) {
            paidToUserBalanceSheet.put(paidByUserId, 0.0);
        }

        paidToUserBalanceSheet.put(paidByUserId, paidToUserBalanceSheet.get(paidByUserId) - amount);
    }

    private void updateBalanceSheetOfPaidByUser(Map<String, Double> paidByUserBalanceSheet,
                                                       Balance paidByUserBalance,
                                                       String paidToUserId,
                                                       double amount) {

        paidByUserBalance.setGetBack(paidByUserBalance.getGetBack() + amount);

        if (!paidByUserBalanceSheet.containsKey(paidToUserId)) {
            paidByUserBalanceSheet.put(paidToUserId, 0.0);
        }

        paidByUserBalanceSheet.put(paidToUserId, paidByUserBalanceSheet.get(paidToUserId) + amount);

    }

    public void showBalanceForAllUsers(Set<User> userList) {
        userList.forEach(this::showBalance);
    }

    public void showBalance(User user) {
        System.out.println("----------------Balance for " + user.getName() + "------------------------");
        // todo need to show overall owed or get back balance

        Map<String, Double> balanceSheet = user.getBalanceSheet();
        for (Map.Entry<String, Double> entry : balanceSheet.entrySet()) {
            printBalance(user.getName(), userService.findUser(entry.getKey()).getName(), entry.getValue());
        }
        System.out.println();
    }

    private void printBalance(String userName1, String userName2, double amount) {
        if(amount < 0) {
            System.out.println(userName1 + " owes " + userName2 + ": " + Math.abs(amount));
        } else if(amount > 0) {
            System.out.println(userName2 + " owes " + userName1 + ": " + Math.abs(amount));
        }
    }
}
