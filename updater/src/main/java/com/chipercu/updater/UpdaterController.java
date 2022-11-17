package com.chipercu.updater;


import com.chipercu.updater.model.UpdaterBalance;
import com.chipercu.updater.services.UpdaterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@Slf4j
@RestController("/balance")
@AllArgsConstructor
public class UpdaterController {
    private final UpdaterService bankService;

    @GetMapping("/{accountId}")
    public BigDecimal getBalance(@PathVariable Long accountId) {
        return bankService.getBalance(accountId);
    }


    @PostMapping("/add")
    public BigDecimal addMoney(@RequestBody UpdaterBalance transferBalance) {
        return bankService.addMoney(transferBalance.getTo(), transferBalance.getAmount());
    }

    @PostMapping("/transfer")
    public void transfer(@RequestBody UpdaterBalance transferBalance) {
        bankService.makeTransfer(transferBalance);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handle(IllegalArgumentException e) {
        //log.error(e.getMessage());
        return "MAMA, YA SLOMALSYA";
    }


}
