
class CricketMatch {

	boolean isTired = false;
	boolean inningsCompleted = false;

	public  void liveMatch(Player p1 , Substitute p2){
	
		System.out.println("India Won Toss and Elected to bat First.");
		System.out.println("Match Starts :");

		p1.start();
		p1.join();

		if (inningsCompleted) {
			System.out.println("First innings total score 310 runs. Opposition requires a total of 311 runs to win.");
                	System.out.println("Second innings begins.");

			synchronized() {
                		while(isTired){
					p2.start();
                        		System.out.println("New player substitutes the tired player and comes on ground for fielding.");
					try{                                                                                                                                                                                                                                                                      }catch(InterruptedException e){
                		}
			}
		}

	}

	public void rohitSharma(){
		
		System.out.println("Rohit opens for india at strickers end.");
		System.out.println("Rohit Scores 150 runs.");

		isTired = true;
		inningsCompleted = true;

		System.out.println("Rohit is substituted with new Player.");
		
		synchronized(){
			try{
				wait();
			}catch(InterruptedException e){
			
			}
		}
	}

	public void subPlayer() {

		if (isTired) {
			System.out.println("Ready to play.");
		}
	}
}

class Player extends Thread {

	CricketMatch obj;

	Player(CricketMatch obj) {

		this.obj = obj;
	}

	public void run() {

		obj.rohitSharma();
	}
}

class Substitue extends Thread {

	CricketMatch obj;

	Substitute(CricketMatch obj) {

                this.obj = obj;
        }

	public void run() {

		obj.subPlayer();
	}
}

class Client {

	public static void main(String[] args) throws InterruptedException {

		CricketMatch obj = new CricketMatch();

		Player p1 = new Player(obj);
		Substitute p2 = new Substitute(obj);

		obj.liveMatch(p1, mt);

	}
}
