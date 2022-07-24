package _04_WhyClassesAreNeeded;

public class Converter {

    double rateUSD = 78.5;
    double rateEUR = 88.7;
    double rateJPY = 0.75;

    public Converter(double rateUSD, double rateEUR, double rateJPY) {
        this.rateUSD = rateUSD;
        this.rateEUR = rateEUR;
        this.rateJPY = rateJPY;
    }

    public void convert(double roubles, int currency) {
        //System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
        if (currency == 1) {
            System.out.println("Ваши сбережения в долларах: " + roubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("Ваши сбережения в евро: " + roubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("Ваши сбережения в иенах: " + roubles / rateJPY);
        } else {
            System.out.println("Неизвестная валюта");
        }
    }
}
