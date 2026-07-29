
class ICC {

	String president = "Jay Shah";

	int totalTeams = 12;

	ICC(){
		System.out.println("International Cricket Council");
	}

	void intlTournaments(){
		System.out.println("Organizes World Cup, T20 World Cup, Champions Trophy");
	}
}

class BCCI extends ICC{

	String president = "Mithun Manhas";

	int domesticTeams = 38;

	BCCI(){
		System.out.println("Board of Control for Cricket in India");
	}

	void domesticTournaments(){
		System.out.println("IPL, Ranji Trophy, Syed Mustaq Ali Trophy");
	}
}

class Prekshak {

	public static void main(String[] args){

		BCCI obj = new BCCI();

		obj.intlTournaments();

		obj.domesticTournaments();
	}
}
