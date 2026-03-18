public class Lecturer extends Person{
    private String department;
    
    public Lecturer (String name, String id, String department){
        super(name, id);
        this.department  = department;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " Department: " + department;
    }
}

