public class Locker {

    private boolean isOpen;
    private String code;

    public Locker() {
        isOpen = true;
        code = "";
    }

    public void unlock(String code) {
        if(this.code.compareTo(code) == 0){
            isOpen = true;
        }
        else{
            System.out.println("Wrong code");
            isOpen = false;
        }
    }

    public boolean isOpen() {
        if(isOpen)
            return true;
        else
            return false;
    }

    public void lock() {
        isOpen = false;
    }

    public void newComb(String newCode) {
        if(isOpen){
            code = newCode;
        }
    }

}