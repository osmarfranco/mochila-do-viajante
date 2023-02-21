package test.com.dh.hoteis;

import com.dh.hoteis.model.Filial;
import com.dh.hoteis.service.FilialService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class FilialServiceTest {

    FilialService filialService;

    @BeforeEach
    void doBefore() { filialService = new FilialService();};

    @Test
    public void cadastrarFilial() throws SQLException {
        Filial filial1 = new Filial();
        filial1.setNomeDaFilial("Ibis Budget");
        filial1.setRua("Rua Vergueiro");
        filial1.setNumero("2286");
        filial1.setCidade("São Paulo");
        filial1.setEstado("São Paulo");
        filial1.setCincoEstrelas(false);

        Filial filial2 = new Filial();
        filial2.setNomeDaFilial("Ibis Styles");
        filial2.setRua("Alameda Santos");
        filial2.setNumero("1820");
        filial2.setCidade("São Paulo");
        filial2.setEstado("São Paulo");
        filial2.setCincoEstrelas(true);

        Filial filial3 = new Filial();
        filial3.setNomeDaFilial("Joy Hotel");
        filial3.setRua("SCRN 702/703, Bloco H");
        filial3.setNumero("Entrada 49");
        filial3.setCidade("Brasília");
        filial3.setEstado("Distrito Federal");
        filial3.setCincoEstrelas(false);

        Filial filial4 = new Filial();
        filial4.setNomeDaFilial("Ibis Bossa Nova");
        filial4.setRua("Avenida Vieira Souto");
        filial4.setNumero("80");
        filial4.setCidade("Rio de Janeiro");
        filial4.setEstado("Rio de Janeiro");
        filial4.setCincoEstrelas(true);

        Filial filial5 = new Filial();
        filial5.setNomeDaFilial("Ibis Tche");
        filial5.setRua("Largo Vespasiano Júlio Veppo");
        filial5.setNumero("77");
        filial5.setCidade("Porto Alegre");
        filial5.setEstado("Rio Grande do Sul");
        filial5.setCincoEstrelas(false);

        filialService.cadastrar(filial1);
        filialService.cadastrar(filial2);
        filialService.cadastrar(filial3);
        filialService.cadastrar(filial4);
        filialService.cadastrar(filial5);

        Assertions.assertTrue(filial1.getId() > 0);
        Assertions.assertTrue(filial2.getId() > 0);
        Assertions.assertTrue(filial3.getId() > 0);
        Assertions.assertTrue(filial4.getId() > 0);
        Assertions.assertTrue(filial5.getId() > 0);

        System.out.println(filial1.getNomeDaFilial() + " recebeu o ID: " + filial1.getId());
        System.out.println(filial1.converterIsCincoEstrelas());
        System.out.println(filial2.getNomeDaFilial() + " recebeu o ID: " + filial2.getId());
        System.out.println(filial2.converterIsCincoEstrelas());
        System.out.println(filial3.getNomeDaFilial() + " recebeu o ID: " + filial3.getId());
        System.out.println(filial3.converterIsCincoEstrelas());
        System.out.println(filial4.getNomeDaFilial() + " recebeu o ID: " + filial4.getId());
        System.out.println(filial4.converterIsCincoEstrelas());
        System.out.println(filial5.getNomeDaFilial() + " recebeu o ID: " + filial5.getId());
        System.out.println(filial5.converterIsCincoEstrelas());
    }

}