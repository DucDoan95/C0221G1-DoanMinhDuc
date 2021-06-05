package model.service.rent_type.impl;

import model.bean.RentType;
import model.repository.rent_type.RentTypeRepository;
import model.service.rent_type.IRentType;

import java.util.List;

public class RentTypeImpl implements IRentType {
    RentTypeRepository rentTypeRepository = new RentTypeRepository();
    @Override
    public RentType findRentTypeByID(int id) {
        return rentTypeRepository.findRentTypeByID(id);
    }

    @Override
    public List<RentType> getAllRentType() {
        return rentTypeRepository.getAllRentType();
    }
}
