public class Movies {
    private String title;
    private float budget;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "title='" + title + '\'' +
                ", budget=" + budget +
                '}';
    }

    public Movies(String title, float budget) {
        this.title = title;
        this.budget = budget;
    }

    public static void main(String[] args) {
        Horror wud = new Horror("Wait until Dark",3,1);
        System.out.println("wud = " +wud);
    }
}
class Horror extends Movies{
    private int jumpScareCount;

    public int getJumpScareCount() {
        return jumpScareCount;
    }

    public void setJumpScareCount(int jumpScareCount) {
        this.jumpScareCount = jumpScareCount;
    }

    @Override
    public String toString() {
        return "Horror{" +
                "jumpScareCount=" + jumpScareCount +
                "} " + super.toString();
    }

    public Horror(String title, float budget, int jumpScareCount) {
        super(title, budget);
        this.jumpScareCount = jumpScareCount;
    }
}
