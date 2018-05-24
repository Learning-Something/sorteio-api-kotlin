package com.lacos.sort.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/")
class HomePageRest {

    @GetMapping
    fun redirectToSwagger(response: HttpServletResponse) {
        response.sendRedirect("/swagger-ui.html")
    }
}