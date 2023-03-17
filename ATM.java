import java.util.Scanner;
  class ATM
{
    public static void main(String args[]){
        int balance = 100000,withdraw, deposit, TransferAmount;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Account User Id:");
            String AccountHolder = in.nextLine();
            System.out.println("Enter Your pin number:");
            int  pin_No = in.nextInt();
            if (pin_No!=3540){
                System.out.println("Wrong pin Number!!");
                System.exit(0);
            }
            if(pin_No == 3540){
                while(true){
                    System.out.println("******************");
                    System.out.println("**WELCOME *****");
                    System.out.println("Choose 1 for Withdraw");
                    System.out.println("Choose 2 for Deposit");
                    System.out.println("Choose 3 for Check Balance");
                    System.out.println("Choose 4 to trqansfer money");
                    System.out.println("Choose 5  to Quit");
                    System.out.println("Choose the operation you want to perform:");
                    int choice = in.nextInt();
                    System.out.println("******************************");
                    switch(choice){
                        case 1 :
                        System.out.println("Account Holder Name:"+AccountHolder);
                        System.out.println("Enter money to be withdrawn");
                        withdraw = in.nextInt();
                        if (balance >= withdraw){
                            balance = balance -withdraw;
                            System.out.println("please collect your money:");
                            System.out.println("your balance is"+balance);
                        }
                        else {
                            System.out.println("Insufficient balance");
                        }
                        System.out.println("");
                        break;
                        case 2:
                        System.out.println("Account Holder Namre:"+AccountHolder);
                        System.out.println("Enter money to be deposited:");
                        deposit = in.nextInt();

                        balance = balance+ deposit;
                        System.out.println("Your money has been successfully deposited:");
                        System.out.println("Your balance is "+ balance);
                        System.out.println("");
                        break;
                        case 3:
                        System.out.println("Account Holder Name:"+AccountHolder);
                        System.out.println("Balance:"+balance);
                        System.out.println("");
                        break;
                        case 4:
                        System.out.println("Account Holder Name:"+AccountHolder);
                        System.out.println("Enter the amount to transfer:");
                        TransferAmount = in.nextInt();
                        balance -= TransferAmount;
                        System.out.println("Transfer is done Successfully:");
                        System.out.println("Available balance:"+balance);
                        case 5:
                        System.exit(0);
                      }  
                 }

              }
        }

    }
}