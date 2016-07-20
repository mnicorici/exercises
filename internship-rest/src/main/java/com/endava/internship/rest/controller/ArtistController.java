package com.endava.internship.rest.controller;

import com.endava.internship.rest.entity.Artist;
import com.endava.internship.rest.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/artists", produces = MediaType.APPLICATION_JSON_VALUE)
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @RequestMapping(method = RequestMethod.GET)
    public HttpEntity<Resources<Resource<Artist>>> getArtists() {
        ArrayList<Artist> artists = this.artistService.getArtists();

        Resources<Resource<Artist>> artistResources = Resources.wrap(artists);

        //artistResources.add(linkTo(methodOn(ArtistController.class).getArtists()).withRel("custom-self"));

        /*artistResources.forEach((artistResource -> {
            artistResource.add(linkTo(methodOn(ArtistController.class)
                    .getArtist(artistResource.getContent().getId())).withRel("custom-self"));
        }));*/

        return new ResponseEntity<>(artistResources, HttpStatus.OK);
    }

    /*@RequestMapping(path = "/{artistId}", method = RequestMethod.GET)
    public HttpEntity<Resource<Artist>> getArtist(@PathVariable Integer artistId) {
        Artist artist = this.artistsService.getArtistById(artistId);

        Resource<Artist> artistResource = new Resource<>(artist);
        artistResource.add(linkTo(methodOn(ArtistController.class).getArtist(artistId)).withRel("another-self"));

        return new ResponseEntity<>(artistResource, HttpStatus.OK);
    }*/

}
