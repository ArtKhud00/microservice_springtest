package com.programmingtechie.inventoryservice.service;

import com.programmingtechie.inventoryservice.dto.InventoryResponse;
import com.programmingtechie.inventoryservice.model.Inventory;
import com.programmingtechie.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> skuCode) {
        List<Inventory> inventoryList = inventoryRepository.findBySkuCodeIn(skuCode);
        List<String> skuList = inventoryList.stream()
                .map(Inventory::getSkuCode)
                .collect(Collectors.toList());

        return skuCode.stream()
                .map(code -> {
                    boolean isInStock = skuList.contains(code);
                    if (isInStock){
                        Optional<Inventory> inventoryOptional = inventoryRepository.findBySkuCode(code);
                        if (inventoryOptional.isPresent()) {
                            Inventory inventory = inventoryOptional.get();
                            isInStock = inventory.getQuantity() > 0;
                        }
                    }
                    return InventoryResponse.builder()
                            .skuCode(code)
                            .isInStock(isInStock)
                            .build();
                })
                .toList();
    }
}
