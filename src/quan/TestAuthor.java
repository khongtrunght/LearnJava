package quan;

public class TestAuthor {

	public static void main(String[] args) {
		Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		System.out.println(ahTeck);
		ahTeck.setEmail("khongtrunght@gmail.com");
		System.out.println("Name is: " + ahTeck.getName());
		System.out.println("Email is: " + ahTeck.getEmail());
		System.out.println("Gender is: " + ahTeck.getGender());

	}

}
