
public class IP {

	
		//D�claration des variables
		private int octet1A1, octet1A2, octet1B1, octet1B2, octet2B1, octet2B2, octet1C1, octet1C2, octet2C1, octet2C2, octet3C1, octet3C2;
		private int ip1octet1, ip1octet2, ip1octet3 , ip1octet4, ip2octet1, ip2octet2, ip2octet3, ip2octet4; 
		private int rep, rep1, rep2, rep3;
		int octetA, octetB;
	
		
		public IP() 
		{
		// R�cup�ration de la premi�re adresse IP
		
	
		System.out.println("Veuillez saisir le premier octet de votre adresse IP.");
		ip1octet1=Clavier.lire_int();
		
		System.out.println("Veuillez saisir le deuxieme octet de votre adresse IP.");
		ip1octet2=Clavier.lire_int();
		
		System.out.println("Veuillez saisir le troisi�me octet de votre adresse IP.");
		ip1octet3=Clavier.lire_int();
		
		System.out.println("Veuillez saisir le quatrieme octet de votre adresse IP.");
		ip1octet4=Clavier.lire_int();
		
		System.out.println("La premi�re adresse IP est : "+ip1octet1+"."+ip1octet2+"."+ip1octet3+"."+ip1octet4);
		
		}
		
		public void classe()
		{
		// D�terminer la classe de la premi�re IP.
		int rep;
		
		System.out.println("Veuillez valider la saisi ( 1:Oui / 2:Non )");
		rep=Clavier.lire_int();
		
		if(rep == 1) {
		
		if(ip1octet1 >= 1 && ip1octet1 <= 126) {
			System.out.println("La premi�re adresse IP fait partie de la cat�gorie de classe A");
		}
		if(ip1octet1 >= 128 && ip1octet1 <= 191) {
			System.out.println("La premi�re adresse IP fait partie de la cat�gorie de classe B");
		} 
		if(ip1octet1 >= 192 && ip1octet1 <= 223) {
			System.out.println("La premi�re adresse IP fait partie de la cat�gorie de classe C");
		}
		if(ip1octet1 >= 224 && ip1octet1 <=255) {
			System.out.println("La premi�re adresse IP fait partie d'autre cat�gorie (D,E,F)");
		}
	
		}
		if(rep == 2) {
			System.out.println("Merci de recommencer le processus.");
			}
		}
		
		public void recupIP2()
		{
			//R�cup�ration de la deuxieme adresse IP	
		
		System.out.println("Veuillez saisir le premier octet de votre deuxi�me adresse IP");
		ip2octet1=Clavier.lire_int();
		System.out.println("Veuillez saisir le deuxieme octet de votre deuxi�me adresse IP");
		ip2octet2=Clavier.lire_int();
		System.out.println("Veuillez saisir le troisi�me octet de votre deuxi�me adresse IP");
		ip2octet3=Clavier.lire_int();
		System.out.println("Veuillez saisir le quatrieme octet de votre deuxi�me adresse IP");
		ip2octet4=Clavier.lire_int();
		
		System.out.println("La deuxieme adresse IP est : "+ip2octet1+"."+ip2octet2+"."+ip2octet3+"."+ip2octet4);
		
	}

		public void classe2()
		{
			// D�terminer la classe de la premi�re IP.
			int rep;
			
			System.out.println("Veuillez valider la saisi ( 1:Oui / 2:Non )");
			rep=Clavier.lire_int();
			
			if(rep == 1) {
			
			if(ip2octet1 >= 1 && ip2octet1 <= 126) {
				System.out.println("La premi�re adresse IP fait partie de la cat�gorie de classe A");
			}
			if(ip2octet1 >= 128 && ip2octet1 <= 191) {
				System.out.println("La premi�re adresse IP fait partie de la cat�gorie de classe B");
			} 
			if(ip2octet1 >= 192 && ip2octet1 <= 223) {
				System.out.println("La premi�re adresse IP fait partie de la cat�gorie de classe C");
			}
			if(ip2octet1 >= 224 && ip2octet1 <=255) {
				System.out.println("La deuxi�me adresse IP fait partie d'autre cat�gorie (D,E,F)");
			}
		
			}
			if(rep == 2) {
				System.out.println("Merci de recommencer le processus.");
				}
			}
		
