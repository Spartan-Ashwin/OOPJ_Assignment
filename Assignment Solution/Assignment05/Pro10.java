//package Assignment05;
//import java.util.*;
//
//class CreditScore{
//	
//	Scanner sc=new Scanner(System.in);
//	private int creditHistory;
//	private double creditUtilizastion;
//	private boolean isGoodPaymentHistory;
//	public int getCreditHistory() {
//		return creditHistory;
//	}
//	public void setCreditHistory(int creditHistory) {
//		this.creditHistory = creditHistory;
//	}
//	public double getCreditUtilizastion() {
//		return creditUtilizastion;
//	}
//	public void setCreditUtilizastion(double creditUtilizastion) {
//		this.creditUtilizastion = creditUtilizastion;
//	}
//	public boolean isGood() {
//		return isGoodPaymentHistory;
//	}
//	public void setGood(boolean isGoodPaymentHistory) {
//		this.isGoodPaymentHistory = isGoodPaymentHistory;
//	}
//	
//	CreditScore(){
//		
//		System.out.println("Enter length of credit History");
//		int hisLength=sc.nextInt();
//		System.out.println("Enter  percentage of available credit");
//		double creditAvailable=sc.nextDouble();
//		System.out.println(" whether the individual has a good(true)payment history or not(false).");
//		boolean goodOrBad=sc.nextBoolean();
//		this.setCreditHistory(hisLength);
//		this.setCreditUtilizastion(creditAvailable);
//		this.setGood(goodOrBad);
//		
//		System.out.println("Your credit score is "+this.calculateCreditScore());
//	}
//	
//	int calculateCreditScore() {
//		int score=0;
//		if(this.isGoodPaymentHistory) {
//			score=(this.getCreditHistory()*15)+(int)(this.getCreditUtilizastion()*30)+55;
//		}else {
//			score=(this.getCreditHistory()*15)+(int)(this.getCreditUtilizastion()*30)+55;
//		
//		}
//		return score;
//	}
//	
//}
//public class Pro10 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		CreditScore cs=new CreditScore();
//
//	}
//
//}
