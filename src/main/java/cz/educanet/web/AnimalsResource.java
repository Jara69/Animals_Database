package cz.educanet.web;
import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.*;
import java.util.ArrayList;

@Produces(MediaType.APPLICATION_JSON)
@Path("zoo")
public class AnimalsResource {

    @GET
    public Response getAll() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/c3zoo", "root", "");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT zvirata.id, zvirata.jmeno, druhy.nazev, zvirata.vaha, zvirata.narozen FROM zvirata JOIN druhy ON (druhy.id = zvirata.druh) LIMIT 3");
        ArrayList<Animals> animalsList = new ArrayList<>();
        while(result.next()) {
            Animals animal = new Animals();

            String id = result.getString("id");
            animal.setId(id);
            String jmeno = result.getString("jmeno");
            animal.setJmeno(jmeno);
            String druhnazev = result.getString("nazev");
            animal.setDruh(druhnazev);
            String vaha = result.getString("vaha");
            animal.setId(id);
            String narozen = result.getString("narozen");
            animal.setId(id);

            animalsList.add(animal);
            System.out.println("Animal added");
        }
        connection.close();
        return Response.ok(animalsList).build();
    }
}

