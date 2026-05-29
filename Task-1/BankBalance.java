//Bankbalance
class Bankbalance{
	private int balance;
	public void setbalance(int balance){
		this.balance=balance;
	}
	public int getbalance(){
		return balance;
	}
	public static void main(String args[])
	{
		Bankbalance object=new Bankbalance();
		object.setbalance(1000);
		System.out.println(object.getbalance());

	}
}