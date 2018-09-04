public class TestEnum {
    public enum ST_NAME {ARIANNE,JAYME,SAM}
    public enum NETWORKS {CW, CBS, PBS}

    public static void main(String[] args) {
        ST_NAME myClassMate;
        myClassMate = ST_NAME.ARIANNE;
        NETWORKS station = NETWORKS.CBS;
        System.out.println("myClassMate = "+myClassMate);
        System.out.println("station: "+station);

    }
}
