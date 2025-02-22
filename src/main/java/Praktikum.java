public class Praktikum {

    public static void main(String[] args) {
        String name = "Sveta Fadeeva";
        Account account = new Account(name);
        boolean result = account.checkNameToEmboss();
        System.out.println("Имя можно печатать на карте: " + result);
    }

}