import java.util.*;
class CrownAndAnchor {

	public static void main(String[] args) {
		
		//DiceRoller a = new DiceRoller();
		//System.out.println(a);
		
		Game game = new Game(new PlaceBet(Arrays.asList(20.0, 10.0)), new Dice(new ChooseDiceIndex(Arrays.asList(3, 5))));
		System.out.println(game.balance());
		//System.out.println();
		game.result();
		System.out.println(game.balance());
		
		
		
		/*
	 * 
	 * //------------------------------------------------------------------------//		
		// Creating a dice
		int dice[] = new int[6];
		
		// Number representing the dice
		int diceIndex[] = {1, 2, 3, 4, 5, 6};
		
		// Create the counter
		int counter[] = new int[6];
		
		Random diceRoller = new Random();
		Scanner in = new Scanner(System.in); // Takes "Number" as a input for dice.
		Scanner exit = new Scanner(System.in); // Takes "Letter" as a input for exiting.
		
		// Input for taking a bet / Placing a bet
		int balance = 2000; // Balance for free user
		int bet[] = new int[6]; // Number of bet the user entered
		int indexOfDice[] = new int[6];
		int totalBet = 0; // Total bet the user entered 
		
		
		// Winning dice Index
		int count = 0;
		
		
	//------------------------------------------------------------------------//
		
	//------------------------------------------------------------------------//		
		for(int i = 0; i < diceIndex.length; i++){
			// Choosing the dice index
			System.out.println("Enter the index of dice: ");
			indexOfDice[i] = in.nextInt();
			
			while(indexOfDice[i] < 1 || indexOfDice[i] > 6){
				System.out.println("Enter the number from 1 to 6: ");
				indexOfDice[i] = in.nextInt();
				
				if(indexOfDice[i] > 1 && indexOfDice[i] < 6){
					break;
				}
			}
			
			// Check if the user entered the same dice index number.
			if(i >= 1 && i <= 6){
				for(int j = 0; j < i; j++){
					if(indexOfDice[i] == indexOfDice[j]){
						System.out.println("Enter the different index of dice: ");
						indexOfDice[i] = in.nextInt();
						j = -1;
						
						while(indexOfDice[i] < 1 || indexOfDice[i] > 6){
							System.out.println("Enter the number from 1 to 6: ");
							indexOfDice[i] = in.nextInt();
							
							if(indexOfDice[i] > 1 && indexOfDice[i] < 6){
								break;
							}
						}
					}
				}
			}
			
			
			
			// Asking user for Placing a bet
			System.out.println("Enter the amount to place the bet: ");
			bet[i] = in.nextInt();
			
			System.out.println("Press r to roll the dice: ");
			char roll = exit.nextLine().charAt(0);
			
			if(roll == 'r'){
				break;
			} else {
				continue;
			}
		}
	//------------------------------------------------------------------------//
		
	//------------------------------------------------------------------------//		
		System.out.println(Arrays.toString(bet));
		
		// Updating the balance after the bet
		for(int i = 0; i < bet.length; i++){
			totalBet = totalBet + bet[i];
		}
		System.out.println("Total bet: " + (totalBet));
		
		balance = balance - totalBet;
		
		System.out.println("Total balance: " + (balance));
		
		// Roll the dice
		for(int i = 0; i <dice.length; i++){
			dice[i] = diceRoller.nextInt(6) + 1;
		}
		
		System.out.println("Rolling the dice");
		System.out.println(Arrays.toString(dice));
		
		// Count every dice
		for(int i = 0; i < dice.length; i++){
			if(dice[i] == 1){
				counter[0]++; 
			} else if (dice[i] == 2){
				counter[1]++;
			} else if(dice[i] == 3){
				counter[2]++; 
			} else if (dice[i] == 4){
				counter[3]++;
			} else if(dice[i] == 5){
				counter[4]++; 
			} else if (dice[i] == 6){
				counter[5]++;
			}
		}
		
		System.out.println("\nDice Rolled");
		System.out.println("Index of dice: " + Arrays.toString(indexOfDice));
		System.out.println("Dice Rolled: " + Arrays.toString(dice));
		
		System.out.println(Arrays.toString(diceIndex));
		System.out.println(Arrays.toString(counter));
	//------------------------------------------------------------------------//
		
	//------------------------------------------------------------------------//
		System.out.println("Counter: " + Arrays.toString(counter));
		System.out.println("Dice Index \t Number of Index\n");
		for(int i = 0; i < counter.length; i++){
			if(counter[i] > 1){
				count++;
			}
		}
		int z = 0;
		int winningIndex[] = new int[count];
		int winningCounter[] = new int[count];
		for(int i = 0; i < counter.length; i++){
			if(counter[i] > 1){
				winningIndex[z] = diceIndex[i];
				winningCounter[z] = counter[i];
				z++;
			}
		}
		System.out.println("Winning Index: " + Arrays.toString(winningIndex));
		System.out.println("Winning Counter: " + Arrays.toString(winningCounter));
		
		for(int i = 0; i < indexOfDice.length; i++){
			for(int j = 0; j < winningIndex.length; j++){
				if(indexOfDice[i] == winningIndex[j]){
					balance = balance + ((bet[i] * winningCounter[j]) + bet[i]);
					System.out.println(indexOfDice[i] + " : " + winningCounter[j]);
					System.out.println("Bet win: " + bet[i]);
					System.out.println("Your win: " + ((bet[i] * winningCounter[j]) + bet[i]));
				}
			}
		}
		
		
		
		System.out.println("Your Balance is: " + balance);
		
		
	/*	if (counter[i] > 1){
			balance = balance + ((bet[i] * counter[i]) + bet[i]);
			System.out.println("Counter win " + (counter[i]));
			System.out.println("Bet win: " + (bet[i]));
			System.out.println("Your win: " + (bet[i] * counter[i] + bet[i]));
			System.out.println("Your Balance is: " + balance);
		} else {
			System.out.println("Balance: " + balance);
		}
		
		 *
		 if(indexOfDice[j] == diceIndex[j]){
						balance = balance + ((bet[i] * counter[i]) + bet[i]);
						System.out.println(indexOfDice[i] + " : " + counter[i]);
						System.out.println("Bet win: " + (bet[i]));
						System.out.println("Your win: " + (bet[i] * counter[i] + bet[i]));
					}*/
		
		
	//------------------------------------------------------------------------//*/	
		
	}

}

