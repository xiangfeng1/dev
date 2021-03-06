package com.example.service.impl;

import com.example.dao.TbMusicMapper;
import com.example.entity.TbMusic;
import com.example.entity.TbMusicExample;
import com.example.service.TbMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbMusicServiceImpl implements TbMusicService {
  @Autowired
   private TbMusicMapper tbMusicMapper;
    @Override
    public List<TbMusic> findAll() {
        //无条件查询全部
        return tbMusicMapper.selectByExample(null);
    }

    @Override
    public TbMusic findById(Integer musicId) {
        return tbMusicMapper.selectByPrimaryKey(musicId);
    }

    @Override
    public TbMusic nextSong(Integer musicId) {
        //获取最大id
        Integer maxId= tbMusicMapper.findMaxId();
        if (musicId.equals(maxId)) {
            musicId=1;
        }else {
            musicId++;
        }
        return tbMusicMapper.selectByPrimaryKey(musicId);
    }

    @Override
    public TbMusic prevSong(Integer musicId) {

        if (musicId !=tbMusicMapper.findMinId()) {
            musicId--;
        }else {
            musicId=tbMusicMapper.findMaxId();
        }
        return tbMusicMapper.selectByPrimaryKey(musicId);
    }

    @Override
    public List<TbMusic> search(String keyword) {
        TbMusicExample musicExample = new TbMusicExample();
        TbMusicExample.Criteria criteria = musicExample.createCriteria();
        criteria.andMusicAlbumNameLike("%"+keyword+"%");
        return tbMusicMapper.selectByExample(musicExample);
    }


}

