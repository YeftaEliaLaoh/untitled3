package com.hackerrank.stocktrades.controller;

import com.hackerrank.stocktrades.model.StockTrade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "trades")
public class StockTradeRestController
{
    List<StockTrade> stockTrades = new ArrayList<>();

    @PostMapping()
    @ResponseBody
    public ResponseEntity<StockTrade> post( @RequestBody @Validated StockTrade stocktrade )
    {
        stockTrades.add(stocktrade);
        return new ResponseEntity<>(
                stocktrade,
                HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<StockTrade>> get()
    {
        return new ResponseEntity<>(
                stockTrades,
                HttpStatus.OK);
    }

    @GetMapping(value = "id")
    public ResponseEntity<StockTrade> getById( @PathVariable("id") @NotNull Integer id )
    {
        return new ResponseEntity<>(
                stockTrades.get(id),
                HttpStatus.OK);
    }

    @DeleteMapping(value = "id")
    public ResponseEntity<StockTrade> delete( @PathVariable("id") @NotNull Integer id )
    {
        return new ResponseEntity<>(
                stockTrades.get(id),
                HttpStatus.METHOD_NOT_ALLOWED);
    }

    @PutMapping(value = "id")
    public ResponseEntity<StockTrade> put( @PathVariable("id") @NotNull Integer id )
    {
        return new ResponseEntity<>(
                stockTrades.get(id),
                HttpStatus.METHOD_NOT_ALLOWED);
    }

    @PatchMapping(value = "id")
    public ResponseEntity<StockTrade> patch( @PathVariable("id") @NotNull Integer id )
    {
        return new ResponseEntity<>(
                stockTrades.get(id),
                HttpStatus.METHOD_NOT_ALLOWED);
    }
}
