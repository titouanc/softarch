
package exercise1.demo4;

public class Demo4 {

	public static void main(String[] args) {

		Hobbit bilbo = new Hobbit.HobbitBuilder("Bilbo Baggins")
				.setLanguage(Language.HOBBITISH)
				.setHeight(125) 
				.setHairColor(HairColor.BROWN)
				.setWeapon(Weapon.STING)
				.build();

		System.out.println(bilbo);

		Hobbit frodo = new Hobbit.HobbitBuilder("Frodo Baggins")
				.setLanguage(Language.HOBBITISH)
				.setHeight(122)
				.setHairColor(HairColor.BROWN)
				.setWeapon(Weapon.STING)
				.build();

		System.out.println(frodo);

	}
}
