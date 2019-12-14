public class Main {
    public static void main(String[] args) {

        Wallet wallet = new Wallet();

        wallet.addMoney(100, MoneyType.PLN);

        wallet.toPrint();
    }
}
