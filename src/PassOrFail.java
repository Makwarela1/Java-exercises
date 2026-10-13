public class PassOrFail {
    public double mark;

    void MarkResponse(){
        if (mark >=50){
            System.out.println("PASS");
        }else if(mark < 0 || mark > 100){
            System.out.println("Rejected");
        } else {
            System.out.println("FAIL");
        }
    }

}
