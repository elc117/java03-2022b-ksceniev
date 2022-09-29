import java.util.ArrayList;
import java.util.UUID;

public class ListOfTeamMates {
    public static void main(String[] args){
        ArrayList<TeamMate> pessoas = new ArrayList<TeamMate>(); // cria um objeto do tipo ArrayList
        String[] nomes = {"Juliana", "Renato", "Marcelo", "Camila", "Ruan", "Vanuza", "Jeromel", "Wjindersson", "Carimbo",
            "Januario", "Isabel", "Kerolaine", "Ana", "Lucas"
        };

        for(String nome : nomes){
            System.out.pritln(nome);
        }
    }
}
