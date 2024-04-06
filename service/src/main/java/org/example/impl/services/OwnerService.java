package org.example.impl.services;

import org.example.implementations.dao.OwnerDaoImpl;
import org.example.implementations.entities.Owner;

public class OwnerService extends ServiceAbs<Owner> {

    public OwnerService(OwnerDaoImpl ownerDao) {
        super(ownerDao);
    }
}
