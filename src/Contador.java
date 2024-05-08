public class Contador {
    
    public void contador(int n1, int n2) throws ParametrosInvalidosException{
        try{
            if(n1 >= n2){
                throw new ParametrosInvalidosException();
            }
            for(; n1 <= n2; n1++){
                System.out.println("Imprimindo número: "+n1);
            }

        } catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());;
        }
    }
}
