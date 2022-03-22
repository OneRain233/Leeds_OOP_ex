public class CheckPassword {
    public static boolean longEnough(String password) {
        int len = password.length();
        if(len < 12){
            return false;
        }
        return true;
    }
  
    public static boolean atLeastTwoDigits(String password) {
        int cnt = 0;
        for(int i = 0; i < password.length(); i ++){
            char c = password.charAt(i);
            if(c > '0' && c < '9'){
                cnt++;
            }
        }
        return cnt>=2;
    }
  
    public static void main(String[] args) {
        String password = args[0];
        if(longEnough(password) && atLeastTwoDigits(password)){
            System.out.println("Password is valid");
        }
        else{
            System.out.println("Password is not valid");
        }
    }
  }