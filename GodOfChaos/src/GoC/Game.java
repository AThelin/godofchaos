package GoC;

/**
 * @class Game
 * @author Andreas
 * @date 2016-07-23
 * 
 * This is the Main class for Arilila Legends: God Of Chaos.  
 *
 */
public class Game implements Runnable{

	public static int width = 300;
	public static int height = width / 16 * 9;
	public static int scale = 3;
	
	private Thread thread;

	public Game()
	{
	}

	public synchronized void start() {
		thread = new Thread(this, "Display");
		thread.start();
	}
	
	public synchronized void stop() {
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		
	}

}
