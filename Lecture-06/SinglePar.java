interface Eatable {
    void eat(String lunch);
}

public class SinglePar {
    public static void main(String[] args) {
        String str = " ohhrra we have kebab";
        Eatable eatable = (String lunch) -> {
            lunch = "potato";
            System.out.println(str);
            System.out.println(lunch);

        };
        eatable.eat(str);
    }
}
