/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.recommend.impl;

import com.eren.radiomode.domain.artist.Artist;
import com.eren.radiomode.domain.artist.ArtistTags;
import com.eren.radiomode.recommend.Similiarity;
import com.eren.radiomode.service.parent.ServiceFactory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author firat
 */
public class CosineSimilarity implements Similiarity {

    @Autowired
    public ServiceFactory serviceFactory;

    public ServiceFactory getServiceFactory() {
        return serviceFactory;
    }

    public void setServiceFactory(ServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    //TODO Gercek Cosine algoritmasi bu, tagCount lar 1 den farklı olarak ordan burdan toplandığında burayı açacaksın
//    public double findArtistSimiliarityOnTags(Artist artistA, Artist artistB) {
//        List<ArtistTags> listA = serviceFactory.getArtistService().getArtistTags(artistA);
//        List<ArtistTags> listB = serviceFactory.getArtistService().getArtistTags(artistB);
//        double similiarity = 0, AxB = 0, A2 = 0, B2 = 0, countA = 0, countB = 0;
//        double sumA = 0, sumB = 0;
//        for (ArtistTags tagA : listA) {
//            for (ArtistTags tagB : listB) {
//                if (tagB.getTagid() == tagA.getTagid()) {
//                    countA = tagA.getCount().floatValue();
//                    countB = tagB.getCount().floatValue();
//                    AxB += countA * countB;
//                    A2 += Math.pow(countA, 2);
//
//                    B2 += Math.pow(countB, 2);
//                    break;
//                }
//            }
//
//        }
//        similiarity = AxB / (Math.sqrt(A2) * Math.sqrt(B2));
//        return similiarity;
//    }
    public double findArtistSimiliarityOnTags(Artist artistA, Artist artistB) {
        List<ArtistTags> listA = serviceFactory.getArtistService().getArtistTags(artistA);
        List<ArtistTags> listB = serviceFactory.getArtistService().getArtistTags(artistB);
        double similiarity = 0, AxB = 0, A2 = 0, B2 = 0, countA = 0, countB = 0;
        double sumA = 0, sumB = 0;
        boolean flag = true;
        for (ArtistTags tagA : listA) {
            countA = tagA.getTagid().getRefcount().floatValue();
            sumB += countA;
            for (ArtistTags tagB : listB) {
                countB = tagB.getTagid().getRefcount().floatValue();
                if (tagB.getTagid() == tagA.getTagid()) {
                    sumA += countA + countB;
                }
                if (flag) {
                    sumB += countB;
                }
            }
            flag = false;
        }
        similiarity = sumA / sumB;
        return similiarity;
    }

    public void findArtistSimiliarityOnTagsMain(String artistName, String artistName2) {
        Artist artist = serviceFactory.getArtistService().getArtistByName(artistName);
        Artist artist2 = serviceFactory.getArtistService().getArtistByName(artistName2);
        double s = findArtistSimiliarityOnTags(artist, artist2);
        System.out.println("similiarity for" + artistName + " and " + artistName2 + " is " + s);
    }
}
