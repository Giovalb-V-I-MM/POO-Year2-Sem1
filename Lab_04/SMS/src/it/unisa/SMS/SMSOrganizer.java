package it.unisa.SMS;

import java.util.*;

public class SMSOrganizer {
    private final List<SMS> messages;

    public SMSOrganizer(){
        messages = new ArrayList<>();
    }

    public void addSMSToOrganizer(SMS sms){
        messages.add(sms);
    }

    public List<SMS> getListByDate(){
        this.messages.sort(new Comparator<SMS>() {
            @Override
            public int compare(SMS o1, SMS o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        return this.messages;
    }

    public List<SMS> getListBySender(){
        this.messages.sort(new Comparator<SMS>() {
            @Override
            public int compare(SMS o1, SMS o2) {
                return o1.getSender().compareTo(o2.getSender());
            }
        });
        return this.messages;
    }

    public static void main(String[] args){
        SMSOrganizer smsOrganizer = new SMSOrganizer();
        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String sender = input.nextLine();
        System.out.println("");
        System.out.print("Who do you want to send an SMS to?: ");
        String receiver = input.nextLine();
        System.out.println("");
        System.out.println("Type your message:");
        String text = input.nextLine();
        SMS sms1 = new SMS(sender, new GregorianCalendar(2022, Calendar.OCTOBER, 23, 12, 23), text);
        SMS sms2 = new SMS(receiver, new GregorianCalendar(2022, Calendar.OCTOBER, 23, 12, 55), "I'm sorry, I'm not available at the moment. Can you call me later? Bye!");

        smsOrganizer.addSMSToOrganizer(sms1);
        smsOrganizer.addSMSToOrganizer(sms2);

        List<SMS> messages = smsOrganizer.getListByDate();
        System.out.println("");
        System.out.println("");

        System.out.println("***Chat with " + receiver + "***   " + smsOrganizer.messages.size() + " messages - Today***");
        System.out.println(sender + "(12:23): " + sms1.getText());
        System.out.println(receiver + "(12:55): " + sms2.getText());

    }
}