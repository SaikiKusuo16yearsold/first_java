public class Main {

    public static void main(String[] args) {
        int maria = 67760;
        int denis = 83690;
        int cristina = 76230;
        float newPayForMaria =  (maria * 1.1f);
        float newPayForDenis =  (denis * 1.1f);
        float newPayForCristina =  (cristina * 1.1f);
        float differenceInSalaryMaria =  newPayForMaria - maria;
        float differenceInSalaryDenis =  newPayForDenis - denis;
        float differenceInSalaryCristina =  newPayForCristina - cristina;
        System.out.println("Маша теперь получает " + newPayForMaria + " рублей. Годовой доход вырос на " + differenceInSalaryMaria +  " рублей");
        System.out.println("Денис теперь получает " + newPayForDenis + " рублей. Годовой доход вырос на " + differenceInSalaryDenis +  " рублей");
        System.out.println("Кристина теперь получает " + newPayForCristina + " рублей. Годовой доход вырос на " + differenceInSalaryCristina +  " рублей");
        System.out.println("Привет мир");
        System.out.println("Hello world ! ");
    }
}