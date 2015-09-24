package Library.Controller;

import Library.Model.Data;
import Library.Service.DataService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by sachin on 9/2/15.
 */
@Path("BookTransactionController")
public class BookTransactionController {

    DataService dataService=new DataService();

    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getOld(){
        return "Old Data";
    }*/
    /*@GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Data> getOld(){
        return dataService.getAllData();
    }*/
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Data> getOld(){
        return dataService.getAllData();
    }

    @GET
    @Path("/{dataId}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getOneData(@PathParam("dataId") String dataId){
        return dataId;
    }

    /*@GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Data> getOld(@QueryParam("dueDate") int dueDate,@QueryParam("start") int stat,@QueryParam("size") int size){
        return dataService.getAllData();
    }
*/
}