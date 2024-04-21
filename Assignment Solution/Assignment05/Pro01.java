//package Assignment05;
//import java.util.Scanner;
//import java.util.Date;
//import java.util.Calendar;
//import java.text.*;
//
//public class Pro01 {
//
//	public static void main(String[] args) throws ParseException {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Date");
//		int date=31;//sc.nextInt();
//		System.out.println("Enter month");
//		int month=12;//sc.nextInt();
//		System.out.println("Enter year");
//		int year=2022;//sc.nextInt();
//		month--;
//		year=year-1900;
//		
//		System.out.println("Enter hour");
//		int hour=23;//sc.nextInt();
//		System.out.println("Enter minute");
//		int minute=59;//sc.nextInt();
//		System.out.println("Enter second");
//		int sec=59;//sc.nextInt();
//		
//		Date d=new Date();
//		d.setDate(date);
//		d.setMonth(month);
//		d.setYear(year);
//		
//		d.setHours(hour);
//		d.setMinutes(minute);
//		d.setSeconds(sec);
//		
//		
//		System.out.println("***************************");
//	
//		System.out.println("Dates Patterns");
//		SimpleDateFormat sdf1=new SimpleDateFormat("dd/M/YYYY a");
//		String ans=sdf1.format(d);
//		System.out.println(ans);
//		
//		System.out.println(new SimpleDateFormat("M/dd/YYYY ").format(d));
//		System.out.println(new SimpleDateFormat("YYYY/M/dd").format(d));		
//	
//		System.out.println("***************************");
//		
//		System.out.println("Times Patterns");
//		
//		System.out.println(new SimpleDateFormat("HH:mm:ss").format(d));		
//		System.out.println(new SimpleDateFormat("hh:mm:ss a").format(d).replace("am","AM").replace("pm","PM"));
//		System.out.println(new SimpleDateFormat("HH:mm").format(d));		
//		
//		
//		System.out.println("****************************");
//		System.out.println("Date and Times Patterns");
//		
//		System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(d));
//		System.out.println(new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a").format(d).replace("am","AM").replace("pm","PM"));
//		System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm").format(d));
//		
//		
//
//	}
//
//}
