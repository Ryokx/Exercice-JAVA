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
		// initialisez les autres valeurs à  0
		System.out.println("Veuillez saisir la marque de votre disque dur");
		marque=Clavier.lire_String();
		System.out.println("Veuillez saisir le modèle de votre disque dur");
		modele=Clavier.lire_String();
		System.out.println("Veuillez saisir la capacité de votre disque dur");
		capacite=Clavier.lire_double();
	}

	public void diminuerEspOccup()
	{
		// l'espace occupe sera diminue selon les souhaits de l'utilisateur
		double diminue;
		int rep;
		System.out.println("Voulez-vous diminuer l'espace occupé? 1-Oui 0-Non");
		rep=Clavier.lire_int();
		
		if(rep==1) {
		System.out.println("Veuillez saisir la quantité de l'espace occupé à diminué");
		diminue=Clavier.lire_double();
		if(espaceOccupe>diminue) {
		espaceOccupe=espaceOccupe-diminue;
		}
		else {
			System.out.println("Vous ne pouvez pas autant diminuer l'espace occupé!");
		}
		if(rep==0) {
			System.out.println("Vous avez choisi de ne pas réduire l'espace occupé.");
		}
		}
	
	}
	
	public void augmenterEspOccup()
	{
		// l'espace occupe sera augmente selon les souhaits de l'utilisateur
		double augmente;
		int rep;
		System.out.println("Voulez-vous augmenté l'espace occupé? 1-Oui 0-Non");
		// Recuperation de la réponse de l'utilisateur 
		rep=Clavier.lire_int();
		if(rep==1) {
			System.out.println("Veuillez saisir la quantité de l'espace occupé à augmenté");
			augmente=Clavier.lire_double();
			// Si l'espace occupé + la quantité a augmenté est plus petit que la capacité afficher le syso suivant.
			if(espaceOccupe+augmente<capacite) {
			espaceOccupe=espaceOccupe+augmente;
			}
			else {
				System.out.println("Vous ne pouvez pas augmenté autant l'espace occupé!");
			}
		}
		if(rep==0) {
			System.out.println("Vous avez choisi de ne pas augmenter l'espace occupé.");
		}
		
	}
	
	public void ajoutPart()
	{
		// permet Ã  l'utilisateur de crÃ©er des partitions supplementaires
		int creerPart;
		System.out.println("Veuillez saisir le nombre de partitions à créer");
		creerPart=Clavier.lire_int();
		NbPartitions=NbPartitions+creerPart;
	}
	
	public void supprPart()
	{
		// permet Ã  l'utilisateur de supprimer une partition
		int supPart = 0;
		int rep;
		
		System.out.println("Voulez vous supprimer des partitions? 1-Oui 0-Non");
		rep=Clavier.lire_int();
		
		if(rep==1) {
			System.out.println("Veuillez saisir le nombre de partitions à supprimé");
			supPart=Clavier.lire_int();
			
			if (NbPartitions>supPart) {
				NbPartitions=NbPartitions-supPart;
			}
			else {
				System.out.println("Vous ne pouvez pas supprimer autant de partitions!");
			}
		}
		if(rep==0) {
			System.out.println("Vous avez choisi de ne pas réduire l'espace occupé.");
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
			// Si le nombre de fichier est supérieur au nombre de fichier a supprimer l'action se fait.
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
		System.out.println("Votre ordinateur possède les caractéristiques suivantes:\nMarque= "+marque+"\nModèle= "+modele+"\nCapacité= "+capacite+"\nPartitions= "+NbPartitions+"\nFichiers= "+NbFichiers);
	}
}