class Board{
	
}

class Game{
	private PlaceBet bet;
	private Dice dice;
	private DiceRoller diceRoller;
	
	// Check for the winning dice
	private int[] counter = new int[6];
	private int[] winningCounter;
	private int[] winningIndex;
	
	// Update the balance after every successful round;
	private double balance;
	
	Game(PlaceBet bet, Dice dice){
		this.bet = bet; // Place the stake
		this.dice = dice; // Choose the dice.
		this.balance = bet.balance();
		diceRoller = new DiceRoller(); // Roll the dice.
		
		//result();
	}
	
	public void result(){
		// Count every dice
		for(int i = 0; i < dice.diceIndexs.length; i++){
			if(diceRoller.diceRolled()[i] == 1){
				counter[0]++; 
			} else if (diceRoller.diceRolled()[i] == 2){
				counter[1]++;
			} else if(diceRoller.diceRolled()[i] == 3){
				counter[2]++; 
			} else if (diceRoller.diceRolled()[i] == 4){
				counter[3]++;
			} else if(diceRoller.diceRolled()[i] == 5){
				counter[4]++; 
			} else if (diceRoller.diceRolled()[i] == 6){
				counter[5]++;
			}
		}
		
		System.out.println((diceRoller));
		System.out.println(Arrays.toString(dice.diceIndexs));
		System.out.println(Arrays.toString(counter));
		
		int countWinning = 0;
		
		for(int i = 0; i < counter.length; i++){
			if(counter[i] > 1){
				countWinning++;
			}
		}
		
		winningCounter = new int[countWinning];
		winningIndex = new int[countWinning];
		
		int z = 0;
		for(int i = 0; i < counter.length; i++){
			if(counter[i] > 1){
				winningIndex[z] = dice.diceIndexs[i];
				winningCounter[z] = counter[i];
				z++;
			}
		}
		
		System.out.println(Arrays.toString(winningIndex));
		System.out.println(Arrays.toString(winningCounter));
		
		Iterator<Integer> diceChosen = diceChosen().iterator(); // Dice selected by user.
		Iterator<Double> betPlaced = totalBet().iterator(); // Total user stake.
		
		while(diceChosen.hasNext() && betPlaced.hasNext()){
			int diceNext = diceChosen.next();
			double betNext = betPlaced.next();
			for(int i = 0; i < winningIndex.length; i++){
				if(diceNext == winningIndex[i]){
					balance = balance + ((betNext * winningCounter[i]) + betNext);
				}
			}
		}
		
		System.out.println(balance);
		
	}
	
