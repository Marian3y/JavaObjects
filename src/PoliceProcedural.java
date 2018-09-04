public class PoliceProcedural {
    private   boolean     ensemble;           // true - ensemble, false buddy
    private   String      style;              //  "Gritty", "Comedy", "Drama", "Inner City"
    private   String      location;           // New York, Chicago, LA
    private   boolean     forensicBased;      //  true = CSI, NCIS, false - Dragnet, Monk, Dick Tracy

    public PoliceProcedural(boolean ensemble, String style, String location, boolean forensicBased) {
        this.ensemble = ensemble;
        this.style = style;
        this.location = location;
        this.forensicBased = forensicBased;
    }

    @Override
    public String toString() {
       return "PoliceProcedural{" +
               "ensemble=" + ensemble +
              ", style='" + style + '\'' +
                ", location='" + location + '\'' +
                ", forensicBased=" + forensicBased +
                '}';
    }


    public PoliceProcedural(String location) {
        this.location = location;
        ensemble = true;
        style = "Drama";
        forensicBased = true;
    }

    public PoliceProcedural(String style, String location) {
        this.style = style;
        this.location = location;
    }

    public static void main(String[] args) {
        PoliceProcedural bones = new PoliceProcedural(true,"forensic Based","Washington D.C.",true);
        System.out.println("Bones: "+bones);
        PoliceProcedural ncis = new PoliceProcedural("Washington D.C.");
        System.out.println("ncis: "+ncis.location);
        PoliceProcedural monk = new PoliceProcedural("Savant","San Francisco");
        System.out.println("monk: "+monk.style+","+ncis.location);

    }
}
