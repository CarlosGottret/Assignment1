import java.util.Scanner;
public class WifiDiagnosis {

	public static void main(String[] args) {
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		Scanner scanner = new Scanner(System.in);
		String successfullConnection=scanner.nextLine();
		if (successfullConnection.equals("no") || successfullConnection.equals("NO") || successfullConnection.equals("No") || successfullConnection.equals("n") || successfullConnection.equals("N")){
			System.out.println("Second step: reboot your router");
			System.out.println("Are you able to connect with the internet? (yes or no)");
			successfullConnection=scanner.nextLine();
			if (successfullConnection.equals("no") || successfullConnection.equals("NO") || successfullConnection.equals("No") || successfullConnection.equals("n") || successfullConnection.equals("N")){
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power.");
				System.out.println("Are you able to connect with the internet? (yes or no)");
				successfullConnection=scanner.nextLine();
				if (successfullConnection.equals("no") || successfullConnection.equals("NO") || successfullConnection.equals("No") || successfullConnection.equals("n") || successfullConnection.equals("N")){
					System.out.println("Fourth step: move the computer closer to the router and try to connect");
					System.out.println("Are you able to connect with the internet? (yes or no)");
					successfullConnection=scanner.nextLine();
					if (successfullConnection.equals("no") || successfullConnection.equals("NO") || successfullConnection.equals("No") || successfullConnection.equals("n") || successfullConnection.equals("N")){
						System.out.println("Fifth step: contact your ISP");
						System.exit(0);
					}
					else {
						System.out.println("Moving the computer closer to the router seemed to work.");
						System.exit(0);
					}
				}
				else {
					System.out.println("Making sure the cables to your router are plugged in firmly and your router is getting power seemed to work.");
					System.exit(0);
				}
			}
			else {
				System.out.println("Rebooting your router seemed to work.");
				System.exit(0);
			}
		}
		else{
			System.out.println("Rebooting your computer seemed to work.");
			System.exit(0);
		}
		scanner.close();
	}
}