public class PhoneNumberTest {
    private static PhoneNumberExample phoneNumberExample;
    private static String[] validPhoneNumber = {"(84)-(0978489648)", "(86)-(01658333226)", "(21)-(0984471729)"};
    private static String[] invalidPhoneNumber = {"(a8)-(22222222)", "0908@@#@!$/K", "3508phaikhong"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone numberr " + phoneNumber + " is " + isvalid);
        }

        for (String phoneNumber : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone numberr " + phoneNumber + " is " + isvalid);
        }
    }
}
