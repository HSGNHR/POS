package command_bank;

public class DepositCommand implements Command {
    
    private BankAccount account;

    public DepositCommand(BankAccount a){
        account = a;
    }
    public void execute(){
        account.deposit();
    }
}

