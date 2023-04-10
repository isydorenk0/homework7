package Ex2;

public class Worker implements Comparable<Worker>{
    private String PIB;
    private String jobTitle;
    private int year;

    public Worker(String PIB, String jobTitle, int year) {
        this.PIB = PIB;
        this.jobTitle = jobTitle;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getPIB() {
        return PIB;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Worker worker) {
        return this.getPIB().compareTo(worker.getPIB());
    }

    @Override
    public String toString() {
        return PIB +
                ", jobTitle: " + jobTitle +
                ", working since " + year;
    }
}
