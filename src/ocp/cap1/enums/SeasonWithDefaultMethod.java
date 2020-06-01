package cap1.enums;

public enum SeasonWithDefaultMethod {

	WINTER {
		public void printHours() {
			System.out.println("short hours");
		}
	},
	SUMMER {
		public void printHours() {
			System.out.println("long hours");
		}
	},
	SPRING, FALL;
	
	/* Se puede utilizar un método default para algunos elementos del enum (SPRING, FALL)
	y en otros elementos mantener métodos personalizados (WINTER, SUMMER)*/ 
	public void printHours() {
		System.out.println("default hours");
	}
	
	public static void main(String[] args) {
		SeasonWithDefaultMethod.SPRING.printHours();
		SeasonWithDefaultMethod.WINTER.printHours();
	}

}
