package command_bank;

public class WithdrawalCommand implements Command {
    private BankAccount account;

    public WithdrawalCommand(BankAccount a){
       account = a; 
    }
    public void execute(){
        account.withdrawal();
    }
}
