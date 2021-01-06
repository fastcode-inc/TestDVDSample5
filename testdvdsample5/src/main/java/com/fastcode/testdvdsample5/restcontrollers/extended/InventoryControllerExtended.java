package com.fastcode.testdvdsample5.restcontrollers.extended;

import com.fastcode.testdvdsample5.application.extended.film.IFilmAppServiceExtended;
import com.fastcode.testdvdsample5.application.extended.inventory.IInventoryAppServiceExtended;
import com.fastcode.testdvdsample5.application.extended.rental.IRentalAppServiceExtended;
import com.fastcode.testdvdsample5.commons.logging.LoggingHelper;
import com.fastcode.testdvdsample5.restcontrollers.core.InventoryController;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory/extended")
public class InventoryControllerExtended extends InventoryController {

    public InventoryControllerExtended(
        IInventoryAppServiceExtended inventoryAppServiceExtended,
        IFilmAppServiceExtended filmAppServiceExtended,
        IRentalAppServiceExtended rentalAppServiceExtended,
        LoggingHelper helper,
        Environment env
    ) {
        super(inventoryAppServiceExtended, filmAppServiceExtended, rentalAppServiceExtended, helper, env);
    }
    //Add your custom code here

}
