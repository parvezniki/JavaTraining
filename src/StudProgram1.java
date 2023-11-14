public class StudProgram1 {
    public static void main(String []args) // -> method
    {
        float stud1,stud2,stud3;

        stud1 = calcAverageOfStud("Raj",10,20,30); //calling of the function
        stud2 = calcAverageOfStud("Prudhvi", 16,76,55); //calling of the function
        stud3 = calcAverageOfStud("Ajay",56,56,66); //calling of the function
    }

    static float calcAverageOfStud(String name,int maths,int telugu,int social)
    {
        float avg;
        System.out.println("Calculating average for"+name);
        avg = (maths+telugu+social)/3;
        return avg; // you can't write anything after return statement
    }
}

