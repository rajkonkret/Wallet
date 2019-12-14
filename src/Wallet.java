import java.util.stream.Stream;

public class Wallet {
    private double moneyStatePln;

    Wallet() {
        this.moneyStatePln = 0.0;
    }

    void addMoney(int money, MoneyType type) {

        switch (type) {
            case PLN:
                moneyStatePln += money;
                break;
            case GR:
                moneyStatePln += money / 100.0;
                break;
            case KILO:
                moneyStatePln += money * 1000.0;
                break;
            default:
                System.out.println("Błędny rodzaj pieniądza");
        }

    }

    void spendSomeMoney(int money, MoneyType type) {

        switch (type) {
            case PLN:
                moneyStatePln -= money;
                break;
            case GR:
                moneyStatePln -= money / 100.0;
                break;
            case KILO:
                moneyStatePln -= money * 1000.0;
                break;
            default:
                System.out.println("Błędny rodzaj pieniądza");
        }

    }

    String toPrint() {
        return MoneyType.GR +": " + moneyStatePln*100 +"\n" +
                MoneyType.PLN + ": " + moneyStatePln + "\n" +
                MoneyType.KILO + ": " + moneyStatePln/1000.0;
//        return String.valueOf(moneyStatePln);
//        //return Double.toString(moneyStatePln);
//        // return " " + moneyStatePln;
        //
    }
}
