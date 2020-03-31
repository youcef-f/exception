package Application;

import java.util.InputMismatchException;
import java.util.Scanner;
import metier.Compte;
import metier.MontantNegatifException;
import metier.SoldeInsuffisantException;

public class app1 {

	public static void main(String[] args) {
		Compte cp = new Compte();

		try {
			Scanner clavier = new Scanner(System.in);
			System.out.print("Montant à verser:");
			float mt1 = clavier.nextFloat();

			cp.verser(mt1);

			System.out.println("Solde Actuel:" + cp.getSolde());
			System.out.print("Montant à retirer:");
			float mt2 = clavier.nextFloat();

			cp.retirer(mt2);
		}
		// montantRetirer=-X
		catch (MontantNegatifException e) {
			e.printStackTrace();

		}
		// montantRetirer>Solde
		catch (SoldeInsuffisantException e) {
			e.printStackTrace();
		}
		// Le comilateur signal l’Exception InputMismatchException
		// dans le cas d'un caractere
		catch (InputMismatchException e) {
			System.out.println("Problème de saisie");
		}
	}
}