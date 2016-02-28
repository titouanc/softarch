package exercise1.demo4;

public enum Weapon {
	STING, BARROW_BLADE;

	@Override
	public String toString() {
		return name().toLowerCase();
	}

}
