package command_bank;

public class Start{
    public static void main(String args[]) {
        BankAccount test_account = new BankAccount();
        WithdrawalCommand test_Withdrawal = new WithdrawalCommand(test_account);
        Button test_Button = new Button(test_Withdrawal);

        test_Button.press();

        DepositCommand test_Deposit = new DepositCommand(test_account);        
        test_Button = new Button(test_Deposit);

        test_Button.press();
    }
}

