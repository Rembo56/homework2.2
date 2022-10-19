public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 1;
        byte b = 2;
        short s = 3;
        long l = 4;
        float f = 34;
        double d = 2.5;
        System.out.println(" Значение переменой " + i + " с типом int = " + i );
        System.out.println(" Значение переменой " + b + " с типом byte = " + b );
        System.out.println(" Значение переменой " + s + " с типом short = " + s );
        System.out.println(" Значение переменой " + l + " с типом long = " + l );
        System.out.println(" Значение переменой " + f + " с типом float = " + f );
        System.out.println(" Значение переменой " + d + " с типом double = " + d );



        double d2 = 27.12;
        long l2 = 987678965549L;
        char ch1 = 062;
        char ch2 = 056;
        char ch3 = 067;
        char ch4 = 070;
        char ch5 = 066;
        boolean bo2c = false;
        short s2 = 569;
        int i2 = -159;
        short s3 = 27897;
        byte b2 = 67;
        System.out.println(" Значение переменой " + d2 + " с типом double = " + d2 );
        System.out.println(" Значение переменой char " + ch1 + "" + ch2 + "" + ch3 + "" + ch4 + "" + ch5);
        System.out.println(" Значение переменой " + l2 + " с типом long = " + l2 );
        System.out.println(" Значение переменой " + bo2c + " с типом boolean = " + bo2c );
        System.out.println(" Значение переменой " + s2 + " с типом short = " + s2 );
        System.out.println(" Значение переменой " + i2 + " с типом int = " + i2 );
        System.out.println(" Значение переменой " + s3 + " с типом short = " + s3 );
        System.out.println(" Значение переменой " + b2 + " с типом byte = " + b2 );


        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short allPaper = 480;

        int allPeople = lp + as + ea;
        int ichPaper = allPaper / allPeople;

        System.out.println(" На каждого ученика рассчитано " + ichPaper + " листов бумаги ");


        byte SourceProd = 16;
        int SourcePeriod = 2;
        int ProdMin = SourceProd / SourcePeriod;
        int day = 1440;

        int mou = day * 30;
        int period20 = SourcePeriod * 10;

        System.out.println( "За 20 мин Машина произвела бутылок " + period20 * ProdMin + " штук" );
        System.out.println( "За сутки Машина произвела бутылок " + day * ProdMin + " штук" );
        System.out.println( "За трое суток Машина произвела бутылок " + 3 * day * ProdMin + " штук" );
        System.out.println( "За месяц Машина произвела бутылок " +mou * ProdMin + " штук" );


        int NumbersPaint = 120;
        int OneClassWhite = 2;
        int OneClassBrown = 4;

        int NumberClasses = NumbersPaint / (OneClassBrown + OneClassWhite);
        int NumberWhite = NumberClasses * OneClassWhite;
        int NumberBrown = NumberClasses * OneClassBrown;

        System.out.println("В школе, где " + NumberClasses + " классов, нужно " + NumberWhite + " банок белой краски и " + NumberBrown + " банок коричневой краски ");



        int NumBan = 5;
        int WeightBan = 80;
        int NumMilk = 200 / 100;
        int WeightMilk = 105;
        int NumIce = 2;
        int WeightIce = 100;
        int NumEggs = 4;
        int WeightEggs = 70;

        float WeightGr = NumBan * WeightBan + NumMilk * WeightMilk + NumIce * WeightIce + NumEggs * WeightEggs;
        float WeightKg = WeightGr / 1000;

        System.out.println("Количество грамм в спорт завтраке " + WeightGr + ". Количесво килограмм в спорт завтраке " + WeightKg);


        int MinusW = 7000;
        int MinusWday1 = 250;
        int MinusWday2 = 500;

        int NumberDay1 = MinusW / MinusWday1;
        int NumberDay2 = MinusW / MinusWday2;
        int AverageDay = (NumberDay1 + NumberDay2) / 2;

        System.out.println( "Если терять по " + MinusWday1 + " грамм в день, то на похудение уйдет " + NumberDay1 );
        System.out.println( "Если терять по " + MinusWday2 + " грамм в день, то на похудение уйдет " + NumberDay2 );
        System.out.println( "В среднем на потерю  " + MinusW + " грамм  уйдет " + AverageDay );


        int OldSalMash = 67760;
        int OldSalDen = 83690;
        int OldSalKris = 76230;
        float IncK = 0.1f;

        double NewSalMash = OldSalMash * IncK + OldSalMash;
        double NewSalDen = OldSalDen * IncK + OldSalDen;
        double NewSalKris = OldSalKris * IncK + OldSalDen;

        double DiffSalMash = (NewSalMash - OldSalMash) * 12;
        double DiffSalDen = (NewSalDen - OldSalDen) * 12;
        double DiffSalKris = (NewSalKris - OldSalKris) * 12;

        System.out.println(" Маша теперь получает " + NewSalMash + " рублей. Годовой доход вырос на " + DiffSalMash + " рублей");
        System.out.println(" Денис теперь получает " + NewSalDen + " рублей. Годовой доход вырос на " + DiffSalDen + " рублей");
        System.out.println(" Кристина теперь получает " + NewSalKris + " рублей. Годовой доход вырос на " + DiffSalKris + " рублей");
    }


}