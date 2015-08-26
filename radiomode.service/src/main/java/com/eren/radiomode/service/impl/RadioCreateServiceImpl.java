/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.service.impl;

import com.eren.radiomode.dao.parent.EntityDAOFactory;
import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.artist.ArtistPictures;
import com.eren.radiomode.domain.artist.ArtistSimiliar;
import com.eren.radiomode.domain.radio.Radio;
import com.eren.radiomode.domain.radio.RadioArtists;
import com.eren.radiomode.domain.radio.RadioArtistsAll;
import com.eren.radiomode.domain.radio.RadioUsers;
import com.eren.radiomode.domain.user.User;
import com.eren.radiomode.service.RadioCreateService;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author work
 */
public class RadioCreateServiceImpl implements RadioCreateService {

    @Autowired
    private EntityDAOFactory entityDAOFactory;

    public EntityDAOFactory getEntityDAOFactory() {
        return entityDAOFactory;
    }

    public void setEntityDAOFactory(EntityDAOFactory entityDAOFactory) {
        this.entityDAOFactory = entityDAOFactory;
    }

    public List<Artist> loadArtistsLikeName(String query, int limit) {
        return entityDAOFactory.getArtistDAO().getArtistsLikeName(query, limit);
    }
    //TODO: count degisikligi geri alinacak. bir string list tanimlayip alls a eklenenler buraya da eklenecek. daha once varsa o oranda eklenecek.

    public List<RadioArtistsAll> loadSimiliarArtists(Map<Integer, String> addedArtists, Map<Integer, String> blockedArtists) {
        List<ArtistSimiliar> similiars = entityDAOFactory.getArtistDAO().getSimiliarArtists(addedArtists);
        List<RadioArtistsAll> alls = new ArrayList<RadioArtistsAll>();
        Map<Artist, Integer> tempSimiliars = new HashMap<Artist, Integer>();
        Artist artist = null;
        for (ArtistSimiliar similiar : similiars) {
            boolean isRemoved = false;
            for (Integer blocked : blockedArtists.keySet()) {
                if (blocked == similiar.getArtistid().getArtistid() || blocked
                        == similiar.getSimiliarArtistid().getArtistid()) {
                    similiars.remove(blocked);
                    isRemoved = true;
                }
            }
            if (isRemoved == false) {
                if (addedArtists.keySet().contains(similiar.getArtistid().getArtistid())) {
                    artist = similiar.getSimiliarArtistid();
                } else {
                    artist = similiar.getArtistid();
                }

                if (tempSimiliars.containsKey(artist)) {
                    tempSimiliars.put(artist, tempSimiliars.get(artist) + new Integer(similiar.getSimiliarPercent()));
                } else {
                    tempSimiliars.put(artist, new Integer(similiar.getSimiliarPercent()));
                }
            }
        }

        Iterator<Artist> keySet = tempSimiliars.keySet().iterator();
        while (keySet.hasNext()) {
            artist = keySet.next();
            alls.add(new RadioArtistsAll(null, null, artist, tempSimiliars.get(artist) / addedArtists.size(), 1));
        }

        return alls;
    }

    public Artist loadArtist(String artistName) {
        return entityDAOFactory.getArtistDAO().getArtistByName(artistName);
    }

    public List<ArtistPictures> loadArtistPictures(List<Integer> artistidList) {
        return entityDAOFactory.getArtistDAO().getArtistPictures(artistidList);
    }

    public void createArtistRadio(Artist artist, User user) {
        Radio radio = new Radio();
        radio.setName(artist.getName() + ".fm");
        radio.setOwnerid(user);
        List<Radio> list2 = entityDAOFactory.getRadioDAO().loadEntityByParam(radio);
        if (!list2.isEmpty()) {
            return;
        }
        radio.setCreatedDate(new Date());
        radio.setModifiedDate(new Date());
        entityDAOFactory.getRadioDAO().saveEntity(radio);

        List<RadioUsers> list = entityDAOFactory.getRadioDAO().getAllRadios(user.getUserName());
        for (RadioUsers ru : list) {
            ru.setIsDefault(Boolean.FALSE);
        }
        entityDAOFactory.getRadioDAO().saveEntity(list);

        RadioUsers radioUsers = new RadioUsers();
        radioUsers.setRadioid(radio);
        radioUsers.setUserid(user);
        radioUsers.setIsDefault(Boolean.TRUE);
        radioUsers.setUserType(RadioUsers.UserType.OWNER.name());
        entityDAOFactory.getRadioDAO().saveEntity(radioUsers);

        RadioArtists ra = new RadioArtists();
        ra.setArtistid(artist);
        ra.setPlayPercent(100);
        ra.setRadioid(radio);
        ra.setStatus(Boolean.TRUE);
        entityDAOFactory.getRadioDAO().saveEntity(ra);

        List<ArtistSimiliar> similiars = entityDAOFactory.getArtistDAO().getSimiliarArtists(artist, 0, 25);
        List<RadioArtistsAll> all = new ArrayList<RadioArtistsAll>();
        for (ArtistSimiliar as : similiars) {
            RadioArtistsAll raa = new RadioArtistsAll();
            if (as.getSimiliarArtistid() == artist) {
                raa.setArtistid(as.getArtistid());
            } else {
                raa.setArtistid(as.getSimiliarArtistid());
            }
            raa.setRadioid(radio);
            raa.setPlayPercent(as.getSimiliarPercent());
            raa.setCount(1);
            all.add(raa);
        }
        entityDAOFactory.getRadioDAO().saveEntity(all);
    }
}
