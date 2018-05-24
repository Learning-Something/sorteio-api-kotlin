package com.lacos.sort.service

import com.lacos.sort.model.ListModel
import org.springframework.stereotype.Service
import java.util.*

@Service
class SortService {
    fun sortVoluntarios(voluntariosList: MutableList<ListModel>): MutableList<ListModel> {
        voluntariosList.shuffle(random = Random())

        return voluntariosList
    }
}