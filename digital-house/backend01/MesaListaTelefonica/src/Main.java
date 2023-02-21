import model.Contato;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contato contato1 = new Contato("Douglas", "douglas@email.com","7132582018");
        Contato contato2 = new Contato("Osmar", "osmar@email.com","000000000");
        Contato contato3 = new Contato("Felipe", "felipe@email.com","00000000000");

        List contatosSave = new ArrayList<>();

        contatosSave.add(contato1);
        contatosSave.add(contato2);
        contatosSave.add(contato3);

        FileOutputStream listaTelefonica;

        try {
            listaTelefonica = new FileOutputStream("listaTelefonica.txt");
            ObjectOutputStream caneta = new ObjectOutputStream(listaTelefonica);
            caneta.writeObject(contatosSave);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Contato> listaTelefonicaRead = new ArrayList<>();
        FileInputStream listaTelefonica2;

        try {
            listaTelefonica2 = new FileInputStream("listaTelefonica.txt");
            ObjectInputStream leitor = new ObjectInputStream(listaTelefonica2);
            listaTelefonicaRead = (ArrayList) leitor.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Contato contato : listaTelefonicaRead)
            System.out.println(contato.getNome()+": "+contato.getEmail()+": "+contato.getTelefone());
    }
}