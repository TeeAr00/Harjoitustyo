public class App {
    public static void main(String[] args) throws Exception {
        
        // Konsoli sovellus, jossa voi lisätä opiskelijoita ja kursseja. 
        // Lisäyksen yhteydessä niistä tehdään kopiot tekstitiedostoihin.
        // Sovelluksen aukaisun yhteydessä tekstitiedostosta luodaan opiskelijat
        // ja kurssit uudelle istunnolle, jossa niitä voidaan käyttää. Opiskeljoita
        // voidaan listätä kurssille (lisäyksessä käytetään opiskelijan sekä kurrsin id:tä),
        // mutta kurssien listauksessa näkyy tällä hetkellä opiskelijan muistipaikka, eikä nimi ja 
        // on istunto kohtainen.

        Service service = new Service();

        service.Start();
    }
}
