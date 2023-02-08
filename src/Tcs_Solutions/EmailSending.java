package Tcs_Solutions;
import java.util.*;

class EmailSending {
    public static void sendEmails(String[] emails) {
        Arrays.sort(emails);
        Map<String, String> firstEmails = new HashMap<>();
        for (String email : emails) {
            String domain = email.split("@")[1];
            if (!firstEmails.containsKey(domain)) {
                firstEmails.put(domain, email);
                System.out.println("Sending email to " + email);
            }
        }
    }
    public static void main(String[] args) {
        String[] emails = {
                "ghi@hotmail.com",
                "def@yahoo.com",
                "ghi@gmail.com",
                "abc@channelier.com",
                "abc@hotmail.com",
                "def@hotmail.com",
                "abc@gmail.com",
                "abc@yahoo.com",
                "def@channelier.com",
                "jkl@hotmail.com",
                "ghi@yahoo.com",
                "def@gmail.com"
        };

        sendEmails(emails);
    }
}