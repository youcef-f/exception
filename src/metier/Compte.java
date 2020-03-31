package metier;

public class Compte {

	private int code;
	private float solde;

	
	public float getSolde() {
		return solde;
	}
	
	
	// si le montant à verser est négatif alors 
	// renvoi l'exception MontantNegatifException: ( exple: -X )
	public void verser(float mt) throws MontantNegatifException {
		if (mt < 0) throw new MontantNegatifException("Montant " + mt + "négatif");
		solde = solde + mt;
	}
	

	// si montant à retirer est superieur au solde existant alors level l'exception:  SoldeInsuffisantException
	// si le montant à retirer est un nombre négatif alors lever l'exception: MontantNegatifException (-24)
	public void retirer(float mt) throws SoldeInsuffisantException, MontantNegatifException {
		if (mt < 0)
			throw new MontantNegatifException("Montant " + mt + "négatif");
		if (mt > solde)
			throw new SoldeInsuffisantException("Solde Insuffisant");
		solde = solde - mt;
	}


}
