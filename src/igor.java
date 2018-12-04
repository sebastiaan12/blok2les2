public class igor
{
    public String naam = "Igor";
    boolean opSlot = true;


    public igor(String newName)
    {
        naam = newName;
    }

    public void RoepNaam()
    {
        System.out.println(naam);
    }

    public void OpenDeur() {

        if (opSlot == true) {

            System.out.println("De deur is dicht!"); //zegt dat de deur dicht is
            System.out.println("Controleer " + opSlot);  //zegt:controleert en + check of opSlot True of False is
            System.out.println("Igor breekt de deur kapot!!"); //zegt dat igor de open maakt
        } else { //als de deur  false is voert hij dit uit
            System.out.println("ja de deur is nu open!");
            System.out.println("controleer: " + opSlot); //controleer of het true of false is
        }}
}