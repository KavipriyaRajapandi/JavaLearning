import java.util.*;
class switchTest 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("\t\t\tSelect the movie:\n 1.PUSHPA\n2.VIKRAM\n3.LEO");
		int movienumber=sc.nextInt();

//switch(movie block)

switch(movienumber){ //movie switch block start
	
				case '1':{
							System.out.println("\t\tuser selected: PUSHPA");
							System.out.println("select the Actors \n a.ALLU ARJUN \n b.RASHIMA");
							char actorOption=sc.nextInt();
							Switch(actorOption){
											case 'a':{
											System.out.println("ALLU ARJUN age is 35");
											System.out.println("ALLU ARJUN phonenum is 336");
											break;
											}
											case 'b':{
											System.out.println("RASHMIKA age is 35");
											System.out.println("RASHMIKA phonenum is 234");
											break;
											}
											default:
											{
											System.out.println("Invalid actor option selected");
											break;
											}

						}


case '2':{
							System.out.println("\t\tuser selected: PUSHPA");
							System.out.println("select the Actors \n a.ALLU ARJUN \n b.RASHIMA");
							char actorOption=sc.nextInt();
							Switch(actorOption){
											case 'a':{
											System.out.println("ALLU ARJUN age is 35");
											System.out.println("ALLU ARJUN phonenum is 336");
											break;
											}
											case 'b':{
											System.out.println("RASHMIKA age is 35");
											System.out.println("RASHMIKA phonenum is 234");
											break;
											}
											default:
											{
											System.out.println("Invalid actor option selected");
											break;
											}

						}







		
	}


}//movie switch block end

	}
}
