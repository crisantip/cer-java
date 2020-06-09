package cap2.interfaces.extiende;

/*La clase Lion debe proveer implementaciones concretas de todos los métodos abstractos heredados*/
public class Lion implements Run {

	public boolean isQuadruped() {
		return true;
	}

	public boolean canHuntWhileRunning() {
		return true;
	}

	public double getMaxSpeed() {
		return 100;
	}

}


