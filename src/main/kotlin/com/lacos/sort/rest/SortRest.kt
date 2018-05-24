package com.lacos.sort.rest

import com.lacos.sort.model.ListModel
import com.lacos.sort.service.SortService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SortRest(
        val sortService: SortService
) {

    @PostMapping("/api/sort")
    fun sortList(@RequestBody list: MutableList<ListModel>) = sortService.sortVoluntarios(list);
}