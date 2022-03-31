package com.example.service;

import com.example.entity.TbMusic;

import java.util.List;

public interface TbMusicService {
    List<TbMusic> findAll();
    TbMusic findById(Integer musicId);

    TbMusic nextSong(Integer musicId);

    TbMusic prevSong(Integer musicId);

    List<TbMusic> search(String keyword);
}
