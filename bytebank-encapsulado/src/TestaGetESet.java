public class TestaGetESet {

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);

        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        conta.setTitular(paulo);
        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        //agora em  2 linhas

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");


    }
}
