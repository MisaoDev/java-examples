package sapo.examples.ejemplosbásicos;

/**
 *
 * @author MisaoDev <https://github.com/MisaoDev>
 */
public class WordWrap {
  
  public static String wrapText(String text, int maxWidth) {
    int length = text.length();
    if (length <= maxWidth) return text;
    
    int start = 0, end = 0;
    String t = "";
    String nextLine;
    
    do {
      end = start + maxWidth;
      nextLine = text.substring(start, end + 1);
      nextLine = nextLine.substring(0, nextLine.lastIndexOf(" "));
      start += nextLine.length() + 1;
      t += nextLine + "\n";
    } while (end < length - maxWidth);
    t += text.substring(start);
    return t;
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    String textoEjemplo = "Of brilliant syntheses corpus callosum rich in heavy atoms concept of the number one vastness is bearable only through love at the edge of forever. Extraordinary claims require extraordinary evidence something incredible is waiting to be known Orion's sword a still more glorious dawn awaits the ash of stellar alchemy Jean-François Champollion. Another world made in the interiors of collapsing stars descended from astronomers another world ship of the imagination globular star cluster? Billions upon billions finite but unbounded are creatures of the cosmos extraplanetary globular star cluster brain is the seed of intelligence. Vastness is bearable only through love something incredible is waiting to be known extraordinary claims require extraordinary evidence great turbulent clouds inconspicuous motes of rock and gas bits of moving fluff. Shores of the cosmic ocean across the centuries shores of the cosmic ocean vastness is bearable only through love made in the interiors of collapsing stars at the edge of forever. Decipherment Vangelis from which we spring birth corpus callosum vanquish the impossible. Kindling the energy hidden in matter are creatures of the cosmos kindling the energy hidden in matter dispassionate extraterrestrial observer permanence of the stars gathered by gravity? Dream of the mind's eye are creatures of the cosmos bits of moving fluff the only home we've ever known a very small stage in a vast cosmic arena preserve and cherish that pale blue dot. Globular star cluster star stuff harvesting star light of brilliant syntheses birth hearts of the stars stirred by starlight? Finite but unbounded prime number Orion's sword a mote of dust suspended in a sunbeam intelligent beings the carbon in our apple pies? Citizens of distant epochs white dwarf extraordinary claims require extraordinary evidence permanence of the stars the ash of stellar alchemy invent the universe. From which we spring invent the universe the ash of stellar alchemy Sea of Tranquility dream of the mind's eye concept of the number one and billions upon billions upon billions upon billions upon billions upon billions upon billions.";
    
    System.out.println(wrapText(textoEjemplo, 70));
    
  }
  
}
