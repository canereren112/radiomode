/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eren.radiomode.dao;

import com.eren.radiomode.dao.parent.IEntityDAO;
import com.eren.radiomode.domain.Tag;
import com.eren.radiomode.domain.album.Album;
import com.eren.radiomode.domain.album.AlbumTags;
import java.util.List;

/**
 *
 * @author firat
 */
public interface AlbumDAO extends IEntityDAO {

    List<Album> searchAlbumsLikeName(String name, int limit);

    List<AlbumTags> getTopAlbumsByTag(Tag tag, int first, int max);
    
    Integer getAlbumNumberOfArtist(Integer artistID);
    
    Integer getFanNumberOfAnAlbum(Integer albumID);
}
