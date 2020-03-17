package lad8_2;

public class Sheriff extends Person {
    private String workState;

    public Sheriff(String name, String dateOfBirth) {
        super(name, dateOfBirth);
        this.workState = workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I work at"+workState);
    }


    @Override
    public String toString() {
        return "Sheriff{" +
                "workState='" + workState + '\'' +
                "} " + super.toString();
    }
}
