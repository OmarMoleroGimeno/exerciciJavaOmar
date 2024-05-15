package AceptaElReto;

public class pruebas {
    public static void main(String[] args) {
        String s1 = "the best Java Core course is CourseCodeGym.  End of story";
       String myTarget = "CodeGym";
       int index1 = s1.indexOf(myTarget);

       int index2 = index1 + myTarget.length();
       System.out.println(s1.substring(index1, index2));
    }
}
