public class Variant {

    private String first;
    private String second;
    private String third;

    public Variant(String first, String second, String third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public String getVariants() {
        return (first + "  " + second + "  " + third);
    }
}
