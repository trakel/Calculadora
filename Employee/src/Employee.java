
/**
 * 
 * Aquest document és per la prova pràctica de ¨M5-UF2"
 * @author Raquel
 *
 */
public class Employee {
	/**
	 * Classe Employee
	 * conté dues variables privades: myName i mySalary
	 */
		   private String myName;
		   private double mySalary;
/**
 * el constructor té aquests dos paràmetres:
 * @param name
 * @param salary
 */
		   public Employee(String name, double salary) {
		      myName = name;
		      mySalary = salary;
		   }
/**
 * per poder llegir myName s'ha de fer amb un getter
 * @return myName
 */
		   public String getName() {
		      return myName;
		   }
/**
 * per poder llegir mySalary s'ha de fer amb un getter
 * @return mySalary
 */
		   public double getSalary() {
		      return mySalary;
		   }
/**
 * raiseSalary demana amb quin % vols pujar el salari 
 * @param percent
 */
		   public void raiseSalary(int percent) {
		      mySalary = mySalary +
		         percent * 0.01 * mySalary;
		   }
/**
 * per entrar un nou valor de mySalary s'utilitza un setter
 * @param salary
 */
		   public void setSalary(double salary) {
		      mySalary = salary;
		   }
/**
 * amb toString() s'imprimeix el nom i el salari utilitzant mètodes anteriors
 */
		   public String toString() {
		      return "Name: " + getName() +
		             ", Salary: " + getSalary();
		   }
}

