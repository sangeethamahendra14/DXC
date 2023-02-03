package Aggregation;


	public class Book {
		private String name;
		private Author author;
		private double price;
		private int quantity;
		
		public Book(String name, Author author, double price, int quantity) {
			this.name = name;
			this.author = author;
			this.price = price;
			this.quantity = quantity;
		}
		
		public void displayAuthorDetails(){
			
			System.out.println("Author name: "+ author.getName()+"\nAuthor email: "+ author.getEmail()+ "\nAuthor gender "+ author.getGender());
			System.out.println("\nBook name: "+ getName()+"\nAuthor : "+ getAuthor()+ "\nPrice: "+ getPrice()+ "\nQuantity: "+ getQuantity());
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Author getAuthor() {
			return author;
		}

		public void setAuthor(Author author) {
			this.author = author;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		

		public static void main(String[] args) {
			
			Author a1 = new Author("Joshua Bloch", "joshua@gmail.com", 'M');
			Book b1 = new Book("Effective Java", a1 , 45.0,15);
//			a1.displayAuthorDetails();
			b1.displayAuthorDetails();
		}
	}

