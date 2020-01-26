package be.industriele_ict.coderen.structured;

public class fruitSorteren
{
	private static final int FRUIT_APPEL = 0;
	private static final int FRUIT_PEER = 1;
	private static final int FRUIT_BANAAN = 2;


	public static void main(String[] args)
	{
		int fruit = FRUIT_APPEL;

		switch(fruit)
		{
		case FRUIT_APPEL:
			System.out.println("leg fruit (appel) in doos met appels");
			break;
		case FRUIT_PEER:
			System.out.println("leg fruit (peer) in doos met peren");
			break;
		case FRUIT_BANAAN:
			System.out.println("leg fruit (banaan) in doos met bananen");
			break;
		default:
			System.out.println("FOUT - Onbekend stuk fruit");
			break;
		}
	}
}