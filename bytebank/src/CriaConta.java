public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.saldo = 200;
        //System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        //System.out.println(primeiraConta.saldo);

        segundaConta.saldo = 50;
        System.out.println("Primeira conta tem: " + primeiraConta.saldo);
        System.out.println("Segunda conta tem: " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        if (primeiraConta == segundaConta){
            System.out.println("Sao a mesmissima conta");
        }else{
            System.out.println("Contas diferentes");
        }
    }
}
