package ch2;

/**
 * 电影评价模型，名字当做类名，属性当做字段名
 * 
 * @author xinpan
 * 
 */
public class Moudle {
	private double LADY_IN_THE_WATER;
	private double SNAKES_ON_A_PLANE;
	private double JUST_MY_LUCK;
	private double SUPERMAN_RETURNS;
	private double YOU_ME_AND_DUPREE;
	private double THE_NIGHT_LISTENER;

	public double getLADY_IN_THE_WATER() {
		return LADY_IN_THE_WATER;
	}

	public void setLADY_IN_THE_WATER(double lADY_IN_THE_WATER) {
		LADY_IN_THE_WATER = lADY_IN_THE_WATER;
	}

	public double getSNAKES_ON_A_PLANE() {
		return SNAKES_ON_A_PLANE;
	}

	public void setSNAKES_ON_A_PLANE(double sNAKES_ON_A_PLANE) {
		SNAKES_ON_A_PLANE = sNAKES_ON_A_PLANE;
	}

	public double getJUST_MY_LUCK() {
		return JUST_MY_LUCK;
	}

	public void setJUST_MY_LUCK(double jUST_MY_LUCK) {
		JUST_MY_LUCK = jUST_MY_LUCK;
	}

	public double getSUPERMAN_RETURNS() {
		return SUPERMAN_RETURNS;
	}

	public void setSUPERMAN_RETURNS(double sUPERMAN_RETURNS) {
		SUPERMAN_RETURNS = sUPERMAN_RETURNS;
	}

	public double getYOU_ME_AND_DUPREE() {
		return YOU_ME_AND_DUPREE;
	}

	public void setYOU_ME_AND_DUPREE(double yOU_ME_AND_DUPREE) {
		YOU_ME_AND_DUPREE = yOU_ME_AND_DUPREE;
	}

	public double getTHE_NIGHT_LISTENER() {
		return THE_NIGHT_LISTENER;
	}

	public void setTHE_NIGHT_LISTENER(double tHE_NIGHT_LISTENER) {
		THE_NIGHT_LISTENER = tHE_NIGHT_LISTENER;
	}

	public Moudle(double lADY_IN_THE_WATER, double sNAKES_ON_A_PLANE,
			double jUST_MY_LUCK, double sUPERMAN_RETURNS,
			double yOU_ME_AND_DUPREE, double tHE_NIGHT_LISTENER) {
		super();
		LADY_IN_THE_WATER = lADY_IN_THE_WATER;
		SNAKES_ON_A_PLANE = sNAKES_ON_A_PLANE;
		JUST_MY_LUCK = jUST_MY_LUCK;
		SUPERMAN_RETURNS = sUPERMAN_RETURNS;
		YOU_ME_AND_DUPREE = yOU_ME_AND_DUPREE;
		THE_NIGHT_LISTENER = tHE_NIGHT_LISTENER;
	}

}
