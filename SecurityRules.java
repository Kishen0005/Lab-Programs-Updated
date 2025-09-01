package Transport;

public final class SecurityRules {

	public SecurityRules() {}
		public static boolean canFly(String place) {
			if(place=="ExamCell") {
				return false;
			}
			else
				return true;
		}
	}


