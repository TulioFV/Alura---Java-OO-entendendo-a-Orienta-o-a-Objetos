public class TesteValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);
        Conta conta2 = new Conta(1337,16459);

        //System.out.println(conta.getAgencia());

        System.out.println(Conta.getTotal());
    }
}
