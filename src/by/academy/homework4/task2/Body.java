package by.academy.homework4.task2;

public class Body {

	private Heart heart;
	private Lungs lungs;

	public Body() {
		super();
		this.heart = new Heart();
		this.lungs = new Lungs();
	}

	public class Heart {
		public void live() {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				if (i != 0 && i % 100 == 0) {
					System.out.println("Knock-knock-knockin' on heaven's door ");
				}
			}
		}
	}

	class Lungs {
		public void live() {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				if (i != 0 && i % 100 == 0) {
					System.out.println("breathe out ");
				} else if (i != 0 && i % 50 == 0) {
					System.out.println("breathe in ");
				}
			}
		}
	}

	public void live() {
		lungs.live();
		heart.live();
		System.out.println("""
				You stand on the shore and feel the salty smell of the wind that blows from the sea.
				And I believe that you are free, and life has only begun.
				""");
	}
}
