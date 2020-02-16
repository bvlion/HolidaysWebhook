package net.ambitious.holidays.webhook.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping(Array("/"))
class IndexController {
  @RequestMapping
  def index() = "/index"
}
