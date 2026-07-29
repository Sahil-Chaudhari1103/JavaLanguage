
class CricketMatch{

	boolean isTired = false;
	boolean inningsCompleted = false;

	void liveMatch(Player p1 , Substitute p2){
	
		System.out.println("India Won the Toss and Elected to bat First.");
		System.out.println("Match Starts :");

		p1.start();

		try{
			p1.join();
		}catch(InterruptedException e){

		}

		if(inningsCompleted == true){
			System.out.println("First innings total score 310 runs. Opposition requires a total of 311 runs to win.");
			System.out.println("Second innings begins.");

			p2.start();
			try{
				p2.join(1000);
				p1 = new Player(this);
				p1.start();
				p1.join();
			}catch(InterruptedException e){

			}
			System.out.println("Substituted player went outside of the field.");
			System.out.println("Rohit is back on the field again. Match contines......");
		}

	}

	synchronized void rohitSharma(){
		if(!isTired){	
			System.out.println("Rohit opens for india at strikers end.");
			System.out.println("Rohit Scores 150 runs.");

			isTired = true;
			inningsCompleted = true;

		}else{
			System.out.println("Rohit is ready to play again.");
                	isTired = false;
			notify();	
		}

	}

	synchronized void subPlayer(){
		
		if(isTired){
			System.out.println("Rohit is substituted with new Player.");
			System.out.println("Substitute player is ready to play.");
			System.out.println("New player substitutes the tired player and comes on ground for fielding.");
			try{
                                wait();
                        }catch(InterruptedException e){

                        }
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


class Substitute extends Thread {

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

		obj.liveMatch(p1,p2);
		
	}
}



