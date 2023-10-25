package ku.atm;

//รักษิตา รัตนาลังการ 6310450654

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DepositMoneySteps {
    private BankAccount bankAccount;
    private int initialBalance;
    private int depositAmount;

    @Given("^I have a bank account$")
    public void createBankAccount() {
        bankAccount = new BankAccount();
        initialBalance = (int) bankAccount.getBalance();
    }

    @When("^I deposit (\\d+) into my bank account$")
    public void depositMoney(int amount) {
        bankAccount.deposit(amount);
        depositAmount = amount;
    }

    @Then("^the money should be added to my account balance$")
    public void checkBalance() {
        int expectedBalance = initialBalance + depositAmount;
        int actualBalance = (int) bankAccount.getBalance();
        Assert.assertEquals(expectedBalance, actualBalance);
    }
}
