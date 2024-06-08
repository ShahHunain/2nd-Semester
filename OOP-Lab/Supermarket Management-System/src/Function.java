public abstract class Function {
    
    Function(){

    }

    public boolean illegalUserTextInput(String text){
        if(text.equals("")){
            return true;
        }

        return false;
    }

}