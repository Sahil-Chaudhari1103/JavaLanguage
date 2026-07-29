
class BgmiTournament{
	BgmiTournament(){
		System.out.println("Official tournament hosted by BGMI community.");
	}
	void matchTime(){
		System.out.println("Date : 22nd March \n Time : 8:00 PM");
	}
}

abstract class IGL extends BgmiTournament{
	IGL(){
		System.out.println("In Game Leader.");
	}
	void matchAlert(){
		System.out.println("Everyone stay online during the match time because its important match for us.If anyone misses it then they are dead.Take this as a warning. ");
	}

	abstract void play();
}

class Players extends IGL{
	Players(){
		System.out.println("All Squad Members of a team.");
	}

	void play(){
		System.out.println("Ok boss! We'll be on time to play the match.");
	}
}

class Client{
	public static void main(String[] args){
		IGL obj = new Players();
		obj.matchTime();
		obj.matchAlert();
		obj.play();
	}
}
