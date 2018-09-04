public class Quotes1 {
    public enum Quotes {
        GODFATHER     ("Marlon Brando",   "The Godfather",    1972, "I'm gonna make him an offer he can't refuse." ),
        WIZARD_OF_OZ  ("Judy Garland",    "The Wizard of Oz", 1939, "Toto, I've a feeling we're not in Kansas anymore." ),
        CASABLANCA    ("Humphrey Bogart", "Casablanca",       1942, "Here's looking at you, kid."),
        SUDDEN_IMPACT ("Clint Eastwood",  "Sudden Impact",    1983, "Go ahead, make my day."),
        ALL_ABOUT_EVE ("Bette Davis",     "All About Eve",    1950, "Fasten your seat-belts. It's going to be a bumpy night." );

        private String actor;
        private String movie;
        private int year;
        private String quote;

         Quotes(String actor, String movie, int year, String quote) {
            this.actor = actor;
            this.movie = movie;
            this.year = year;
            this.quote = quote;
        }

        public String whoSaidIt        () { return actor; }
        public int    whenDidTheySayIt () { return year;  }
        public String whereDidTheySayIt() { return movie; }
        public String whatDidTheySay   () { return quote; }

        static public void main(String[] args) {
            for (Quotes q : Quotes.values()) {
                System.out.println(q);
            }
            System.out.println ("Who said? '" + CASABLANCA.whatDidTheySay() + "' in \"" + CASABLANCA.whereDidTheySayIt() + "\"");
            System.out.println("What year? "+CASABLANCA.whenDidTheySayIt());
            System.out.println (CASABLANCA.whoSaidIt() + "! Of course!");
        }
    }
}
