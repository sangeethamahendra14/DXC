package Static;

public class Participant {
	
		
		private static int counter;
		private String registrationId;
		private String name;
		private long contactNumber;
		private String city;
		
		static
		{
			counter=10000;
		}
		
		Participant(String name,long contactNumber,String city)
		{
			this.name=name;
			this.contactNumber=contactNumber;
			this.city=city;
			this.registrationId="D"+ ++counter;
		}
		
		
		public static int getCounter() {
			return counter;
		}

		public static void setCounter(int counter) {
			Participant.counter = counter;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
		

		public String getRegistrationId() {
			return registrationId;
		}


		public void setRegistrationId(String registrationId) {
			this.registrationId = registrationId;
		}


		public static void main(String[] args) 
		{
			Participant p1=new Participant("Sangeetha",7656784323L, "Texas");
			Participant p2=new Participant("Sheeru",7890423112L, "New York");
			Participant[] participants = { p1, p2 };
			for(Participant p : participants)
			{
				System.out.println("Hi"+p.getName()+"! Your registration id is "+p.getRegistrationId());
			}
			
		}

	}

