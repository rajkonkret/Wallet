public class Main {
    public static void main(String[] args) {

        Wallet wallet = new Wallet();

        wallet.addMoney(100, MoneyType.PLN);
        wallet.addMoney(1001, MoneyType.PLN);
        wallet.spendSomeMoney(980 , MoneyType.GR);

        System.out.println(wallet.toPrint());

        wallet.spendSomeMoney(230980 , MoneyType.PLN);
        System.out.println(wallet.toPrint());

    }
}
