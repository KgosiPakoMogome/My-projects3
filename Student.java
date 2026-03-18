public class Student extends Person{
    
    private double gpa;

    public Student(String name, String id, double gpa){
        super(name, id);
        setGpa(gpa);

    }
    public void setGpa(double gpa){
        if (gpa > 5.0 || gpa < 0.0){
            this.gpa = 0.0;
        }
        else {
            this.gpa = gpa;
        }
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "Gpa :" + gpa;
    }
}