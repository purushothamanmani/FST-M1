package activities;

class CustomException extends Exception{
    private String message=null;
    public void CustomException(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}

public class Activity8 {
    public static void main(String[] args) throws Exception {
        try {
            exceptionTest("Hello welcome exception");
            exceptionTest(null);
        } catch (CustomException customException) {
            System.out.println("CustomException value is:"+customException.getMessage());

        }
    }

    static void exceptionTest(String message) throws Exception {
        if (message == null) {
            throw new Exception("String value is null");
        } else {
            System.out.println("String value:" + message);
        }
    }
}
