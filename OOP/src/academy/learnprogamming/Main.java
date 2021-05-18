package academy.learnprogamming;

public class Main {

    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("Carrera");
//        System.out.println(porsche.getModel());
        BankAccount chrisAccount = new BankAccount();
        chrisAccount.setAccountNumber(1);
        chrisAccount.setBalance(1000);
        chrisAccount.setCustomerName("Chris Owens");
        chrisAccount.setEmail("cowensdev@gmail.com");
        chrisAccount.setPhoneNumber("804-387-4597");

        System.out.println(chrisAccount.getAccountNumber());
        System.out.println(chrisAccount.getBalance());
        System.out.println(chrisAccount.getCustomerName());
        System.out.println(chrisAccount.getEmail());
        System.out.println(chrisAccount.getPhoneNumber());

        System.out.println(chrisAccount.depositFunds(1000));
        System.out.println(chrisAccount.getBalance());

        System.out.println(chrisAccount.withdrawFunds(3000));
        System.out.println(chrisAccount.getBalance());

        System.out.println(chrisAccount.withdrawFunds(1000));

    }
}
