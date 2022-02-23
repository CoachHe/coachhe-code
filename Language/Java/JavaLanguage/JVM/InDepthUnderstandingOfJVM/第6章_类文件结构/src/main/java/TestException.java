public class TestException{
    public int inc(){
        int x;
        try{
            x = 1;
        } catch (Exception e){
            x = 2;
        } finally {
            x = 3;
        }
        return x;
    }
    public static void main(String[] args){
        TestException testException = new TestException();
        System.out.println(testException.inc());
    }
}