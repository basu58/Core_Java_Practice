import java.util.Scanner;

public class SwitchStopLight {
	private static final String GREEN = "green";
	private static final String YELLOW="yellow";
	private static final String RED="red";
	private String color;
	
	public SwitchStopLight(String c) {
		this.color=c;
	}
	public static void main(String[] args) {
		SwitchStopLight lightOld=new SwitchStopLight(RED);
		lightOld.printActionOld();
		
		promptEnterKey();
		
		SwitchStopLight lightNew=new SwitchStopLight(RED);
		lightNew.printActionNew();
	}
	
	public void printActionOld() {
		String action="Unknown";
		
		if(color==null) {
			System.out.println("Color is null.");
		}
		else {
			if(color.equalsIgnoreCase(GREEN))
				action="Go";
			else if(color.equalsIgnoreCase(YELLOW))
				action="Slow Down";
			else if(color.equalsIgnoreCase(RED))
				action="Stop";
			System.out.println("The Stoplight color is "+color+" so "+action);
		}
	}
	
	public void printActionNew() {
		String action="Unknown";
		if(color==null) {
			System.out.println("Color is null.");
		}
		else {
			switch(color.toLowerCase()) {
			case GREEN:
				action="Go";
				break;
			case YELLOW:
				action="Slow Down";
				break;
			case RED:
				action="Stop";
				break;
			default:
				break;
			}
			System.out.println("The Stoplight color is "+color+" so "+action);
		}
	}
	public static void promptEnterKey(){
		   System.out.println("Press \"ENTER\" to execute Switch-case in String format...");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
		   scanner.close();
		}
	

}