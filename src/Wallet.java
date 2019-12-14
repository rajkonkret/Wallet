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
               spendMoney(money);
                break;
            case GR:
                spendMoney(money/100.0);
                break;
            case KILO:
                spendMoney(money*1000);
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
    private void spendMoney(double moneyPLN){
        if (moneyStatePln>= moneyPLN){
            moneyStatePln -= moneyPLN;
        } else {
            System.out.println("Brak kasy misiu\n");
        }
    }
}
