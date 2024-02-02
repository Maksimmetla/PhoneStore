public class Main {
    public static void main(String[] args) throws Exception {
        Phone phone = new Phone("iPhone XS", PhoneColors.Red, 15000, 100);
        System.out.println(phone);

        phone.setPrice(20000);

        System.out.println(phone);
    }
}