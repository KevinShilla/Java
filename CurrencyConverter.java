import java.util.Scanner;

public class CurrencyConverter {
double convert;

public void Tanzanian_USD(double money_USD) {
    convert = money_USD * 0.00043; 
    System.out.print("$ ");
    System.out.println(convert);
}

public double Tanzanian_Canadian(double money_Canadian) {
    convert = money_Canadian * 0.00056;
    return convert;
}

public void USD_Tanzanian(double money_Tanzanian) {
    convert = money_Tanzanian * 2335.69;
    System.out.print("TSH ");
    System.out.println(convert);
}

public void USD_Candanian(double money_Canadian) {
    convert = money_Canadian * 1.30;
    System.out.print("CAD ");
    System.out.println(convert);
}

public void CAD_Tanzanian(double money_Tanzanian) {
    convert = money_Tanzanian * 1798.28;
    System.out.print("TSH ");
    System.out.println(convert);
}

public void CAD_USD(double money_USD) {
    convert = money_USD * 0.77;
    System.out.print("USD ");
    System.out.println(convert);
}
    public static void main(String[] args) {
        System.out.println("Welcome to the Currency Converter!");
        System.out.println("----------------------------------");
        System.out.println("");

        System.out.println("Currency from: ");
        System.out.println("1 - Tanzanian Shillings ");
        System.out.println("2 - U.S Dollar");
        System.out.println("3 - Canadian");

        try (Scanner answer = new Scanner(System.in)) {
            int Converter = answer.nextInt();
            
            if(Converter == 1) {
                System.out.println("What do you want your Tanzanian Shllings to convert to: ");
                System.out.println("1 - U.S Dollar");
                System.out.println("2 - Canadian");

                try (Scanner tz_ = new Scanner(System.in)) {
                    int tz_to = tz_.nextInt();

                    if (tz_to == 1) {
                    System.out.print("Convert TSH: ");

                    try (Scanner TZ = new Scanner(System.in)) {
                        double TZ_Converter = TZ.nextInt();

                        CurrencyConverter money = new CurrencyConverter();
                        money.Tanzanian_USD(TZ_Converter);
                    }
                    }

                        else if (tz_to == 2) {
                            System.out.print("Convert TSH: ");
                            try (Scanner TZ = new Scanner(System.in)) {
                                double TZ_Converter = TZ.nextInt();

                                CurrencyConverter money = new CurrencyConverter();
                                System.out.print("CAD");
                                System.out.println(money.Tanzanian_Canadian(TZ_Converter));
                            }
                        }
                }
            }

                if(Converter == 2) {
                    System.out.println("What do you want your U.S Dollar to convert to: ");
                    System.out.println("1 - Tanzanian Shillings");
                    System.out.println("2 - Canadian");

                    try (Scanner USD_ = new Scanner(System.in)) {
                        int USD_to = USD_.nextInt();
    
                        if (USD_to == 1) {
                        System.out.print("Convert USD: ");
    
                        try (Scanner USD = new Scanner(System.in)) {
                            double USD_Converter = USD.nextInt();
    
                            CurrencyConverter money = new CurrencyConverter();
                            money.USD_Tanzanian(USD_Converter);
                        }
                    }

                            else if (USD_to == 2) {
                                System.out.print("Convert USD: ");
                                try (Scanner USD = new Scanner(System.in)) {
                                    double USD_Converter = USD.nextInt();
    
                                    CurrencyConverter money = new CurrencyConverter();
                                    money.USD_Candanian(USD_Converter);
                                }
                            }
                    }
                } 
                    if(Converter == 3) {
                    System.out.println("What do you want your Canadian Dollar to convert to: ");
                    System.out.println("1 - Tanzanian Shillings");
                    System.out.println("2 - U.S Dollar");

                    try (Scanner CAD_ = new Scanner(System.in)) {
                        int CAD_to = CAD_.nextInt();
    
                        if (CAD_to == 1) {
                        System.out.print("Convert CAD: ");
    
                        try (Scanner CAD = new Scanner(System.in)) {
                            double CAD_Converter = CAD.nextInt();
    
                            CurrencyConverter money = new CurrencyConverter();
                            money.CAD_Tanzanian(CAD_Converter);
                        }
                    }

                            else if (CAD_to == 2) {
                                System.out.print("Convert CAD: ");
                                try (Scanner CAD = new Scanner(System.in)) {
                                    double CAD_Converter = CAD.nextInt();
    
                                    CurrencyConverter money = new CurrencyConverter();
                                    money.CAD_USD(CAD_Converter);
                                }
                            }
                    }
                }             
        }

    }
}
