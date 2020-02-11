package _old;

import java.util.Scanner;
import java.util.*;

/**
 * @author Schoenmaeker
 * @version 0.0.1
 * @since 2020
 *
 */
public class TableauChaine_004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int id_langue = 0;
		int id_jour = 0;
		
		//------------------//
		String[] tabFlag = {"fr", "en", "de", "es", "it"};
		String[] tabLanguage = {"Fran�ais", "Anglais", "Allemand", "Espagnol", "Italien"};
		String[][] tabTrad = {
								{"J'ai vraiment approfondi mon int�r�t pour les statistiques et l'analyse de donn�es au cours de mes sept derni�res ann�es pass�es au sein de trois entreprises de publicit� en ligne. Comme l'a dit un jour mon ancien directeur, il n'a jamais rencontr� quelqu'un qui pouvait parler d'Excel si passionn�ment.",
								"Mon premier engagement, c'�tait � 14 ans : ma premi�re p�tition sign�e contre la chasse � la baleine. Un an plus tard, j'organisais ma premi�re manifestation contre la surconsommation de papier dans mon lyc�e. Depuis, j'ai approfondi mon engagement et je lis tout ce qui se passe au sujet de l'�cologie et de la protection de l'environnement dans le monde. En voyant votre offre d'emploi de responsable associatif dans la lutte pour le r�chauffement climatique, j'ai su que c'�tait pour moi.",
								"J'adore la photographie. Les portraits. Les paysages. Les nus. Les lumi�res chaudes qui glissent sur les corps. Les clair-obscurs. Les reliefs et les lignes saillantes. J'aime la douceur du brouillard et l'effet de la pluie sur les feuilles mortes d'automne.",
								"J'ai d�couvert la photographie � 15 ans et je n'ai depuis plus quitt� mon Nikon D79. J'ai appris � d�velopper mes propres photos (dans ma salle de bains transform�e en labo photo). Je ma�trise toutes les techniques de retouche photo et je crois pouvoir dire que j'en connais plus sur Photoshop que n'importe qui.",
								"J'aime �crire. Des textes vifs. Courts. Concis et convaincants. Mais �galement des propos plus �toff�s et �labor�s, des discours, des nouvelles et des histoires en tout genre, des histoires qui font rire, des histoires qui font pleurer, des histoires sombres et des histoires dr�les. R��crire l'histoire d'entreprises comme la v�tre, voil� ma passion, voil� mon talent et voil� pourquoi j'aimerais travailler avec vous.",
								"C'est en 2016 que j'ai d�couvert Youpla Caf� lors d'un meetup sur le marketing des sites de e-commerce. J'avais d�j� ador� votre concept et votre approche. Depuis, je suis toutes les �volutions de votre soci�t� et lorsque j'ai appris que vous cherchiez un nouveau responsable marketing, j'ai tout de suite d�cid� de postuler.",
								"Lorsque j'ai assist� � une conf�rence sur le commerce �quitable il y a 1 mois et que j'ai �cout� votre pr�sentation sur les nouvelles approches commerciales responsables, j'ai tout de suite �t� voir sur votre site Internet les offres d'emploi."}, 
								
								{"I have really deepened my interest in statistics and data analysis in the past seven years with three online advertising companies. As my former manager once said, he has never met someone who could speak so passionately about Excel.",
								"My first commitment was when I was 14: my first petition against whaling. A year later, I organized my first demonstration against the overconsumption of paper in my high school. Since then, I have deepened my commitment and I read everything that is happening about the ecology and the protection of the environment in the world. Seeing your job offer as an association manager in the fight against global warming, I knew it was for me.",
								"I love photography. The portraits. The landscapes. The nudes. The warm lights that slide over the bodies. The chiaroscuro. The reliefs and the salient lines. I like the softness of the fog and the effect of the rain on the dead autumn leaves.",
								"I discovered photography when I was 15 and I haven't left my Nikon D79 since. I learned to develop my own photos (in my bathroom transformed into a photo lab). I master all photo editing techniques and I think I can say that I know more about Photoshop than anyone.",
								"I like to write. Vivid texts. Short. Concise and compelling. But also more detailed and elaborate words, speeches, news and stories of all kinds, stories that make you laugh, stories that make you cry, dark stories and funny stories. Rewriting the history of companies like yours, this is my passion, this is my talent and this is why I would like to work with you.",
								"It was in 2016 that I discovered Youpla Caf� during a meetup on the marketing of e-commerce sites. I already loved your concept and your approach. Since then, I have been following all the developments in your company and when I learned that you were looking for a new marketing manager, I immediately decided to apply.",
								"When I attended a conference on fair trade 1 month ago and I listened to your presentation on new responsible business approaches, I immediately saw job offers on your website."}, 
								
								{"Realmente he profundizado mi inter�s en estad�sticas y an�lisis de datos en los �ltimos siete a�os con tres compa��as de publicidad en l�nea. Como dijo una vez mi ex gerente, nunca ha conocido a alguien que pueda hablar tan apasionadamente sobre Excel.",
								"Mi primer compromiso fue cuando ten�a 14 a�os: mi primera petici�n contra la caza de ballenas. Un a�o despu�s, organic� mi primera manifestaci�n contra el consumo excesivo de papel en mi escuela secundaria. Desde entonces, he profundizado mi compromiso y le� todo lo que est� sucediendo sobre la ecolog�a y la protecci�n del medio ambiente en el mundo. Al ver su oferta de trabajo como gerente de asociaci�n en la lucha contra el calentamiento global, supe que era para m�.",
								"Amo la fotografia. Los retratos Los paisajes. Los desnudos. Las c�lidas luces que se deslizan sobre los cuerpos. El claroscuro. Los relieves y las l�neas salientes. Me gusta la suavidad de la niebla y el efecto de la lluvia sobre las hojas muertas del oto�o.",
								"Descubr� la fotograf�a cuando ten�a 15 a�os y no he dejado mi Nikon D79 desde entonces. Aprend� a desarrollar mis propias fotos (en mi ba�o transformado en un laboratorio fotogr�fico). Domino todas las t�cnicas de edici�n de fotos y creo que puedo decir que s� m�s sobre Photoshop que nadie.",
								"Me gusta escribir Textos vivos Corto. Conciso y convincente. Pero tambi�n palabras m�s detalladas y elaboradas, discursos, noticias e historias de todo tipo, historias que te hacen re�r, historias que te hacen llorar, historias oscuras e historias divertidas. Reescribiendo la historia de compa��as como la suya, esta es mi pasi�n, este es mi talento y es por eso que me gustar�a trabajar con ustedes.",
								"Fue en 2016 cuando descubr� Youpla Caf� durante una reuni�n sobre la comercializaci�n de sitios de comercio electr�nico. Ya me encant� tu concepto y tu enfoque. Desde entonces, he estado siguiendo todos los desarrollos en su empresa y cuando supe que estaba buscando un nuevo gerente de marketing, inmediatamente decid� presentar una solicitud.",
								"Cuando asist� a una conferencia sobre comercio justo hace 1 mes y escuch� tu presentaci�n sobre nuevos enfoques de negocios responsables, inmediatamente vi ofertas de trabajo en tu sitio web."}, 
								
								{"In den letzten sieben Jahren habe ich mein Interesse an Statistik und Datenanalyse bei drei Online-Werbefirmen wirklich vertieft. Wie mein ehemaliger Manager einmal sagte, hat er noch nie jemanden getroffen, der so leidenschaftlich �ber Excel sprechen konnte.",
								"Meine erste Verpflichtung war, als ich 14 Jahre alt war: meine erste Petition gegen den Walfang. Ein Jahr sp�ter organisierte ich meine erste Demonstration gegen �berm��igen Papierverbrauch in meiner High School. Seitdem habe ich mein Engagement vertieft und alles gelesen, was sich um �kologie und Umweltschutz in der Welt dreht. Als ich sein Stellenangebot als Verbandsmanager im Kampf gegen die globale Erw�rmung sah, wusste ich, dass es f�r mich war.",
								"Ich liebe Fotografie. Die Portr�ts Die Landschaften. Die Akte Die warmen Lichter, die �ber die K�rper gleiten. Das Helldunkel. Die Erleichterungen und die abgehenden Linien. Ich mag die Weichheit des Nebels und die Wirkung des Regens auf die toten Herbstbl�tter.",
								"Ich entdeckte die Fotografie als ich 15 Jahre alt war und habe meine Nikon D79 seitdem nicht mehr verlassen. Ich habe gelernt, meine eigenen Fotos zu entwickeln (in meinem Badezimmer, das in ein Fotolabor verwandelt wurde). Ich beherrsche alle Fotobearbeitungstechniken und kann sagen, dass ich mehr �ber Photoshop wei� als jeder andere.",
								"Ich schreibe gerne kurze Live-Texte. Pr�gnant und �berzeugend. Aber auch detailliertere und ausf�hrlichere W�rter, Reden, Nachrichten und Geschichten aller Art, Geschichten, die Sie zum Lachen bringen, Geschichten, die Sie zum Weinen bringen, dunkle Geschichten und lustige Geschichten. Die Geschichte von Unternehmen wie Ihrem neu zu schreiben, das ist meine Leidenschaft, das ist mein Talent und deshalb w�rde ich gerne mit Ihnen zusammenarbeiten.",
								"Es war im Jahr 2016, als ich Youpla Caf� w�hrend eines Treffens zur Vermarktung von E-Commerce-Websites entdeckte. Ich habe Ihr Konzept und Ihre Herangehensweise bereits geliebt. Seitdem verfolge ich alle Entwicklungen in Ihrem Unternehmen und als ich erfuhr, dass ich einen neuen Marketing Manager suche, habe ich mich sofort entschlossen, eine Bewerbung einzureichen.",
								"Als ich vor einem Monat an einer Fairtrade-Konferenz teilnahm und Ihre Pr�sentation �ber neue verantwortungsbewusste Gesch�ftsans�tze h�rte, sah ich sofort Stellenangebote auf Ihrer Website."}, 
								
								{"Ho davvero approfondito il mio interesse per le statistiche e l'analisi dei dati negli ultimi sette anni con tre societ� di pubblicit� online. Come disse una volta il mio ex manager, non ha mai incontrato qualcuno che potesse parlare cos� appassionatamente di Excel.",
								"Il mio primo impegno fu quando avevo 14 anni: la mia prima petizione contro la caccia alle balene. Un anno dopo, organizzai la mia prima manifestazione contro il consumo eccessivo di carta nel mio liceo. Da allora, ho approfondito il mio impegno e ho letto tutto ci� che sta accadendo sull'ecologia e la protezione dell'ambiente nel mondo. Vedendo la tua offerta di lavoro come manager di associazione nella lotta contro il riscaldamento globale, sapevo che era per me.",
								"Adoro la fotografia. I ritratti. I paesaggi. I nudi Le luci calde che scivolano sui corpi. Il chiaroscuro. I rilievi e le linee salienti. Mi piace la morbidezza della nebbia e l'effetto della pioggia sulle foglie morte autunnali.",
								"Ho scoperto la fotografia quando avevo 15 anni e da allora non ho pi� lasciato la mia Nikon D79. Ho imparato a sviluppare le mie foto (nel mio bagno trasformato in un laboratorio fotografico). Padroneggio tutte le tecniche di fotoritocco e penso di poter dire di sapere pi� di Photoshop di chiunque altro.",
								"J'aime �crire. Des textes vifs. Courts. Concis et convaincants. Mais �galement des propos plus �toff�s et �labor�s, des discours, des nouvelles et des histoires en tout genre, des histoires qui font rire, des histoires qui font pleurer, des histoires sombres et des histoires dr�les. R��crire l'histoire d'entreprises comme la v�tre, voil� ma passion, voil� mon talent et voil� pourquoi j'aimerais travailler avec vous.",
								"� stato nel 2016 che ho scoperto Youpla Caf� durante un incontro sul marketing dei siti di e-commerce. Ho gi� adorato il tuo concetto e il tuo approccio. Da allora seguo tutti gli sviluppi della tua azienda e quando ho saputo che stavi cercando un nuovo responsabile marketing, ho immediatamente deciso di candidarmi.",
								"Quando ho partecipato a una conferenza sul commercio equo e solidale 1 mese fa e ho ascoltato la tua presentazione su nuovi approcci aziendali responsabili, ho immediatamente visto le offerte di lavoro sul tuo sito web."} 
							};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle est la langue source ? choix:fr/en/de/es/it");
		String langue = sc.nextLine();
		//System.out.println("langue ->"+langue);
		
		// Premi�re boucle pour trouver l'identifiant de la langue
		for(int i = 0; i < tabFlag.length ; i++ ) {
			String stringTemp = tabFlag[i].toLowerCase();
			if(stringTemp.contains(langue.toLowerCase())) { // .toUpperCase()
				id_langue = i;
				//System.out.println("id_langue ->"+id_langue);
			}
		}
		
		System.out.println("Donnez un terme pour obtenir sa traduction dans un extrait de texte : ");
		String jour = sc.nextLine();
		//System.out.println("jour ->"+jour);
		
		// Deuxi�me boucle pour trouver l'identifiant du jour de la semaine
		for(int i = 0; i < tabTrad.length ; i++ ) {
			for(int j = 0; j < tabTrad[i].length ; j++ ) {
				String stringTemp = tabTrad[i][j].toLowerCase();
				if(stringTemp.equalsIgnoreCase(jour)) { // .toUpperCase()
					id_jour = j;
					//System.out.println("id_jour ->"+id_jour);
				}
			}
		}
		
		// Troisi�me boucle pour afficher le r�sultat langue et jour du tableau de jours
		for(int i = 0; i < tabTrad.length ; i++ ) {
			if(id_langue != i) {
				System.out.println("La traduction de '" +jour+ "' est la suivante : " + tabTrad[i][id_jour] + " en " + tabLanguage[i]);
			}
		}
		
	}
	
}
