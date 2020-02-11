import java.util.Scanner;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class GenerateurLosangeKyweez {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la largeur du losange : ");
		int n = sc.nextInt();
		
		int nombreCroix = n;
		int nombreEspace = 0;
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=nombreCroix; j++) {
				System.out.print ('X');
			}
			for (int k=1; k<=nombreEspace; k++) {
				System.out.print(' ');
            }
			for (int l=1; l<=nombreCroix; l++) {
				System.out.print ('X');
			}
			nombreCroix--;
			System.out.println();
			nombreEspace+=2;
		}
 
		 
		int nombreCroix2 = 1;
		int nombreEspace2 = (n*2)-2;
		for (int z=1; z<=n; z++) {
			for (int m=1; m<=nombreCroix2; m++) {
				System.out.print ('X');
			}
			for (int p=1; p<=nombreEspace2; p++) {
				System.out.print(' ');
			}
			for (int e=1; e<=nombreCroix2; e++) {
				System.out.print ('X');
            }
            nombreCroix2++;
            System.out.println();
            nombreEspace2-=2;
		}
		
		sc.close();
		
	}
	
}
