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
		String[] tabLanguage = {"Français", "Anglais", "Allemand", "Espagnol", "Italien"};
		String[][] tabTrad = {
								{"J'ai vraiment approfondi mon intérêt pour les statistiques et l'analyse de données au cours de mes sept dernières années passées au sein de trois entreprises de publicité en ligne. Comme l'a dit un jour mon ancien directeur, il n'a jamais rencontré quelqu'un qui pouvait parler d'Excel si passionnément.",
								"Mon premier engagement, c'était à 14 ans : ma première pétition signée contre la chasse à la baleine. Un an plus tard, j'organisais ma première manifestation contre la surconsommation de papier dans mon lycée. Depuis, j'ai approfondi mon engagement et je lis tout ce qui se passe au sujet de l'écologie et de la protection de l'environnement dans le monde. En voyant votre offre d'emploi de responsable associatif dans la lutte pour le réchauffement climatique, j'ai su que c'était pour moi.",
								"J'adore la photographie. Les portraits. Les paysages. Les nus. Les lumières chaudes qui glissent sur les corps. Les clair-obscurs. Les reliefs et les lignes saillantes. J'aime la douceur du brouillard et l'effet de la pluie sur les feuilles mortes d'automne.",
								"J'ai découvert la photographie à 15 ans et je n'ai depuis plus quitté mon Nikon D79. J'ai appris à développer mes propres photos (dans ma salle de bains transformée en labo photo). Je maîtrise toutes les techniques de retouche photo et je crois pouvoir dire que j'en connais plus sur Photoshop que n'importe qui.",
								"J'aime écrire. Des textes vifs. Courts. Concis et convaincants. Mais également des propos plus étoffés et élaborés, des discours, des nouvelles et des histoires en tout genre, des histoires qui font rire, des histoires qui font pleurer, des histoires sombres et des histoires drôles. Réécrire l'histoire d'entreprises comme la vôtre, voilà ma passion, voilà mon talent et voilà pourquoi j'aimerais travailler avec vous.",
								"C'est en 2016 que j'ai découvert Youpla Café lors d'un meetup sur le marketing des sites de e-commerce. J'avais déjà adoré votre concept et votre approche. Depuis, je suis toutes les évolutions de votre société et lorsque j'ai appris que vous cherchiez un nouveau responsable marketing, j'ai tout de suite décidé de postuler.",
								"Lorsque j'ai assisté à une conférence sur le commerce équitable il y a 1 mois et que j'ai écouté votre présentation sur les nouvelles approches commerciales responsables, j'ai tout de suite été voir sur votre site Internet les offres d'emploi."}, 
								
								{"I have really deepened my interest in statistics and data analysis in the past seven years with three online advertising companies. As my former manager once said, he has never met someone who could speak so passionately about Excel.",
								"My first commitment was when I was 14: my first petition against whaling. A year later, I organized my first demonstration against the overconsumption of paper in my high school. Since then, I have deepened my commitment and I read everything that is happening about the ecology and the protection of the environment in the world. Seeing your job offer as an association manager in the fight against global warming, I knew it was for me.",
								"I love photography. The portraits. The landscapes. The nudes. The warm lights that slide over the bodies. The chiaroscuro. The reliefs and the salient lines. I like the softness of the fog and the effect of the rain on the dead autumn leaves.",
								"I discovered photography when I was 15 and I haven't left my Nikon D79 since. I learned to develop my own photos (in my bathroom transformed into a photo lab). I master all photo editing techniques and I think I can say that I know more about Photoshop than anyone.",
								"I like to write. Vivid texts. Short. Concise and compelling. But also more detailed and elaborate words, speeches, news and stories of all kinds, stories that make you laugh, stories that make you cry, dark stories and funny stories. Rewriting the history of companies like yours, this is my passion, this is my talent and this is why I would like to work with you.",
								"It was in 2016 that I discovered Youpla Café during a meetup on the marketing of e-commerce sites. I already loved your concept and your approach. Since then, I have been following all the developments in your company and when I learned that you were looking for a new marketing manager, I immediately decided to apply.",
								"When I attended a conference on fair trade 1 month ago and I listened to your presentation on new responsible business approaches, I immediately saw job offers on your website."}, 
								
								{"Realmente he profundizado mi interés en estadísticas y análisis de datos en los últimos siete años con tres compañías de publicidad en línea. Como dijo una vez mi ex gerente, nunca ha conocido a alguien que pueda hablar tan apasionadamente sobre Excel.",
								"Mi primer compromiso fue cuando tenía 14 años: mi primera petición contra la caza de ballenas. Un año después, organicé mi primera manifestación contra el consumo excesivo de papel en mi escuela secundaria. Desde entonces, he profundizado mi compromiso y leí todo lo que está sucediendo sobre la ecología y la protección del medio ambiente en el mundo. Al ver su oferta de trabajo como gerente de asociación en la lucha contra el calentamiento global, supe que era para mí.",
								"Amo la fotografia. Los retratos Los paisajes. Los desnudos. Las cálidas luces que se deslizan sobre los cuerpos. El claroscuro. Los relieves y las líneas salientes. Me gusta la suavidad de la niebla y el efecto de la lluvia sobre las hojas muertas del otoño.",
								"Descubrí la fotografía cuando tenía 15 años y no he dejado mi Nikon D79 desde entonces. Aprendí a desarrollar mis propias fotos (en mi baño transformado en un laboratorio fotográfico). Domino todas las técnicas de edición de fotos y creo que puedo decir que sé más sobre Photoshop que nadie.",
								"Me gusta escribir Textos vivos Corto. Conciso y convincente. Pero también palabras más detalladas y elaboradas, discursos, noticias e historias de todo tipo, historias que te hacen reír, historias que te hacen llorar, historias oscuras e historias divertidas. Reescribiendo la historia de compañías como la suya, esta es mi pasión, este es mi talento y es por eso que me gustaría trabajar con ustedes.",
								"Fue en 2016 cuando descubrí Youpla Café durante una reunión sobre la comercialización de sitios de comercio electrónico. Ya me encantó tu concepto y tu enfoque. Desde entonces, he estado siguiendo todos los desarrollos en su empresa y cuando supe que estaba buscando un nuevo gerente de marketing, inmediatamente decidí presentar una solicitud.",
								"Cuando asistí a una conferencia sobre comercio justo hace 1 mes y escuché tu presentación sobre nuevos enfoques de negocios responsables, inmediatamente vi ofertas de trabajo en tu sitio web."}, 
								
								{"In den letzten sieben Jahren habe ich mein Interesse an Statistik und Datenanalyse bei drei Online-Werbefirmen wirklich vertieft. Wie mein ehemaliger Manager einmal sagte, hat er noch nie jemanden getroffen, der so leidenschaftlich über Excel sprechen konnte.",
								"Meine erste Verpflichtung war, als ich 14 Jahre alt war: meine erste Petition gegen den Walfang. Ein Jahr später organisierte ich meine erste Demonstration gegen übermäßigen Papierverbrauch in meiner High School. Seitdem habe ich mein Engagement vertieft und alles gelesen, was sich um Ökologie und Umweltschutz in der Welt dreht. Als ich sein Stellenangebot als Verbandsmanager im Kampf gegen die globale Erwärmung sah, wusste ich, dass es für mich war.",
								"Ich liebe Fotografie. Die Porträts Die Landschaften. Die Akte Die warmen Lichter, die über die Körper gleiten. Das Helldunkel. Die Erleichterungen und die abgehenden Linien. Ich mag die Weichheit des Nebels und die Wirkung des Regens auf die toten Herbstblätter.",
								"Ich entdeckte die Fotografie als ich 15 Jahre alt war und habe meine Nikon D79 seitdem nicht mehr verlassen. Ich habe gelernt, meine eigenen Fotos zu entwickeln (in meinem Badezimmer, das in ein Fotolabor verwandelt wurde). Ich beherrsche alle Fotobearbeitungstechniken und kann sagen, dass ich mehr über Photoshop weiß als jeder andere.",
								"Ich schreibe gerne kurze Live-Texte. Prägnant und überzeugend. Aber auch detailliertere und ausführlichere Wörter, Reden, Nachrichten und Geschichten aller Art, Geschichten, die Sie zum Lachen bringen, Geschichten, die Sie zum Weinen bringen, dunkle Geschichten und lustige Geschichten. Die Geschichte von Unternehmen wie Ihrem neu zu schreiben, das ist meine Leidenschaft, das ist mein Talent und deshalb würde ich gerne mit Ihnen zusammenarbeiten.",
								"Es war im Jahr 2016, als ich Youpla Café während eines Treffens zur Vermarktung von E-Commerce-Websites entdeckte. Ich habe Ihr Konzept und Ihre Herangehensweise bereits geliebt. Seitdem verfolge ich alle Entwicklungen in Ihrem Unternehmen und als ich erfuhr, dass ich einen neuen Marketing Manager suche, habe ich mich sofort entschlossen, eine Bewerbung einzureichen.",
								"Als ich vor einem Monat an einer Fairtrade-Konferenz teilnahm und Ihre Präsentation über neue verantwortungsbewusste Geschäftsansätze hörte, sah ich sofort Stellenangebote auf Ihrer Website."}, 
								
								{"Ho davvero approfondito il mio interesse per le statistiche e l'analisi dei dati negli ultimi sette anni con tre società di pubblicità online. Come disse una volta il mio ex manager, non ha mai incontrato qualcuno che potesse parlare così appassionatamente di Excel.",
								"Il mio primo impegno fu quando avevo 14 anni: la mia prima petizione contro la caccia alle balene. Un anno dopo, organizzai la mia prima manifestazione contro il consumo eccessivo di carta nel mio liceo. Da allora, ho approfondito il mio impegno e ho letto tutto ciò che sta accadendo sull'ecologia e la protezione dell'ambiente nel mondo. Vedendo la tua offerta di lavoro come manager di associazione nella lotta contro il riscaldamento globale, sapevo che era per me.",
								"Adoro la fotografia. I ritratti. I paesaggi. I nudi Le luci calde che scivolano sui corpi. Il chiaroscuro. I rilievi e le linee salienti. Mi piace la morbidezza della nebbia e l'effetto della pioggia sulle foglie morte autunnali.",
								"Ho scoperto la fotografia quando avevo 15 anni e da allora non ho più lasciato la mia Nikon D79. Ho imparato a sviluppare le mie foto (nel mio bagno trasformato in un laboratorio fotografico). Padroneggio tutte le tecniche di fotoritocco e penso di poter dire di sapere più di Photoshop di chiunque altro.",
								"J'aime écrire. Des textes vifs. Courts. Concis et convaincants. Mais également des propos plus étoffés et élaborés, des discours, des nouvelles et des histoires en tout genre, des histoires qui font rire, des histoires qui font pleurer, des histoires sombres et des histoires drôles. Réécrire l'histoire d'entreprises comme la vôtre, voilà ma passion, voilà mon talent et voilà pourquoi j'aimerais travailler avec vous.",
								"È stato nel 2016 che ho scoperto Youpla Café durante un incontro sul marketing dei siti di e-commerce. Ho già adorato il tuo concetto e il tuo approccio. Da allora seguo tutti gli sviluppi della tua azienda e quando ho saputo che stavi cercando un nuovo responsabile marketing, ho immediatamente deciso di candidarmi.",
								"Quando ho partecipato a una conferenza sul commercio equo e solidale 1 mese fa e ho ascoltato la tua presentazione su nuovi approcci aziendali responsabili, ho immediatamente visto le offerte di lavoro sul tuo sito web."} 
							};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quelle est la langue source ? choix:fr/en/de/es/it");
		String langue = sc.nextLine();
		//System.out.println("langue ->"+langue);
		
		// Première boucle pour trouver l'identifiant de la langue
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
		
		// Deuxième boucle pour trouver l'identifiant du jour de la semaine
		for(int i = 0; i < tabTrad.length ; i++ ) {
			for(int j = 0; j < tabTrad[i].length ; j++ ) {
				String stringTemp = tabTrad[i][j].toLowerCase();
				if(stringTemp.equalsIgnoreCase(jour)) { // .toUpperCase()
					id_jour = j;
					//System.out.println("id_jour ->"+id_jour);
				}
			}
		}
		
		// Troisième boucle pour afficher le résultat langue et jour du tableau de jours
		for(int i = 0; i < tabTrad.length ; i++ ) {
			if(id_langue != i) {
				System.out.println("La traduction de '" +jour+ "' est la suivante : " + tabTrad[i][id_jour] + " en " + tabLanguage[i]);
			}
		}
		
	}
	
}
