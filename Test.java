package PA6;
public class Test {
	public static void main(String[] args) {
		BonusCalculator.readEmployees("fileDoesNotExist.txt");
		Employee[] employees = BonusCalculator.readEmployees("employee.csv");
		Bonus[] bonuses = BonusCalculator.computeBonuses(employees);
		BonusCalculator.writeBonuses(bonuses, "bonus.csv");
	}
}
