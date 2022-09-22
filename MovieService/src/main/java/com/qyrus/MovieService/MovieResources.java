package com.qyrus.MovieService;

import java.sql.SQLException;
import java.util.List;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.tomcat.util.log.UserDataHelper.Mode;

@Path("/movie")
public class MovieResources 
{
	MovieRepository mr = new MovieRepository();
	
	
	@GET
	@Path("details")
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<MovieDetails> getDetails() throws ClassNotFoundException, SQLException
	{
		for(MovieDetails MovieDetails :mr.getAllDetails())
            System.out.println(MovieDetails.toString());
		return mr.getAllDetails();
	}

@SuppressWarnings("null")
@POST
@Path("insert")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public MovieDetails insertMovieDetails(MovieDetails MovieDetails) throws ClassNotFoundException, SQLException {

    mr.insertMovieDetails(MovieDetails);
    return MovieDetails;
}

//Update
@PUT
@Path("update")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public MovieDetails updateMovieDetails(MovieDetails MovieDetails) throws Exception {
    mr.updateMovieDetails(MovieDetails);

   return MovieDetails;    
    }


@DELETE      
@Path("delete/{screenNo}")
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public void deletebike(@PathParam ("screenNo")int screenNo) throws Exception {
  mr.deleteMovieDetails(screenNo);
  }
}