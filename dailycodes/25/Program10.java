
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

class IPL extends BCCI {
	
	String sponsor = "TATA";

	int totalTeams = 10;

	IPL(){
		
		System.out.println("Indian Premier League");
	}

	void iplInfo(){
	
		System.out.println("Sponsor : " + sponsor);

		System.out.println("Total Teams : " + totalTeams);
	}
}

class Prekshak {

        public static void main(String[] args){

                IPL obj = new IPL();

                obj.intlTournaments();

                obj.domesticTournaments();

		obj.iplInfo();
        }
}
