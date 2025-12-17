public class Main {
    public static void main(String[] args) {

        //Первое задание
        int intVariable = 23800;
         System.out.println("Значение переменной с типом int равно " + intVariable);
         byte byteVariable = 120;
         System.out.println("Значение переменной с типом byte равно " + byteVariable);
         short shortVariable = 32766;
         System.out.println("Значение переменной с типом short равно " + shortVariable);
         long longVariable = 3000000;
         System.out.println("Значение переменной с типом long равно " + longVariable);
         float floatVariable = 2.0123f;
         System.out.println("Значение переменной с типом float равно " + floatVariable);
         double doubleVariable = 4.0123456;
         System.out.println("Значение переменной с типом double равно " + doubleVariable);

         // Второе задание

        float a = 27.12f;
        long b = 987678965549l;
        double c = 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        //Задача 3

        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        byte totalStudents = (byte) (studentsAS + studentsEA + studentsLP);
        short sheetsOfPaper = 480;
        short sheetsPerStudent = (short) (sheetsOfPaper / totalStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + "  листов бумаги».");

        //задача 4

        byte prodOfMachine = 16 / 2;
        short minutes20 = (short) (20 * prodOfMachine);
        System.out.println("За 20 минут машина произвела " + minutes20 + " штук бутылок");
        short day = (short) (24 * 60 * prodOfMachine);
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int day3 = day * 3;
        System.out.println("За три дня машина произвела " + day3 + " штук бутылок");
        int month = day * 30;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        //Задача 5
        byte redForClass = 2;
        byte brownForClass = 4;
        byte totalCan = 120;
        byte cansForClass = (byte)(redForClass + brownForClass);
        byte totalClasses = (byte)(totalCan / cansForClass);
        byte white = (byte) (totalClasses * 2);
        byte brown = (byte) (totalClasses * 4);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски».");

        //Task6

        byte bananaQuantity = 5;
        byte bananaWeight = 80;
        short bananaTotal = (short)(bananaQuantity * bananaWeight);
        short milkVolume = 200;
        float convertMilkToWeight = 105f / 100f;
        float milkWeight = milkVolume * convertMilkToWeight;
        byte iceCreamQuantity = 2;
        byte iceCreamWeight = 100;
        short iceCreamTotal = (short) (iceCreamQuantity * iceCreamWeight);
        byte eggQuantity = 4;
        byte eggWeight = 70;
        short eggTotal = (short)(eggQuantity * eggWeight);
        float totalWeight = (bananaTotal + milkWeight + iceCreamTotal + eggTotal);
        System.out.println("Вес завтрака в граммах " + totalWeight);
        float totalWeightKilo = totalWeight / 1000f;
        System.out.println("Вес завтрака в киллограммах " + totalWeightKilo);

        //Task 7

        byte goalLoose = 7;
        short goalLooseGram = (short)(goalLoose * 1000);
        short minLooseByDay = 250;
        short maxLooseByDay = 500;
        short avgLooseByDay = (short)((minLooseByDay + maxLooseByDay) / 2);
        float minDays = (float)(goalLooseGram / minLooseByDay);
        System.out.println("Минимальное количество дней для требуемого результата " + minDays);
        float maxDays = (float)(goalLooseGram / maxLooseByDay);
        System.out.println("максимальное количество дней для требуемого результата " + maxDays);
        double avgDays = (float)goalLooseGram / avgLooseByDay;
        System.out.println("Среднее количество дней для требуемого результата " + avgDays);


        //Task 8

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int ChristinaSalary = 76230;
        float newMashaSalary = (float)mashaSalary * 1.1f;
        float newDenisSalary = (float)denisSalary * 1.1f;
        float newChristinaSalary = (float)ChristinaSalary * 1.1f;
        float MashaOldYear = mashaSalary * 12;
        float DenisOldYear = denisSalary * 12;
        float ChristinaOldYear = ChristinaSalary * 12;
        float MashaNewYear = newMashaSalary * 12;
        float DenisNewYear = newDenisSalary * 12;
        float ChristinaNewYear = newChristinaSalary * 12;
        float MashaProfit = MashaNewYear - MashaOldYear;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + MashaProfit + " рублей");
        float DenisProfit = DenisNewYear - DenisOldYear;
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + DenisProfit + " рублей");
        float ChristinaProfit = ChristinaNewYear - ChristinaOldYear;
        System.out.println("Кристина теперь получает " + newChristinaSalary + " рублей. Годовой доход вырос на " + ChristinaProfit + " рублей");























    }
}