interface Bank {
    int MIN_AGE = 8;//it is by default public static final

    double rateOfInterest();//it is by default public and abstract

}

interface  RBIBank  extends Bank{
    String REGULATORY_NAME = "Reserve Bank of India";

    double shareValue();
}

interface LIC {
    String CORPORATION_NAME = "Life Insurance Corporation of India";

    String  typeOfLIC();
}

class SBI implements RBIBank, LIC{
    private int accountID;
    private String name;
    private String balance;



    //getters and setters


    @Override
    public double rateOfInterest() {
        return 7.8;
    }

    @Override
    public double shareValue(){
        return 65874.7;
    }

    @Override
    public String typeOfLIC() {
        return "Life";
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        SBI a1 = new SBI();
    }
}
