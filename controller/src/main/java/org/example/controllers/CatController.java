package org.example.controllers;

import org.example.declarations.Controller;
import org.example.declarations.Service;
import org.example.impl.dto.CatDto;

public class CatController extends Controller<CatDto> {

    protected CatController(Service<CatDto> service) {
        super(service);
    }
}