	public int[] winningIndex(){
		return winningIndex;
	}
	public double balance(){
		return balance;
	}
	
	public ArrayList<Integer> diceChosen(){
		return dice.diceIndex();
	}
	
	public ArrayList<Double> totalBet(){
		return bet.totalBet();
	}
	
	public String toString(){
		
		return "";
	}
	
}

class DiceRoller{
	private int[] diceRolled = new int[6];
	
	DiceRoller(){
		for(int i = 0; i < 6; i++){
			diceRolled[i] = (int) (Math.random() * 6) + 1;
		}
	}
	
	public int[] diceRolled(){
		return diceRolled;
	}
	
	public String toString(){
		if(diceRolled.length == 0) return "[]";
		String s = "[";
		for(int j = 0; j < diceRolled.length - 1; j++)
			s = s + diceRolled[j] + ",";
		return s+ diceRolled[5] + "]";
	}
}

class Dice{
	// Creating a dice
	//int dice[] = new int[6];
	
	// Number representing the dice
	int diceIndexs[] = {1, 2, 3, 4, 5, 6};
	private ChooseDiceIndex diceIndex;
	
	Dice(ChooseDiceIndex diceIndex){
		this.diceIndex = diceIndex;
	}
	
	public ArrayList<Integer> diceIndex(){
		return this.diceIndex.getDiceIndex();
	}
}

class ChooseDiceIndex{
	private ArrayList<Integer> diceChosen = new ArrayList<>();
	
	ChooseDiceIndex(List<Integer> x){
		this.diceChosen.addAll(x);
	}
	public ArrayList<Integer> getDiceIndex(){
		return diceChosen;
	}
}

class Balance{
	private double balance;
	Balance(){
		this.balance = 2000;
	}
	public double getBalance(){
		return balance;
	}
	public void placeStake(List<Double> x){
		int sum = 0;
		Iterator<Double> i = x.iterator();
		while(i.hasNext()){
			sum += i.next();
		}
		
		this.balance -= sum;
	}
	
}

class PlaceBet{
	private ArrayList<Double> stake = new ArrayList<>();
	private Balance b = new Balance();
	
	PlaceBet(List<Double> x){
		this.stake.addAll(x);
		if(b.getBalance() > sum()){
			b.placeStake(x);
		}
	}
	
	public int sum(){
		//calculate the sum of money in the purse
		int sum = 0;
		Iterator<Double> i = stake.iterator();
		while(i.hasNext()){
			sum += i.next();
		}
		return sum;
	}
	
	public ArrayList<Double> totalBet(){
		return stake;
	}
	
	public double balance(){
		return b.getBalance();
	}
}

class User{
	
}