		public void pp()
		{
			int octetB2;
			
			
			System.out.println("Voulez vous continuer ? ( 1=Oui / 2=Non )");
			rep2=Clavier.lire_int();
			{	
				if(rep2 == 1) {
				
				System.out.println("Veuillez saisir la classe de votre 1er IP. (1=A , 2=B, 3=C)");
				rep2=Clavier.lire_int();
				
					if( rep2 == 1 ) {
						System.out.println("Veuillez saisir le premi�re octet.");
						octetA=Clavier.lire_int();
				
						if(octetA != 10) {
							System.out.println("Votre adresse IP de classe A est public");
						}
						else {
							System.out.println("Votre adresse IP de classe A est priv�e");
							 }	
									}
				if (rep2 == 2) {
				System.out.println("Veuillez saisir le premi�re octet.");
				octetB=Clavier.lire_int();
				
					if(octetB == 172) {
						System.out.println("Veuillez saisir le deuxi�me octet.");
						octetB2=Clavier.lire_int();
						
						if(octetB2 >= 16 && octetB2 <= 31) {
							System.out.println("Votre adresse IP de classe B est priv�e.");
					}
						else {
							System.out.println("Votre adresse IP de classe B est public.");
					}	
					}
					else {
					System.out.println("Votre adresse IP est public.");
						 }
				}
				
				
				if (rep2 == 3) {
				System.out.println("Veuillez saisir le premi�re octet.");
				octetB=Clavier.lire_int();
				
					if(octetB == 192) {
						System.out.println("Veuillez saisir le deuxi�me octet.");
						octetB2=Clavier.lire_int();
						
						if(octetB2 == 168) {
							System.out.println("Votre adresse IP de classe C est priv�e.");
					}
						else {
							System.out.println("Votre adresse IP de classe C est public.");
					}	
					}
					else {
					System.out.println("Votre adresse IP est public.");
						 }
					}	
					}
					}	
			}
			public void pp2()
			{
				int octetB2;
				
				
				System.out.println("Voulez vous continuer ? ( 1=Oui / 2=Non )");
				rep2=Clavier.lire_int();
				{	
					if(rep2 == 1) {
					
					System.out.println("Veuillez saisir la classe de votre 2eme IP. (1=A , 2=B, 3=C)");
					rep2=Clavier.lire_int();
					
						if( rep2 == 1 ) {
							System.out.println("Veuillez saisir le premi�re octet.");
							octetA=Clavier.lire_int();
					
							if(octetA != 10) {
								System.out.println("Votre adresse IP de classe A est public");
							}
							else {
								System.out.println("Votre adresse IP de classe A est priv�e");
								 }	
										}
					if (rep2 == 2) {
					System.out.println("Veuillez saisir le premi�re octet.");
					octetB=Clavier.lire_int();
					
						if(octetB == 172) {
							System.out.println("Veuillez saisir le deuxi�me octet.");
							octetB2=Clavier.lire_int();
							
							if(octetB2 >= 16 && octetB2 <= 31) {
								System.out.println("Votre adresse IP de classe B est priv�e.");
						}
							else {
								System.out.println("Votre adresse IP de classe B est public.");
						}	
						}
						else {
						System.out.println("Votre adresse IP est public.");
							 }
					}
					
					
					if (rep2 == 3) {
					System.out.println("Veuillez saisir le premi�re octet.");
					octetB=Clavier.lire_int();
					
						if(octetB == 192) {
							System.out.println("Veuillez saisir le deuxi�me octet.");
							octetB2=Clavier.lire_int();
							
							if(octetB2 == 168) {
								System.out.println("Votre adresse IP de classe C est priv�e.");
						}
							else {
								System.out.println("Votre adresse IP de classe C est public.");
						}	
						}
						else {
						System.out.println("Votre adresse IP est public.");
							 }
						}	
						}
						}	
				}
	
