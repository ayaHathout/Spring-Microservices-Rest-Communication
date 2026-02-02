package com.ayahathout.address_service.services.impls;

import com.ayahathout.address_service.dtos.AddressResponseDTO;
import com.ayahathout.address_service.repositories.AddressRepo;
import com.ayahathout.address_service.services.interfaces.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AddressResponseDTO findById(Integer id) {
        return modelMapper.map(addressRepo.findById(id), AddressResponseDTO.class);
    }
}
