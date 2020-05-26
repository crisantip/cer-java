package cap1.nestedclasses;

public class CaseOfThePrivateInterface {

	private interface Secret {
		public void shh();
	}

	class DontTell implements Secret {
		
		public void shh() {
		}
	}
}

