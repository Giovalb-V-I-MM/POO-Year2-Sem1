package it.unisa.SMS;

import java.util.GregorianCalendar;

public class SMS {
  private final String sender;
  private final GregorianCalendar date;
  private final int id;
  private static int totalNumberSMS;
  private final String text;

  public SMS(String sender, GregorianCalendar date, String text){
      this.sender = sender;
      this.date = date;
      this.id = totalNumberSMS;
      totalNumberSMS++;
      this.text = text;
  }

  public String getSender(){
      return this.sender;
  }

  public GregorianCalendar getDate(){
      return date;
  }

  public int getId(){
      return this.id;
  }

  public int getTotalNumberSMS(){
      return totalNumberSMS;
  }

  public String getText(){
      return this.text;
  }
}