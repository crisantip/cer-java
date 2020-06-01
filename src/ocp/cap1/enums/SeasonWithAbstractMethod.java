package cap1.enums;

public enum SeasonWithAbstractMethod {

	WINTER {
		public void printHours() {
			System.out.println("9am-3pm");
		}
	},
	SPRING {
		public void printHours() {
			System.out.println("9am-5pm");
		}
	},	
	SUMMER {
		public void printHours() {
			System.out.println("9am-7pm");
		}
	},
	FALL {
		public void printHours() {
			System.out.println("9am-5pm");
		}
	};

	//La presencia de un método abstract obliga a que cada elemento del enum implemente este método
	public abstract void printHours();
	
	public static void main(String[] args) {
		SeasonWithAbstractMethod.SPRING.printHours();
		SeasonWithAbstractMethod.WINTER.printHours();
	}
}
