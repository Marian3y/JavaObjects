public class Music {
    private String title;
    private String type;
    private String singer;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }

    public Music(String title, String type, String singer) {
        this.title = title;
        this.type = type;
        this.singer = singer;
    }


    public static void main(String[] args) {
        Hiphop music = new Hiphop("I like it","rap","Cardi B",1);
        System.out.println(music);
    }
}

class Hiphop extends Music{
    private int beatCount;

    public int getBeatCount() {
        return beatCount;
    }

    public void setBeatCount(int beatCount) {
        this.beatCount = beatCount;
    }

    @Override
    public String toString() {
        return "Hiphop{" +
                "beatCount=" + beatCount +
                "} " + super.toString();
    }

    public Hiphop(String title, String type, String singer, int beatCount) {
        super(title, type, singer);
        this.beatCount = beatCount;
    }
}