			public void res()
			{
				
				char reponse = 'O';
				
				System.out.println("Voulez vous continuer ? ( 1=Oui / 2=Non )");
				rep2=Clavier.lire_int();	
					
					System.out.println("Vos deux Ip sont-elle de la m�me classe ? (O/N)");
					reponse=Clavier.lire_char();
				
				if(reponse == 'O') {
						System.out.println("Veuillez saisir la classe de votre 1er IP. (1=A ,2=B, 3=C)");
						rep2=Clavier.lire_int();
						
							if(rep2 == 1) {
								System.out.println("Veuillez saisir le premiere octet de votre 1er adresse IP");
							octet1A1=Clavier.lire_int();
						
							System.out.println("Veuillez saisir le premiere octet de votre 2eme adresse IP");
							octet1A2=Clavier.lire_int();
						
								if(octet1A1 == octet1A2) {
									System.out.println("Vos adresses IP sont sur le m�me r�seau");
								}
						
								else {
									System.out.println("Vos adresses IP ne sont pas sur le m�me r�seau");
								}
							}
						
		
							if(rep2 == 2) {
							System.out.println("Veuillez saisir le premiere octet de votre 1er adresse IP");
							octet1A1=Clavier.lire_int();
						
							System.out.println("Veuillez saisir le premiere octet de votre 2eme adresse IP");
							octet1A2=Clavier.lire_int();
						
								if(octet1B1 == octet1B2) {
									System.out.println("Veuillez saisir le deuxieme octet de votre 1er adresse IP");
									octet2B1=Clavier.lire_int();
									
									System.out.println("Veuillez saisir le deuxieme octet de votre 2eme adresse IP");
									octet2B2=Clavier.lire_int();
								
								if(octet2B1 == octet2B2) {
									System.out.println("Vos adresses IP sont sur le m�me r�seau");
								}
							
								else {
									System.out.println("Vos adresses IP ne sont pas sur le m�me r�seau");
								}
						
								}
							
							else {
								System.out.println("Vos adresses IP ne sont pas sur le m�me r�seau");
							}
							}
						if(rep2 == 3) {
							System.out.println("Veuillez saisir le premiere octet de votre 1er adresse IP");
							octet1C1=Clavier.lire_int();
							
							System.out.println("Veuillez saisir le premiere octet de votre 2eme adresse IP");
							octet1C2=Clavier.lire_int();
							
							if(octet1C1 == octet1C2) {
									System.out.println("Veuillez saisir le deuxieme octet de votre 1er adresse IP");
									octet2C1=Clavier.lire_int();
										
									System.out.println("Veuillez saisir le deuxieme octet de votre 2eme adresse IP");
									octet2C2=Clavier.lire_int();
									
									if(octet2C1 == octet2C2) {
										System.out.println("Veuillez saisir le troisi�me octet de votre 1er adresse IP");
										octet3C1=Clavier.lire_int();
											
										System.out.println("Veuillez saisir le troisi�me octet de votre 2eme adresse IP");
										octet3C2=Clavier.lire_int();
										if(octet3C1 == octet3C2) {
								
										System.out.println("Vos adresses IP sont sur le m�me r�seau");
									
										}
										else {
										System.out.println("Vos adresses IP ne sont pas sur le m�me r�seau");
									}
							
									}
								}
								else {
									System.out.println("Vos adresses IP ne sont pas sur le m�me r�seau");
								}
					
						
								
							}
					}
						if(reponse == 'N') {
							System.out.println("Vos adresse IP ne sont pas sur le m�me r�seau. Au revoir !");
					}				
						
				}
		}
			
		
	

