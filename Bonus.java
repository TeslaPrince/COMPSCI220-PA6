package PA6;
public class Bonus {
	private Employee employee;
	private double bonus;
	public Bonus(final Employee employee, final double bonus) {
		this.employee = employee;
		this.bonus = bonus;
	}
	public final Employee getEmployee() {
		return employee;
	}
	public final double getBonus() {
		return bonus;
	}
}
