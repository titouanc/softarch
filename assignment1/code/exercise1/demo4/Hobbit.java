
package exercise1.demo4;

 class Hobbit {

	private final String name;
	private final float height;  // cm
	private final Language language;
	private final HairColor hairColor;
	private final Weapon weapon;

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

	public Language getLanguage() {
		return language;
	}

	public HairColor getHairColor() {
		return hairColor;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	private Hobbit(HobbitBuilder builder) {
		this.name = builder.name;
		this.height = builder.height;
		this.language = builder.language;
		this.hairColor = builder.hairColor;
		this.weapon = builder.weapon;
	}
	

	public static class HobbitBuilder {

		private final String name;
		private float height;
		private Language language;
		private HairColor hairColor;
		private Weapon weapon;

		/**
		 * Constructor
		 */
		public HobbitBuilder(String name) {
			this.name = name;
		}

		public HobbitBuilder setHeight(float height) {
			this.height = height;
			return this;
		}

		public HobbitBuilder setLanguage(Language lang) {
			this.language = lang;
			return this;
		}

		public HobbitBuilder setHairColor(HairColor hairColor) {
			this.hairColor = hairColor;
			return this;
		}
		
		public HobbitBuilder setWeapon(Weapon weapon) {
			this.weapon = weapon;
			return this;
		}

		public Hobbit build() {
			return new Hobbit(this);
		}
	}
}
