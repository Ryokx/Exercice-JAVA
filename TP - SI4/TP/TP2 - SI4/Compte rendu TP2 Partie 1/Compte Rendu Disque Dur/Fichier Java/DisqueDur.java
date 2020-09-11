class DisqueDur
{
	private String marque;
	private String modele;
	private double capacite;
	private double espaceOccupe=0;
	private int NbPartitions=0;
	private int NbFichiers=0;
	
	public DisqueDur()
	{
		// Ceci est l'etape de creation d'un disque dur
		// l'utilisateur saisira la marque, le modele et la capacite du disque dur
		// initialisez les autres valeurs � 0
		System.out.println("Veuillez saisir la marque de votre disque dur");
		marque=Clavier.lire_String();
		System.out.println("Veuillez saisir le mod�le de votre disque dur");
		modele=Clavier.lire_String();
		System.out.println("Veuillez saisir la capacit� de votre disque dur");
		capacite=Clavier.lire_double();
	}

	public void diminuerEspOccup()
	{
		// l'espace occupe sera diminue selon les souhaits de l'utilisateur
		double diminue;
		int rep;
		System.out.println("Voulez-vous diminuer l'espace occup�? 1-Oui 0-Non");
		rep=Clavier.lire_int();
		
		if(rep==1) {
		System.out.println("Veuillez saisir la quantit� de l'espace occup� � diminu�");
		diminue=Clavier.lire_double();
		if(espaceOccupe>diminue) {
		espaceOccupe=espaceOccupe-diminue;
		}
		else {
			System.out.println("Vous ne pouvez pas autant diminuer l'espace occup�!");
		}
		if(rep==0) {
			System.out.println("Vous avez choisi de ne pas r�duire l'espace occup�.");
		}
		}
	
	}
	
	public void augmenterEspOccup()
	{
		// l'espace occupe sera augmente selon les souhaits de l'utilisateur
		double augmente;
		int rep;
		System.out.println("Voulez-vous augment� l'espace occup�? 1-Oui 0-Non");
		// Recuperation de la r�ponse de l'utilisateur 
		rep=Clavier.lire_int();
		if(rep==1) {
			System.out.println("Veuillez saisir la quantit� de l'espace occup� � augment�");
			augmente=Clavier.lire_double();
			// Si l'espace occup� + la quantit� a augment� est plus petit que la capacit� afficher le syso suivant.
			if(espaceOccupe+augmente<capacite) {
			espaceOccupe=espaceOccupe+augmente;
			}
			else {
				System.out.println("Vous ne pouvez pas augment� autant l'espace occup�!");
			}
		}
		if(rep==0) {
			System.out.println("Vous avez choisi de ne pas augmenter l'espace occup�.");
		}
		
	}
	
	public void ajoutPart()
	{
		// permet à l'utilisateur de créer des partitions supplementaires
		int creerPart;
		System.out.println("Veuillez saisir le nombre de partitions � cr�er");
		creerPart=Clavier.lire_int();
		NbPartitions=NbPartitions+creerPart;
	}
	
	public void supprPart()
	{
		// permet à l'utilisateur de supprimer une partition
		int supPart = 0;
		int rep;
		
		System.out.println("Voulez vous supprimer des partitions? 1-Oui 0-Non");
		rep=Clavier.lire_int();
		
		if(rep==1) {
			System.out.println("Veuillez saisir le nombre de partitions � supprim�");
			supPart=Clavier.lire_int();
			
			if (NbPartitions>supPart) {
				NbPartitions=NbPartitions-supPart;
			}
			else {
				System.out.println("Vous ne pouvez pas supprimer autant de partitions!");
			}
		}
		if(rep==0) {
			System.out.println("Vous avez choisi de ne pas r�duire l'espace occup�.");
		}
		
	}
	
	public void ajoutFichiers()
	{
		int ajoutFichiers;
		System.out.println("Veuillez saisir le nombre de fichiers que vous souhaiter ajouter");
		ajoutFichiers=Clavier.lire_int();
		NbFichiers=NbFichiers+ajoutFichiers;
	}
	
	public void supprFichiers()
	{
		// l'utilisateur va pouvoir supprimer des fichiers sur le disque
		int SupFichiers;
		int rep;
		System.out.println("Voulez vous enlever des fichiers? 1-Oui 0-Non");
		rep=Clavier.lire_int();
		if(rep==1) {
			System.out.println("Veuillez saisir le nombre de fichiers que vous souhaiter enlever");
			SupFichiers=Clavier.lire_int();
			// Si le nombre de fichier est sup�rieur au nombre de fichier a supprimer l'action se fait.
			if(NbFichiers>SupFichiers) {
				NbFichiers=NbFichiers-SupFichiers;
			}
			// Sinon afficher le syso suivant
			else {
				System.out.println("Vous ne pouvez pas enlever autant de fichiers!");
			}
		}
		if(rep==0) {
			System.out.println("Vous avez choisi de ne pas enlever des fichiers.");
		}
	}
	
	public void espaceLibre()
	{
		// calcule et affiche l'espace libre sur le disque
		double espaceLibre = 0;
				espaceLibre=capacite-espaceOccupe;
				System.out.println("Il y a "+espaceLibre+" Go d'espace libre.");	
	}
	
	public void proprietes()
	{
		// affiche les proprietes du disque
		System.out.println("Votre ordinateur poss�de les caract�ristiques suivantes:\nMarque= "+marque+"\nMod�le= "+modele+"\nCapacit�= "+capacite+"\nPartitions= "+NbPartitions+"\nFichiers= "+NbFichiers);
	}
}
