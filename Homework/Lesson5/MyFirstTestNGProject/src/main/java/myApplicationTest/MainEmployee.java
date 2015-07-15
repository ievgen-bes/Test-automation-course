package myApplicationTest;

public class MainEmployee{
	  public String name (String firstName, String lastName){
		     return firstName + lastName;
		   }
		   public static int age(int BDay, int PresYear){
			   return PresYear - BDay;
		   }
		   public int ID (int ID){
		      return ID;
		   }
		   public String Designation (String Designation){
			      return Designation;
		}  
		   public float baseRate(float priceDay, float workDay ){
			   return priceDay * workDay;
		   }
		   public float ExperienceRatio(float affiliationYear, float presentYear){
			   return affiliationYear - presentYear;
		}
		   public float CalculateSalary(float bonus, float baseRate){
			   return bonus + baseRate;
		}
		   public int late (int late){
			   return late;
		   }
		   public int bonus(int lateCost, int bonus){
			   return bonus - lateCost;
		   }
	 
}