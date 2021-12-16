import java.util.ArrayList;

public class CadastroDeContas {

    private ArrayList<ContaCorrente> aContaCorrente = new ArrayList<>();

    public boolean novaContaCorrente(ContaCorrente c){
        aContaCorrente.add(c);
        return true;//teste para erro
    }

    public ContaCorrente getConta(int nroCta){
        if(aContaCorrente.isEmpty()){
            System.out.println("Número da conta está vazio");
            return null;

        }
        return aContaCorrente.get(nroCta);
    }

    public double getSaldoTotal(){
        return saldo;
    }

    public int qtdContas(double noMinimo){

    }

}
