
public class Student extends Object {
	static String school = "Epicode";
	
	String firstName, lastName;
	int[] votes;
	
	public Student(String firstName, String lastName, int[] votes) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.votes = votes;
		studentCreated();
	}
	
	public double getAvg() {
		double avg = 0;
		for(int i = 0; i < this.votes.length; i++) {
			avg += this.votes[i];
		}
		
		return avg / this.votes.length;
	}
	
	static void studentCreated() {
		//System.out.println( this.firstName );
		System.out.println( "Studente creato!" );
	}
	
	@Override
	public boolean equals(Object s) {		
		// confronto per nome e cognome
		Student _s = (Student)s;
		return ( this.firstName.equals(_s.firstName) && this.lastName.equals(_s.lastName) );
		
		// confronto per media voto
		//return this.getAvg() == ((Student)s).getAvg();
	}
}
