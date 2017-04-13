package ch2;

import java.util.HashMap;

/**
 * 欧几里得距离：勾股定理求出两点之间的距离，然后让该结果+1并取倒，若值为1，则说明两点间距离为0，即两者喜好一样。
 */
public class OJLDDistance {

	public static void main(String[] args) {
		HashMap<String, Moudle> list = new HashMap<String, Moudle>();
		list.put("LISA_ROSE", new Moudle(2.5, 3.5, 3.0, 3.5, 2.5, 3.0));
		list.put("GENE_SEYMOUR", new Moudle(3.0, 3.5, 1.5, 5.0, 3.5, 3.0));
		list.put("MICJAEL_PHILLIPS", new Moudle(2.5, 3.0, 0, 3.5, 0, 4.0));
		list.put("CLAUDIA_PUIG", new Moudle(3.5, 0, 3.0, 4.0, 2.5, 4.5));
		list.put("MICK_LASALLE", new Moudle(3.0, 4.0, 2.0, 3.0, 2.0, 3.0));
		list.put("JACK_MATTHEWS", new Moudle(3.0, 4.0, 0, 5.0, 3.5, 3.0));
		list.put("TOBY", new Moudle(0, 4.5, 0, 4.0, 1.0, 0));
		System.out.println(distance(list, "GENE_SEYMOUR", "MICJAEL_PHILLIPS"));
	}

	public static double distance(HashMap<String, Moudle> list, String person1,
			String person2) {
		Moudle per1 = list.get(person1);
		Moudle per2 = list.get(person2);
		return 1 / (1
				+ Math.pow(per1.getJUST_MY_LUCK() - per2.getJUST_MY_LUCK(), 2)
				+ Math.pow(
						per1.getLADY_IN_THE_WATER()
								- per2.getLADY_IN_THE_WATER(), 2)
				+ Math.pow(
						per1.getSNAKES_ON_A_PLANE()
								- per2.getSNAKES_ON_A_PLANE(), 2)
				+ Math.pow(
						per1.getSUPERMAN_RETURNS() - per2.getSUPERMAN_RETURNS(),
						2)
				+ Math.pow(
						per1.getTHE_NIGHT_LISTENER()
								- per2.getTHE_NIGHT_LISTENER(), 2) 
				+ Math.pow(	per1.getYOU_ME_AND_DUPREE() 
						- per2.getYOU_ME_AND_DUPREE(), 2));
	}
}
