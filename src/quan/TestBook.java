package quan;

public class TestBook {

	public static void main(String[] args) {
		Author quan = new Author("Phan Hong Quan", "khongtrunght@gmail.com", 'm');
		System.out.println(quan);
		
		Book myBook = new Book("Java for dummy", quan, 19.95, 99);
		System.out.println(myBook);
		
		myBook.setPrice(29.95);
		myBook.setQty(28);
		System.out.println("Name is: " + myBook.getName());
		System.out.println("Price is: " + myBook.getPrice());
		System.out.println("Qty is: " + myBook.getQty());
		System.out.println("Author is: " + myBook.getAuthor());
		System.out.println("Author's name is: " + myBook.getAuthor().getName());
		System.out.println("Author's email is: " + myBook.getAuthor().getEmail());
		
		
		Book anotherBook = new Book("More Java", new Author("Test", "paul@gmail.com", 'm'), 29.95);
		System.out.println(anotherBook);
				
	}

}
