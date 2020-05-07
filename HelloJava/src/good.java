
public class good {

	public static void main(String[] args) {
		String[] stringName= {"Gen","Leo","Luna","Lesley","Elvie"};
		good app = new good();
		app.displayNames(stringName);
		System.out.println(stringName[0]);
	}

		void displayNames(String[] names) {
			names[0]="Ken";
			for (String name: names) {
			
				System.out.println(name);
		}
	
	}

}
