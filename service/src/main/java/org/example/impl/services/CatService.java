package org.example.impl.services;

import org.example.declarations.Service;
import org.example.impl.dto.CatDto;
import org.example.implementations.dao.CatDaoImpl;
import org.example.implementations.entities.Cat;

import java.util.ArrayList;
import java.util.List;


public class CatService implements Service<CatDto> {

    private final CatDaoImpl catDao;

    private CatDto convertCatToCatDto(Cat cat) {
        CatDto catDto = new CatDto();
        catDto.setId(cat.getId());
        catDto.setName(cat.getName());
        catDto.setBreed(cat.getBreed());
        catDto.setColor(cat.getColor());
        catDto.setFriends(cat.getFriends());
        catDto.setOwner(cat.getOwner());
        catDto.setDateOfBirth(cat.getDateOfBirth());
        return catDto;
    }
    private Cat convertCatDtoToCat(CatDto catDto) {
        Cat cat = new Cat();
        cat.setId(catDto.getId());
        cat.setName(catDto.getName());
        cat.setColor(catDto.getColor());
        cat.setOwner(catDto.getOwner());
        cat.setDateOfBirth(catDto.getDateOfBirth());
        cat.setBreed(cat.getBreed());
        cat.setFriends(cat.getFriends());
        return cat;
    }

    public CatService(CatDaoImpl catDao) {
        this.catDao = catDao;
    }

    @Override
    public CatDto getById(Long id) {
        return convertCatToCatDto(catDao.getById(id));
    }

    @Override
    public List<CatDto> getItems(Integer from, Integer count) {
        List<Cat> cats = catDao.getItems(from, count);
        List<CatDto> catDtos = new ArrayList<>();
        for (Cat cat : cats) {
            catDtos.add(convertCatToCatDto(cat));
        }
        return catDtos;
    }

    @Override
    public List<CatDto> getAll() {
        List<Cat> cats = catDao.getAll();
        List<CatDto> catDtos = new ArrayList<>();
        for (Cat cat : cats) {
            catDtos.add(convertCatToCatDto(cat));
        }
        return catDtos;
    }

    @Override
    public Long getCount() {
        return catDao.getCount();
    }

    @Override
    public void saveOrUpdate(CatDto entity) {
        catDao.saveOrUpdate(convertCatDtoToCat(entity));
    }

    @Override
    public CatDto update(CatDto entity) {
        return convertCatToCatDto(catDao.update(convertCatDtoToCat(entity)));
    }

    @Override
    public void delete(CatDto entity) {
        catDao.delete(convertCatDtoToCat(entity));
    }

    @Override
    public void deleteById(Long entityId) {
        catDao.deleteById(entityId);
    }
}
