package exercise3.entity;

public class Student {
    public String name;
    public double n1, n2, n3;

    public double finalGrade(){
        return n1 + n2 + n3;
    }

    public double missingPoints(){
        return 60.0 - finalGrade();
    }
}
