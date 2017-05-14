import java.util.*;
public class Chal 
{
	 public static ArrayList<Hotel> arr = new ArrayList<Hotel>();
	public static String bookhotel(double amt,int da,int ra)
	{
		Hotel h1 = new Hotel("The park",90,2,5,20);
		 Hotel h2 = new Hotel("Hotel Hyaat",82,3,5,12);
		 Hotel h3 = new Hotel("Raddisson",60,3,3,18);
		 Hotel h4 = new Hotel("Raintree",58,2,3,15);
		 Hotel h5 = new Hotel("Accord",41.55f,3,1,11.8);
		 Hotel h6 = new Hotel("Fortune",43,4,1,14.8);
		 
		 String best_hotel="";
		 double best_hotel_amount=0;
		
		 arr.add(h1);
		 arr.add(h2);
		 arr.add(h3);
		 arr.add(h4);
		 arr.add(h5);
		 arr.add(h6);
		
		Iterator<Hotel> itr = arr.iterator();
		 TreeMap<String,Double> discount_hotel=new TreeMap<String,Double>();
		 
		 
		 while(itr.hasNext())
		 {
			 Hotel hot=(Hotel)itr.next();
			 
			 if(hot.rating==ra)
			 {
				 double amnt=hot.amount;
				 
				 if(hot.days<da)
				 {
					 amnt=amnt*da;
					 double amnt_discount=0;
				 amnt_discount=(amnt*hot.discount)/100;
				 amnt=amnt-amnt_discount;
				 if(amnt<=amt)
				 {
					 discount_hotel.put(hot.name,amnt);
				 }
				 
				 }
				 else
				 {
					 
					 amnt=amnt*da;
					
					 if(amnt<=amt)
					 {
						 discount_hotel.put(hot.name, amnt);
					 }
				 }
				 
				 
			 }
				 	}
		 if(discount_hotel.size()==0)
		 {
			 return "Insufficient Balance";
		 }
		 else
		 {
		 for(Map.Entry<String,Double> m:discount_hotel.entrySet())
		 {
			 best_hotel=m.getKey();
			 best_hotel_amount=m.getValue();
			 break;
			 
		 }
		 return "Hotel Booked for "+da+" days in "+ra+" star hotel "+best_hotel+" for the cose of "+best_hotel_amount+" for hotel"; 
		 }
		
		
	}
	
 public static void main(String ar[])
 {
	 double amount;
	 int day;
	 int rating;
	 String name;
	 
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter the amount in Dollar");
		amount=in.nextDouble();
		System.out.println("Enter number of days");
		day=(int) in.nextDouble();
		System.out.println("Enter the rate of Hotel");
		rating=(int) in.nextDouble();
	String review= bookhotel(amount,day,rating);
	 
	 
System.out.println(review);	 
	 
	 }
 
 	}
 

