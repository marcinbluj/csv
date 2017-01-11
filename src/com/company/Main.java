package com.company;

import org.apache.commons.mail.EmailException;

public class Main {

    public static void main(String[] args) {

    Integer[][] data = new Integer[][]{{1,2},{3,4}};

    CSV.saveArrayToCSV(data, "C://Users/RENT/Desktop/CSV.csv");
        try {
            new MailSender().sendMail("marcinbluj21@gmail.com", "Spam", "spam");
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}
