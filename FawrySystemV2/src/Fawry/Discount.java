package Fawry;
public abstract class Discount {

		String Description = "Unknown Discount\n";
		
		public String getDescription() {
			return Description;
		}
		
		public abstract double percentage();
		public abstract void Add_Discount();
	}
