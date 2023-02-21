package JORDelivery;

public class Main {

    public static void main(String[] args) {

        //Clientes Pessoa Física
        ClientePessoaFisica cliente1 = new ClientePessoaFisica("Rubia Falcão Amorim", "Travessa Juá, 87, CEP: 68909-618, Macapá/AP", "rubiaamorim@email.com", 987427375, "280.934.653-40");
        ClientePessoaFisica cliente2 = new ClientePessoaFisica("Elino Barrada Bragança", "Rua Santa Clara, 202, CEP: 69312-349, Boa Vista/RR", "elino.braganca@geradornv.com.br", 985565282, "158.203.062-60");
        ClientePessoaFisica cliente3 = new ClientePessoaFisica("Wanda Palmas Vitorino", "Avenida Uraçá, 2437, CEP: 79018-031, Campo Grande/MS", "wanda.vitorino@geradornv.com.br", 969911216, "297.542.461-22");

        //Clientes PJ
        ClientePessoaJuridica cliente4 = new ClientePessoaJuridica("Borges Carvalho Ferragens ME", "Rua William de Oliveira, 302, CEP: 58436-156, Campina Grande/PB", "ferragens.borges@geradornv.com.br", 22930213, "71.544.337/0001-08");
        ClientePessoaJuridica cliente5 = new ClientePessoaJuridica("Esteves Amorim Funilaria LTDA", "Rua Cafelândia, 558, CEP: 78710-856, Rondonópolis/MT", "funilaria.esteves@geradornv.com.br", 35271270, "66.567.693/0001-07");
        ClientePessoaJuridica cliente6 = new ClientePessoaJuridica("Jales Alves Floricultura LTDA", "Rua Jaime Cerveira, 880, CEP: 79017-060, Campo Grande/MS", "floricultura.jales@geradornv.com.br", 32552541, "31.771.347/0001-61");

        //Entregadores
        Entregador entregador1 = new Entregador("Nei Furtado Borralho", "Rua Dois, 127, CEP: 23036-064, Rio de Janeiro/RJ", "nei.borralho@geradornv.com.br", 996451672, "25741356650", "Moto");
        Entregador entregador2 = new Entregador("Rogério Leite Marica", "Quadra QN 8F Bloco D, CEP: 71880-184, Brasília/DF", "rogerio.marica@geradornv.com.br", 983886085, "73303192592", "Van", true);
        Entregador entregador3 = new Entregador("Bento Cavalcanti Ramos", "Rua Bela Vista, 926, CEP: 27288-361, Volta Redonda/RJ", "bento.ramos@geradornv.com.br", 996155006, "41314511400", "Utilitário");
        Entregador entregador4 = new Entregador("Iago França Diniz", "Rua Ruy Virmond Carnasciali, 1762, CEP: 80310-550, Curitiba/PR", "iago.diniz@geradornv.com.br", 979427459, "11976862528", "Carreto", true);

        //Pacotes
        Pacote pacote1 = new Pacote(256849, "Geladeira Samsung", "185 x 82 x 70", 60.00, true);
        Pacote pacote2 = new Pacote(559874, "Notebook Acer", "48 x 34 x 9", 3.20, true);
        Pacote pacote3 = new Pacote(974523, "Livros", "35 x 25 x 15", 6.2, false);

        //Rotas
        Rota rota1 = new Rota(225684, pacote1.getIdPacote(), "Em trânsito", cliente4.getEndereco(), cliente1.getEndereco(),cliente1.getNome(),entregador4.getNome());
        Rota rota2 = new Rota(226487, pacote2.getIdPacote(), "Aguardando Coleta", cliente5.getEndereco(), cliente2.getEndereco(), cliente2.getNome(), entregador1.getNome());
        Rota rota3 = new Rota(221254, pacote3.getIdPacote(), "Em Preparação", cliente6.getEndereco(), cliente3.getEndereco(), cliente3.getNome()," ");

        rota1.atualizarStatus(4);
        rota1.exibirDados();

        rota2.atualizarStatus(3);
        rota2.exibirDados();

        rota3.atualizarEntregador(entregador2.getNome());
        rota3.atualizarStatus(2);
        rota3.exibirDados();

    }
}
