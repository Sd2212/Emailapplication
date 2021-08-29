package Email.model;

public class Employee {
    private   String fristname;
    private   String secondname;

   public  Employee(String FristName, String SecondName){
        this.fristname=FristName;
        this.secondname=SecondName;

    }

    public String getFristname() {
        return fristname;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

}

