package com.lacos.sort.rest

import com.lacos.sort.model.ListModel
import com.lacos.sort.service.SortService
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/api/sort")
class SortRest(
        val sortService: SortService
) {
    @PostMapping
    fun sortList(@RequestBody list: MutableList<ListModel>) = sortService.sortVoluntarios(list);
}